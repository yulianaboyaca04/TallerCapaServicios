package co.edu.uptc.sw2.taller2.services;

import co.edu.uptc.sw2.taller2.dto.Municipio;
import co.edu.uptc.sw2.taller2.logica.Almacenamiento;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Yuliana Boyaca
 */
@Path("ServicioMunicipio")
public class ServicioMunicipio {
     @GET
    public List<Municipio> consultarMunicipios(){
        return Almacenamiento.getInstancia().getListaMunicipios();
    }
    
    @POST
    public Municipio guardarEstudiante(Municipio municipio){
        Almacenamiento.getInstancia().getListaMunicipios().add(municipio);
        return municipio;
    }
}
