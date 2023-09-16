package org.example;

import org.example.domain.Agenda;
import org.example.domain.Consulta;
import org.example.domain.Medico;
import org.example.domain.Paciente;
import org.example.domain.enums.Equipamentos;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //--------MARCAR CONSULTA

        Medico medico = new Medico("Roberto", 40, LocalDate.of(1983, 5, 15), 11.00, null);
        Paciente paciente = new Paciente("Antonio", 30, LocalDate.of(1993, 3, 18), 222.00);
        Paciente paciente2 = new Paciente("Roberto", 40, LocalDate.of(1983, 3, 18), 223.00);

        Consulta consulta = new Consulta(LocalDate.of(2023, 12, 1), 4444.00, medico, paciente, Equipamentos.ANDADOR);

        //--------Lista dos pacientes cadastrados na consulta
        Agenda agenda = new Agenda();
        agenda.adicionarPaciente(paciente);
        agenda.adicionarPaciente(paciente2);

        List<Paciente> pacientes = agenda.listarPacientes();
        agenda.imprimirListaPacientes(pacientes);

        Double consultaId = consulta.getIdConsulta();
        Double medicoId = consulta.getMedico().getIdMedico();
        Double pacienteId = consulta.getPaciente().getIdPaciente();

        System.out.println("");
        consulta.definirMedico();
        //consulta.imprimirDetalhes();


    }
}