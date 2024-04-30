package com.descomplica.springexercise.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "tb_instrutor")
public class Instrutor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private int rg;

    @Column(length = 45)
    private String nome;

    @Column(name = "data_nascimento")
    private Date nascimento;

    @Column(name = "titulacao")
    private int titulacao;

    @ManyToOne
    private Instrutor instrutor;

    public Instrutor(Long id, int rg, String nome, Date nascimento, int titulacao, Instrutor instrutor) {
        this.id = id;
        this.rg = rg;
        this.nome = nome;
        this.nascimento = nascimento;
        this.titulacao = titulacao;
        this.instrutor = instrutor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public int getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(int titulacao) {
        this.titulacao = titulacao;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    
}
