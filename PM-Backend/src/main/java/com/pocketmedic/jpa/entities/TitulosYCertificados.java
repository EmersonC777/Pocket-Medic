/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "TITULOS_Y_CERTIFICADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TitulosYCertificados.findAll", query = "SELECT t FROM TitulosYCertificados t"),
    @NamedQuery(name = "TitulosYCertificados.findByIdProfesiones", query = "SELECT t FROM TitulosYCertificados t WHERE t.idProfesiones = :idProfesiones"),
    @NamedQuery(name = "TitulosYCertificados.findByTitulos", query = "SELECT t FROM TitulosYCertificados t WHERE t.titulos = :titulos")})
public class TitulosYCertificados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_profesiones")
    private Integer idProfesiones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "titulos")
    private String titulos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "titulosYCertificados")
    private List<ProfesionesUsuarios> profesionesUsuariosList;

    public TitulosYCertificados() {
    }

    public TitulosYCertificados(Integer idProfesiones) {
        this.idProfesiones = idProfesiones;
    }

    public TitulosYCertificados(Integer idProfesiones, String titulos) {
        this.idProfesiones = idProfesiones;
        this.titulos = titulos;
    }

    public Integer getIdProfesiones() {
        return idProfesiones;
    }

    public void setIdProfesiones(Integer idProfesiones) {
        this.idProfesiones = idProfesiones;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    @XmlTransient
    public List<ProfesionesUsuarios> getProfesionesUsuariosList() {
        return profesionesUsuariosList;
    }

    public void setProfesionesUsuariosList(List<ProfesionesUsuarios> profesionesUsuariosList) {
        this.profesionesUsuariosList = profesionesUsuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfesiones != null ? idProfesiones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TitulosYCertificados)) {
            return false;
        }
        TitulosYCertificados other = (TitulosYCertificados) object;
        if ((this.idProfesiones == null && other.idProfesiones != null) || (this.idProfesiones != null && !this.idProfesiones.equals(other.idProfesiones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pocketmedic.jpa.entities.TitulosYCertificados[ idProfesiones=" + idProfesiones + " ]";
    }
    
}
