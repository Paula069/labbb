
package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Mueble;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioCarritoMockRemote;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 

@Path("/CarroCompras")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CarroComprasService {
 

    @EJB
    private IServicioCarritoMockRemote carroEjb;

   
    @POST
    @Path("agregar/")
    public List<Mueble> agregarMuebles(List<Mueble> mb) {
        for (Mueble mueble : mb) {
            carroEjb.agregarItem(mueble);
        }
        
        return mb;
    }
    
    @DELETE
    @Path("borrar/")
    public void eliminarMuebles(List<Mueble> mb) {
        for (Mueble mueble : mb) {
            carroEjb.removerItem(mueble, true);
        }
    }

    @GET
    @Path("muebles/")
    public List<Mueble> getTodosLosMuebles() {
        return carroEjb.getInventario();
 
    }
}

