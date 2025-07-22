package com.mycompany.sistematurnos.igu;

import com.mycompany.sistematurnos.utilidades.UtilidadesCardLayout;
import com.mycompany.sistematurnos.utilidades.UtilidadesJOptionPane;
import com.mycompany.sistematurnos.utilidades.UtilidadesMetodosAuxiliares;
import com.mycompany.sistematurnos.logica.ControladoraLogica;
import com.mycompany.sistematurnos.logica.Medico;
import com.mycompany.sistematurnos.logica.Paciente;
import com.mycompany.sistematurnos.logica.Turno;
import com.mycompany.sistematurnos.utilidades.UtilidadesBotones;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;


public class PanelEditarTurno extends javax.swing.JPanel {

    /* Para evitar POSIBLES errores en consola, cada vez que trabaje en "JFrame", 
      la o las clases declaradas globalmente, SIEMPRE hay que iniciarlas en "null".
    */
    private ControladoraLogica controlLogico = null;
    private java.util.Map<String, Medico> mapaMedicos;
    private java.util.Map<String, Paciente> mapaPacientes;
    private LocalDate fechaObtenida;
    private Medico medicoSeleccionado = null;
    private Paciente pacienteSeleccionado = null;
    
    private Long num_id;
    private Turno turno = null;

    public PanelEditarTurno(Long num_id) {
        controlLogico = new ControladoraLogica();
        initComponents();
        
        UtilidadesBotones.aplicarHoverGrises(btnLimpiar);
        UtilidadesBotones.aplicarHoverGrises(btnCancelarCambios);
        UtilidadesBotones.aplicarHoverGrises(btnGuardarCambios);
        
        cmbListaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaPacientesActionPerformed(evt);
            }
        });

        cmbListaMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaMedicosActionPerformed(evt);
            }
        });

        
        this.num_id = num_id;

        // Limpio el combo por si acaso
        cmbListaMedicos.removeAllItems();
        cmbListaPacientes.removeAllItems();


        // Inicializo mapas
        mapaMedicos = new java.util.HashMap<>();
        mapaPacientes = new java.util.HashMap<>();
        
        List<Medico> listaMedicos = controlLogico.traerListaMedicos();
        List<Paciente> listaPacientes = controlLogico.traerListaPacientes();

        // Cargo combos
        cargarComboMedicos(listaMedicos);
        cargarComboPacientes(listaPacientes);

        // Ahora que ya están los ítems en los combos, cargo la selección
        cargarDatos(num_id);
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
        btnGuardarCambios = new javax.swing.JButton();
        btnCancelarCambios = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1057, 560));

        contenedorPadre_cargarTurno.setPreferredSize(new java.awt.Dimension(1057, 560));

        txtTituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTituloPrincipal.setForeground(new java.awt.Color(74, 161, 222));
        txtTituloPrincipal.setText("Editar Datos del Turno");

        txtSubtituloPrincipal.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtSubtituloPrincipal.setForeground(new java.awt.Color(153, 153, 153));
        txtSubtituloPrincipal.setText("Modifique la información registrada y presione \"Guardar\" para confirmar");

        javax.swing.GroupLayout contenedorLogoTitulo_cargarTurnoLayout = new javax.swing.GroupLayout(contenedorLogoTitulo_cargarTurno);
        contenedorLogoTitulo_cargarTurno.setLayout(contenedorLogoTitulo_cargarTurnoLayout);
        contenedorLogoTitulo_cargarTurnoLayout.setHorizontalGroup(
            contenedorLogoTitulo_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogoTitulo_cargarTurnoLayout.createSequentialGroup()
                .addGroup(contenedorLogoTitulo_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSubtituloPrincipal)
                    .addGroup(contenedorLogoTitulo_cargarTurnoLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txtTituloPrincipal)))
                .addGap(0, 0, 0))
        );
        contenedorLogoTitulo_cargarTurnoLayout.setVerticalGroup(
            contenedorLogoTitulo_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogoTitulo_cargarTurnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(txtSubtituloPrincipal)
                .addContainerGap())
        );

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen-3-MawClinic_opacity25_300x330.png"))); // NOI18N

        contenedorFormulario.setPreferredSize(new java.awt.Dimension(333, 317));

        fechaJCalendar.setBackground(new java.awt.Color(255, 255, 255));
        fechaJCalendar.setForeground(new java.awt.Color(75, 161, 222));
        fechaJCalendar.setToolTipText("Seleccione la fecha en la que se desea asignar el turno");
        fechaJCalendar.setDateFormatString("d/MM/yyyy");
        fechaJCalendar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaJCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbListaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(cmbListaMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                    .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
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
        btnGuardarCambios.setToolTipText("Guardar los cambios del turno");
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

        javax.swing.GroupLayout contenedorPadre_cargarTurnoLayout = new javax.swing.GroupLayout(contenedorPadre_cargarTurno);
        contenedorPadre_cargarTurno.setLayout(contenedorPadre_cargarTurnoLayout);
        contenedorPadre_cargarTurnoLayout.setHorizontalGroup(
            contenedorPadre_cargarTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPadre_cargarTurnoLayout.createSequentialGroup()
                .addGap(301, 301, 301)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorPadre_cargarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        if (medicoSeleccionado == null) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Debe seleccionar un médico", "Error", "Error al guardar el turno");
            return;
        }

        if (pacienteSeleccionado == null) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Debe seleccionar un paciente", "Error", "Error al guardar el turno");
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
            UtilidadesJOptionPane.mostrarMensaje(this, "Por favor, seleccione una fecha", "Warning", "Error al guardar el turno");
            return;
        }

        String horarioSeleccionado = (String) cmbHora.getSelectedItem();

        if (horarioSeleccionado == null || horarioSeleccionado.equals("-")) {
            UtilidadesJOptionPane.mostrarMensaje(this, "Por favor, seleccione una hora", "Warning", "Error al guardar el turno");
            return;
        }

        LocalTime horaLocal = LocalTime.parse(horarioSeleccionado);

        // Validaciones finales
        if (fechaObtenida == null || horaLocal == null) {
            UtilidadesJOptionPane.mostrarMensaje(this, "La fecha y la hora son obligatorias", "Warning", "Error al guardar el turno");
            return;
        }

        // Guardar el turno
        controlLogico.modificarDatosDelTurno(turno, fechaObtenida, horaLocal, medicoSeleccionado, pacienteSeleccionado);
        
        UtilidadesJOptionPane.mostrarMensaje(this, "Turno editado correctamente", "Info", "Registrar turno");

        UtilidadesMetodosAuxiliares.recargarTablaPanelVerDatosTurno(this);
        
        UtilidadesCardLayout.mostrarPanel(this.getParent(), "PanelVerDatosTurnos");
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void cmbHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHoraActionPerformed

    private void btnCancelarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCambiosActionPerformed
        UtilidadesCardLayout.confirmacionCancelarEdicion(this.getParent(), "PanelVerDatosTurnos", "turno");
    }//GEN-LAST:event_btnCancelarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCambios;
    private javax.swing.JButton btnGuardarCambios;
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


    private void cargarDatos(Long num_id) {
        this.turno = controlLogico.traerTurno(num_id);

        if (this.turno == null) {
            UtilidadesJOptionPane.mostrarMensaje(this, "El turno no existe.", "Error", "Error");
            return;
        }

        // Setea Médico
        int indexMedico = indiceMedicoAsociado();
        cmbListaMedicos.setSelectedIndex(indexMedico);

        // Cargá horarios del médico
        Medico medicoTurno = turno.getMedicoAsociado();
        List<String> horarios = medicoTurno.getHorariosDisponibles();

        cmbHora.removeAllItems();
        cmbHora.addItem("-"); // Opción por defecto
        for (String horario : horarios) {
            cmbHora.addItem(horario);
        }

        // Setea Paciente
        cmbListaPacientes.setSelectedIndex(indicePacienteAsociado());

        // Setea Fecha
        fechaJCalendar.setDate(
           java.util.Date.from(
               turno.getFecha()
                    .atStartOfDay()
                    .atZone(ZoneId.systemDefault())
                    .toInstant()
           )
        );

        // Setea Hora
        cmbHora.setSelectedIndex(indiceHoraElegida());
    }
    
    
    private int indiceMedicoAsociado() {
        this.turno = controlLogico.traerTurno(num_id);

        Medico medicoTurno = turno.getMedicoAsociado();
        
        for (int i = 0; i < cmbListaMedicos.getItemCount(); i++) {
            String item = cmbListaMedicos.getItemAt(i);
            Medico medicoItem = mapaMedicos.get(item);

            if (medicoItem != null && medicoItem.getId().equals(medicoTurno.getId())) {
                return i;
            }
        }
        return 0; // Por defecto "Seleccione un médico"
    }
    
    private int indicePacienteAsociado() {
        this.turno = controlLogico.traerTurno(num_id);
        Paciente pacienteTurno = turno.getPacienteAsociado();

        for (int i = 0; i < cmbListaPacientes.getItemCount(); i++) {
            String item = cmbListaPacientes.getItemAt(i);
            Paciente pacienteItem = mapaPacientes.get(item);
            if (pacienteItem != null && pacienteItem.getId().equals(pacienteTurno.getId())) {
                return i;
            }
        }

        return 0; // Por defecto "Seleccione un paciente"
    }
    
    
    private int indiceHoraElegida() {
        LocalTime horaElegida = turno.getHora();

        for (int i = 0; i < cmbHora.getItemCount(); i++) {
            String item = cmbHora.getItemAt(i);

            if (item != null && !item.equals("-")) {
                try {
                    LocalTime horaItem = LocalTime.parse(item);

                    if (horaItem.equals(horaElegida)) {
                        return i;
                    }
                } catch (Exception ex) {
                    System.out.println("Error parseando: " + ex.getMessage());
                }
            }
        }
        return 0;
    }

    
    private void cmbListaMedicosActionPerformed(ActionEvent evt) {
        String clave = (String) cmbListaMedicos.getSelectedItem();
        if (clave != null && mapaMedicos.containsKey(clave)) {
            medicoSeleccionado = mapaMedicos.get(clave);

            // Recargar horarios del médico seleccionado
            cmbHora.removeAllItems();
            cmbHora.addItem("-");
            for (String horario : medicoSeleccionado.getHorariosDisponibles()) {
                cmbHora.addItem(horario);
            }
        } else {
            medicoSeleccionado = null;
        }
    }

    
    private void cmbListaPacientesActionPerformed(ActionEvent evt) {
        String clave = (String) cmbListaPacientes.getSelectedItem();
        if (clave != null && mapaPacientes.containsKey(clave)) {
            pacienteSeleccionado = mapaPacientes.get(clave);
        } else {
            pacienteSeleccionado = null;
        }
    }

}
