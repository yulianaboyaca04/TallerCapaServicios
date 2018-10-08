/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller2.services;

import co.edu.uptc.sw2.taller2.dto.Estudiante;
import co.edu.uptc.sw2.taller2.dto.Matricula;
import co.edu.uptc.sw2.taller2.logica.Almacenamiento;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Yuliana Boyaca
 */
@Path("ServicioMatricula")
public class ServicioMatricula {
      @GET
    public List<Matricula> consultarMatriculas(){
        return Almacenamiento.getInstancia().getListaMatriculas();
    }
    
    @POST
    public Matricula guardarEstudiante(Matricula matricula){
        Almacenamiento.getInstancia().getListaMatriculas().add(matricula);
        return matricula;
    }
    
}
