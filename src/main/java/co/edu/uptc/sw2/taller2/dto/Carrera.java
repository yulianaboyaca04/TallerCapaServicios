/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller2.dto;

/**
 *
 * @author Yuliana Boyaca
 */
public class Carrera {

    private String nombre;
    private int id;
    public static int var = 0;
    private Facultad facultad;

    public Carrera(String nombre, Facultad f) {
        this.nombre = nombre;
        this.id = var++;
        this.facultad = f;
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
