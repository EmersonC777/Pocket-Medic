/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.rest.services;

import com.pocketmedic.jpa.entities.CitasMedicas;
import com.pocketmedic.jpa.entities.Respuestas;
import com.pocketmedic.jpa.session.CitasMedicasFacade;
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
@Path("citasmedicas")
public class CitasMedicasRest {
    @EJB
    private CitasMedicasFacade ejbCitasMedicasFacade;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(CitasMedicas citasmedicas) {
        ejbCitasMedicasFacade.create(citasmedicas);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, CitasMedicas citasmedicas) {
        ejbCitasMedicasFacade.edit(citasmedicas);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        ejbCitasMedicasFacade.remove(ejbCitasMedicasFacade.find(id));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CitasMedicas> findAll() {
        return ejbCitasMedicasFacade.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CitasMedicas findById(@PathParam("id") Integer id) {
        return ejbCitasMedicasFacade.find(id);
    }
}
