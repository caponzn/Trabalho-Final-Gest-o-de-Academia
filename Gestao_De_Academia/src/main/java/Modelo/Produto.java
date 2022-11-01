package Modelo;

import java.sql.Date;

public class Produto {
    private int iD;
    private String nome;
    private String marca;
    private Date dataCompra;
    private double precoCompra;
    private double precoVenda;
    private int iDFornecedor;
    private int quantEstoque;

    public Produto() {
    }

    public Produto(int iD, String nome, String marca, Date dataCompra, double precoCompra, double precoVenda, int iDFornecedor, int quantEstoque) {
        this.iD = iD;
        this.nome = nome;
        this.marca = marca;
        this.dataCompra = dataCompra;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.iDFornecedor = iDFornecedor;
        this.quantEstoque = quantEstoque;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getiDFornecedor() {
        return iDFornecedor;
    }

    public void setiDFornecedor(int iDFornecedor) {
        this.iDFornecedor = iDFornecedor;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    
    
}
