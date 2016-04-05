/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.rest.services;

import com.pocketmedic.jpa.entities.ProfesionesUsuarios;
import com.pocketmedic.jpa.session.ProfesionesUsuariosFacade;
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
@Path("profesionesusuarios")
public class ProfesionesUsuarioRest {
    @EJB 
    private ProfesionesUsuariosFacade ejbProfesionesUsuariosFacade;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(ProfesionesUsuarios profesionesusuarios) {
        ejbProfesionesUsuariosFacade.create(profesionesusuarios);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, ProfesionesUsuarios respuesta) {
        ejbProfesionesUsuariosFacade.edit(respuesta);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        ejbProfesionesUsuariosFacade.remove(ejbProfesionesUsuariosFacade.find(id));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProfesionesUsuarios> findAll() {
        return ejbProfesionesUsuariosFacade.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ProfesionesUsuarios findById(@PathParam("id") Integer id) {
        return ejbProfesionesUsuariosFacade.find(id);
    }
}
