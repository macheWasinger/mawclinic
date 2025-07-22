package com.mycompany.sistematurnos.igu;

import com.mycompany.sistematurnos.utilidades.UtilidadesCardLayout;
import com.mycompany.sistematurnos.utilidades.UtilidadesJOptionPane;
import com.mycompany.sistematurnos.utilidades.UtilidadesMetodosAuxiliares;
import com.mycompany.sistematurnos.utilidades.UtilidadesTexto;
import com.mycompany.sistematurnos.logica.ControladoraLogica;
import com.mycompany.sistematurnos.logica.Paciente;
import com.mycompany.sistematurnos.utilidades.UtilidadesBotones;


public class PanelEditarPaciente extends javax.swing.JPanel {

    private ControladoraLogica controlLogico = null;
    private Long num_id;
    private Paciente paci = null;
    
    public PanelEditarPaciente(Long num_id) {
        
        controlLogico = new ControladoraLogica();    
        initComponents();
        
        UtilidadesBotones.aplicarHoverGrises(btnLimpiar);
        UtilidadesBotones.aplicarHoverGrises(btnCancelarCambios);
        UtilidadesBotones.aplicarHoverGrises(btnGuardarCambios);
        
        /* Con esto, "num_id" ya tiene valor cuando llamo y no es nulo al 
           buscar el médico. */
        this.num_id = num_id;
        
        cargarDatos(num_id);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPadre_cargarPaciente = new javax.swing.JPanel();
        contenedorLogoTitulo_cargarPaciente = new javax.swing.JPanel();
        txtTituloPrincipal = new javax.swing.JLabel();
        txtSubtituloPrincipal = new javax.swing.JLabel();
        imagenFondo = new javax.swing.JLabel();
        contenedorFormulario = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelDni = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        contenedorBtnLimpiarGuardar = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnCancelarCambios = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1057, 560));

        contenedorPadre_cargarPaciente.setPreferredSize(new java.awt.Dimension(1057, 560));

        txtTituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTituloPrincipal.setForeground(new java.awt.Color(74, 161, 222));
        txtTituloPrincipal.setText("Editar Datos del Paciente");

        txtSubtituloPrincipal.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtSubtituloPrincipal.setForeground(new java.awt.Color(153, 153, 153));
        txtSubtituloPrincipal.setText("Modifique la información registrada y presione \"Guardar\" para confirmar");

        javax.swing.GroupLayout contenedorLogoTitulo_cargarPacienteLayout = new javax.swing.GroupLayout(contenedorLogoTitulo_cargarPaciente);
        contenedorLogoTitulo_cargarPaciente.setLayout(contenedorLogoTitulo_cargarPacienteLayout);
        contenedorLogoTitulo_cargarPacienteLayout.setHorizontalGroup(
            contenedorLogoTitulo_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogoTitulo_cargarPacienteLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(contenedorLogoTitulo_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSubtituloPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogoTitulo_cargarPacienteLayout.createSequentialGroup()
                        .addComponent(txtTituloPrincipal)
                        .addGap(61, 61, 61))))
        );
        contenedorLogoTitulo_cargarPacienteLayout.setVerticalGroup(
            contenedorLogoTitulo_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogoTitulo_cargarPacienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTituloPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(txtSubtituloPrincipal)
                .addContainerGap())
        );

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen-3-MawClinic_opacity25_300x330.png"))); // NOI18N

        contenedorFormulario.setPreferredSize(new java.awt.Dimension(333, 317));

        labelNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNombre.setText("Nombre:");

        labelDni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDni.setText("Dni:");

        labelTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTelefono.setText("Teléfono:");

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmail.setText("Email:");

        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        txtDni.setPreferredSize(new java.awt.Dimension(75, 30));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        txtTelefono.setPreferredSize(new java.awt.Dimension(75, 30));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.setPreferredSize(new java.awt.Dimension(75, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setPreferredSize(new java.awt.Dimension(75, 30));

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDni, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenedorBtnLimpiarGuardar.setPreferredSize(new java.awt.Dimension(399, 70));

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

        btnGuardarCambios.setBackground(new java.awt.Color(213, 213, 213));
        btnGuardarCambios.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save23x23.png"))); // NOI18N
        btnGuardarCambios.setText("Guardar");
        btnGuardarCambios.setToolTipText("Guardar los cambios del paciente");
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
        btnCancelarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconCancelar25x25.png"))); // NOI18N
        btnCancelarCambios.setText("Cancelar");
        btnCancelarCambios.setToolTipText("Cancelar la edición y volver al menú");
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
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout contenedorPadre_cargarPacienteLayout = new javax.swing.GroupLayout(contenedorPadre_cargarPaciente);
        contenedorPadre_cargarPaciente.setLayout(contenedorPadre_cargarPacienteLayout);
        contenedorPadre_cargarPacienteLayout.setHorizontalGroup(
            contenedorPadre_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPadre_cargarPacienteLayout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(contenedorLogoTitulo_cargarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 294, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPadre_cargarPacienteLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(contenedorPadre_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contenedorBtnLimpiarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagenFondo)
                .addGap(115, 115, 115))
        );
        contenedorPadre_cargarPacienteLayout.setVerticalGroup(
            contenedorPadre_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPadre_cargarPacienteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(contenedorLogoTitulo_cargarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorPadre_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPadre_cargarPacienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imagenFondo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenedorPadre_cargarPacienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(contenedorBtnLimpiarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPadre_cargarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorPadre_cargarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed

        String nombrePaciente = UtilidadesTexto.capitalizarPalabra(txtNombre.getText());

        String dniPaciente = txtDni.getText();

        String telPaciente = txtTelefono.getText();
        String emailPaciente = txtEmail.getText();

        // Validaciones
        if (nombrePaciente.isEmpty() || telPaciente.isEmpty() ||
            dniPaciente.isEmpty() || emailPaciente.isEmpty()) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Por favor complete todos los campos", "Error", "Error al completar los campos");
            return; // Frena el flujo del código
        }

        if (!UtilidadesTexto.esNombreValido(nombrePaciente)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El nombre solo puede contener letras y espacios", "Error", "Error al guardar el paciente");
            return;
        }

        if (!UtilidadesTexto.esEmailValido(emailPaciente)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El email no es válido", "Error", "Error al guardar el paciente");
            return;
        }

        if (!UtilidadesTexto.esTelefonoValido(telPaciente)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El teléfono no es válido", "Error", "Error al guardar el paciente");
            return;
        }

        if (!UtilidadesTexto.esDniValido(dniPaciente)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El DNI no es válido. Debe tener 7 u 8 dígitos", "Error", "Error al guardar el paciente");
            return;
        }

        
        /* Le paso como parámetro el objeto "medi" creado globalmente
        para poder obtener su "id" y que mi clase sepa cuál médico hay 
        que modificar. */
        controlLogico.modificarDatosDelPaciente(paci, nombrePaciente, dniPaciente, telPaciente, emailPaciente);
        
        // Mensaje de que se guardó correctamente
        UtilidadesJOptionPane.mostrarMensaje(this, "Paciente editado correctamente", "Info", "Editar paciente");
        
        UtilidadesMetodosAuxiliares.recargarTablaPanelVerDatosPaciente(this);   
        
        UtilidadesCardLayout.mostrarPanel(this.getParent(), "PanelVerDatosPacientes");
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnCancelarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCambiosActionPerformed
        UtilidadesCardLayout.confirmacionCancelarEdicion(this.getParent(), "PanelVerDatosPacientes", "paciente");
    }//GEN-LAST:event_btnCancelarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCambios;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel contenedorBtnLimpiarGuardar;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JPanel contenedorLogoTitulo_cargarPaciente;
    private javax.swing.JPanel contenedorPadre_cargarPaciente;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtSubtituloPrincipal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTituloPrincipal;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        txtNombre.setText("");
        txtDni.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
    }

    private void cargarDatos(Long num_id) {
        /* Traigo el médico seleccionado mediante 
        "num_id" así muestro sus datos en pantalla y 
        elijo cuál o cuáles datos voy a modificar. */
        this.paci = controlLogico.traerPaciente(num_id);
        
        /* Los datos del médico obtenido, los seteo en la 
        interfaz gráfica mediante sus variables. */
        txtNombre.setText(paci.getNombre());
        txtDni.setText(paci.getDni());
        txtTelefono.setText(paci.getTelefono());
        txtEmail.setText(paci.getEmail());
    }
}
