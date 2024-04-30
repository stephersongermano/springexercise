package com.descomplica.springexercise.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_turma")
public class Turma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTurma;

    @Column(name = "horario")
    private Time horario;

    @Column(name = "duracao")
    private int duracao;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_fim")
    private Date dataFim;

    @OneToMany(mappedBy = "instrutor", cascade = CascadeType.ALL)
    private List<Turma> turmas;

    public Turma(int idTurma, Time horario, int duracao, Date dataInicio, Date dataFim, List<Turma> turmas) {
        this.idTurma = idTurma;
        this.horario = horario;
        this.duracao = duracao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.turmas = turmas;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    
}
