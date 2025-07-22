package com.mycompany.sistematurnos.logica;

import com.mycompany.sistematurnos.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    /* Los métodos creados pertenecen a la propia clase "ControladoraLogica". En cambio,
    Los métodos internos invocados desde el objeto "controlPersis", pertenecen a la clase 
    "ControladoraPersistencia". */
    
    //------------- MÉDICO -------------
    public void guardarMedico(String nombreMedico, String especialidadMedi, String telMedico, String matricMedico, String emailMedico, List<String> listaHorarios) {
        // Creo el objeto "Medico"
        Medico medico = new Medico();
        
        // Le asigno los valores a cada atributo del objeto creado:
        medico.setNombre(nombreMedico);
        medico.setEspecialidad(especialidadMedi);
        medico.setTelefono(telMedico);
        medico.setMatricula(matricMedico);
        medico.setEmail(emailMedico);
        medico.setHorariosDisponibles(listaHorarios);
        
        /* La "controladoraLogica" se encarga de crear el objeto y 
           asignarle los valores a sus atributos.
           Ahora llamo a la "controladoraPersistencia" para que se
           encargue de crear el objeto y guardarlos en la base de 
           datos mediante el método "guardarMedico" (que primero fue
           creado en la "interfaz gráfica" y después se lo pasé a la
           "controladoraLogica"). */
        controlPersis.guardarMedico(medico);
    }
    
    public void eliminarMedico(Long id) {
        controlPersis.eliminarMedico(id);
    }
    
    public void editarMedico(Medico medi) {
        controlPersis.editarMedico(medi);
    }
    
    public Medico traerMedico(Long id) {
        return controlPersis.traerMedico(id);
    }
    
    public List<Medico> traerListaMedicos() {
        /* La "controladoraLogica" actúa como intermediaria. O sea, 
           recibe la solicitud de que necesitas la lista de Médicos
           y le dice a la "controladoraPersistencia" que las traiga,  
           y esta las trae desde la base de datos mediante el JPA Controller. */
        return controlPersis.traerListaMedicos();
    }
    
    public void modificarDatosDelMedico(Medico medi, String nombreMedico, String especialidadMedi, String telMedico, String matricMedico, String emailMedico, List<String> listaHorarios) {
        /* Al parámetro "medi" que es mi objeto viejo, le asigno
        los nuevos valores ingresados en la pantalla de edición. */ 
        medi.setNombre(nombreMedico);
        medi.setEspecialidad(especialidadMedi);
        medi.setTelefono(telMedico);
        medi.setMatricula(matricMedico);
        medi.setEmail(emailMedico);
        medi.setHorariosDisponibles(listaHorarios);
        
        /* Creo el método "modificarDatosDelMedico" en la "controladoraPersistencia"
        para que se encargue de modificarlo en la base de datos mediante
        el JPA Controller. */
        controlPersis.modificarDatosDelMedico(medi);
    }

    //------------------------------------
    
    
    //------------- PACIENTE -------------
    public void guardarPaciente(String nombrePaciente, String dniPaciente, String telPaciente, String emailPaciente) {
        Paciente paciente = new Paciente();
        paciente.setNombre(nombrePaciente);
        paciente.setDni(dniPaciente);
        paciente.setTelefono(telPaciente);
        paciente.setEmail(emailPaciente);
        
        controlPersis.guardarPaciente(paciente);
    }
    
    public void eliminarPaciente(Long id) {
        controlPersis.eliminarPaciente(id);
    }
    
    public void editarPaciente(Paciente paci) {
        controlPersis.editarPaciente(paci);
    }
    
    public Paciente traerPaciente(Long id) {
        return controlPersis.traerPaciente(id);
    }
    
    public List<Paciente> traerListaPacientes() {
        return controlPersis.traerListaPacientes();
    }

    public void modificarDatosDelPaciente(Paciente paci, String nombrePaciente, String dniPaciente, String telPaciente, String emailPaciente) {
        paci.setNombre(nombrePaciente);
        paci.setDni(dniPaciente);
        paci.setTelefono(telPaciente);
        paci.setEmail(emailPaciente);
        
        controlPersis.modificarDatosDelPaciente(paci);
    }

    //------------------------------------
    
    
    //------------- TURNO -------------    
    public void guardarTurno(LocalDate fechaObtenida, LocalTime horaLocal, Medico medicoSeleccionado, Paciente pacienteSeleccionado) {
        Turno turno = new Turno();
        turno.setFecha(fechaObtenida);
        turno.setHora(horaLocal);
        turno.setMedicoAsociado(medicoSeleccionado);
        turno.setPacienteAsociado(pacienteSeleccionado);
        
        controlPersis.guardarTurno(turno);
    }
    
    public void eliminarTurno(Long id) {
        controlPersis.eliminarTurno(id);
    }
    
    public void editarTurno(Turno turno) {
        controlPersis.editarTurno(turno);
    }
    
    public Turno traerTurno(Long id) {
        return controlPersis.traerTurno(id);
    }
    
    public List<Turno> traerListaTurnos() {
        return controlPersis.traerListaTurnos();
    }

    public void modificarDatosDelTurno(Turno turno, LocalDate fechaObtenida, LocalTime horaLocal, Medico medicoSeleccionado, Paciente pacienteSeleccionado) {
        turno.setFecha(fechaObtenida);
        turno.setHora(horaLocal);
        turno.setMedicoAsociado(medicoSeleccionado);
        turno.setPacienteAsociado(pacienteSeleccionado);
        
        controlPersis.modificarDatosDelTurno(turno);
    }
    //------------------------------------ 
}
