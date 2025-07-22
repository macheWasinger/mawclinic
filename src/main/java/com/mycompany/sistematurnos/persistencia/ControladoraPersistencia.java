package com.mycompany.sistematurnos.persistencia;

import com.mycompany.sistematurnos.logica.Medico;
import com.mycompany.sistematurnos.logica.Paciente;
import com.mycompany.sistematurnos.logica.Turno;
import com.mycompany.sistematurnos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    MedicoJpaController mediJpa = new MedicoJpaController();
    PacienteJpaController paciJpa = new PacienteJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();
    

    /*  - Cada método creado se invoca en la clase "ControladoraLogica".
        - "mediJpa" invoca a cada método creado automáticamente en el "MedicoJpaController".
        - "paciJpa" invoca a cada método creado automáticamente en el "PacienteJpaController".
        - "turnoJpa" invoca a cada método creado automáticamente en el "TurnoJpaController". 
    */
    
    //------------ MÉDICO -------------
    public void guardarMedico(Medico medico) {
        // Se encarga de guardar el Medico en la BD
        mediJpa.create(medico);
    }
    
    
    public void eliminarMedico(Long id) {
        try {
            mediJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarMedico(Medico medi) {
        try {
            mediJpa.edit(medi);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Medico traerMedico(Long id) {
        return mediJpa.findMedico(id);
    }
    
    public List<Medico> traerListaMedicos() {
        return mediJpa.findMedicoEntities();
    }
    
    public void modificarDatosDelMedico(Medico medi) {
        try {
            mediJpa.edit(medi);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //---------------------------------
    
    
    //------------ PACIENTE -------------
    public void guardarPaciente(Paciente paci) {
        paciJpa.create(paci);
    }
    
    public void eliminarPaciente(Long id) {
        try {
            paciJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarPaciente(Paciente paci) {
        try {
            paciJpa.edit(paci);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Paciente traerPaciente(Long id) {
        return paciJpa.findPaciente(id);
    }
    
    public List<Paciente> traerListaPacientes() {
        return paciJpa.findPacienteEntities();
    }
    
    public void modificarDatosDelPaciente(Paciente paci) {
        try {
            paciJpa.edit(paci);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //---------------------------------
    
        //------------ TURNO -------------
    public void guardarTurno(Turno turno) {
        turnoJpa.create(turno);
    }
    
    public void eliminarTurno(Long id) {
        try {
            turnoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarTurno(Turno turno) {
        try {
            turnoJpa.edit(turno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Turno traerTurno(Long id) {
        return turnoJpa.findTurno(id);
    }
    
    public List<Turno> traerListaTurnos() {
        return turnoJpa.findTurnoEntities();
    }
    
    public void modificarDatosDelTurno(Turno turno) {
        try {
            turnoJpa.edit(turno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //---------------------------------
}
