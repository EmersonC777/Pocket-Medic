/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pocketmedic.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author adsi1
 */
@Embeddable
public class ProfesionesUsuariosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_profesion_usuario")
    private int idProfesionUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_profesiones")
    private int idProfesiones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private int idUsuario;

    public ProfesionesUsuariosPK() {
    }

    public ProfesionesUsuariosPK(int idProfesionUsuario, int idProfesiones, int idUsuario) {
        this.idProfesionUsuario = idProfesionUsuario;
        this.idProfesiones = idProfesiones;
        this.idUsuario = idUsuario;
    }

    public int getIdProfesionUsuario() {
        return idProfesionUsuario;
    }

    public void setIdProfesionUsuario(int idProfesionUsuario) {
        this.idProfesionUsuario = idProfesionUsuario;
    }

    public int getIdProfesiones() {
        return idProfesiones;
    }

    public void setIdProfesiones(int idProfesiones) {
        this.idProfesiones = idProfesiones;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProfesionUsuario;
        hash += (int) idProfesiones;
        hash += (int) idUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfesionesUsuariosPK)) {
            return false;
        }
        ProfesionesUsuariosPK other = (ProfesionesUsuariosPK) object;
        if (this.idProfesionUsuario != other.idProfesionUsuario) {
            return false;
        }
        if (this.idProfesiones != other.idProfesiones) {
            return false;
        }
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pocketmedic.jpa.entities.ProfesionesUsuariosPK[ idProfesionUsuario=" + idProfesionUsuario + ", idProfesiones=" + idProfesiones + ", idUsuario=" + idUsuario + " ]";
    }
    
}
