package com.pocketmedic.jpa.entities;

import com.pocketmedic.jpa.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-04T19:30:43")
@StaticMetamodel(CitasMedicas.class)
public class CitasMedicas_ { 

    public static volatile SingularAttribute<CitasMedicas, Integer> idCita;
    public static volatile SingularAttribute<CitasMedicas, Date> fechaCita;
    public static volatile SingularAttribute<CitasMedicas, Usuarios> medico;
    public static volatile SingularAttribute<CitasMedicas, Usuarios> usuario;

}