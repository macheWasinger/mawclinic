package com.mycompany.sistematurnos.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Medico implements Serializable, Identificable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Basic
    private String nombre;
    private String especialidad;
    private String telefono;
    private String matricula;
    private String email;
    
    @ElementCollection
    private List<String> horariosDisponibles; 
    /* JPA automáticamente crea una tabla secundaria llamada, por ejemplo, 
       medico_horariosDisponibles que tiene:
            - La FK al medico_id
            - La columna con el horario. 
    */

    @OneToMany(mappedBy = "medicoAsociado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Turno> turnos;
    /*  - cascade = CascadeType.ALL incluye persistir, borrar, actualizar, etc.
        - orphanRemoval = true elimina turnos que ya no estén asociadas a ningún médico. 
        - mappedBy = "medicoAsociado", es para que desde la clase "Turno", la variable de 
        instancia "medicoAsociado" se encargue de generar el @OneToMany. 
    */
    
    public Medico(){}
    
    public Medico(String nombre, String especialidad, String telefono, String matricula, String email, List<String> horariosDisponibles) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.matricula = matricula;
        this.email = email;
        this.horariosDisponibles = horariosDisponibles;
    }
    
    // Firmas "getId()" y "getNombre(), declaradas en Identificable (interfaz creada)"
    public Long getId() { return id; }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String getDescripcion() {
        return getNombre() + " | Especialidad: " + getEspecialidad();
    }
    
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getEmail() { return email; }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Turno> getTurnos() { return turnos; }
    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    
    public List<String> getHorariosDisponibles() { return horariosDisponibles; }
    public void setHorariosDisponibles(List<String> horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
    }
    
    @Override
    public String toString() {
        return nombre + " - " + especialidad;
    }
}
