
package Modelo;

import java.util.ArrayList;

public class Fornecedor extends Pessoa{
    private String CNPJ;
    private ArrayList<Produto> Lista_produtos = new ArrayList<>();

    public Fornecedor() {
    }

    public Fornecedor(String CNPJ, int iD, String nome, String telefone, String email, String CPF, String endereco, ArrayList<Produto> Lista_produtos) {
        super(iD, nome, telefone, email, CPF, endereco);
        this.CNPJ = CNPJ;
        this.Lista_produtos = Lista_produtos;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public ArrayList<Produto> getLista_produtos() {
        return Lista_produtos;
    }

    public void setLista_produtos(ArrayList<Produto> Lista_produtos) {
        this.Lista_produtos = Lista_produtos;
    }
    
}
