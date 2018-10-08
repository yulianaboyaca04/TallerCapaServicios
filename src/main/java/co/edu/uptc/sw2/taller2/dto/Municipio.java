package co.edu.uptc.sw2.taller2.dto;

import java.util.List;
import java.util.ArrayList;

public class Municipio {

    private String nombre;
    private int id;
    public static int var = 0;

    public Municipio(String nombre) {
        this.nombre = nombre;
        this.id = var++;
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
}
