package com.example.william.catalogodevinos;

/**
 * Created by william on 18/11/2017.
 */

public class Detalhes {
    private int id;
    private String nome;
    private String comentario;
    private int vinho_id;

    public Detalhes(int id, String nome, String comentario, int vinho_id) {
        this.id = id;
        this.nome = nome;
        this.comentario = comentario;
        this.vinho_id = vinho_id;
    }

    public int getId() {
        return id;
    }
}
