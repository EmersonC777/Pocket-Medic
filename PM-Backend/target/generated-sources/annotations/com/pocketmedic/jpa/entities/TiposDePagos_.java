package com.pocketmedic.jpa.entities;

import com.pocketmedic.jpa.entities.Pagos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T11:42:54")
@StaticMetamodel(TiposDePagos.class)
public class TiposDePagos_ { 

    public static volatile SingularAttribute<TiposDePagos, String> descripcion;
    public static volatile SingularAttribute<TiposDePagos, Integer> idTipoPago;
    public static volatile ListAttribute<TiposDePagos, Pagos> pagosList;

}