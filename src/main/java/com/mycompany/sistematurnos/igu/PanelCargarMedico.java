package com.mycompany.sistematurnos.igu;

import com.mycompany.sistematurnos.utilidades.UtilidadesJOptionPane;
import com.mycompany.sistematurnos.utilidades.UtilidadesMetodosAuxiliares;
import com.mycompany.sistematurnos.utilidades.UtilidadesTexto;
import com.mycompany.sistematurnos.logica.ControladoraLogica;
import com.mycompany.sistematurnos.logica.Medico;
import com.mycompany.sistematurnos.utilidades.UtilidadesBotones;
import com.mycompany.sistematurnos.utilidades.UtilidadesCardLayout;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PanelCargarMedico extends javax.swing.JPanel {
    
    private ControladoraLogica controlLogico = null;
    private boolean estaRegistrado = false;

    public PanelCargarMedico() {
        
        controlLogico = new ControladoraLogica();
        initComponents();
        
        UtilidadesBotones.aplicarHoverGrises(btnLimpiar);
        UtilidadesBotones.aplicarHoverGrises(btnCancelar);
        UtilidadesBotones.aplicarHoverGrises(btnGuardar);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPadre_cargarMedico = new javax.swing.JPanel();
        contenedorLogoTitulo_cargarMedico = new javax.swing.JPanel();
        txtTituloPrincipal = new javax.swing.JLabel();
        txtSubtituloPrincipal = new javax.swing.JLabel();
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
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 243, 243));
        setPreferredSize(new java.awt.Dimension(1057, 560));

        contenedorPadre_cargarMedico.setBackground(new java.awt.Color(243, 243, 243));
        contenedorPadre_cargarMedico.setPreferredSize(new java.awt.Dimension(1057, 560));

        contenedorLogoTitulo_cargarMedico.setBackground(new java.awt.Color(243, 243, 243));

        txtTituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTituloPrincipal.setForeground(new java.awt.Color(74, 161, 222));
        txtTituloPrincipal.setText("Cargar Médico");

        txtSubtituloPrincipal.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtSubtituloPrincipal.setForeground(new java.awt.Color(153, 153, 153));
        txtSubtituloPrincipal.setText("Ingrese la información del profesional y presione \"Guardar\" para registrarlo.");

        javax.swing.GroupLayout contenedorLogoTitulo_cargarMedicoLayout = new javax.swing.GroupLayout(contenedorLogoTitulo_cargarMedico);
        contenedorLogoTitulo_cargarMedico.setLayout(contenedorLogoTitulo_cargarMedicoLayout);
        contenedorLogoTitulo_cargarMedicoLayout.setHorizontalGroup(
            contenedorLogoTitulo_cargarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogoTitulo_cargarMedicoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtSubtituloPrincipal)
                .addGap(0, 0, 0))
            .addGroup(contenedorLogoTitulo_cargarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLogoTitulo_cargarMedicoLayout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(txtTituloPrincipal)
                    .addContainerGap(129, Short.MAX_VALUE)))
        );
        contenedorLogoTitulo_cargarMedicoLayout.setVerticalGroup(
            contenedorLogoTitulo_cargarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogoTitulo_cargarMedicoLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(txtSubtituloPrincipal)
                .addContainerGap())
            .addGroup(contenedorLogoTitulo_cargarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLogoTitulo_cargarMedicoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtTituloPrincipal)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen-3-MawClinic_opacity25_300x330.png"))); // NOI18N

        contenedorFormulario.setBackground(new java.awt.Color(243, 243, 243));
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
        cmbEspecialidad.setToolTipText("Seleccione la especialidad médica del profesional");
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

        contenedorBtnLimpiarGuardar.setBackground(new java.awt.Color(243, 243, 243));

        btnLimpiar.setBackground(new java.awt.Color(213, 213, 213));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar28x28.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("Limpiar todos los campos");
        btnLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(213, 213, 213));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save23x23.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar los datos del médico");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(108, 41));
        btnGuardar.setMinimumSize(new java.awt.Dimension(108, 41));
        btnGuardar.setPreferredSize(new java.awt.Dimension(108, 41));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(213, 213, 213));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconCancelar25x25.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar y volver al menú");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(108, 41));
        btnCancelar.setMinimumSize(new java.awt.Dimension(108, 41));
        btnCancelar.setPreferredSize(new java.awt.Dimension(108, 41));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorBtnLimpiarGuardarLayout = new javax.swing.GroupLayout(contenedorBtnLimpiarGuardar);
        contenedorBtnLimpiarGuardar.setLayout(contenedorBtnLimpiarGuardarLayout);
        contenedorBtnLimpiarGuardarLayout.setHorizontalGroup(
            contenedorBtnLimpiarGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorBtnLimpiarGuardarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contenedorBtnLimpiarGuardarLayout.setVerticalGroup(
            contenedorBtnLimpiarGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorBtnLimpiarGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorBtnLimpiarGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(imagenFondo)
                .addGap(117, 117, 117))
            .addGroup(contenedorPadre_cargarMedicoLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(contenedorLogoTitulo_cargarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorPadre_cargarMedicoLayout.setVerticalGroup(
            contenedorPadre_cargarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPadre_cargarMedicoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(contenedorLogoTitulo_cargarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorPadre_cargarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPadre_cargarMedicoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenedorBtnLimpiarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(contenedorPadre_cargarMedicoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imagenFondo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        /* Reinicio el valor a "false" para que deje de ser "true" y cuando el 
        usuario vuelva a presionar el botón "guardar", pueda guardar el médico. */
        estaRegistrado = false;
        
        /*
        Para que el código esté lo más DESACOPLADO posible:
        - En la "intefaz gráfica" NO PUEDO hacer cosas que le pertenezcan
        a la "controladora lógica" y a la "controladora persistencia".

        - En la "controladora lógica" NO PUEDO hacer cosas que le pertenezcan
        a la "interfaz gráfica" y a la "controladora persistencia".

        - En la "controladora persistencia" NO PUEDO hacer cosas que le pertenezcan
        a la "interfaz gráfica" y a la "controladora logica".
        */

        // Valores obtenidos desde la interfaz gráfica y capitalizo algunos atributos:
        String nombreMedico = UtilidadesTexto.capitalizarPalabra(txtNombre.getText());

        // El ítem seleccionado es un objeto. Entonces, lo casteo a String.
        String especialidadMedi = UtilidadesTexto.capitalizarPalabra((String) cmbEspecialidad.getSelectedItem());

        String matricMedico = txtMatricula.getText().toUpperCase();

        String telMedico = txtTelefono.getText();
        String emailMedico = txtEmail.getText();
        String horariosMedico = txtHorarios.getText();

        List<String> listaHorarios = Arrays.stream(horariosMedico.split(","))
        .map(String::trim)
        .collect(Collectors.toList());

        // Validaciones
        if (nombreMedico.isEmpty() || especialidadMedi.equals("-")
            || telMedico.isEmpty() || matricMedico.isEmpty() || emailMedico.isEmpty()) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Por favor complete todos los campos.", "Error", "No se pudo guardar el médico");
            return;
        }

        if (!UtilidadesTexto.esNombreValido(nombreMedico)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El nombre ingresado solo puede contener letras y espacios.", "Error", "No se pudo guardar el médico");
            return;
        }
        
        if (!UtilidadesTexto.esNombreValido(especialidadMedi)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "La especialidad ingresada solo puede contener letras y espacios.", "Error", "No se pudo guardar el médico");
            return;
        }
        
        if (!UtilidadesTexto.esTelefonoValido(telMedico)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El teléfono ingresado no es válido.", "Error", "No se pudo guardar el médico");
            return;
        }

        if (!UtilidadesTexto.esMatriculaValida(matricMedico)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "La matrícula ingresada no es válida.", "Error", "No se pudo guardar el médico");
            return;
        }

        if (!UtilidadesTexto.esEmailValido(emailMedico)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El email ingresado no es válido.", "Error", "No se pudo guardar el médico");
            return;
        }


        if (!UtilidadesTexto.esHorarioValido(listaHorarios)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Uno o más horarios no tienen el formato correcto (HH:mm).", "Error", "No se pudo guardar el médico");
            return;
        }
        
        yaExisteMedico(txtMatricula.getText());
        
        if (!estaRegistrado) {
            /* Llamo al método "guardarPaciente" que está creado en la "controladoraLogica"
        y le paso como parámetros todos los valores obtenidos desde el formulario
        de la interfaz gráfica: */
        controlLogico.guardarMedico(nombreMedico, especialidadMedi, telMedico, matricMedico, emailMedico, listaHorarios);

        UtilidadesJOptionPane.mostrarMensaje(this, "Médico guardado correctamente.", "Info", "Registrar médico");
        /* this:
        - En este contexto, this hace referencia a la instancia actual del JFrame
        donde estás escribiendo este código.
        - Es decir, si estás dentro de tu clase CargarMedico extends JFrame,
        this apunta al propio formulario.

        Es el parent component, o sea, la ventana "padre" sobre la que se mostrará
        el cuadro de diálogo.
        - Si ponés this, el JOptionPane se centra sobre tu ventana de carga de médicos.
        - Si ponés null, el diálogo aparecerá en el centro de la pantalla
        (sin referencia a ninguna ventana).

        "this" para que el mensaje aparezca encima de la ventana activa.
        Es más claro para el usuario y evita que el mensaje quede "perdido"
        detrás de otras ventanas.
        */
        
        /* Cuando se agrega el médico, recargo la tabla de médicos así, cuando 
        presiono el botón "Ver Médicos" de la sección "Ver Registros", me aparece
        la tabla actualizada con el último médico agregado. */
        UtilidadesMetodosAuxiliares.recargarTablaPanelVerDatosMedico(this);

        /* Una vez que aparece el panel del mensaje "Médico guardado correctamente",
        se limpia el formulario. */       
        limpiarFormulario();
        } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        boolean confirmacion = UtilidadesCardLayout.yaConfirmoCancelarCargaDatos(this.getParent(), "médico");
        
        if (confirmacion) {
            UtilidadesCardLayout.mostrarPanel(this.getParent(), "Inicio");
            limpiarFormulario();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JPanel contenedorBtnLimpiarGuardar;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JPanel contenedorLogoTitulo_cargarMedico;
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
    private javax.swing.JLabel txtSubtituloPrincipal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTituloPrincipal;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        // setText(""), setea un string vacío y limpia el campo.
        txtNombre.setText("");

        /* Se agrega el índice 0, que es el caracter '-'(primer índice del combo), 
        vuelve al primer elemento del combo y da la sensación que se deselecciona 
        la especialidad había seleccionado cuando cargué/creé el médico. */
        cmbEspecialidad.setSelectedIndex(0);

        txtTelefono.setText("");
        txtMatricula.setText("");
        txtEmail.setText("");
        txtHorarios.setText("");
    }
    
    private void yaExisteMedico(String matricula) {
        for (Medico medi : controlLogico.traerListaMedicos()) {
            if (medi.getMatricula().equalsIgnoreCase(matricula)) {
                UtilidadesJOptionPane.mostrarMensaje(this, "Ya hay un médico registrado con esa matrícula.", "Error", "No se pudo guardar el médico");
                estaRegistrado = true;
            }
        }
    }
}
