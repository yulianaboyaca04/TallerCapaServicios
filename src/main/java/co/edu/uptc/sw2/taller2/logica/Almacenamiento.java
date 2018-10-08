package co.edu.uptc.sw2.taller2.logica;

import co.edu.uptc.sw2.taller2.dto.Carrera;
import co.edu.uptc.sw2.taller2.dto.Estudiante;
import co.edu.uptc.sw2.taller2.dto.Facultad;
import co.edu.uptc.sw2.taller2.dto.Materia;
import co.edu.uptc.sw2.taller2.dto.Matricula;
import co.edu.uptc.sw2.taller2.dto.Municipio;
import co.edu.uptc.sw2.taller2.dto.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RA302
 */
public class Almacenamiento {

    private static final Almacenamiento instancia = new Almacenamiento();
    private List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    private List<Carrera> listaCarreras = new ArrayList<>();
    private List<Facultad> listaFacultades = new ArrayList<>();
    private List<Materia> listaMaterias = new ArrayList<>();
    private List<Matricula> listaMatriculas = new ArrayList<>();
    private List<Municipio> listaMunicipios = new ArrayList<>();
    private List<Profesor> listaProfesor = new ArrayList<>();

    public static Almacenamiento getInstancia() {
        return instancia;
    }

    private Almacenamiento() {

        for (int i = 0; i < 10; i++) {
            Profesor profesor = new Profesor("Pepito", "Perez", "123456789");
            Facultad facultad = new Facultad("Ingenieria");
            Carrera carrera = new Carrera("ing Sistemas", facultad);
            Municipio municipio = new Municipio("Siachoque");
            Materia materia = new Materia("ingles", 4, profesor, carrera);
            Estudiante estudiante = new Estudiante("aa", "a@a.com", "ing software1", carrera, municipio);
            Matricula matricula = new Matricula(2018, 2, estudiante);
            
            listaEstudiantes.add(estudiante);
            listaCarreras.add(carrera);
            listaFacultades.add(facultad);
            listaMaterias.add(materia);
            listaMatriculas.add(matricula);
            listaMunicipios.add(municipio);
            listaProfesor.add(profesor);

        }

    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public List<Carrera> getListaCarrera() {
        return listaCarreras; //To change body of generated methods, choose Tools | Templates.
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    public List<Facultad> getListaFacultades() {
        return listaFacultades;
    }

    public void setListaFacultades(List<Facultad> listaFacultades) {
        this.listaFacultades = listaFacultades;
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }

    public List<Municipio> getListaMunicipios() {
        return listaMunicipios;
    }

    public void setListaMunicipios(List<Municipio> listaMunicipios) {
        this.listaMunicipios = listaMunicipios;
    }

    public List<Profesor> getListaProfesor() {
        return listaProfesor;
    }

    public void setListaProfesor(List<Profesor> listaProfesor) {
        this.listaProfesor = listaProfesor;
    }
    
    
    
}
