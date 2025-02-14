package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean atencionEsp;
    private String observaciones;
    @OneToOne
    private Dueno dueno;

    public Mascota() {
    }

    public Mascota(int id, String nombre, String raza, String color, boolean alergico, boolean atencionEsp, String observaciones, Dueno dueno) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEsp = atencionEsp;
        this.observaciones = observaciones;
        this.dueno = dueno;
    }
    
    public Mascota(String nombre, String raza, String color, boolean alergico, boolean atencionEsp, String observaciones, Dueno dueno) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEsp = atencionEsp;
        this.observaciones = observaciones;
        this.dueno = dueno;
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

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Dueno getDueno() {
        return dueno;
    }
    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public boolean isAlergico() {
        return alergico;
    }
    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencionEsp() {
        return atencionEsp;
    }
    public void setAtencionEsp(boolean atencionEsp) {
        this.atencionEsp = atencionEsp;
    }

    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", Raza=" + raza + ", Color=" + color + ", alergico=" + alergico + ", atencionEsp=" + atencionEsp + ", observaciones=" + observaciones + ", dueno=" + dueno + '}';
    }

}