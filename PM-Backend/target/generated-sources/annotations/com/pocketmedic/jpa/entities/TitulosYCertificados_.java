package com.pocketmedic.jpa.entities;

import com.pocketmedic.jpa.entities.ProfesionesUsuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-04T19:30:43")
@StaticMetamodel(TitulosYCertificados.class)
public class TitulosYCertificados_ { 

    public static volatile SingularAttribute<TitulosYCertificados, String> titulos;
    public static volatile SingularAttribute<TitulosYCertificados, Integer> idProfesiones;
    public static volatile ListAttribute<TitulosYCertificados, ProfesionesUsuarios> profesionesUsuariosList;

}