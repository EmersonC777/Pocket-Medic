package com.pocketmedic.rest.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pocketmedic.jpa.entities.Usuarios;
import com.pocketmedic.jpa.session.UsuariosFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Donde Esta Mi Hamburgesa
 */
@Path("usuarios")
@Produces(MediaType.APPLICATION_JSON)
public class UsuariosRest {

    @EJB
    private UsuariosFacade ejbUsuariosFacade;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Usuarios usuario) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        if (ejbUsuariosFacade.findByEmail(usuario.getEmail()) == null) {
            ejbUsuariosFacade.create(usuario);
            return Response.ok()
                    .entity(gson.toJson("El usuario fue creado exitosamente"))
                    .build();
        } else {
            return Response
                    .status(Response.Status.CONFLICT)
                    .entity(gson.toJson("El email ya esta registrado"))
                    .build();
        }
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Usuarios usuario) {
        ejbUsuariosFacade.edit(usuario);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        ejbUsuariosFacade.remove(ejbUsuariosFacade.find(id));
    }

    @GET
    public List<Usuarios> findAll() {
        return ejbUsuariosFacade.findAll();
    }

    @GET
    @Path("{id}")
    public Usuarios findById(@PathParam("id") Integer id) {
        return ejbUsuariosFacade.find(id);
    }
    
    @GET
    @Path("nombre/{nombre}")
    public List<Usuarios> findByNombre(@PathParam("nombre") String nombre) {
        return ejbUsuariosFacade.findByNombre(nombre);
    }

}
