package org.example.domain;

import java.time.LocalDate;
import java.util.Date;

public class Consulta {

    private LocalDate dataConsulta;

    private Double idConsulta;

    private Medico medico;

    private Paciente paciente;

    public Consulta(LocalDate dataConsulta, Double idConsulta, Medico medico, Paciente paciente) {
        this.dataConsulta = dataConsulta;
        this.idConsulta = idConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public Double getIdConsulta() {
        return idConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}
