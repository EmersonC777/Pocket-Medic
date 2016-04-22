package com.pocketmedic.jpa.entities;

import com.pocketmedic.jpa.entities.EmpresasPagos;
import com.pocketmedic.jpa.entities.TiposDePagos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T11:42:54")
@StaticMetamodel(Pagos.class)
public class Pagos_ { 

    public static volatile SingularAttribute<Pagos, Date> fecha;
    public static volatile ListAttribute<Pagos, EmpresasPagos> empresasPagosList;
    public static volatile SingularAttribute<Pagos, Boolean> estado;
    public static volatile SingularAttribute<Pagos, TiposDePagos> idTipoPago;
    public static volatile SingularAttribute<Pagos, Integer> idPagos;

}