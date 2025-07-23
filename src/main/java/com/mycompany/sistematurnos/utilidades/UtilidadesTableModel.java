package com.mycompany.sistematurnos.utilidades;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


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
    
    
    public static void personalizarTablaDeDatos(JTable tabla) {
        DefaultTableCellRenderer rendererConMargenYTooltip = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                label.setBorder(new EmptyBorder(10, 5, 10, 5));
                label.setToolTipText(null); // reset

                if (value != null) {
                    String text = value.toString();
                    FontMetrics fm = label.getFontMetrics(label.getFont());
                    int textWidth = fm.stringWidth(text);
                    int columnWidth = table.getColumnModel().getColumn(column).getWidth();

                    int margin = 20; // margen interno + icono de orden
                    if (textWidth + margin > columnWidth) {
                        label.setToolTipText(text);
                    }
                }

                return label;
            }
        };

        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(rendererConMargenYTooltip);
        }

        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        tabla.setRowHeight(20);

        JTableHeader header = tabla.getTableHeader();
        header.setBackground(new Color(220, 241, 255));
        header.setForeground(new Color(35, 64, 102));
        header.setFont(new Font("Segoe UI", Font.BOLD, 13));
    }
}
