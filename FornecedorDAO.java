package DAO;
import Modelo.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FornecedorDAO {
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
     
    public static void  Salvar (Fornecedor fornecedor){
        Connection conexao = FabricaConexao.getConnection();
        PreparedStatement insereSt = null;
        
        String sql = "insert into fornecedor(Nome, Telefone,Email, CNPJ, Endereço, Lista_Produtos) values (?,?,?,?,?,?)";
        try{
            insereSt = conexao.prepareStatement(sql);
            insereSt.setInt(1, fornecedor.getiD());
            insereSt.setString(2, fornecedor.getNome());
            insereSt.setString(3, fornecedor.getTelefone());
            insereSt.setString(4, fornecedor.getEmail());
            insereSt.setString(5, fornecedor.getCNPJ());
            insereSt.setString(6, fornecedor.getNascimento());
            insereSt.setString(7, fornecedor.getEndereco());
            insereSt.executeUpdate();
            }catch (SQLException e){
              JOptionPane.showMessageDialog(null,"Erro ao cadastrar o fornecedor:" + e.getMessage()); 
            } finally{
            try{
                JOptionPane.showMessageDialog(null,"Fornecedor incluído com sucesso.");
                    insereSt.close();
                    conexao.close();
              } catch (Exception e ){
                  JOptionPane.showMessageDialog(null,"Erro ao encerrar a conexão na função salvar." + e.getMessage());
              }
             }
                
                  
    }    
}
