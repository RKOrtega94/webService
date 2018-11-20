package facadeREST;

import entity.Empresa;
import implement.EmpresaImpl;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.EmpresaInterfaz;

/**
 *
 * @author RKOrtega
 */
@Stateless
@Path("empresaFacadeREST")
public class EmpresaFacadeREST extends EmpresaImpl {
    
    @POST
    @Override
    @Path("empresa")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public boolean create(@PathParam("empresa") Empresa empresa) {
        EmpresaInterfaz ei = new EmpresaImpl();
        return ei.create(empresa);
    }
    
    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Empresa> findAll(){
        EmpresaInterfaz ei = new EmpresaImpl();
        return ei.findAll();
    }
}