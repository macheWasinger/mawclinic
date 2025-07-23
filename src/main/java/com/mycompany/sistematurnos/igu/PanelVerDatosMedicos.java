package com.mycompany.sistematurnos.igu;

import com.mycompany.sistematurnos.utilidades.UtilidadesTexto;
import com.mycompany.sistematurnos.utilidades.UtilidadesCardLayout;
import com.mycompany.sistematurnos.utilidades.UtilidadesJOptionPane;
import com.mycompany.sistematurnos.logica.ControladoraLogica;
import com.mycompany.sistematurnos.logica.Medico;
import com.mycompany.sistematurnos.utilidades.UtilidadesBotones;
import com.mycompany.sistematurnos.utilidades.UtilidadesTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;


public class PanelVerDatosMedicos extends javax.swing.JPanel {
    
    private ControladoraLogica controlLogico = null;

    public PanelVerDatosMedicos() {
        controlLogico = new ControladoraLogica();
        
        initComponents();
        cargarTabla();

        UtilidadesBotones.aplicarIconoManoCursor(btnSearch);
        UtilidadesBotones.aplicarIconoManoCursor(btnEliminar);
        UtilidadesBotones.aplicarIconoManoCursor(btnEditar);
        UtilidadesBotones.aplicarIconoManoCursor(btnX);
        
        /* Así, cuando el usuario haga clic o tabule en el campo, se limpia el 
        texto, y si no escribió nada y salió del campo, vuelve el texto de ayuda. */
        txtNombreOespecialidad.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if ("Ingrese un Nombre o Especialidad".equals(txtNombreOespecialidad.getText().trim())) {
                    txtNombreOespecialidad.setText("");
                    txtDatoFiltrado.setText("");
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtNombreOespecialidad.getText().trim().isEmpty()) {
                    limpiarBusqueda();
                }
            }
        });
        
        txtNombreOespecialidad.addActionListener(new ActionListener() {
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
        tablaMedicos = new javax.swing.JTable();
        subtituloTabla = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        contenedorInputBotonBuscar = new javax.swing.JPanel();
        txtNombreOespecialidad = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        contenedorDatoFiltrado = new javax.swing.JPanel();
        txtDatoFiltrado = new javax.swing.JLabel();
        btnX = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1060, 560));

        contenedorPrincipal.setBackground(new java.awt.Color(243, 243, 243));
        contenedorPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));
        contenedorPrincipal.setPreferredSize(new java.awt.Dimension(1057, 560));

        txtTituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTituloPrincipal.setForeground(new java.awt.Color(74, 161, 222));
        txtTituloPrincipal.setText("Listado de Médicos");
        txtTituloPrincipal.setAlignmentY(0.0F);
        txtTituloPrincipal.setPreferredSize(new java.awt.Dimension(271, 33));

        panelContenedorTabla.setBackground(new java.awt.Color(243, 243, 243));
        panelContenedorTabla.setPreferredSize(new java.awt.Dimension(1056, 431));

        panelTabla.setBackground(new java.awt.Color(243, 243, 243));
        panelTabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        panelTabla.setPreferredSize(new java.awt.Dimension(993, 397));

        tablaMedicos.setBackground(new java.awt.Color(255, 255, 255));
        tablaMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaMedicos.setSelectionBackground(new java.awt.Color(133, 197, 237));
        panelTabla.setViewportView(tablaMedicos);

        subtituloTabla.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        subtituloTabla.setForeground(new java.awt.Color(153, 153, 153));
        subtituloTabla.setText("Seleccione un médico para eliminar o editar sus datos:");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_30x30.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar médico seleccionado");
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
        btnEditar.setToolTipText("Editar médico seleccionado");
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

        txtNombreOespecialidad.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtNombreOespecialidad.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreOespecialidad.setText("Ingrese un Nombre o Especialidad");
        txtNombreOespecialidad.setToolTipText("Presione Enter o clic en 'Buscar' luego de ingresar el texto");
        txtNombreOespecialidad.setBorder(null);
        txtNombreOespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreOespecialidadActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconSearch19x19.png"))); // NOI18N
        btnSearch.setToolTipText("Buscar médico por nombre o especialidad");
        btnSearch.setBorder(null);
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
                .addComponent(txtNombreOespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        contenedorInputBotonBuscarLayout.setVerticalGroup(
            contenedorInputBotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInputBotonBuscarLayout.createSequentialGroup()
                .addGroup(contenedorInputBotonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreOespecialidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenedorDatoFiltrado.setBackground(new java.awt.Color(243, 243, 243));
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
                    .addGroup(panelContenedorTablaLayout.createSequentialGroup()
                        .addComponent(subtituloTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contenedorDatoFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contenedorInputBotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelContenedorTablaLayout.setVerticalGroup(
            panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorTablaLayout.createSequentialGroup()
                .addGroup(panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenedorTablaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar))
                    .addGroup(panelContenedorTablaLayout.createSequentialGroup()
                        .addGroup(panelContenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subtituloTabla)
                            .addGroup(panelContenedorTablaLayout.createSequentialGroup()
                                .addComponent(contenedorDatoFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(contenedorInputBotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(txtTituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(24, 24, 24)
                .addComponent(panelContenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /* Controla que la tabla no esté vacía. Por lo tanto, tiene que haber
        más de una fila rellena por los datos del médico. */
        if (tablaMedicos.getRowCount() > 0) {

            /* Controlo que se haya seleccionado a un médico. Ya que, si no
            seleccionó a ninguno, va a ser -1. */
            if (tablaMedicos.getSelectedRow() != -1) {

                /* Obtengo "id" del médico a eliminar desde la "fila" seleccionada,
                mediante la columna "Num" que es índice 0, en donde se guardan
                todos los id de los médicos. */
                long num_id = Long.parseLong(String.valueOf(tablaMedicos.getValueAt(tablaMedicos.getSelectedRow(), 0)));
                /*
                Ejemplo ilustrativo:
                Si en la tabla tenés:

                Id  |   Nombre
                10  |   Pérez
                15  |   Ramírez
                22  |   González

                Y seleccionaste la fila 1 (Ramírez), entonces:

                - tablaMedicos.getSelectedRow() → 1
                - tablaMedicos.getValueAt(1,0) → 15L
                - String.valueOf(...) → "15"
                - Long.parseLong(...) → 15L
                - num_cliente = 15L

                Así obtenés el identificador único del médico seleccionado.
                */

                // La variable "confirmado" almacena "true o false"
                boolean confirmado = UtilidadesJOptionPane.confirmarAccion(this, "¿Deseas borrar este registro?", "Confirmar eliminación");

                if (confirmado) {
                    // Si hizo clic en sí, se ejecuta esto:
                    /* - Llamo al método borrar.
                    - "num_id" almacena el "id" del médico obtenido en la tabla */
                    controlLogico.eliminarMedico(num_id);

                    // Aviso al usuario que borró correctamente
                    UtilidadesJOptionPane.mostrarMensaje(this, "Médico eliminado correctamente", "Info", "Eliminación exitosa");

                    /* Vuelvo a cargar la tabla con los datos actualizados. Por lo
                    tanto, no va a aparecer el médico eliminado. Si no llamo a este
                    método, por más que se haya borrado el médico de la base de datos,
                    va a seguir apareciendo en pantalla. */
                    cargarTabla();
                }
            }

            // Si hizo clic en No, no pasa nada y vuelve al programa
            else {
                UtilidadesJOptionPane.mostrarMensaje(this, "No seleccionó ningún médico", "Error", "Error al eliminar");
            }
        }
        else {
            UtilidadesJOptionPane.mostrarMensaje(this, "No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tablaMedicos.getRowCount() > 0) {

            /* Controlo que se haya seleccionado a un médico. Ya que, si no
            seleccionó a ninguno, va a ser -1. */
            if (tablaMedicos.getSelectedRow() != -1) {
                /* Obtengo "id" del médico a editar desde la "fila" seleccionada,
                mediante la columna "Num" que es índice 0, en donde se guardan
                todos los id de los médicos. */
                long num_id = Long.parseLong(String.valueOf(tablaMedicos.getValueAt(tablaMedicos.getSelectedRow(), 0)));

                /*  Recibe como parámetro "num_id", que es el id del
                médico que tiene que editar. */
                
                /*
                EditarMedico pantallaEditar = new EditarMedico(num_id);
                pantallaEditar.setVisible(true);
                pantallaEditar.setLocationRelativeTo(null);
                */
                
                /* Cuando creo el objeto, le paso el "num_id" para que sepa cuál
                médico tiene que editar. */
                PanelEditarMedico pantallaEditarMedico = new PanelEditarMedico(num_id);

                UtilidadesCardLayout.agregarPanel(this, pantallaEditarMedico, "PanelEditarMedico");
                
                UtilidadesCardLayout.mostrarPanel(this.getParent(), "PanelEditarMedico");
            }
            else {
                UtilidadesJOptionPane.mostrarMensaje(this, "No seleccionó ningún médico", "Error", "Error al eliminar");
            }
        }
        else {
            UtilidadesJOptionPane.mostrarMensaje(this, "No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombreOespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreOespecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreOespecialidadActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String input = quitarTildes(txtNombreOespecialidad.getText().trim());
        
        if (input.isEmpty() || input.equals("Ingrese el Nombre o Especialidad")) {
            txtDatoFiltrado.setText("");
            btnX.setVisible(false);
        
            // Si no hay filtro, recarga toda la tabla
            cargarTabla();
            return;
        }
        
        if (!UtilidadesTexto.esNombreValido(input)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Solo puede contener letras y espacios", "Error", "Error al guardar el médico");
            return;
        }
        
        DefaultTableModel modeloTablaAmostrar = UtilidadesTableModel.modeloTablaDeDatos_medico();

        // Carga de los datos desde la base de datos.
        List<Medico> listaMedicos = controlLogico.traerListaMedicos();
        
        boolean medicoBuscado = false;

        if (listaMedicos != null) {
            for (Medico medico : listaMedicos) {
                if(quitarTildes(medico.getNombre()).equalsIgnoreCase(input)) {
                    Object[] objeto_medico = crearObjetoMedico(medico);   
                    modeloTablaAmostrar.addRow(objeto_medico);
                    
                    txtDatoFiltrado.setText("Filtrando: " + medico.getNombre());
                    btnX.setVisible(true);
                    txtNombreOespecialidad.setText("");
                    medicoBuscado = true;
                }
                
                if (quitarTildes(medico.getEspecialidad()).equalsIgnoreCase(input)) {
                    Object[] objeto_medico = crearObjetoMedico(medico);
                    modeloTablaAmostrar.addRow(objeto_medico);
                    
                    txtDatoFiltrado.setText("Filtrando: " + medico.getEspecialidad());
                    btnX.setVisible(true);
                    txtNombreOespecialidad.setText("");
                    medicoBuscado = true;
                }
            }
            
            if (medicoBuscado) {
                tablaMedicos.setModel(modeloTablaAmostrar);
            } else {
                UtilidadesJOptionPane.mostrarMensaje(this, "No se encontró el médico", "Error", "Error al buscar");
                
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
    private javax.swing.JTable tablaMedicos;
    private javax.swing.JLabel txtDatoFiltrado;
    private javax.swing.JTextField txtNombreOespecialidad;
    private javax.swing.JLabel txtTituloPrincipal;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        txtDatoFiltrado.setText("");
        btnX.setVisible(false);
        
        DefaultTableModel modeloTablaAmostrar = UtilidadesTableModel.modeloTablaDeDatos_medico();
        
        // Carga de los datos desde la base de datos.
        List<Medico> listaMedicos = controlLogico.traerListaMedicos();
        /* Se implementa el modelo de 3 capas:
            1. IGU le solicita la lista de Médicos a la "controladoraLogica"
            2. "controladoraLogica" le solicita a "controladoraPersistencia"
            3. "controladoraPersistencia" le solicita a la base de datos 
                mediante JPA Controller.
           Una vez conseguido el dato, ControladoraPersistencia se lo entrega
           a ControladoraLogica y esta se lo da a IGU (Interfaz gráfica de usuario)
           para que lo almacene en la variable "listaMedicos".
        */
        
        // Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaMedicos != null) {
            for (Medico medi : listaMedicos) {
                /* Creo un objeto para guardar los datos del médico 
                   sin importar el tipo de dato. Ejemplo: El "id" es
                   un "int" y los demás datos son "Strings". Por lo
                   tanto, son distintos tipos de datos y el objeto 
                   los almacena sin ningún inconveniente. */
                Object[] objeto_medico = crearObjetoMedico(medi);
                
                // Agrego el objeto en cada fila de la tabla
                modeloTablaAmostrar.addRow(objeto_medico);
            }
        }
        
        /* 
           Primero seteo el modelo: Le asigno el "modelo de tabla"(diseño) que 
           personalicé a la tabla que creé en la interfaz gráfica mediante su 
           variable "tablaMedicos" así la interfaz gráfica sabe qué 
           es lo que tiene que renderizar.
            */
        tablaMedicos.setModel(modeloTablaAmostrar);
        
        // Después aplico la personalización
        UtilidadesTableModel.personalizarTablaDeDatos(tablaMedicos);
    }
    
    // Crea un array de tipo Object[] con los datos del paciente
    public Object[] crearObjetoMedico(Medico medi) { 
        Object[] objeto = {medi.getId(), medi.getNombre(), 
                    medi.getEspecialidad(), medi.getTelefono(), 
                    medi.getMatricula(), medi.getEmail()};

        return objeto;
    }
    

    public static String quitarTildes(String texto) {
        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        Pattern patron = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return patron.matcher(normalizado).replaceAll("");
    }


    private void limpiarBusqueda() {
        txtNombreOespecialidad.setText("Ingrese un Nombre o Especialidad");
        txtDatoFiltrado.setText("");
        btnX.setVisible(false);
        tablaMedicos.requestFocus(); // Mueve el foco a la tabla para evitar conflictos de foco
        cargarTabla();
    }
}
