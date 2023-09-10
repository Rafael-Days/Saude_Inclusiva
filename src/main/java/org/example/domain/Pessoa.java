package org.example.domain;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {

    private String nome;

    private int idade;

    private LocalDate dataNascimento;


    public Pessoa(String nome, int idade, LocalDate dataNascimento) {
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
