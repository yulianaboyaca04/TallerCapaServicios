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
public class Matricula {

    private int id;
    private int anio;
    private int semestre;
    private List<Materia> materias;
    private Estudiante estudiante;
    private static int var = 0;

    public Matricula(int anio, int semestre, Estudiante estudiante) {
        this.anio = anio;
        this.semestre = semestre;
        this.materias = new ArrayList<>();
        this.estudiante = estudiante;
        this.id = var++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

}
