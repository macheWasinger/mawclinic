package com.mycompany.sistematurnos.igu;

import com.mycompany.sistematurnos.utilidades.UtilidadesJOptionPane;
import com.mycompany.sistematurnos.utilidades.UtilidadesMetodosAuxiliares;
import com.mycompany.sistematurnos.utilidades.UtilidadesTexto;
import com.mycompany.sistematurnos.logica.ControladoraLogica;
import com.mycompany.sistematurnos.logica.Paciente;
import com.mycompany.sistematurnos.utilidades.UtilidadesBotones;
import com.mycompany.sistematurnos.utilidades.UtilidadesCardLayout;


public class PanelCargarPaciente extends javax.swing.JPanel {

    private ControladoraLogica controlLogico = null;
    private boolean estaRegistrado = false;
    
    public PanelCargarPaciente() {
        
        controlLogico = new ControladoraLogica();    
        initComponents();
        
        UtilidadesBotones.aplicarHoverGrises(btnLimpiar);
        UtilidadesBotones.aplicarHoverGrises(btnCancelar);
        UtilidadesBotones.aplicarHoverGrises(btnGuardar);
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
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 243, 243));
        setPreferredSize(new java.awt.Dimension(1057, 560));

        contenedorPadre_cargarPaciente.setBackground(new java.awt.Color(243, 243, 243));
        contenedorPadre_cargarPaciente.setPreferredSize(new java.awt.Dimension(1057, 560));

        contenedorLogoTitulo_cargarPaciente.setBackground(new java.awt.Color(243, 243, 243));

        txtTituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTituloPrincipal.setForeground(new java.awt.Color(74, 161, 222));
        txtTituloPrincipal.setText("Cargar Paciente");

        txtSubtituloPrincipal.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtSubtituloPrincipal.setForeground(new java.awt.Color(153, 153, 153));
        txtSubtituloPrincipal.setText("Ingrese los datos personales del paciente y presione \"Guardar\" para registrarlo.");

        javax.swing.GroupLayout contenedorLogoTitulo_cargarPacienteLayout = new javax.swing.GroupLayout(contenedorLogoTitulo_cargarPaciente);
        contenedorLogoTitulo_cargarPaciente.setLayout(contenedorLogoTitulo_cargarPacienteLayout);
        contenedorLogoTitulo_cargarPacienteLayout.setHorizontalGroup(
            contenedorLogoTitulo_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogoTitulo_cargarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSubtituloPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedorLogoTitulo_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLogoTitulo_cargarPacienteLayout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(txtTituloPrincipal)
                    .addContainerGap(141, Short.MAX_VALUE)))
        );
        contenedorLogoTitulo_cargarPacienteLayout.setVerticalGroup(
            contenedorLogoTitulo_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogoTitulo_cargarPacienteLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(txtSubtituloPrincipal)
                .addContainerGap())
            .addGroup(contenedorLogoTitulo_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLogoTitulo_cargarPacienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtTituloPrincipal)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen-3-MawClinic_opacity25_300x330.png"))); // NOI18N

        contenedorFormulario.setBackground(new java.awt.Color(243, 243, 243));
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
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        contenedorBtnLimpiarGuardar.setBackground(new java.awt.Color(243, 243, 243));
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

        btnGuardar.setBackground(new java.awt.Color(213, 213, 213));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save23x23.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar los datos del paciente");
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
            .addGroup(contenedorBtnLimpiarGuardarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout contenedorPadre_cargarPacienteLayout = new javax.swing.GroupLayout(contenedorPadre_cargarPaciente);
        contenedorPadre_cargarPaciente.setLayout(contenedorPadre_cargarPacienteLayout);
        contenedorPadre_cargarPacienteLayout.setHorizontalGroup(
            contenedorPadre_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPadre_cargarPacienteLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(contenedorPadre_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorBtnLimpiarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(imagenFondo)
                .addGap(115, 115, 115))
            .addGroup(contenedorPadre_cargarPacienteLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(contenedorLogoTitulo_cargarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorPadre_cargarPacienteLayout.setVerticalGroup(
            contenedorPadre_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPadre_cargarPacienteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(contenedorLogoTitulo_cargarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorPadre_cargarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPadre_cargarPacienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(contenedorBtnLimpiarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(contenedorPadre_cargarPacienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imagenFondo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        /* Reinicio el valor a "false" para que deje de ser "true" y cuando el 
        usuario vuelva a presionar el botón "guardar", pueda guardar el paciente. */
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
        String nombrePaciente = UtilidadesTexto.capitalizarPalabra(txtNombre.getText());

        String dniPaciente = txtDni.getText();

        String telPaciente = txtTelefono.getText();
        String emailPaciente = txtEmail.getText();

        // Validaciones
        if (nombrePaciente.isEmpty() || telPaciente.isEmpty() ||
            dniPaciente.isEmpty() || emailPaciente.isEmpty()) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Por favor complete todos los campos.", "Error", "No se pudo guardar el paciente");
            return; // Frena el flujo del código
        }

        if (!UtilidadesTexto.esNombreValido(nombrePaciente)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El nombre ingresado solo puede contener letras y espacios.", "Error", "No se pudo guardar el paciente");
            return;
        }

        if (!UtilidadesTexto.esEmailValido(emailPaciente)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El email ingresado no es válido.", "Error", "No se pudo guardar el paciente");
            return;
        }

        if (!UtilidadesTexto.esTelefonoValido(telPaciente)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El teléfono ingresado no es válido.", "Error", "No se pudo guardar el paciente");
            return;
        }

        if (!UtilidadesTexto.esDniValido(dniPaciente)) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El DNI ingresado no es válido. Debe tener 7 u 8 dígitos.", "Error", "No se pudo guardar el paciente");
            return;
        }
        
        yaExistePaciente(txtDni.getText());

        if (!estaRegistrado) {
            /* Llamo al método "guardarPaciente" que está creado en la "controladoraLogica"
            y le paso como parámetros todos los valores obtenidos desde el formulario
            de la interfaz gráfica: */
            controlLogico.guardarPaciente(nombrePaciente, dniPaciente, telPaciente, emailPaciente);

            UtilidadesJOptionPane.mostrarMensaje(this, "Paciente guardado correctamente.", "Info", "Registrar paciente");
            /* this:
            - En este contexto, this hace referencia a la instancia actual del JFrame
            donde estás escribiendo este código.
            - Es decir, si estás dentro de tu clase CargarPaciente extends JFrame,
            this apunta al propio formulario.

            Es el parent component, o sea, la ventana "padre" sobre la que se mostrará
            el cuadro de diálogo.
            - Si ponés this, el JOptionPane se centra sobre tu ventana de carga de pacientes.
            - Si ponés null, el diálogo aparecerá en el centro de la pantalla
            (sin referencia a ninguna ventana).

            "this" para que el mensaje aparezca encima de la ventana activa.
            Es más claro para el usuario y evita que el mensaje quede "perdido"
            detrás de otras ventanas.
            */

            UtilidadesMetodosAuxiliares.recargarTablaPanelVerDatosPaciente(this);

            /* Una vez que aparece el panel del mensaje "Paciente guardado correctamente",
            se limpia el formulario. */
            limpiarFormulario();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        boolean confirmacion = UtilidadesCardLayout.yaConfirmoCancelarCargaDatos(this.getParent(), "paciente");
        
        if (confirmacion) {
            UtilidadesCardLayout.mostrarPanel(this.getParent(), "Inicio");
            limpiarFormulario();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
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
    
    private void yaExistePaciente(String dni) {
        for (Paciente paci : controlLogico.traerListaPacientes()) {
            if (paci.getDni().equals(dni)) {
                UtilidadesJOptionPane.mostrarMensaje(this, "Ya hay un paciente registrado con ese DNI.", "Error", "No se pudo guardar el paciente");
                estaRegistrado = true;
            }
        }
    }
}
