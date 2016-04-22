package com.pocketmedic.jpa.entities;

import com.pocketmedic.jpa.entities.CitasMedicas;
import com.pocketmedic.jpa.entities.Ciudades;
import com.pocketmedic.jpa.entities.Consultas;
import com.pocketmedic.jpa.entities.Empresas;
import com.pocketmedic.jpa.entities.ProfesionesUsuarios;
import com.pocketmedic.jpa.entities.Respuestas;
import com.pocketmedic.jpa.entities.Roles;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-21T11:42:54")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> apellidos;
    public static volatile SingularAttribute<Usuarios, Roles> idRol;
    public static volatile SingularAttribute<Usuarios, Integer> idUsuario;
    public static volatile SingularAttribute<Usuarios, String> direccion;
    public static volatile SingularAttribute<Usuarios, String> documento;
    public static volatile SingularAttribute<Usuarios, String> avatar;
    public static volatile SingularAttribute<Usuarios, String> tarjetaProfesional;
    public static volatile ListAttribute<Usuarios, Respuestas> respuestasList;
    public static volatile ListAttribute<Usuarios, Consultas> consultasList1;
    public static volatile ListAttribute<Usuarios, CitasMedicas> citasMedicasList;
    public static volatile SingularAttribute<Usuarios, String> nombres;
    public static volatile SingularAttribute<Usuarios, Date> fechaNac;
    public static volatile ListAttribute<Usuarios, Consultas> consultasList;
    public static volatile SingularAttribute<Usuarios, String> password;
    public static volatile ListAttribute<Usuarios, CitasMedicas> citasMedicasList1;
    public static volatile SingularAttribute<Usuarios, Empresas> idEmpresa;
    public static volatile SingularAttribute<Usuarios, String> telefono;
    public static volatile SingularAttribute<Usuarios, Character> sexo;
    public static volatile SingularAttribute<Usuarios, String> email;
    public static volatile SingularAttribute<Usuarios, Ciudades> ciudades;
    public static volatile ListAttribute<Usuarios, ProfesionesUsuarios> profesionesUsuariosList;

}