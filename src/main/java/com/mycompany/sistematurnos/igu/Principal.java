package com.mycompany.sistematurnos.igu;

import com.mycompany.sistematurnos.utilidades.UtilidadesBotones;
import com.mycompany.sistematurnos.utilidades.UtilidadesCardLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;


public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents(); // Esto carga todo el diseño visual (Design)
        
        UIManager.put("Button.focus", new Color(0, 0, 0, 0)); // Transparente
        UIManager.put("ToolTip.foreground", Color.WHITE);
        UIManager.put("ToolTip.background", Color.BLACK);
        UIManager.put("ToolTip.font", new Font("SansSerif", Font.PLAIN, 12));
        UIManager.put("ToolTip.border", BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.GRAY),                   // borde visible
            BorderFactory.createEmptyBorder(5, 10, 5, 10)                 // padding interno
        ));
        
        // Deshabilita el botón de maximizar y redimensionar
        setResizable(false);
        
        panelPantallas.setLayout(new CardLayout());
        
        cargarPantallas();
        
        UtilidadesBotones.aplicarHoverCelestes(btnGestionDatos);
        UtilidadesBotones.aplicarHoverCelestes(btnVerRegistros);
        UtilidadesBotones.aplicarHoverCelestes(btnSalirDeLaApp);
        UtilidadesBotones.aplicarHoverCelestes(btnCargarMedico);
        UtilidadesBotones.aplicarHoverCelestes(btnCargarPaciente);
        UtilidadesBotones.aplicarHoverCelestes(btnCargarTurno);
        UtilidadesBotones.aplicarHoverCelestes(btnVolverDeGestionDatos);
        UtilidadesBotones.aplicarHoverCelestes(btnVerMedicos);
        UtilidadesBotones.aplicarHoverCelestes(btnVerPacientes);
        UtilidadesBotones.aplicarHoverCelestes(btnVerTurnos);
        UtilidadesBotones.aplicarHoverCelestes(btnVolverDeVerRegistros);
        
         panelPantallas.setBorder(new MatteBorder(1, 1, 4, 4, new Color(218, 218, 218)));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenido = new javax.swing.JPanel();
        contenedorLogoTitulos = new javax.swing.JPanel();
        logoTitulo = new javax.swing.JLabel();
        txtTituloPrincipal = new javax.swing.JLabel();
        txtSubtituloPrincipal = new javax.swing.JLabel();
        contenedorCardPanels = new javax.swing.JPanel();
        panelMenuPrincipal = new javax.swing.JPanel();
        btnVerRegistros = new javax.swing.JButton();
        btnSalirDeLaApp = new javax.swing.JButton();
        btnGestionDatos = new javax.swing.JButton();
        panelGestionDatos = new javax.swing.JPanel();
        btnCargarMedico = new javax.swing.JButton();
        btnCargarPaciente = new javax.swing.JButton();
        btnCargarTurno = new javax.swing.JButton();
        btnVolverDeGestionDatos = new javax.swing.JButton();
        panelVerRegistros = new javax.swing.JPanel();
        btnVerMedicos = new javax.swing.JButton();
        btnVerPacientes = new javax.swing.JButton();
        btnVerTurnos = new javax.swing.JButton();
        btnVolverDeVerRegistros = new javax.swing.JButton();
        panelPantallas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));

        panelContenido.setPreferredSize(new java.awt.Dimension(1366, 768));

        logoTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-MawClinic.png"))); // NOI18N
        logoTitulo.setText("jLabel3");

        txtTituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        txtTituloPrincipal.setForeground(new java.awt.Color(23, 84, 125));
        txtTituloPrincipal.setText("MawClinic – Sistema de Turnos Médicos");

        txtSubtituloPrincipal.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        txtSubtituloPrincipal.setForeground(new java.awt.Color(153, 153, 153));
        txtSubtituloPrincipal.setText("Gestión médica simple y eficiente");

        javax.swing.GroupLayout contenedorLogoTitulosLayout = new javax.swing.GroupLayout(contenedorLogoTitulos);
        contenedorLogoTitulos.setLayout(contenedorLogoTitulosLayout);
        contenedorLogoTitulosLayout.setHorizontalGroup(
            contenedorLogoTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogoTitulosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(logoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorLogoTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSubtituloPrincipal)
                    .addComponent(txtTituloPrincipal))
                .addGap(0, 0, 0))
        );
        contenedorLogoTitulosLayout.setVerticalGroup(
            contenedorLogoTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogoTitulosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorLogoTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorLogoTitulosLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtTituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubtituloPrincipal))))
        );

        contenedorCardPanels.setAlignmentY(0.0F);
        contenedorCardPanels.setPreferredSize(new java.awt.Dimension(0, 0));
        contenedorCardPanels.setLayout(new java.awt.CardLayout());

        btnVerRegistros.setBackground(new java.awt.Color(135, 198, 236));
        btnVerRegistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconRegistros26x26.png"))); // NOI18N
        btnVerRegistros.setText("Ver Registros");
        btnVerRegistros.setToolTipText("Consultar los registros almacenados en el sistema");
        btnVerRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(73, 159, 221)));
        btnVerRegistros.setFocusPainted(false);
        btnVerRegistros.setMaximumSize(new java.awt.Dimension(132, 32));
        btnVerRegistros.setMinimumSize(new java.awt.Dimension(132, 32));
        btnVerRegistros.setPreferredSize(new java.awt.Dimension(132, 32));
        btnVerRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistrosActionPerformed(evt);
            }
        });

        btnSalirDeLaApp.setBackground(new java.awt.Color(135, 198, 236));
        btnSalirDeLaApp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalirDeLaApp.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirDeLaApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconExit28x28.png"))); // NOI18N
        btnSalirDeLaApp.setText("Salir");
        btnSalirDeLaApp.setToolTipText("Cerrar el sistema y salir de MawClinic");
        btnSalirDeLaApp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 159, 221), 1, true));
        btnSalirDeLaApp.setFocusPainted(false);
        btnSalirDeLaApp.setIconTextGap(5);
        btnSalirDeLaApp.setMaximumSize(new java.awt.Dimension(132, 32));
        btnSalirDeLaApp.setMinimumSize(new java.awt.Dimension(132, 32));
        btnSalirDeLaApp.setPreferredSize(new java.awt.Dimension(132, 32));
        btnSalirDeLaApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDeLaAppActionPerformed(evt);
            }
        });

        btnGestionDatos.setBackground(new java.awt.Color(135, 198, 236));
        btnGestionDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGestionDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconGestionDatos_20x20.png"))); // NOI18N
        btnGestionDatos.setText("Gestión de Datos");
        btnGestionDatos.setToolTipText("Acceder a la gestión de médicos, pacientes y turnos");
        btnGestionDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 159, 221), 1, true));
        btnGestionDatos.setFocusPainted(false);
        btnGestionDatos.setIconTextGap(8);
        btnGestionDatos.setMaximumSize(new java.awt.Dimension(132, 32));
        btnGestionDatos.setMinimumSize(new java.awt.Dimension(132, 32));
        btnGestionDatos.setPreferredSize(new java.awt.Dimension(132, 32));
        btnGestionDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGestionDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSalirDeLaApp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVerRegistros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnGestionDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnVerRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnSalirDeLaApp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        contenedorCardPanels.add(panelMenuPrincipal, "cardMenu");
        panelMenuPrincipal.getAccessibleContext().setAccessibleName("");

        panelGestionDatos.setPreferredSize(new java.awt.Dimension(250, 300));

        btnCargarMedico.setBackground(new java.awt.Color(135, 198, 236));
        btnCargarMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargarMedico.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconMedico24x24.png"))); // NOI18N
        btnCargarMedico.setText("Cargar Médico");
        btnCargarMedico.setToolTipText("Cargar un nuevo médico");
        btnCargarMedico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 159, 221), 1, true));
        btnCargarMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCargarMedico.setFocusPainted(false);
        btnCargarMedico.setIconTextGap(5);
        btnCargarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarMedicoActionPerformed(evt);
            }
        });

        btnCargarPaciente.setBackground(new java.awt.Color(135, 198, 236));
        btnCargarPaciente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPaciente_25x25.png"))); // NOI18N
        btnCargarPaciente.setText("Cargar Paciente");
        btnCargarPaciente.setToolTipText("Cargar un nuevo paciente");
        btnCargarPaciente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 159, 221), 1, true));
        btnCargarPaciente.setFocusPainted(false);
        btnCargarPaciente.setIconTextGap(3);
        btnCargarPaciente.setMaximumSize(new java.awt.Dimension(132, 32));
        btnCargarPaciente.setMinimumSize(new java.awt.Dimension(132, 32));
        btnCargarPaciente.setPreferredSize(new java.awt.Dimension(132, 32));
        btnCargarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPacienteActionPerformed(evt);
            }
        });

        btnCargarTurno.setBackground(new java.awt.Color(135, 198, 236));
        btnCargarTurno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargarTurno.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconTurno26x26.png"))); // NOI18N
        btnCargarTurno.setText("Cargar Turno");
        btnCargarTurno.setToolTipText("Cargar un nuevo turno");
        btnCargarTurno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 159, 221), 1, true));
        btnCargarTurno.setFocusPainted(false);
        btnCargarTurno.setIconTextGap(7);
        btnCargarTurno.setMaximumSize(new java.awt.Dimension(132, 32));
        btnCargarTurno.setMinimumSize(new java.awt.Dimension(132, 32));
        btnCargarTurno.setPreferredSize(new java.awt.Dimension(132, 32));
        btnCargarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTurnoActionPerformed(evt);
            }
        });

        btnVolverDeGestionDatos.setBackground(new java.awt.Color(135, 198, 236));
        btnVolverDeGestionDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolverDeGestionDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverDeGestionDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconVolver_24x24.png"))); // NOI18N
        btnVolverDeGestionDatos.setText("Volver");
        btnVolverDeGestionDatos.setToolTipText("Volver al menú anterior");
        btnVolverDeGestionDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 159, 221), 1, true));
        btnVolverDeGestionDatos.setFocusPainted(false);
        btnVolverDeGestionDatos.setIconTextGap(5);
        btnVolverDeGestionDatos.setMaximumSize(new java.awt.Dimension(132, 32));
        btnVolverDeGestionDatos.setMinimumSize(new java.awt.Dimension(132, 32));
        btnVolverDeGestionDatos.setPreferredSize(new java.awt.Dimension(132, 32));
        btnVolverDeGestionDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverDeGestionDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGestionDatosLayout = new javax.swing.GroupLayout(panelGestionDatos);
        panelGestionDatos.setLayout(panelGestionDatosLayout);
        panelGestionDatosLayout.setHorizontalGroup(
            panelGestionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGestionDatosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelGestionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolverDeGestionDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelGestionDatosLayout.setVerticalGroup(
            panelGestionDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCargarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnCargarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnCargarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnVolverDeGestionDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        contenedorCardPanels.add(panelGestionDatos, "cardGestion");

        btnVerMedicos.setBackground(new java.awt.Color(135, 198, 236));
        btnVerMedicos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerMedicos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconVerMedicos_24x24.png"))); // NOI18N
        btnVerMedicos.setText("Ver Médicos");
        btnVerMedicos.setToolTipText("Ver la lista de médicos registrados");
        btnVerMedicos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 159, 221), 1, true));
        btnVerMedicos.setFocusPainted(false);
        btnVerMedicos.setIconTextGap(5);
        btnVerMedicos.setMaximumSize(new java.awt.Dimension(132, 32));
        btnVerMedicos.setMinimumSize(new java.awt.Dimension(132, 32));
        btnVerMedicos.setPreferredSize(new java.awt.Dimension(132, 32));
        btnVerMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMedicosActionPerformed(evt);
            }
        });

        btnVerPacientes.setBackground(new java.awt.Color(135, 198, 236));
        btnVerPacientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnVerPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconVerPacientes26x26.png"))); // NOI18N
        btnVerPacientes.setText("Ver Pacientes");
        btnVerPacientes.setToolTipText("Ver la lista de pacientes registrados");
        btnVerPacientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 159, 221), 1, true));
        btnVerPacientes.setFocusPainted(false);
        btnVerPacientes.setIconTextGap(5);
        btnVerPacientes.setMaximumSize(new java.awt.Dimension(132, 32));
        btnVerPacientes.setMinimumSize(new java.awt.Dimension(132, 32));
        btnVerPacientes.setPreferredSize(new java.awt.Dimension(132, 32));
        btnVerPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPacientesActionPerformed(evt);
            }
        });

        btnVerTurnos.setBackground(new java.awt.Color(135, 198, 236));
        btnVerTurnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerTurnos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerTurnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconVerTurnos26x26.png"))); // NOI18N
        btnVerTurnos.setText("Ver Turnos");
        btnVerTurnos.setToolTipText("Ver los turnos médicos programados");
        btnVerTurnos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 159, 221), 1, true));
        btnVerTurnos.setFocusPainted(false);
        btnVerTurnos.setIconTextGap(5);
        btnVerTurnos.setMaximumSize(new java.awt.Dimension(132, 32));
        btnVerTurnos.setMinimumSize(new java.awt.Dimension(132, 32));
        btnVerTurnos.setPreferredSize(new java.awt.Dimension(132, 32));
        btnVerTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTurnosActionPerformed(evt);
            }
        });

        btnVolverDeVerRegistros.setBackground(new java.awt.Color(135, 198, 236));
        btnVolverDeVerRegistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolverDeVerRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverDeVerRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconVolver_24x24.png"))); // NOI18N
        btnVolverDeVerRegistros.setText("Volver");
        btnVolverDeVerRegistros.setToolTipText("Volver al menú anterior");
        btnVolverDeVerRegistros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 159, 221), 1, true));
        btnVolverDeVerRegistros.setFocusPainted(false);
        btnVolverDeVerRegistros.setIconTextGap(5);
        btnVolverDeVerRegistros.setMaximumSize(new java.awt.Dimension(132, 32));
        btnVolverDeVerRegistros.setMinimumSize(new java.awt.Dimension(132, 32));
        btnVolverDeVerRegistros.setPreferredSize(new java.awt.Dimension(132, 32));
        btnVolverDeVerRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverDeVerRegistrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVerRegistrosLayout = new javax.swing.GroupLayout(panelVerRegistros);
        panelVerRegistros.setLayout(panelVerRegistrosLayout);
        panelVerRegistrosLayout.setHorizontalGroup(
            panelVerRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerRegistrosLayout.createSequentialGroup()
                .addGroup(panelVerRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelVerRegistrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolverDeVerRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVerRegistrosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelVerRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnVerTurnos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerPacientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerMedicos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelVerRegistrosLayout.setVerticalGroup(
            panelVerRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnVerPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnVerTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnVolverDeVerRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        btnVerTurnos.getAccessibleContext().setAccessibleDescription("");

        contenedorCardPanels.add(panelVerRegistros, "cardVer");

        panelPantallas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        panelPantallas.setMinimumSize(new java.awt.Dimension(0, 0));
        panelPantallas.setName(""); // NOI18N
        panelPantallas.setPreferredSize(new java.awt.Dimension(1060, 560));
        panelPantallas.setRequestFocusEnabled(false);
        panelPantallas.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(contenedorCardPanels, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(panelPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(contenedorLogoTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorLogoTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panelPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(contenedorCardPanels, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        contenedorCardPanels.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSalirDeLaAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDeLaAppActionPerformed
        System.exit(0);
        /* "System.exit(0);", cierra la ventana y la app entera (como si el 
            usuario tocara la X).
            En cambio, el método "setVisible(false)" la oculta pero no la destruye, 
            sigue en memoria. 
        */
    }//GEN-LAST:event_btnSalirDeLaAppActionPerformed

    private void btnCargarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarMedicoActionPerformed
        
        UtilidadesCardLayout.mostrarPanel(panelPantallas, "PanelCargarMedico");
    }//GEN-LAST:event_btnCargarMedicoActionPerformed

    private void btnCargarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPacienteActionPerformed

        UtilidadesCardLayout.mostrarPanel(panelPantallas, "PanelCargarPaciente");
    }//GEN-LAST:event_btnCargarPacienteActionPerformed

    private void btnCargarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTurnoActionPerformed

        UtilidadesCardLayout.mostrarPanel(panelPantallas, "PanelCargarTurno");
    }//GEN-LAST:event_btnCargarTurnoActionPerformed

    private void btnVolverDeGestionDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverDeGestionDatosActionPerformed
        volverAlPanelMenuPrincipal();
    }//GEN-LAST:event_btnVolverDeGestionDatosActionPerformed

    private void btnVerMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMedicosActionPerformed

        UtilidadesCardLayout.mostrarPanel(panelPantallas, "PanelVerDatosMedicos");
    }//GEN-LAST:event_btnVerMedicosActionPerformed

    private void btnVerPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPacientesActionPerformed
        UtilidadesCardLayout.mostrarPanel(panelPantallas, "PanelVerDatosPacientes");
    }//GEN-LAST:event_btnVerPacientesActionPerformed

    private void btnVerTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTurnosActionPerformed
        UtilidadesCardLayout.mostrarPanel(panelPantallas, "PanelVerDatosTurnos");
    }//GEN-LAST:event_btnVerTurnosActionPerformed

    private void btnVolverDeVerRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverDeVerRegistrosActionPerformed
        volverAlPanelMenuPrincipal();
    }//GEN-LAST:event_btnVolverDeVerRegistrosActionPerformed

    private void btnVerRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistrosActionPerformed
        UtilidadesCardLayout.mostrarPanel(contenedorCardPanels, "cardVer");
    }//GEN-LAST:event_btnVerRegistrosActionPerformed

    private void btnGestionDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionDatosActionPerformed
        UtilidadesCardLayout.mostrarPanel(contenedorCardPanels, "cardGestion");
    }//GEN-LAST:event_btnGestionDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarMedico;
    private javax.swing.JButton btnCargarPaciente;
    private javax.swing.JButton btnCargarTurno;
    private javax.swing.JButton btnGestionDatos;
    private javax.swing.JButton btnSalirDeLaApp;
    private javax.swing.JButton btnVerMedicos;
    private javax.swing.JButton btnVerPacientes;
    private javax.swing.JButton btnVerRegistros;
    private javax.swing.JButton btnVerTurnos;
    private javax.swing.JButton btnVolverDeGestionDatos;
    private javax.swing.JButton btnVolverDeVerRegistros;
    private javax.swing.JPanel contenedorCardPanels;
    private javax.swing.JPanel contenedorLogoTitulos;
    private javax.swing.JLabel logoTitulo;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelGestionDatos;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelPantallas;
    private javax.swing.JPanel panelVerRegistros;
    private javax.swing.JLabel txtSubtituloPrincipal;
    private javax.swing.JLabel txtTituloPrincipal;
    // End of variables declaration//GEN-END:variables

    private void volverAlPanelMenuPrincipal() {
        UtilidadesCardLayout.mostrarPanel(contenedorCardPanels, "cardMenu");
        
        UtilidadesCardLayout.mostrarPanel(panelPantallas, "Inicio");
    }

    private void cargarPantallas() {
        // Acá va el código para agregar los paneles
        panelPantallas.add(new PanelInicio(), "Inicio");
        panelPantallas.add(new PanelCargarMedico(), "PanelCargarMedico");
        panelPantallas.add(new PanelCargarPaciente(), "PanelCargarPaciente");
        panelPantallas.add(new PanelCargarTurno(), "PanelCargarTurno");
        panelPantallas.add(new PanelVerDatosMedicos(), "PanelVerDatosMedicos");
        panelPantallas.add(new PanelVerDatosPacientes(), "PanelVerDatosPacientes");
        panelPantallas.add(new PanelVerDatosTurnos(), "PanelVerDatosTurnos");
        
        // Muestro un panel inicial
        UtilidadesCardLayout.mostrarPanel(contenedorCardPanels, "Inicio");
    }
}
