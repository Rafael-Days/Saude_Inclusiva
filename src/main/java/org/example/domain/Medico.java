package org.example.domain;

import java.time.LocalDate;
import java.util.Date;

public class Medico extends Pessoa{

    private Double idMedico;

    public Medico(String nome, int idade, LocalDate dataNascimento, Double idMedico){
        super(nome, idade, dataNascimento);
        this.idMedico = idMedico;
    }

    public Double getIdMedico() {
        return idMedico;
    }
}
