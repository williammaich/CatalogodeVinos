package com.example.william.catalogodevinos;

/**
 * Created by william on 18/11/2017.
 */

public class Vinho {

    private int id;
    private String nome;
    private String origem;
    private String tipo;
    private String vinicula;
    private int nota;
    private String ano;
    private String descricao;

    public Vinho(int id, String nome, String origem, String tipo, String vinicula, int nota, String ano, String descricao) {
        this.id = id;
        this.nome = nome;
        this.origem = origem;
        this.tipo = tipo;
        this.vinicula = vinicula;
        this.nota = nota;
        this.ano = ano;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVinicula() {
        return vinicula;
    }

    public void setVinicula(String vinicula) {
        this.vinicula = vinicula;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
