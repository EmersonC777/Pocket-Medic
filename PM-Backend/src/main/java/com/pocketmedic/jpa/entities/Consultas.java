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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CONSULTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consultas.findAll", query = "SELECT c FROM Consultas c"),
    @NamedQuery(name = "Consultas.findByIdConsultas", query = "SELECT c FROM Consultas c WHERE c.idConsultas = :idConsultas"),
    @NamedQuery(name = "Consultas.findByDescripcion", query = "SELECT c FROM Consultas c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Consultas.findByPublico", query = "SELECT c FROM Consultas c WHERE c.publico = :publico"),
    @NamedQuery(name = "Consultas.findByUrlImage", query = "SELECT c FROM Consultas c WHERE c.urlImage = :urlImage")})
public class Consultas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_consultas")
    private Integer idConsultas;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "publico")
    private Boolean publico;
    @Size(max = 500)
    @Column(name = "url_image")
    private String urlImage;
    @JoinColumn(name = "usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuarios usuario;
    @JoinColumn(name = "medico", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuarios medico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConsultas")
    private List<Respuestas> respuestasList;

    public Consultas() {
    }

    public Consultas(Integer idConsultas) {
        this.idConsultas = idConsultas;
    }

    public Integer getIdConsultas() {
        return idConsultas;
    }

    public void setIdConsultas(Integer idConsultas) {
        this.idConsultas = idConsultas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getPublico() {
        return publico;
    }

    public void setPublico(Boolean publico) {
        this.publico = publico;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Usuarios getMedico() {
        return medico;
    }

    public void setMedico(Usuarios medico) {
        this.medico = medico;
    }

    @XmlTransient
    public List<Respuestas> getRespuestasList() {
        return respuestasList;
    }

    public void setRespuestasList(List<Respuestas> respuestasList) {
        this.respuestasList = respuestasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsultas != null ? idConsultas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consultas)) {
            return false;
        }
        Consultas other = (Consultas) object;
        if ((this.idConsultas == null && other.idConsultas != null) || (this.idConsultas != null && !this.idConsultas.equals(other.idConsultas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pocketmedic.jpa.entities.Consultas[ idConsultas=" + idConsultas + " ]";
    }
    
}
