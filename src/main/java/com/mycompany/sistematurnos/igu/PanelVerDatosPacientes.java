package com.mycompany.sistematurnos.igu;

import com.mycompany.sistematurnos.utilidades.UtilidadesCardLayout;
import com.mycompany.sistematurnos.utilidades.UtilidadesJOptionPane;
import com.mycompany.sistematurnos.logica.ControladoraLogica;
import com.mycompany.sistematurnos.logica.Paciente;
import com.mycompany.sistematurnos.utilidades.UtilidadesTableModel;
import com.mycompany.sistematurnos.utilidades.UtilidadesTexto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

public class PanelVerDatosPacientes extends javax.swing.JPanel {

    private ControladoraLogica controlLogico = null;

    public PanelVerDatosPacientes() {
        controlLogico = new ControladoraLogica();

        initComponents();
        cargarTabla();
        
        /* Así, cuando el usuario haga clic o tabule en el campo, se limpia el 
        texto, y si no escribió nada y salió del campo, vuelve el texto de ayuda. */
        txtNombreOdni.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if ("Ingrese un Nombre o DNI".equals(txtNombreOdni.getText().trim())) {
                    txtNombreOdni.setText("");
                    txtDatoFiltrado.setText("");
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtNombreOdni.getText().trim().isEmpty()) {
                    limpiarBusqueda();
                }
            }
        });
        
        txtNombreOdni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSearch.doClick(); // Simula el clic del botón Buscar
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        txtTituloPrincipal = new javax.swing.JLabel();
        panelContenedorTabla = new javax.swing.JPanel();
        panelTabla = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        subtituloTabla = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        contenedorInputBotonBuscar = new javax.swing.JPanel();
        txtNombreOdni = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        contenedorDatoFiltrado = new javax.swing.JPanel();
        txtDatoFiltrado = new javax.swing.JLabel();
        btnX = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1057, 560));

        contenedorPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));
        contenedorPrincipal.setPreferredSize(new java.awt.Dimension(1057, 560));

        txtTituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTituloPrincipal.setForeground(new java.awt.Color(74, 161, 222));
        txtTituloPrincipal.setText("Listado de Pacientes");
        txtTituloPrincipal.setAlignmentY(0.0F);
        txtTituloPrincipal.setPreferredSize(new java.awt.Dimension(271, 33));

        panelContenedorTabla.setPreferredSize(new java.awt.Dimension(1056, 431));

        panelTabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        panelTabla.setPreferredSize(new java.awt.Dimension(993, 397));

        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        panelTabla.setViewportView(tablaPacientes);

        subtituloTabla.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        subtituloTabla.setForeground(new java.awt.Color(153, 153, 153));
        subtituloTabla.setText("Seleccione un paciente para eliminar o editar sus datos:");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_30x30.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar paciente seleccionado");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit26x26.png"))); // NOI18N
        btnEditar.setToolTipText("Editar paciente seleccionado");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setFocusPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        contenedorInputBotonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        contenedorInputBotonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(221, 221, 221)));
        contenedorInputBotonBuscar.setPreferredSize(new java.awt.Dimension(267, 28));

        txtNombreOdni.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtNombreOdni.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreOdni.setText("Ingrese un Nombre o DNI");
        txtNombreOdni.setToolTipText("Presione Enter o clic en 'Buscar' luego de ingresar el texto");
        txtNombreOdni.setBorder(null);
        txtNombreOdni.setPreferredSize(new java.awt.Dimension(179, 16));
        txtNombreOdni.setSelectionEnd(32);
        txtNombreOdni.setSelectionStart(32);

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconSearch19x19.png"))); // NOI18N
        btnSearch.setToolTipText("Buscar paciente por nombre o DNI");
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setFocusPainted(false);
        btnSearch.setPreferredSize(new java.awt.Dimension(76, 25));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorInputBotonBuscarLayout = new javax.swing.GroupLayout(contenedorInputBotonBuscar);
        contenedorInputBotonBuscar.setLayout(contenedorInputBotonBuscarLayout);
        contenedorInputBotonBuscarLayout.setHorizontalGroup(
            contenedorInputBotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInputBotonBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombreOdni, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        contenedorInputBotonBuscarLayout.setVerticalGroup(
            contenedorInputBotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtNombreOdni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        contenedorDatoFiltrado.setPreferredSize(new java.awt.Dimension(242, 20));

        txtDatoFiltrado.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        txtDatoFiltrado.setForeground(new java.awt.Color(102, 102, 102));

        btnX.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnX.setForeground(new java.awt.Color(255, 0, 0));
        btnX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel13x13.png"))); // NOI18N
        btnX.setBorder(null);
        btnX.setBorderPainted(false);
        btnX.setContentAreaFilled(false);
        btnX.setFocusPainted(false);
        btnX.setMinimumSize(new java.awt.Dimension(20, 20));
        btnX.setPreferredSize(new java.awt.Dimension(24, 24));
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorDatoFiltradoLayout = new javax.swing.GroupLayout(contenedorDatoFiltrado);
        contenedorDatoFiltrado.setLayout(contenedorDatoFiltradoLayout);
        contenedorDatoFiltradoLayout.setHorizontalGroup(
            contenedorDatoFiltradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatoFiltradoLayout.createSequentialGroup()
                .addComponent(txtDatoFiltrado)
                .addGap(3, 3, 3)
                .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contenedorDatoFiltradoLayout.setVerticalGroup(
            contenedorDatoFiltradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatoFiltradoLayout.createSequentialGroup()
                .addGroup(contenedorDatoFiltradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorDatoFiltradoLayout.createSequentialGroup()
                        .addComponent(txtDatoFiltrado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorDatoFiltradoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelContenedorTablaLayout = new javax.swing.GroupLayout(panelContenedorTabla);
        panelContenedorTabla.setLayout(panelContenedorTablaLayout);
        panelContenedorTablaLayout.setHorizontalGroup(
            panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorTablaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelContenedorTablaLayout.createSequentialGroup()
                        .addComponent(subtituloTabla)
                        .addGap(418, 418, 418)
                        .addGroup(panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contenedorDatoFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contenedorInputBotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelContenedorTablaLayout.setVerticalGroup(
            panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorTablaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(contenedorDatoFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenedorTablaLayout.createSequentialGroup()
                        .addGroup(panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contenedorInputBotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelContenedorTablaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(subtituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContenedorTablaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(txtTituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (tablaPacientes.getRowCount() > 0) {

            if (tablaPacientes.getSelectedRow() != -1) {

                long num_id = Long.parseLong(String.valueOf(tablaPacientes.getValueAt(tablaPacientes.getSelectedRow(), 0)));
                boolean confirmado = UtilidadesJOptionPane.confirmarAccion(this, "¿Deseas borrar este registro?", "Confirmar eliminación");

                if (confirmado) {
                    controlLogico.eliminarPaciente(num_id);

                    // Aviso al usuario que borró correctamente
                    UtilidadesJOptionPane.mostrarMensaje(this, "Paciente eliminado correctamente", "Info", "Eliminación exitosa");

                    cargarTabla();
                }
            } // Si hizo clic en No, no pasa nada y vuelve al programa
            else {
                UtilidadesJOptionPane.mostrarMensaje(this, "No seleccionó ningún paciente", "Error", "Error al eliminar");
            }
        } else {
            UtilidadesJOptionPane.mostrarMensaje(this, "No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tablaPacientes.getRowCount() > 0) {

            if (tablaPacientes.getSelectedRow() != -1) {
                long num_id = Long.parseLong(String.valueOf(tablaPacientes.getValueAt(tablaPacientes.getSelectedRow(), 0)));

                PanelEditarPaciente pantallaEditarPaciente = new PanelEditarPaciente(num_id);

                UtilidadesCardLayout.agregarPanel(this, pantallaEditarPaciente, "PanelEditarPaciente");

                UtilidadesCardLayout.mostrarPanel(this.getParent(), "PanelEditarPaciente");
            } else {
                UtilidadesJOptionPane.mostrarMensaje(this, "No seleccionó ningún paciente", "Error", "Error al eliminar");
            }
        } else {
            UtilidadesJOptionPane.mostrarMensaje(this, "No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        /* trim()
            - Elimina los espacios al inicio y al final del texto ingresado.
            - Mejora la limpieza del dato ingresado antes de procesarlo.
        */
        String input = quitarTildes(txtNombreOdni.getText().trim());
        
        if (input.isEmpty() || input.equals("Ingrese el Nombre o DNI")) {
            txtDatoFiltrado.setText("");
            btnX.setVisible(false);
            
            // Si no hay filtro, recarga toda la tabla
            cargarTabla();
            return;
        }
        
        
        DefaultTableModel modeloTablaAmostrar = UtilidadesTableModel.modeloTablaDeDatos_cincoParametros("Num", "Nombre", "Dni", "Teléfono", "Email");

        // Carga de los datos desde la base de datos.
        List<Paciente> listaPacientes = controlLogico.traerListaPacientes();
        
        boolean pacienteBuscado = false;

        if (listaPacientes != null) {
            for (Paciente paciente : listaPacientes) {
                if (input.matches("\\d+")) {
                    if (!UtilidadesTexto.esDniValido(input)) {
                        UtilidadesJOptionPane.mostrarMensaje(this, "El DNI no es válido. Debe tener 7 u 8 dígitos", "Error", "Error al guardar el paciente");
                        return;
                    }
                    
                    if (paciente.getDni().equals(input)) {
                        Object[] objeto_paciente = crearObjetoPaciente(paciente);   
                        modeloTablaAmostrar.addRow(objeto_paciente);
                        
                        txtDatoFiltrado.setText("Filtrando: " + paciente.getNombre());
                        btnX.setVisible(true);
                        txtNombreOdni.setText("");
                        pacienteBuscado = true;
                    }
                } else {
                    if (!UtilidadesTexto.esNombreValido(input)) {
                        UtilidadesJOptionPane.mostrarMensaje(this, "El nombre solo puede contener letras y espacios", "Error", "Error al guardar el paciente");
                        return;
                    }
                    
                    if (quitarTildes(paciente.getNombre()).equalsIgnoreCase(input)) {
                        Object[] objeto_paciente = crearObjetoPaciente(paciente);
                        modeloTablaAmostrar.addRow(objeto_paciente);
                        
                        txtDatoFiltrado.setText("Filtrando: " + paciente.getNombre());
                        btnX.setVisible(true);
                        txtNombreOdni.setText("");
                        pacienteBuscado = true;
                    }
                }
            }
            
            if (pacienteBuscado) {
                tablaPacientes.setModel(modeloTablaAmostrar);
            } else {
                UtilidadesJOptionPane.mostrarMensaje(this, "No se encontró el paciente", "Error", "Error al buscar");
                
                // Opcional: mostrar tabla completa si no encontró nada
                cargarTabla();
                limpiarBusqueda();
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed

        limpiarBusqueda();
    }//GEN-LAST:event_btnXActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnX;
    private javax.swing.JPanel contenedorDatoFiltrado;
    private javax.swing.JPanel contenedorInputBotonBuscar;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JPanel panelContenedorTabla;
    private javax.swing.JScrollPane panelTabla;
    private javax.swing.JLabel subtituloTabla;
    private javax.swing.JTable tablaPacientes;
    private javax.swing.JLabel txtDatoFiltrado;
    private javax.swing.JTextField txtNombreOdni;
    private javax.swing.JLabel txtTituloPrincipal;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        txtDatoFiltrado.setText("");
        btnX.setVisible(false);
        
        DefaultTableModel modeloTablaAmostrar = UtilidadesTableModel.modeloTablaDeDatos_cincoParametros("Num", "Nombre", "Dni", "Teléfono", "Email");
        
        // Carga de los datos desde la base de datos.
        List<Paciente> listaPacientes = controlLogico.traerListaPacientes();

        if (listaPacientes != null) {
            for (Paciente paciente : listaPacientes) {
                
                // Obtengo el array desde la función "crearObjetoPaciente"
                Object[] objeto_paciente = crearObjetoPaciente(paciente);
                
                // Agrego el objeto en cada fila de la tabla
                modeloTablaAmostrar.addRow(objeto_paciente);
            }
        }
        
        /* A la tabla creada en el "Design" llamada "tablaPacientes", le agrego
        el "modeloTablaAmostrar". */
        tablaPacientes.setModel(modeloTablaAmostrar);
    }

    // Crea un array de tipo Object[] con los datos del paciente
    public Object[] crearObjetoPaciente(Paciente paciente) { 
        Object[] objeto = {paciente.getId(), paciente.getNombre(),
            paciente.getDni(), paciente.getTelefono(), paciente.getEmail()};

        return objeto;
    }
    
    public static String quitarTildes(String texto) {
        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        Pattern patron = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return patron.matcher(normalizado).replaceAll("");
    }
    
    public void limpiarBusqueda() {
        txtNombreOdni.setText("Ingrese un Nombre o DNI");
        txtDatoFiltrado.setText("");
        btnX.setVisible(false);
        tablaPacientes.requestFocus(); // Mueve el foco a la tabla para evitar conflictos de foco
        cargarTabla();
    }
}
