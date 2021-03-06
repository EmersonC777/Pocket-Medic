/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.jpa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adsi1
 */
@Entity
@Table(name = "PAGOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagos.findAll", query = "SELECT p FROM Pagos p"),
    @NamedQuery(name = "Pagos.findByIdPagos", query = "SELECT p FROM Pagos p WHERE p.idPagos = :idPagos"),
    @NamedQuery(name = "Pagos.findByEstado", query = "SELECT p FROM Pagos p WHERE p.estado = :estado"),
    @NamedQuery(name = "Pagos.findByFecha", query = "SELECT p FROM Pagos p WHERE p.fecha = :fecha")})
public class Pagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pagos")
    private Integer idPagos;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pagos")
    private List<EmpresasPagos> empresasPagosList;
    @JoinColumn(name = "id_tipo_pago", referencedColumnName = "id_tipo_pago")
    @ManyToOne
    private TiposDePagos idTipoPago;

    public Pagos() {
    }

    public Pagos(Integer idPagos) {
        this.idPagos = idPagos;
    }

    public Integer getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(Integer idPagos) {
        this.idPagos = idPagos;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<EmpresasPagos> getEmpresasPagosList() {
        return empresasPagosList;
    }

    public void setEmpresasPagosList(List<EmpresasPagos> empresasPagosList) {
        this.empresasPagosList = empresasPagosList;
    }

    public TiposDePagos getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(TiposDePagos idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPagos != null ? idPagos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagos)) {
            return false;
        }
        Pagos other = (Pagos) object;
        if ((this.idPagos == null && other.idPagos != null) || (this.idPagos != null && !this.idPagos.equals(other.idPagos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pocketmedic.jpa.entities.Pagos[ idPagos=" + idPagos + " ]";
    }
    
}
