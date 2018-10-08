package co.edu.uptc.sw2.taller2.dto;

/**
 *
 * @author Yuliana Boyaca, Jorge Catolico
 * 
 */
public class Estudiante {

    private int id;
    private String nombre;
    private String correo;
    private String curso;
    private Carrera carrera;
    private Municipio lugarNacimiento;
    private static int var = 0;

    public Estudiante(String nombre, String correo, String curso, Carrera carre, Municipio muni) {
        this.id = var++;
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
        this.carrera = carre;
        this.lugarNacimiento = muni;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Municipio getMunicipio() {
        return lugarNacimiento;
    }

    public void setMunicipio(Municipio municipio) {
        this.lugarNacimiento = municipio;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
