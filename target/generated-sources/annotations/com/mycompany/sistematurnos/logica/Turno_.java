package com.mycompany.sistematurnos.logica;

import com.mycompany.sistematurnos.logica.Medico;
import com.mycompany.sistematurnos.logica.Paciente;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-07-08T11:43:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, LocalDate> fecha;
    public static volatile SingularAttribute<Turno, LocalTime> hora;
    public static volatile SingularAttribute<Turno, Paciente> pacienteAsociado;
    public static volatile SingularAttribute<Turno, Long> id;
    public static volatile SingularAttribute<Turno, Medico> medicoAsociado;

}