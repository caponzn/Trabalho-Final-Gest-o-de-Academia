package Modelo;
import java.sql.Date;
public class Funcionario extends Pessoa{
    private Date data_contrato;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(Date data_contrato, double salario, int iD, String nome, String telefone, String email, String CPF, Date Nascimento, String endereco) {
        super(iD, nome, telefone, email, CPF, Nascimento, endereco);
        this.data_contrato = data_contrato;
        this.salario = salario;
    }

    public Date getData_contrato() {
        return data_contrato;
    }

    public void setData_contrato(Date data_contrato) {
        this.data_contrato = data_contrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
