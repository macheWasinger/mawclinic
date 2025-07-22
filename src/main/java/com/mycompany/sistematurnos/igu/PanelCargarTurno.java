package com.mycompany.sistematurnos.igu;

import com.mycompany.sistematurnos.utilidades.UtilidadesJOptionPane;
import com.mycompany.sistematurnos.logica.ControladoraLogica;
import com.mycompany.sistematurnos.logica.Medico;
import com.mycompany.sistematurnos.logica.Paciente;
import com.mycompany.sistematurnos.logica.Turno;
import com.mycompany.sistematurnos.utilidades.UtilidadesBotones;
import com.mycompany.sistematurnos.utilidades.UtilidadesCardLayout;
import com.mycompany.sistematurnos.utilidades.UtilidadesMetodosAuxiliares;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;


public class PanelCargarTurno extends javax.swing.JPanel {

    /* Para evitar POSIBLES errores en consola, cada vez que trabaje en "JFrame", 
      la o las clases declaradas globalmente, SIEMPRE hay que iniciarlas en "null".
    */
    private ControladoraLogica controlLogico = null;
    private java.util.Map<String, Medico> mapaMedicos;
    private java.util.Map<String, Paciente> mapaPacientes;
    private LocalDate fechaObtenida;
    private List<String> horariosDisponiblesMedicos;
    private Medico medicoSeleccionado = null;
    private Paciente pacienteSeleccionado = null;
    private boolean estaRegistrado = false;

    public PanelCargarTurno() {
        controlLogico = new ControladoraLogica();
        initComponents();
        
        UtilidadesBotones.aplicarHoverGrises(btnLimpiar);
        UtilidadesBotones.aplicarHoverGrises(btnCancelar);
        UtilidadesBotones.aplicarHoverGrises(btnGuardar);
        

        // Limpio el combo por si acaso
        cmbListaMedicos.removeAllItems();
        cmbListaPacientes.removeAllItems();

        cmbListaMedicos.addItem("Seleccione un médico");
        cmbListaPacientes.addItem("Seleccione un paciente");

        // Inicializo el mapa
        mapaMedicos = new java.util.HashMap<>();
        mapaPacientes = new java.util.HashMap<>();

        // Traigo los médicos y pacientes
        List<Medico> listaMedicos = controlLogico.traerListaMedicos();
        List<Paciente> listaPacientes = controlLogico.traerListaPacientes();

        // Cargo combos y mapas
        cargarComboMedicos(listaMedicos);
        cargarComboPacientes(listaPacientes);

        // Eventos para cada lista
        actionListenerComboListaMedicos();
        actionListenerComboListaPacientes();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPadre_cargarTurno = new javax.swing.JPanel();
        contenedorLogoTitulo_cargarTurno = new javax.swing.JPanel();
        txtTituloPrincipal = new javax.swing.JLabel();
        txtSubtituloPrincipal = new javax.swing.JLabel();
        imagenFondo = new javax.swing.JLabel();
        contenedorFormulario = new javax.swing.JPanel();
        fechaJCalendar = new com.toedter.calendar.JDateChooser();
        labelHora = new javax.swing.JLabel();
        cmbHora = new javax.swing.JComboBox<>();
        labelFecha = new javax.swing.JLabel();
        labelPaciente = new javax.swing.JLabel();
        cmbListaPacientes = new javax.swing.JComboBox<>();
        labelMedico = new javax.swing.JLabel();
        cmbListaMedicos = new javax.swing.JComboBox<>();
        contenedorBtnLimpiarGuardar = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1057, 560));

        contenedorPadre_cargarTurno.setPreferredSize(new java.awt.Dimension(1057, 560));

        txtTituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTituloPrincipal.setForeground(new java.awt.Color(74, 161, 222));
        txtTituloPrincipal.setText("Cargar Turno");

        txtSubtituloPrincipal.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtSubtituloPrincipal.setForeground(new java.awt.Color(153, 153, 153));
        txtSubtituloPrincipal.setText("Seleccioná paciente, médico, fecha y horario para registrar un nuevo turno.");

        javax.swing.GroupLayout contenedorLogoTitulo_cargarTurnoLayout = new javax.swing.GroupLayout(contenedorLogoTitulo_cargarTurno);
        contenedorLogoTitulo_cargarTurno.setLayout(contenedorLogoTitulo_cargarTurnoLayout);
        contenedorLogoTitulo_cargarTurnoLayout.setHorizontalGroup(
            contenedorLogoTitulo_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogoTitulo_cargarTurnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSubtituloPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedorLogoTitulo_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLogoTitulo_cargarTurnoLayout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(txtTituloPrincipal)
                    .addContainerGap(141, Short.MAX_VALUE)))
        );
        contenedorLogoTitulo_cargarTurnoLayout.setVerticalGroup(
            contenedorLogoTitulo_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogoTitulo_cargarTurnoLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(txtSubtituloPrincipal)
                .addContainerGap())
            .addGroup(contenedorLogoTitulo_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLogoTitulo_cargarTurnoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtTituloPrincipal)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen-3-MawClinic_opacity25_300x330.png"))); // NOI18N

        contenedorFormulario.setPreferredSize(new java.awt.Dimension(333, 317));

        fechaJCalendar.setBackground(new java.awt.Color(255, 255, 255));
        fechaJCalendar.setToolTipText("Seleccione la fecha en la que se desea asignar el turno");
        fechaJCalendar.setDateFormatString("d/MM/yyyy");
        fechaJCalendar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fechaJCalendar.setMinimumSize(new java.awt.Dimension(155, 20));
        fechaJCalendar.setPreferredSize(new java.awt.Dimension(165, 30));

        labelHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelHora.setText("Hora:");

        cmbHora.setBackground(new java.awt.Color(255, 255, 255));
        cmbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbHora.setToolTipText("Seleccione una hora disponible del médico para el turno");
        cmbHora.setBorder(null);
        cmbHora.setMinimumSize(new java.awt.Dimension(155, 20));
        cmbHora.setPreferredSize(new java.awt.Dimension(165, 30));
        cmbHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHoraActionPerformed(evt);
            }
        });

        labelFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelFecha.setText("Fecha:");

        labelPaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPaciente.setText("Paciente:");

        cmbListaPacientes.setBackground(new java.awt.Color(255, 255, 255));
        cmbListaPacientes.setToolTipText("Seleccione el paciente al que se le asignará el turno");
        cmbListaPacientes.setBorder(null);
        cmbListaPacientes.setMinimumSize(new java.awt.Dimension(155, 20));
        cmbListaPacientes.setPreferredSize(new java.awt.Dimension(165, 30));

        labelMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMedico.setText("Médico:");

        cmbListaMedicos.setBackground(new java.awt.Color(255, 255, 255));
        cmbListaMedicos.setToolTipText("Seleccione el médico para asignar el turno");
        cmbListaMedicos.setBorder(null);
        cmbListaMedicos.setMinimumSize(new java.awt.Dimension(155, 20));
        cmbListaMedicos.setPreferredSize(new java.awt.Dimension(165, 30));

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorFormularioLayout.createSequentialGroup()
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbListaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbListaMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaJCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMedico)
                    .addComponent(cmbListaMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPaciente)
                    .addComponent(cmbListaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaJCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha))
                .addGap(33, 33, 33)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHora)
                    .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        btnGuardar.setBackground(new java.awt.Color(213, 213, 213));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save23x23.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar los datos del turno");
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

        javax.swing.GroupLayout contenedorPadre_cargarTurnoLayout = new javax.swing.GroupLayout(contenedorPadre_cargarTurno);
        contenedorPadre_cargarTurno.setLayout(contenedorPadre_cargarTurnoLayout);
        contenedorPadre_cargarTurnoLayout.setHorizontalGroup(
            contenedorPadre_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPadre_cargarTurnoLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(contenedorLogoTitulo_cargarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPadre_cargarTurnoLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(contenedorPadre_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contenedorBtnLimpiarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(imagenFondo)
                .addGap(115, 115, 115))
        );
        contenedorPadre_cargarTurnoLayout.setVerticalGroup(
            contenedorPadre_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPadre_cargarTurnoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(contenedorLogoTitulo_cargarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorPadre_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPadre_cargarTurnoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(contenedorBtnLimpiarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(contenedorPadre_cargarTurnoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imagenFondo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPadre_cargarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorPadre_cargarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        estaRegistrado = false;
        
        if (medicoSeleccionado == null) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Debe seleccionar un médico", "Error", "No se pudo guardar el turno");
            return;
        }

        if (pacienteSeleccionado == null) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Debe seleccionar un paciente", "Error", "No se pudo guardar el turno");
            return;
        }

        // Fecha seleccionada en el JCalendar
        java.util.Date fechaSeleccionada = fechaJCalendar.getDate();

        if (fechaSeleccionada != null) {
            // Obtengo mi LocalDate
            fechaObtenida = fechaSeleccionada
                    .toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
        } else {
            UtilidadesJOptionPane.mostrarMensaje(this, "Por favor, seleccione una fecha", "Warning", "No se pudo guardar el turno");
            return;
        }

        String horarioSeleccionado = (String) cmbHora.getSelectedItem();

        if (horarioSeleccionado == null || horarioSeleccionado.equals("-")) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Por favor, seleccione una hora", "Warning", "No se pudo guardar el turno");
            return;
        }

        LocalTime horaLocal = LocalTime.parse(horarioSeleccionado);

        if (fechaObtenida == null || horaLocal == null) {
            UtilidadesJOptionPane.mostrarMensaje(this, "La fecha y la hora son obligatorias", "Warning", "No se pudo guardar el turno");
            return;
        }

        yaExisteTurno(fechaObtenida, horaLocal, medicoSeleccionado.getId());
        
        if (!estaRegistrado) {
            // Guardar el turno
            controlLogico.guardarTurno(fechaObtenida, horaLocal, medicoSeleccionado, pacienteSeleccionado);
            UtilidadesJOptionPane.mostrarMensaje(this, "Turno guardado correctamente", "Info", "Registrar turno");


            UtilidadesMetodosAuxiliares.recargarTablaPanelVerDatosTurno(this);

            limpiarFormulario();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHoraActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        boolean confirmacion = UtilidadesCardLayout.yaConfirmoCancelarCargaDatos(this.getParent(), "turno");
        
        if (confirmacion) {
            UtilidadesCardLayout.mostrarPanel(this.getParent(), "Inicio");
            limpiarFormulario();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbHora;
    private javax.swing.JComboBox<String> cmbListaMedicos;
    private javax.swing.JComboBox<String> cmbListaPacientes;
    private javax.swing.JPanel contenedorBtnLimpiarGuardar;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JPanel contenedorLogoTitulo_cargarTurno;
    private javax.swing.JPanel contenedorPadre_cargarTurno;
    private com.toedter.calendar.JDateChooser fechaJCalendar;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelMedico;
    private javax.swing.JLabel labelPaciente;
    private javax.swing.JLabel txtSubtituloPrincipal;
    private javax.swing.JLabel txtTituloPrincipal;
    // End of variables declaration//GEN-END:variables

    // MÉTODOS AUXILIARES
    private void cargarComboMedicos(List<Medico> listaMedicos) {
        for (Medico m : listaMedicos) {
            // Por ejemplo, usás el nombre como clave
            String clave = m.getId() + " - " + m.getNombre() + " - " + m.getEspecialidad();

            cmbListaMedicos.addItem(clave);

            mapaMedicos.put(clave, m);
        }
    }

    private void cargarComboPacientes(List<Paciente> listaPacientes) {
        for (Paciente p : listaPacientes) {
            String clave = p.getNombre() + " - DNI: " + p.getDni();
            cmbListaPacientes.addItem(clave);

            mapaPacientes.put(clave, p);
        }
    }
    
    
    private void limpiarFormulario() {
        cmbListaMedicos.setSelectedIndex(0);
        cmbListaPacientes.setSelectedIndex(0);
        fechaJCalendar.setDate(null);
        cmbHora.setSelectedIndex(0);
    }

    private void actionListenerComboListaMedicos() {
        /* 
          - Agrego el ActionListener solo para eventos del Medico.
          - Cada vez que el usuario cambie el médico en el combo, se ejecuta ese bloque de código. 
         */
        cmbListaMedicos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String claveMedicoSeleccionada = (String) cmbListaMedicos.getSelectedItem();
                /* Evento para obtener el médico y, por consiguiente, sus horarios
                   mediante su método getHorariosDisponibles(). */

                if (claveMedicoSeleccionada.equals("Seleccione un médico")) {
                    System.out.println("No hay médico seleccionado.");
                    
                    cmbHora.removeAllItems();
                    /* Si los horarios del médico anterior estaban cargados, 
                    cuando selecciono el ítem "Seleccione un médico", borro los 
                    horarios del médico cargados anteriormente. */
                    
                    cmbHora.addItem("-");
                    /* Vuelvo a mostrar el indicador de que aún no ha 
                       seleccionado un horario. */
                    
                    return;
                }

                /* Mediante la CLAVE seleccionada, obtengo el VALOR del 
                   map (o sea, el objeto Medico). */
                medicoSeleccionado = mapaMedicos.get(claveMedicoSeleccionada);
                if (medicoSeleccionado != null) {

                    cmbHora.removeAllItems();
                    /* Borro los horarios del médico anterior así no se acumulan
                       con los horarios del nuevo médico seleccionado. */

                    cmbHora.addItem("-");
                    /* Vuelvo a mostrar el indicador de que aún no ha 
                       seleccionado un horario. */
                    
                    horariosDisponiblesMedicos = new ArrayList<>(medicoSeleccionado.getHorariosDisponibles());

                    for (String horario : horariosDisponiblesMedicos) {
                        cmbHora.addItem(horario);
                        // Se agregan los horarios del nuevo médico
                    }
                }
            }
        });
    }
    
    private void actionListenerComboListaPacientes() {
        /* 
          - Agrego el ActionListener solo para eventos del Paciente.
          - Cada vez que el usuario cambie el paciente en el combo, se ejecuta ese bloque de código. 
         */
        cmbListaPacientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String clavePacienteSeleccionado = (String) cmbListaPacientes.getSelectedItem();

                if (clavePacienteSeleccionado.equals("Seleccione un paciente")) {
                    pacienteSeleccionado = null;
                    System.out.println("No hay paciente seleccionado.");
                    //cmbListaPacientes.addItem("-");
                    return;
                }

                pacienteSeleccionado = mapaPacientes.get(clavePacienteSeleccionado);
            }
        });
    }
    
    private void yaExisteTurno(LocalDate fecha, LocalTime hora, Long idMedico) {
        for (Turno turno : controlLogico.traerListaTurnos()) {
            if (turno.getFecha().equals(fecha) && turno.getHora().equals(hora) && turno.getMedicoAsociado().getId() == idMedico) {
                UtilidadesJOptionPane.mostrarMensaje(this, "Ya existe un turno registrado para este médico en la fecha y hora seleccionadas.", "Error", "No se pudo guardar el turno");
                estaRegistrado = true;
            }
        }
    }
}
