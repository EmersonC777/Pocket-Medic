/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adsi1
 */
@Entity
@Table(name = "TIPOS_DE_PAGOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposDePagos.findAll", query = "SELECT t FROM TiposDePagos t"),
    @NamedQuery(name = "TiposDePagos.findByIdTipoPago", query = "SELECT t FROM TiposDePagos t WHERE t.idTipoPago = :idTipoPago"),
    @NamedQuery(name = "TiposDePagos.findByDescripcion", query = "SELECT t FROM TiposDePagos t WHERE t.descripcion = :descripcion")})
public class TiposDePagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipo_pago")
    private Integer idTipoPago;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idTipoPago")
    private List<Pagos> pagosList;

    public TiposDePagos() {
    }

    public TiposDePagos(Integer idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public Integer getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(Integer idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Pagos> getPagosList() {
        return pagosList;
    }

    public void setPagosList(List<Pagos> pagosList) {
        this.pagosList = pagosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoPago != null ? idTipoPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposDePagos)) {
            return false;
        }
        TiposDePagos other = (TiposDePagos) object;
        if ((this.idTipoPago == null && other.idTipoPago != null) || (this.idTipoPago != null && !this.idTipoPago.equals(other.idTipoPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pocketmedic.jpa.entities.TiposDePagos[ idTipoPago=" + idTipoPago + " ]";
    }
    
}
