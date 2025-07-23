package com.mycompany.sistematurnos.utilidades;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;

public class UtilidadesBotones {
    
    public static void aplicarHoverCelestes(JButton boton) {
        boton.setBackground(new Color(135, 198, 236, 255));
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setOpaque(true);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(new Color(72, 161, 222, 255));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(new Color(135, 198, 236, 255));
            }
        });
    }
    
    public static void aplicarHoverGrises(JButton boton) {
        boton.setBackground(new Color(213, 213, 213, 255));
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setOpaque(true);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(new Color(170, 170, 170));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(new Color(213, 213, 213, 255));
            }
        });
    }
    
    public static void aplicarIconoManoCursor(JButton boton) {
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}
