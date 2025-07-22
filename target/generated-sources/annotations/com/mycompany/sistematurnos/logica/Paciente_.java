package com.mycompany.sistematurnos.logica;

import com.mycompany.sistematurnos.logica.Turno;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-07-08T11:43:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile ListAttribute<Paciente, Turno> turnos;
    public static volatile SingularAttribute<Paciente, Long> id;
    public static volatile SingularAttribute<Paciente, String> telefono;
    public static volatile SingularAttribute<Paciente, String> nombre;
    public static volatile SingularAttribute<Paciente, String> dni;
    public static volatile SingularAttribute<Paciente, String> email;

}