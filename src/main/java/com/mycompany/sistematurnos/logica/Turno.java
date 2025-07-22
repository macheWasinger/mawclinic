package com.mycompany.sistematurnos.logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "fecha")
    private LocalDate fecha;
    
    @Column(name = "hora")
    private LocalTime hora;
    
    
    /* @JoinColumn, une al "ArrayList<Turno> turnos" creada en las clases "Medico" y "Paciente" 
    con la columna "medicoAsociado_id" y "pacienteAsociado_id" creada en la tabla "turnos" de 
    la base de datos. 
    "medicoAsociado_id" y "pacienteAsociado_id" contienen la clave primaria del "médico y/o 
    paciente" al que pertenece el turno. */
    
    @ManyToOne
    @JoinColumn(name = "medicoAsociado_id")
    private Medico medicoAsociado;
    
    @ManyToOne
    @JoinColumn(name = "pacienteAsociado_id")
    private Paciente pacienteAsociado;
    
    /* 
        - DateTimeFormatter NO implementa Serializable y no es un dato que tenga sentido guardar
        en la base de datos.
        - Es sólo una herramienta para formatear fechas en la salida (como usás en toString()).
        - Al marcarlo @Transient, JPA lo ignora y no intenta persistirlo, evitando el error. 
    */
    @Transient
    DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    @Transient
    DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");
    
    public Turno(){}
    
    public Turno(LocalDate fecha, LocalTime hora, Medico medicoAsociado, Paciente pacienteAsociado) {
        this.fecha = fecha;
        this.hora = hora;
        this.medicoAsociado = medicoAsociado;
        this.pacienteAsociado = pacienteAsociado;
    }
    
    public Long getId() { return id; }
    public void setId(Long id) {
        this.id = id;
    }
    
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    public Medico getMedicoAsociado() { return medicoAsociado; }
    public void setMedicoAsociado(Medico medicoAsociado) {
        this.medicoAsociado = medicoAsociado;
    }
    
    public Paciente getPacienteAsociado() { return pacienteAsociado; }
    public void setPacienteAsociado(Paciente pacienteAsociado) {
        this.pacienteAsociado = pacienteAsociado;
    }
    
    @Override
    public String toString() {
        return "Turno{" + 
                "id=" + (id != null ? id : "no asignado") + 
                ", fecha=" + (fecha != null ? fecha.format(fechaFormatter) : "sin fecha") + 
                ", hora=" + (hora != null ? hora.format(horaFormatter) : "sin hora") + 
                ", medico=" + (medicoAsociado != null ? medicoAsociado.getNombre() : "sin médico") + 
                ", paciente=" + (pacienteAsociado != null ? pacienteAsociado.getNombre() : "sin paciente") + 
                "}";
    }
}
