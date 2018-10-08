
package co.edu.uptc.sw2.taller2.dto;

/**
 *
 * @author Yuliana Boyaca
 */
public class Facultad {
     private String nombre;
    private int id;
    public static int var = 0;

    public Facultad(String nombre) {
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
