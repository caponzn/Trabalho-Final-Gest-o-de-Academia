package Controle;

import Modelo.Aluno;
import java.util.ArrayList;

public class ctrlAluno {
    private final Aluno objAluno;

    public ctrlAluno() {
        this.objAluno = new Aluno();
    }
    
    public int Salvar(ArrayList<String>listadoAluno){
        this.objAluno.setNome(listadoAluno.get(1));
        this.objAluno.setTelefone(listadoAluno.get(2));
        this.objAluno.setEmail(listadoAluno.get(3));
        this.objAluno.setCPF(listadoAluno.get(4));
        this.objAluno.setNascimento(listadoAluno.get(5));
        this.objAluno.setEndereco(listadoAluno.get(6));
        this.objAluno.setProximoCodigo();
        this.objAluno.Salvar();
        return this.objAluno.getiD();
    }
    public void Excluir(int chave){
        this.objAluno.setiD(chave);
        this.objAluno.Excluir(chave);
    }
    public void Atualizar(ArrayList<String>listadoAluno){
        this.objAluno.setiD(Integer.valueOf(listadoAluno.get(0)));
        this.objAluno.setNome(listadoAluno.get(1));
        this.objAluno.setTelefone(listadoAluno.get(2));
        this.objAluno.setEmail(listadoAluno.get(3));
        this.objAluno.setCPF(listadoAluno.get(4));
        this.objAluno.setNascimento(listadoAluno.get(5));
        this.objAluno.setEndereco(listadoAluno.get(6));
        
        this.objAluno.Atualizar();
    }
    public ArrayList<String>ConverterObjetoParaArray(){
        ArrayList<String>vetCampos = new ArrayList<>();
        vetCampos.add(String.valueOf(this.objAluno.getiD()));
        vetCampos.add(this.objAluno.getNome());
        vetCampos.add(this.objAluno.getTelefone());
        vetCampos.add(this.objAluno.getEmail());
        vetCampos.add(this.objAluno.getCPF());
        vetCampos.add(this.objAluno.getNascimento());
        vetCampos.add(this.objAluno.getEndereco());
        
        return vetCampos;
    }
    public ArrayList<String>RecuperaObjeto(int iD){
        this.objAluno.RecuperaObjeto(iD);
        return ConverterObjetoParaArray();
    }
}
