package com.example.Armerillo.modelo;

import javax.persistence.*;

@Entity
@Table(name = "comentarios")
public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String comen;


    public Comentarios() {
    }

    public Comentarios(int id, String name, String comen) {
        this.id = id;
        this.name = name;
        this.comen = comen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComen() {
        return comen;
    }

    public void setComen(String comen) {
        this.comen = comen;
    }
}