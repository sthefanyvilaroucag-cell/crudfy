package com.senai.crudfy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Artista {

    @Id
    private int id;
    private String nome;
    private String estilo;
    private String album;

    public Artista() {
    }

    public Artista(int id, String nome, String estilo, String album) {
        this.id = id;
        this.nome = nome;
        this.estilo = estilo;
        this.album = album;
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

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
