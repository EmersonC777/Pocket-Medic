package com.pocketmedic.jpa.entities;

import com.pocketmedic.jpa.entities.Ciudades;
import com.pocketmedic.jpa.entities.Paises;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T11:42:54")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, Integer> idDepartamento;
    public static volatile SingularAttribute<Departamentos, String> nombreDepartamento;
    public static volatile SingularAttribute<Departamentos, Paises> idPais;
    public static volatile ListAttribute<Departamentos, Ciudades> ciudadesList;

}