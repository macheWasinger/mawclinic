package com.mycompany.sistematurnos.utilidades;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;

public class UtilidadesCardLayout {
    
    public static void mostrarPanel(Component contenedor, String nombrePanel) {
        CardLayout cl = (CardLayout) ((Container) contenedor).getLayout();
        cl.show((Container) contenedor, nombrePanel);
    }

    // contenedorPadre es "panelPantallas", o sea "this.getParent()"
    public static void agregarPanel(Component contenedorPadre, Component panelNuevo, String nombreIdentificadorPanel) {
        contenedorPadre.getParent().add(panelNuevo, nombreIdentificadorPanel);
    }
    
    public static void mostrarCardMenu(Container contenedor, String nombreCard) {
        CardLayout cl = (CardLayout) contenedor.getLayout();
        cl.show(contenedor, "nombreCard");
    }
    
    public static boolean yaConfirmoCancelarCargaDatos(Component contenedor, String tipo) {
        String mensaje = "¿Está seguro de que desea cancelar? El " + tipo + " no será registrado.";
        String titulo = "Cancelar carga de " + tipo;
        boolean confirmado = UtilidadesJOptionPane.confirmarAccion(contenedor, mensaje, titulo);
        
        return confirmado;
    }
       
    public static void confirmacionCancelarEdicion(Component contenedor, String nombreIdentificadorPanel, String tipo) {
        String mensaje = "¿Desea cancelar la edición de los datos del " + tipo + "? Los cambios no se guardarán.";
        String titulo = "Cancelar edición";
        boolean confirmado = UtilidadesJOptionPane.confirmarAccion(contenedor, mensaje, titulo);
        
        if (confirmado) {
            mostrarPanel(contenedor, nombreIdentificadorPanel);
        }
    }
}
