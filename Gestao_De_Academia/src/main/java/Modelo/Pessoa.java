package Modelo;
    
import java.sql.Date;

public class Pessoa {
    private int iD;
    private String nome;
    private String telefone;
    private String email;
    private String CPF;
    private Date Nascimento;
    private String endereco;
    

    public Pessoa(int iD, String nome, String telefone, String email, String CPF, Date Nascimento, String endereco) {
        this.iD = iD;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.CPF = CPF;
        this.Nascimento = Nascimento;
        this.endereco = endereco;
    }

    public Pessoa(int iD, String nome, String telefone, String email, String CPF, String endereco) {
        this.iD = iD;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    

    public Pessoa() {
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
