package Modelo;

import DAO.AlunoDAO;
import java.sql.Date;

public class Aluno{
    private int iD;
    private String nome;
    private String telefone;
    private String email;
    private String CPF;
    private String Nascimento;
    private String endereco;

    public Aluno() {
    }

    public Aluno( int iD, String nome, String telefone, String email, String CPF, String Nascimento, String endereco) {
        this.iD = iD;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.CPF = CPF;
        this.Nascimento = Nascimento;
        this.endereco = endereco;
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

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void setProximoCodigo(){
        this.iD = AlunoDAO.ProximoCodigo();
    }
   
    public void Salvar() {
        AlunoDAO.Salvar(this);
    }

    public void RecuperaObjeto(int iD) {
        //implementar
    }

    public void Atualizar() {
        //implementar
    }

    public void Excluir(int chave) {
        //implementar
    }
}
