package DAO;
import Modelo.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class AlunoDAO {
    public static int ProximoCodigo(){
        Connection conexao = FabricaConexao.getConnection();
        Statement consulta = null;
        ResultSet resultado = null;
        
        int codigo = -1;
        
        String sql = "select max(iD_ALuno)+1 as iD_Aluno from aluno ";
        
        try {
            consulta = (Statement)conexao.createStatement();
            resultado = consulta.executeQuery(sql);
            resultado.next();
            codigo = resultado.getInt("iD_Aluno");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o iD do aluno: " +e.getMessage());
        } finally{
           try {
                conexao.close();
                consulta.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro ao encerrar conexão no banco de Dados: " +e.getMessage());
            }
        }
        return codigo;
    }
    public static void Salvar(Aluno aluno){
        Connection conexao = FabricaConexao.getConnection();
        PreparedStatement insereSt = null;
        
        String sql = "insert into aluno (iD ,Nome,Telefone, Email, CPF, Nascimento, Endereco, Salario) values (?,?,?,?,?,?,?)";
        
        try {
            insereSt = conexao.prepareStatement(sql);
            insereSt.setInt(1, aluno.getiD());
            insereSt.setString(2, aluno.getNome());
            insereSt.setString(3, aluno.getTelefone());
            insereSt.setString(4, aluno.getEmail());
            insereSt.setString(5, aluno.getCPF());
            insereSt.setString(6, aluno.getNascimento());
            insereSt.setString(7, aluno.getEndereco());
            insereSt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao incerir o aluno: " +e.getMessage());
        } finally{
            try {
                JOptionPane.showMessageDialog(null,"Aluno incluido com sucesso!");
                insereSt.close();
                conexao.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Erro ao encerrar conexão na função salvar: " +e.getMessage());
            }
        }
    }
}
