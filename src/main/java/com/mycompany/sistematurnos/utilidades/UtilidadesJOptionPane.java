package com.mycompany.sistematurnos.utilidades;

import java.awt.Component;
import javax.swing.JOptionPane;


public class UtilidadesJOptionPane {
    
    // Muestra un mensaje informativo, de error, advertencia o pregunta.
    
    /* Al parámetro "parent" lo hago de tipo "Component" para no tener ningún 
    problema cuando invoque el método "mostrarMensaje" o "confirmarAccion" 
    dentro de un JFrame, JPanel, etc. */
    
    public static void mostrarMensaje(Component parent, String mensaje, String tipo, String titulo) {
        int messageType;
        switch(tipo) {
            case "Info" -> messageType = JOptionPane.INFORMATION_MESSAGE;
            case "Error" -> messageType = JOptionPane.ERROR_MESSAGE;
            case "Warning" -> messageType = JOptionPane.WARNING_MESSAGE;
            case "Question" -> messageType = JOptionPane.QUESTION_MESSAGE;
            default -> messageType = JOptionPane.PLAIN_MESSAGE;
        }
        JOptionPane.showMessageDialog(parent, mensaje, titulo, messageType);
    }
    
    // Muestra un cuadro de confirmación y devuelve true si el usuario acepta.
    public static boolean confirmarAccion(Component parent, String mensaje, String titulo) {
        int respuesta = JOptionPane.showConfirmDialog(
            parent,
            mensaje,
            titulo,
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        return respuesta == JOptionPane.YES_OPTION;
    }
    /* Este método abre un cuadro de diálogo de confirmación con dos botones:
        - Sí
        - No
       
    - Si el usuario hace clic en Sí, respuesta vale JOptionPane.YES_OPTION, 
      entonces: "return true;"
    
    - Si el usuario hace clic en No, respuesta es JOptionPane.NO_OPTION, 
      entonces: "return false;"
    */
}
