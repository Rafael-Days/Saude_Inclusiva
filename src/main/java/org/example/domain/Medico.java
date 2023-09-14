package org.example.domain;

import java.time.LocalDate;
import java.util.Date;

public class Medico extends Pessoa{

    private Double idMedico;
    public enum Especializacao {
        ORTOPEDISTA, UROLOGISTA, OTORRINOLARINGOLOGISTA;
    }

    private Especializacao especializacao;

    public Medico(String nome, int idade, LocalDate dataNascimento, Double idMedico, Especializacao especializacao){
        super(nome, idade, dataNascimento);
        this.idMedico = idMedico;
        this.especializacao = especializacao;
    }

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public Double getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Double idMedico) {
        this.idMedico = idMedico;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }
}
