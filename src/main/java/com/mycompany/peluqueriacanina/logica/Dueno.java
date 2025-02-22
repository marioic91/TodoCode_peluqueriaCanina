package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dueno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String celular;

    public Dueno() {
    }

    public Dueno(int id, String nombre, String celular) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
    }
    
    public Dueno(String nombre, String celular) {
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Dueno{" + "id=" + id + ", nombre=" + nombre + ", celular=" + celular + '}';
    }

}