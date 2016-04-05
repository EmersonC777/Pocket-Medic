/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.jpa.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adsi1
 */
@Entity
@Table(name = "EMPRESAS_PAGOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpresasPagos.findAll", query = "SELECT e FROM EmpresasPagos e"),
    @NamedQuery(name = "EmpresasPagos.findByIdEmpresaPago", query = "SELECT e FROM EmpresasPagos e WHERE e.empresasPagosPK.idEmpresaPago = :idEmpresaPago"),
    @NamedQuery(name = "EmpresasPagos.findByIdEmpresa", query = "SELECT e FROM EmpresasPagos e WHERE e.empresasPagosPK.idEmpresa = :idEmpresa"),
    @NamedQuery(name = "EmpresasPagos.findByIdPagos", query = "SELECT e FROM EmpresasPagos e WHERE e.empresasPagosPK.idPagos = :idPagos")})
public class EmpresasPagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmpresasPagosPK empresasPagosPK;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Empresas empresas;
    @JoinColumn(name = "id_pagos", referencedColumnName = "id_pagos", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pagos pagos;

    public EmpresasPagos() {
    }

    public EmpresasPagos(EmpresasPagosPK empresasPagosPK) {
        this.empresasPagosPK = empresasPagosPK;
    }

    public EmpresasPagos(int idEmpresaPago, int idEmpresa, int idPagos) {
        this.empresasPagosPK = new EmpresasPagosPK(idEmpresaPago, idEmpresa, idPagos);
    }

    public EmpresasPagosPK getEmpresasPagosPK() {
        return empresasPagosPK;
    }

    public void setEmpresasPagosPK(EmpresasPagosPK empresasPagosPK) {
        this.empresasPagosPK = empresasPagosPK;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public Pagos getPagos() {
        return pagos;
    }

    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empresasPagosPK != null ? empresasPagosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresasPagos)) {
            return false;
        }
        EmpresasPagos other = (EmpresasPagos) object;
        if ((this.empresasPagosPK == null && other.empresasPagosPK != null) || (this.empresasPagosPK != null && !this.empresasPagosPK.equals(other.empresasPagosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pocketmedic.jpa.entities.EmpresasPagos[ empresasPagosPK=" + empresasPagosPK + " ]";
    }
    
}
