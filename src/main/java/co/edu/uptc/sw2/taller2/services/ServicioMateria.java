/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller2.services;

import co.edu.uptc.sw2.taller2.dto.Estudiante;
import co.edu.uptc.sw2.taller2.dto.Materia;
import co.edu.uptc.sw2.taller2.logica.Almacenamiento;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Yuliana Boyaca
 */
@Path("ServicioMateria")
public class ServicioMateria {
      @GET
    public List<Materia> consultarMaterias(){
        return Almacenamiento.getInstancia().getListaMaterias();
    }
    
    @POST
    public Materia guardarEstudiante(Materia materia){
        Almacenamiento.getInstancia().getListaMaterias().add(materia);
        return materia;
    }
    
}
