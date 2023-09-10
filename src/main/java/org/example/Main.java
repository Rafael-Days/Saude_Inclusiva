package org.example;

import org.example.domain.Consulta;
import org.example.domain.Medico;
import org.example.domain.Paciente;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        //MARCAR CONSULTA

        Medico medico = new Medico("Roberto", 40, LocalDate.of(1983, 5, 15), 11.00);
        Paciente paciente = new Paciente("Antonio", 30, LocalDate.of(1993, 3, 18), 222.00);

        Consulta consulta = new Consulta(LocalDate.of(2023, 12, 1), 4444.00, medico, paciente);

        Double consultaId = consulta.getIdConsulta();
        Double medicoId = consulta.getMedico().getIdMedico();
        Double pacienteId = consulta.getPaciente().getIdPaciente();

        System.out.println("ID da Consulta: " + consultaId);
        System.out.println("ID do Médico: " + medicoId);
        System.out.println("ID do Paciente: " + pacienteId);
    }
}