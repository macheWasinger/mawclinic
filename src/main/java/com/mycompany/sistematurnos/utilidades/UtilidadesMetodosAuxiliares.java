package com.mycompany.sistematurnos.utilidades;

import com.mycompany.sistematurnos.igu.PanelVerDatosMedicos;
import com.mycompany.sistematurnos.igu.PanelVerDatosPacientes;
import com.mycompany.sistematurnos.igu.PanelVerDatosTurnos;
import com.mycompany.sistematurnos.logica.ControladoraLogica;
import com.mycompany.sistematurnos.logica.Medico;
import com.mycompany.sistematurnos.logica.Paciente;
import java.awt.Component;

public class UtilidadesMetodosAuxiliares {
    //ControladoraLogica controlLogico = new ControladoraLogica();
    
    // "panel" recibe el "this" de la clase que lo invoca.
    public static void recargarTablaPanelVerDatosMedico(Component panel) {
        
        /* "getParent()", hace referencia al JPanel "panelPantallas" que contiene
        a todas las CardLayout.
        Por ejemplo, si estoy en "PanelEditarMedico", con "this" hago referencia
        a la clase nombrada. Por ende, con el código "this.getParent()", me refiero
        al CardLayout "PanelEditarMedico" que se encuentra en el contenedor 
        JPanel "panelPantallas". */
        Component[] componentes = panel.getParent().getComponents();
        /* getComponents(), obtiene todos los componentes hijos de ese 
        contenedor padre. Es decir, si panelPantallas tiene varios paneles 
        cargados (PanelVerDatosMedicos, PanelEditarMedico, etc.), getComponents()
        devuelve un array con todos ellos: */
        
        // Recorre uno por uno esos componentes:
       for (Component c : componentes) {
           
           // 'c' es cada panel que está adentro del CardLayout.
           if (c instanceof PanelVerDatosMedicos) {
               /* if (c instanceof PanelVerDatosMedicos)
                Pregunta:
                ¿Este componente es de tipo PanelVerDatosMedicos?
                Si es sí, entonces sabemos que es el panel que muestra la "tabla 
                de médicos". */
               
               /* Si se cumple la condición, hago un cast para poder acceder 
               a sus métodos e invoco al método "cargarTabla" de la clase 
               "PanelVerDatosMedico" para recargar la tabla y mostrar sus datos 
               actualizados. */
               ((PanelVerDatosMedicos) c).cargarTabla();
               /* 'c' es un Component y, mediante el casteo, lo convierto a 
               "PanelVerDatosMedicos" para poder invocar su método cargarTabla(). 
               */
               break;
           }
       }
    }

    public static void recargarTablaPanelVerDatosPaciente(Component panel) {
       Component[] componentes = panel.getParent().getComponents();

       for (Component c : componentes) {
           
           if (c instanceof PanelVerDatosPacientes) {
               PanelVerDatosPacientes panelPacientes = (PanelVerDatosPacientes) c;
               panelPacientes.cargarTabla();
               panelPacientes.limpiarBusqueda();
               break;
           }
       }
    }

    public static void recargarTablaPanelVerDatosTurno(Component panel) {
       Component[] componentes = panel.getParent().getComponents();

       for (Component c : componentes) {
           
           if (c instanceof PanelVerDatosTurnos) {

               ((PanelVerDatosTurnos) c).cargarTabla();
               break;
           }
       }
    }
}
