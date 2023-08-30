package org.example.domain;

import java.util.Date;

public class Pessoa {

    private String nome;

    private int idade;

    private Date dataNascimento;


    public Pessoa(String nome, int idade, Date dataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
}
