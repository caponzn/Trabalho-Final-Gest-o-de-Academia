package Modelo;

import java.sql.Date;

public class Aluno extends Pessoa {

    public Aluno(int iD, String nome, String telefone, String email, String CPF, Date Nascimento, String endereco) {
        super(iD, nome, telefone, email, CPF, Nascimento, endereco);
    }
    
}
