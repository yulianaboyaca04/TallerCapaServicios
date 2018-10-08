/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller2.services;

import co.edu.uptc.sw2.taller2.dto.Estudiante;
import co.edu.uptc.sw2.taller2.dto.Facultad;
import co.edu.uptc.sw2.taller2.logica.Almacenamiento;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Yuliana Boyaca
 */
@Path("ServicioFacultad")
public class ServicioFacultad {
    
      @GET
    public List<Facultad> consultarFacultades(){
        return Almacenamiento.getInstancia().getListaFacultades();
    }
    
    @POST
    public Facultad guardarFacultad(Facultad facultad){
        Almacenamiento.getInstancia().getListaFacultades().add(facultad);
        return facultad;
    }
    
}
