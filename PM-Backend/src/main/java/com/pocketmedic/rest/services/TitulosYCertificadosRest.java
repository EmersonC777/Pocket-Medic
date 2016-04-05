/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.rest.services;

import com.pocketmedic.jpa.entities.TitulosYCertificados;
import com.pocketmedic.jpa.session.TitulosYCertificadosFacade;
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
@Path("titulosycertificados")
public class TitulosYCertificadosRest {
    @EJB 
    private TitulosYCertificadosFacade ejbTitulosYCertificadosFacade;
    

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TitulosYCertificados> findAll() {
        return ejbTitulosYCertificadosFacade.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TitulosYCertificados findById(@PathParam("id") Integer id) {
        return ejbTitulosYCertificadosFacade.find(id);
    }
}
