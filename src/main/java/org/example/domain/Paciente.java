package org.example.domain;

import java.util.Date;

public class Paciente extends Pessoa{

    private Double idCliente;

    public Paciente(String nome, int idade, Date dataNascimento, Double idCliente){
        super(nome, idade, dataNascimento);
        this.idCliente = idCliente;
    }

    public Double getIdCliente() {
        return idCliente;
    }
}
