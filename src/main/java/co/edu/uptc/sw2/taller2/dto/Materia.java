/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller2.dto;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Yuliana Boyaca
 */
public class Materia {

    private String nombre;
    private int id;
    private int creditos;
    public static int var = 0;
    private List<Horario> listaHorarios;
    private Profesor profesor;
    private Carrera carrera;

    public Materia(String nombre, int creditos, Profesor p, Carrera c) {
        this.nombre = nombre;
        this.id = var++;
        this.creditos = creditos;
        this.listaHorarios = new ArrayList<>();
        this.carrera = c;
        this.profesor = p;
        listaHorarios.add(new Horario(1, 2, 3));
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<Horario> getListaHorarios() {
        return listaHorarios;
    }

    public void setListaHorarios(List<Horario> listaHorarios) {
        this.listaHorarios = listaHorarios;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

}
