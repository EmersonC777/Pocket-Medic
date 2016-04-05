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
@Table(name = "PROFESIONES_USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfesionesUsuarios.findAll", query = "SELECT p FROM ProfesionesUsuarios p"),
    @NamedQuery(name = "ProfesionesUsuarios.findByIdProfesionUsuario", query = "SELECT p FROM ProfesionesUsuarios p WHERE p.profesionesUsuariosPK.idProfesionUsuario = :idProfesionUsuario"),
    @NamedQuery(name = "ProfesionesUsuarios.findByIdProfesiones", query = "SELECT p FROM ProfesionesUsuarios p WHERE p.profesionesUsuariosPK.idProfesiones = :idProfesiones"),
    @NamedQuery(name = "ProfesionesUsuarios.findByIdUsuario", query = "SELECT p FROM ProfesionesUsuarios p WHERE p.profesionesUsuariosPK.idUsuario = :idUsuario")})
public class ProfesionesUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProfesionesUsuariosPK profesionesUsuariosPK;
    @JoinColumn(name = "id_profesiones", referencedColumnName = "id_profesiones", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TitulosYCertificados titulosYCertificados;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuarios usuarios;

    public ProfesionesUsuarios() {
    }

    public ProfesionesUsuarios(ProfesionesUsuariosPK profesionesUsuariosPK) {
        this.profesionesUsuariosPK = profesionesUsuariosPK;
    }

    public ProfesionesUsuarios(int idProfesionUsuario, int idProfesiones, int idUsuario) {
        this.profesionesUsuariosPK = new ProfesionesUsuariosPK(idProfesionUsuario, idProfesiones, idUsuario);
    }

    public ProfesionesUsuariosPK getProfesionesUsuariosPK() {
        return profesionesUsuariosPK;
    }

    public void setProfesionesUsuariosPK(ProfesionesUsuariosPK profesionesUsuariosPK) {
        this.profesionesUsuariosPK = profesionesUsuariosPK;
    }

    public TitulosYCertificados getTitulosYCertificados() {
        return titulosYCertificados;
    }

    public void setTitulosYCertificados(TitulosYCertificados titulosYCertificados) {
        this.titulosYCertificados = titulosYCertificados;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profesionesUsuariosPK != null ? profesionesUsuariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfesionesUsuarios)) {
            return false;
        }
        ProfesionesUsuarios other = (ProfesionesUsuarios) object;
        if ((this.profesionesUsuariosPK == null && other.profesionesUsuariosPK != null) || (this.profesionesUsuariosPK != null && !this.profesionesUsuariosPK.equals(other.profesionesUsuariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pocketmedic.jpa.entities.ProfesionesUsuarios[ profesionesUsuariosPK=" + profesionesUsuariosPK + " ]";
    }
    
}
