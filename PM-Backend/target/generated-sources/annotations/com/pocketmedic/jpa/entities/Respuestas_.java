package com.pocketmedic.jpa.entities;

import com.pocketmedic.jpa.entities.Consultas;
import com.pocketmedic.jpa.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T11:42:54")
@StaticMetamodel(Respuestas.class)
public class Respuestas_ { 

    public static volatile SingularAttribute<Respuestas, String> descripcion;
    public static volatile SingularAttribute<Respuestas, Consultas> idConsultas;
    public static volatile SingularAttribute<Respuestas, Usuarios> idUsuario;
    public static volatile SingularAttribute<Respuestas, Integer> idRespuestas;

}