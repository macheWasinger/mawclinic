package com.mycompany.sistematurnos.utilidades;

import javax.swing.table.DefaultTableModel;


public class UtilidadesTableModel {
    public static DefaultTableModel modeloTablaDeDatos_cincoParametros(String param1, String param2, String param3, String param4, String param5) {
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        // Establecemos los nombres de las columnas
        String[] titulos = {param1, param2, param3, param4, param5};
        
        // Setear datos en el modelo de la tabla
        modeloTabla.setColumnIdentifiers(titulos);
        
        return modeloTabla;
    }
    
    
    public static DefaultTableModel modeloTablaDeDatos_medico() {
        /*  - "DefaultTableModel", es una tabla "personalizable" en donde puedo
            modificarle sus columnas, filas, etc.
            - Definir el modelo que quiero que tenga la tabla.
            - ES EL DISEÑO DE LA TABLA.*/
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            
            /* - Que fila y columnas no sean editables.
               - Si o si hay que agregarle @Override para "sobrescribir"
               porque es un método que ya existe. */
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        // Establecemos los nombres de las columnas
        String[] titulos = {"Num", "Nombre", "Especialidad", "Teléfono", "Matrícula", "Email"};
        
        // Setear datos en el modelo de la tabla
        modeloTabla.setColumnIdentifiers(titulos);
        
        return modeloTabla;
    }
}
