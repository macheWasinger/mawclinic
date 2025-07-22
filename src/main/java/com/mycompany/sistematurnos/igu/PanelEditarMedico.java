package com.mycompany.sistematurnos.igu;

import com.mycompany.sistematurnos.utilidades.UtilidadesCardLayout;
import com.mycompany.sistematurnos.utilidades.UtilidadesJOptionPane;
import com.mycompany.sistematurnos.utilidades.UtilidadesMetodosAuxiliares;
import com.mycompany.sistematurnos.utilidades.UtilidadesTexto;
import com.mycompany.sistematurnos.logica.ControladoraLogica;
import com.mycompany.sistematurnos.logica.Medico;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PanelEditarMedico extends javax.swing.JPanel {
    
    private ControladoraLogica controlLogico = null;
    private Long num_id;
    private Medico medi = null;


    public PanelEditarMedico(Long num_id) {
        
        controlLogico = new ControladoraLogica();
        
        initComponents();
        
        /* Con esto, "num_id" ya tiene valor cuando llamo y no es nulo al 
           buscar el médico. */
        this.num_id = num_id;
        
        cargarDatos(num_id);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPadre_cargarMedico = new javax.swing.JPanel();
        contenedorLogoTitulo_editarMedico = new javax.swing.JPanel();
        txtTituloPrincipal1 = new javax.swing.JLabel();
        txtSubtituloPrincipal1 = new javax.swing.JLabel();
        imagenFondo = new javax.swing.JLabel();
        contenedorFormulario = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelEspecialidad = new javax.swing.JLabel();
        labelTel = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        labelHorarios = new javax.swing.JLabel();
        txtHorarios = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contenedorBtnLimpiarGuardar = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnCancelarCambios = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1057, 560));

        contenedorPadre_cargarMedico.setPreferredSize(new java.awt.Dimension(1057, 560));

        txtTituloPrincipal1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTituloPrincipal1.setForeground(new java.awt.Color(74, 161, 222));
        txtTituloPrincipal1.setText("Editar Datos del Médico");

        txtSubtituloPrincipal1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtSubtituloPrincipal1.setForeground(new java.awt.Color(153, 153, 153));
        txtSubtituloPrincipal1.setText("Modifique la información registrada y presione \"Guardar\" para confirmar");

        javax.swing.GroupLayout contenedorLogoTitulo_editarMedicoLayout = new javax.swing.GroupLayout(contenedorLogoTitulo_editarMedico);
        contenedorLogoTitulo_editarMedico.setLayout(contenedorLogoTitulo_editarMedicoLayout);
        contenedorLogoTitulo_editarMedicoLayout.setHorizontalGroup(
            contenedorLogoTitulo_editarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSubtituloPrincipal1)
            .addGroup(contenedorLogoTitulo_editarMedicoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(txtTituloPrincipal1))
        );
        contenedorLogoTitulo_editarMedicoLayout.setVerticalGroup(
            contenedorLogoTitulo_editarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogoTitulo_editarMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloPrincipal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(txtSubtituloPrincipal1)
                .addContainerGap())
        );

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen-3-MawClinic_opacity25_300x330.png"))); // NOI18N

        contenedorFormulario.setPreferredSize(new java.awt.Dimension(333, 317));

        labelNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNombre.setText("Nombre:");

        labelEspecialidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEspecialidad.setText("Especialidad:");

        labelTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTel.setText("Teléfono:");

        labelMatricula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMatricula.setText("Matrícula:");

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmail.setText("Email:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setPreferredSize(new java.awt.Dimension(75, 30));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        txtTelefono.setPreferredSize(new java.awt.Dimension(75, 30));

        txtMatricula.setBackground(new java.awt.Color(255, 255, 255));
        txtMatricula.setBorder(null);
        txtMatricula.setPreferredSize(new java.awt.Dimension(75, 30));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.setPreferredSize(new java.awt.Dimension(75, 30));

        cmbEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "CARDIOLOGÍA", "DERMATOLOGÍA", "GASTROENTEROLOGÍA", "ENDOCRINOLOGÍA", "PEDIATRÍA", "NEUROLOGÍA", "PSIQUIATRÍA", "FONIATRÍA" }));
        cmbEspecialidad.setBorder(null);
        cmbEspecialidad.setPreferredSize(new java.awt.Dimension(165, 30));

        labelHorarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelHorarios.setText("Horarios:");

        txtHorarios.setBackground(new java.awt.Color(255, 255, 255));
        txtHorarios.setBorder(null);
        txtHorarios.setPreferredSize(new java.awt.Dimension(75, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Horarios (HH:mm), separados por coma. Ej.: 08:00,08:30,09:00");

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHorarios))
                        .addGap(42, 42, 42)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                .addComponent(labelEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23)))
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEspecialidad)
                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTel)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHorarios)
                    .addComponent(txtHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnLimpiar.setBackground(new java.awt.Color(213, 213, 213));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar30x30.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardarCambios.setBackground(new java.awt.Color(213, 213, 213));
        btnGuardarCambios.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save_30x30.png"))); // NOI18N
        btnGuardarCambios.setText("Guardar");
        btnGuardarCambios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnGuardarCambios.setFocusPainted(false);
        btnGuardarCambios.setMaximumSize(new java.awt.Dimension(83, 32));
        btnGuardarCambios.setMinimumSize(new java.awt.Dimension(83, 32));
        btnGuardarCambios.setPreferredSize(new java.awt.Dimension(83, 32));
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnCancelarCambios.setBackground(new java.awt.Color(213, 213, 213));
        btnCancelarCambios.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCancelarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconCancelar24x24.png"))); // NOI18N
        btnCancelarCambios.setText("Cancelar");
        btnCancelarCambios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnCancelarCambios.setFocusPainted(false);
        btnCancelarCambios.setMaximumSize(new java.awt.Dimension(83, 32));
        btnCancelarCambios.setMinimumSize(new java.awt.Dimension(83, 32));
        btnCancelarCambios.setPreferredSize(new java.awt.Dimension(83, 32));
        btnCancelarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorBtnLimpiarGuardarLayout = new javax.swing.GroupLayout(contenedorBtnLimpiarGuardar);
        contenedorBtnLimpiarGuardar.setLayout(contenedorBtnLimpiarGuardarLayout);
        contenedorBtnLimpiarGuardarLayout.setHorizontalGroup(
            contenedorBtnLimpiarGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorBtnLimpiarGuardarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contenedorBtnLimpiarGuardarLayout.setVerticalGroup(
            contenedorBtnLimpiarGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorBtnLimpiarGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorBtnLimpiarGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorPadre_cargarMedicoLayout = new javax.swing.GroupLayout(contenedorPadre_cargarMedico);
        contenedorPadre_cargarMedico.setLayout(contenedorPadre_cargarMedicoLayout);
        contenedorPadre_cargarMedicoLayout.setHorizontalGroup(
            contenedorPadre_cargarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPadre_cargarMedicoLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(contenedorPadre_cargarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contenedorBtnLimpiarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(imagenFondo)
                .addGap(115, 115, 115))
            .addGroup(contenedorPadre_cargarMedicoLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(contenedorLogoTitulo_editarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorPadre_cargarMedicoLayout.setVerticalGroup(
            contenedorPadre_cargarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPadre_cargarMedicoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(contenedorLogoTitulo_editarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorPadre_cargarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPadre_cargarMedicoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenedorBtnLimpiarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(contenedorPadre_cargarMedicoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(imagenFondo)
                        .addContainerGap(105, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPadre_cargarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorPadre_cargarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        // Todos los datos del médico.
        String nombreMedico = UtilidadesTexto.capitalizarPalabra(txtNombre.getText());

        String especialidadMedi = UtilidadesTexto.capitalizarPalabra((String) cmbEspecialidad.getSelectedItem());

        String matricMedico = txtMatricula.getText().toUpperCase();

        String telMedico = txtTelefono.getText();
        String emailMedico = txtEmail.getText();
        String horariosMedico = txtHorarios.getText();

        // "horariosMedico" es un String y lo convierto en una lista de String.
        List<String> listaHorarios = Arrays.stream(horariosMedico.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        // Validaciones
        if (nombreMedico.isEmpty() || especialidadMedi.equals("-")
                || telMedico.isEmpty() || matricMedico.isEmpty() || emailMedico.isEmpty()) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Por favor complete todos los campos", "Error", "Error al completar los campos");
            return;
        }

        if (!UtilidadesTexto.esNombreValido(nombreMedico)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El nombre solo puede contener letras y espacios", "Error", "Error al guardar el médico");
            return;
        }

        if (!UtilidadesTexto.esMatriculaValida(matricMedico)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "La matrícula es inválida", "Error", "Error al guardar el médico");
            return;
        }

        if (!UtilidadesTexto.esEmailValido(emailMedico)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El email no es válido", "Error", "Error al guardar el médico");
            return;
        }

        if (!UtilidadesTexto.esTelefonoValido(telMedico)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El teléfono no es válido", "Error", "Error al guardar el médico");
            return;
        }

        if (!UtilidadesTexto.esHorarioValido(listaHorarios)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Uno o más horarios no tienen el formato correcto (HH:mm)", "Error", "Error al guardar el médico");
            return;
        }

        /* Le paso como parámetro el objeto "medi" creado globalmente
        para poder obtener su "id" y que mi clase sepa cuál médico hay 
        que modificar. */
        controlLogico.modificarDatosDelMedico(medi, nombreMedico, especialidadMedi, telMedico, matricMedico, emailMedico, listaHorarios);
        
        // Mensaje de que se guardó correctamente
        UtilidadesJOptionPane.mostrarMensaje(this, "Médico editado correctamente", "Info", "Editar médico");

        /* Llamo a "VerDatosMedicos" para que cargue la tabla con los datos 
        modificados y los muestre en pantalla. */
       
        
        UtilidadesMetodosAuxiliares.recargarTablaPanelVerDatosMedico(this);
        
        UtilidadesCardLayout.mostrarPanel(this.getParent(), "PanelVerDatosMedicos");
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnCancelarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCambiosActionPerformed
        UtilidadesCardLayout.confirmacionCancelarEdicion(this.getParent(), "PanelVerDatosMedicos", "médico");
    }//GEN-LAST:event_btnCancelarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCambios;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JPanel contenedorBtnLimpiarGuardar;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JPanel contenedorLogoTitulo_editarMedico;
    private javax.swing.JPanel contenedorPadre_cargarMedico;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidad;
    private javax.swing.JLabel labelHorarios;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHorarios;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtSubtituloPrincipal1;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTituloPrincipal1;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        txtNombre.setText("");
        cmbEspecialidad.setSelectedIndex(0);
        txtTelefono.setText("");
        txtMatricula.setText("");
        txtEmail.setText("");
        txtHorarios.setText("");
    }

    private void cargarDatos(Long num_id) {
        /* Traigo el médico seleccionado mediante 
        "num_id" así muestro sus datos en pantalla y 
        elijo cuál o cuáles datos voy a modificar. */
        this.medi = controlLogico.traerMedico(num_id);
        
        // Validación por si no encontró el paciente
        if (this.medi == null) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El médico no existe.", "Error", "Error");
            return;
        }
        
        /* Los datos del médico obtenido, los seteo en la 
        interfaz gráfica mediante sus variables. */
        txtNombre.setText(medi.getNombre());
        cmbEspecialidad.setSelectedIndex(indiceEspecialidad());
        txtTelefono.setText(medi.getTelefono());
        txtMatricula.setText(medi.getMatricula());
        txtEmail.setText(medi.getEmail());
        txtHorarios.setText(String.join(",", medi.getHorariosDisponibles()));
        // Convierto una List<String> en un único String
    }
    
    private int indiceEspecialidad() {
        this.medi = controlLogico.traerMedico(num_id);

        String especialidadDelMedico = medi.getEspecialidad();

        /*  - Recorro todos los ítems del combo.
        
            - "getItemCount()", Devuelve la cantidad total de elementos que 
            tiene el JComboBox. Sirve para saber cuántas posiciones hay, así 
            puedo recorrerlas con un bucle for.
        
            - "getItemAt(i)", Devuelve el ítem que está en la posición index 
            que yo le pasé. Sirve para recuperar el texto que hay en cada 
            posición, por ejemplo, cuando quiero comparar si coincide con la 
            especialidad del médico.
        */
        for (int i = 0; i < cmbEspecialidad.getItemCount(); i++) {
            String item = cmbEspecialidad.getItemAt(i);

            // Comparo con equalsIgnoreCase por si cambia mayúscula/minúscula
            if (item.equalsIgnoreCase(especialidadDelMedico)) {
                return i;
            }
        }
        return 0;
    }
}
