package com.mycompany.sistematurnos;

import com.mycompany.sistematurnos.igu.Principal;

public class SistemaTurnos {
    public static void main(String[] args) {
        
        // EJECUTO EL JFrame DE LA PANTALLA "Principal" ASÍ EJECUTA LA PANTALLA "CargarMedico"
        Principal princ = new Principal();
        princ.setVisible(true); // Muestra la pantalla Principal
        princ.setLocationRelativeTo(null); // Para centrar la pantalla vertical y horizontalmente
        
    } 
}
