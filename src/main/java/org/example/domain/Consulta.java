package org.example.domain;

import org.example.domain.enums.Equipamentos;

import java.time.LocalDate;
import java.util.Date;

public class Consulta implements Consultador{

    private LocalDate dataConsulta;

    private Double idConsulta;

    private Medico medico;

    private Paciente paciente;

    private Equipamentos equipamentos;

    public Consulta(LocalDate dataConsulta, Double idConsulta, Medico medico, Paciente paciente, Equipamentos equipamentos) {
        this.dataConsulta = dataConsulta;
        this.idConsulta = idConsulta;
        this.medico = medico;
        this.paciente = paciente;
        this.equipamentos = equipamentos;
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

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Equipamentos getEquipamentos(){ return equipamentos; }

    @Override
    public void agendarConsulta() {

    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("DETALHES DA CONSULTA:");
        System.out.println("Nome do Paciente: " + paciente.getNome());
        System.out.println("Equipamento Requerido da Consulta: " + equipamentos);
        System.out.println("");
        System.out.println("Nome do Médico: " + medico.getNome());
        System.out.println("Especialização do Médico: " + medico.getEspecializacao());
        System.out.println("");
        System.out.println("Data da Consulta: " + dataConsulta);
    }

    @Override
    public void definirMedico() {
        switch (equipamentos){
            case MULETA, ANDADOR, PROTESE, ORTESE, CADEIRA_DE_RODAS -> medico.setEspecializacao(Medico.Especializacao.ORTOPEDISTA);

            case APARELHO_AUDITIVO -> medico.setEspecializacao(Medico.Especializacao.OTORRINOLARINGOLOGISTA);

            case CADEIRA_HIGIENICA -> medico.setEspecializacao(Medico.Especializacao.UROLOGISTA);
        }
    }
}
