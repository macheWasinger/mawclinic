package com.mycompany.sistematurnos.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Paciente implements Serializable, Identificable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Basic
    private String nombre;
    private String dni;
    private String telefono;
    private String email;
    
    /*  - cascade = CascadeType.ALL incluye persistir, borrar, actualizar, etc.
        - orphanRemoval = true elimina turnos que ya no estén asociadas a ningún paciente. 
        - mappedBy = "pacienteAsociado", es para que desde la clase "Turno", la variable de 
        instancia "pacienteAsociado" se encargue de generar el @OneToMany. 
    */
    @OneToMany(mappedBy = "pacienteAsociado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Turno> turnos;
    
    public Paciente(){}
    
    public Paciente(String nombre, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
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
    public String getDescripcion() { return getNombre(); }
    
    public String getDni() { return dni; }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getEmail() { return email; }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Turno> getTurnos() { return turnos; }
    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    
    @Override
    public String toString() {
        return nombre + " - " + dni;
    }
}
