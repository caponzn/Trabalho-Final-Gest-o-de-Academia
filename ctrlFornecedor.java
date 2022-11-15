package Controle;

import Modelo.Fornecedor;
import Modelo.Fornecedor;
import java.util.ArrayList;

public class ctrlFornecedor {
    private final Fornecedor objFornecedor;
            
    public ctrlFornecedor() {
        this.objFornecedor = new Fornecedor();
    }
        
    
    public int Salvar(ArrayList<String>listadoFornecedor){
        this.objFornecedor.setCNPJ(listadoFornecedor.get(1));
        this.objFornecedor.setNome(listadoFornecedor.get(2));
        this.objFornecedor.setTelefone(listadoFornecedor.get(3));
        this.objFornecedor.setEmail(listadoFornecedor.get(4));     
        this.objFornecedor.setEndereco(listadoFornecedor.get(5));
        //lista_produto não soube como colocar
        this.objFornecedor.setProximoCodigo();
        this.objFornecedor.Salvar();
        return this.objFornecedor.getiD();
    }  
    public void Excluir(int chave){
        this.objFornecedor.setiD(chave);
        this.objFornecedor.Excluir(chave);
    }
    public void Atualizar(ArrayList<String>listadoFornecedor){
        this.objFornecedor.setiD(Integer.valueOf(listadoFornecedor.get(0)));
        this.objFornecedor.setCNPJ(listadoFornecedor.get(1));
        this.objFornecedor.setNome(listadoFornecedor.get(2));
        this.objFornecedor.setTelefone(listadoFornecedor.get(3));
        this.objFornecedor.setEmail(listadoFornecedor.get(4));        
        this.objFornecedor.setEndereco(listadoFornecedor.get(5));
        //lista_produto não soube como colocar
        
        this.objFornecedor.Atualizar();
    }   
public ArrayList<String>ConverterObjetoParaArray(){
        ArrayList<String>vetCampos = new ArrayList<>();
        vetCampos.add(String.valueOf(this.objFornecedor.getiD()));
        vetCampos.add(this.objFornecedor.getCNPJ());
        vetCampos.add(this.objFornecedor.getNome());
        vetCampos.add(this.objFornecedor.getTelefone());
        vetCampos.add(this.objFornecedor.getEmail());
        vetCampos.add(this.objFornecedor.getNascimento());
        vetCampos.add(this.objFornecedor.getEndereco());
        
        return vetCampos;
    }
    public ArrayList<String>RecuperaObjeto(int iD){
        this.objFornecedor.RecuperaObjeto(iD);
        return ConverterObjetoParaArray();
    }    
}
