/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller2.services;

import co.edu.uptc.sw2.taller2.dto.Estudiante;
import co.edu.uptc.sw2.taller2.logica.Almacenamiento;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author RA302
 */

@Path("ServicioEstudiante")
public class ServicioEstudiante {
    
    @GET
    public List<Estudiante> consultarEstudiantes(){
        return Almacenamiento.getInstancia().getListaEstudiantes();
    }
    
    @POST
    public Estudiante guardarEstudiante(Estudiante estudiante){
        
        estudiante.setId(Almacenamiento.getInstancia().getListaEstudiantes().size() + 1);
        Almacenamiento.getInstancia().getListaEstudiantes().add(estudiante);
        return estudiante;
    }
    
  
}
