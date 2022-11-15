
package Modelo;

import java.util.ArrayList;
import DAO.FornecedorDAO;
import java.sql.Date;
   
    public class Fornecedor {
        private int iD;
        private String nome;
        private String telefone;
        private String email;
        private String CNPJ;
        private String Nascimento;
        private String endereco;

    public Fornecedor(){      
    }
    
    public Fornecedor(int iD, String nome, String telefone, String email, String CNPJ, String Nascimento, String endereco) {
        this.iD = iD;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.CNPJ = CNPJ;
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

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
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
        this.iD = FornecedorDAO.ProximoCodigo();
    }

   

    
    public void Salvar() {
       FornecedorDAO.Salvar(this);
    }

    public void RecuperaObjeto(int iD) {
        
    }

    public void Atualizar() {
       
    }

    public void Excluir(int chave) {
       
    }
}
