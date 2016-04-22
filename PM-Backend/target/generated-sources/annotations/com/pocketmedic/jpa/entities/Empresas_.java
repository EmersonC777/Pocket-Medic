package com.pocketmedic.jpa.entities;

import com.pocketmedic.jpa.entities.EmpresasPagos;
import com.pocketmedic.jpa.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T11:42:54")
@StaticMetamodel(Empresas.class)
public class Empresas_ { 

    public static volatile ListAttribute<Empresas, EmpresasPagos> empresasPagosList;
    public static volatile ListAttribute<Empresas, Usuarios> usuariosList;
    public static volatile SingularAttribute<Empresas, String> nit;
    public static volatile SingularAttribute<Empresas, Integer> idEmpresa;
    public static volatile SingularAttribute<Empresas, String> tipoDeServicio;
    public static volatile SingularAttribute<Empresas, String> nombre;

}