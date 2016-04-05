/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.jpa.session;

import com.pocketmedic.jpa.entities.EmpresasPagos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adsi1
 */
@Stateless
public class EmpresasPagosFacade extends AbstractFacade<EmpresasPagos> {

    @PersistenceContext(unitName = "com.mycompany_mavenproject2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpresasPagosFacade() {
        super(EmpresasPagos.class);
    }
    
}
