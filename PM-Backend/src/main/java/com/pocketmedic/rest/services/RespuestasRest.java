/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.rest.services;

import com.pocketmedic.jpa.entities.Respuestas;
import com.pocketmedic.jpa.session.RespuestasFacade;
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

/**
 *
 * @author adsi1
 */
@Path("respuestas")
public class RespuestasRest {
    @EJB 
    private RespuestasFacade ejbRespuestasFacade;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Respuestas respuesta) {
        ejbRespuestasFacade.create(respuesta);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, Respuestas respuesta) {
        ejbRespuestasFacade.edit(respuesta);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        ejbRespuestasFacade.remove(ejbRespuestasFacade.find(id));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Respuestas> findAll() {
        return ejbRespuestasFacade.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Respuestas findById(@PathParam("id") Integer id) {
        return ejbRespuestasFacade.find(id);
    }
    
}
