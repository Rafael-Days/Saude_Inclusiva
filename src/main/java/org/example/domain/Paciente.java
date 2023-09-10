package org.example.domain;

import java.time.LocalDate;
import java.util.Date;

public class Paciente extends Pessoa{

    private Double idPaciente;

    public Paciente(String nome, int idade, LocalDate dataNascimento, Double idPaciente){
        super(nome, idade, dataNascimento);
        this.idPaciente = idPaciente;
    }

    public Double getIdPaciente() {
        return idPaciente;
    }
}
