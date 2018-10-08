/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller2.services;

import co.edu.uptc.sw2.taller2.dto.Carrera;
import co.edu.uptc.sw2.taller2.logica.Almacenamiento;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Yuliana Boyaca, Jorge catolico
 */
@Path("ServicioCarrera")
public class ServicioCarrera {

    
    @GET
    public List<Carrera> consultarCarreras(){
        return  Almacenamiento.getInstancia().getListaCarrera();
    }
    
    @POST
    public Carrera guardarEstudiante(Carrera carrera){
        Almacenamiento.getInstancia().getListaCarreras().add(carrera);
        return carrera;
    }
    
}
