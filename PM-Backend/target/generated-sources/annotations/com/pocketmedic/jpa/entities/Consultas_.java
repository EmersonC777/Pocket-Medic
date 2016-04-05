package com.pocketmedic.jpa.entities;

import com.pocketmedic.jpa.entities.Respuestas;
import com.pocketmedic.jpa.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-04T19:30:43")
@StaticMetamodel(Consultas.class)
public class Consultas_ { 

    public static volatile SingularAttribute<Consultas, String> descripcion;
    public static volatile SingularAttribute<Consultas, Integer> idConsultas;
    public static volatile SingularAttribute<Consultas, Usuarios> medico;
    public static volatile SingularAttribute<Consultas, Usuarios> usuario;
    public static volatile ListAttribute<Consultas, Respuestas> respuestasList;
    public static volatile SingularAttribute<Consultas, Boolean> publico;
    public static volatile SingularAttribute<Consultas, String> urlImage;

}