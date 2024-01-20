
package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id_duenio;
    private String nombre;
    private String cel_duenio;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String cel_duenio) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.cel_duenio = cel_duenio;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCel_duenio() {
        return cel_duenio;
    }

    public void setCel_duenio(String cel_duenio) {
        this.cel_duenio = cel_duenio;
    }
    
    
}
