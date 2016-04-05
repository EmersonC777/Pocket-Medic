/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.rest.services;

import com.pocketmedic.jpa.entities.Consultas;
import com.pocketmedic.jpa.session.ConsultasFacade;
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
@Path("consultas")
public class ConsultasRest {
    @EJB 
    private ConsultasFacade ejbConsultasFacade;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Consultas consulta) {
        ejbConsultasFacade.create(consulta);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, Consultas consulta) {
        ejbConsultasFacade.edit(consulta);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        ejbConsultasFacade.remove(ejbConsultasFacade.find(id));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Consultas> findAll() {
        return ejbConsultasFacade.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Consultas findById(@PathParam("id") Integer id) {
        return ejbConsultasFacade.find(id);
    }
}
