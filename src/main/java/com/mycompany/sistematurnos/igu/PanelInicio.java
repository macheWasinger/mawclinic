package com.mycompany.sistematurnos.igu;

public class PanelInicio extends javax.swing.JPanel {

    public PanelInicio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorInicio = new javax.swing.JPanel();
        logoGrandeInicio = new javax.swing.JLabel();
        txtTituloBienvenidaInicio = new javax.swing.JLabel();
        txtSubtituloInicio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(243, 243, 243));
        setPreferredSize(new java.awt.Dimension(1040, 560));

        contenedorInicio.setBackground(new java.awt.Color(242, 242, 242));
        contenedorInicio.setMinimumSize(new java.awt.Dimension(0, 0));
        contenedorInicio.setPreferredSize(new java.awt.Dimension(1040, 560));

        logoGrandeInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoInicio-40%-400x360.png"))); // NOI18N

        txtTituloBienvenidaInicio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTituloBienvenidaInicio.setForeground(new java.awt.Color(74, 163, 223));
        txtTituloBienvenidaInicio.setText("Bienvenido a MawClinic");

        txtSubtituloInicio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtSubtituloInicio.setForeground(new java.awt.Color(153, 153, 153));
        txtSubtituloInicio.setText("Administre médicos, pacientes y turnos de forma centralizada ");

        javax.swing.GroupLayout contenedorInicioLayout = new javax.swing.GroupLayout(contenedorInicio);
        contenedorInicio.setLayout(contenedorInicioLayout);
        contenedorInicioLayout.setHorizontalGroup(
            contenedorInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInicioLayout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(txtTituloBienvenidaInicio)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInicioLayout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addGroup(contenedorInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSubtituloInicio)
                    .addComponent(logoGrandeInicio))
                .addGap(313, 313, 313))
        );
        contenedorInicioLayout.setVerticalGroup(
            contenedorInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInicioLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(txtTituloBienvenidaInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSubtituloInicio)
                .addGap(36, 36, 36)
                .addComponent(logoGrandeInicio)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorInicio, 1038, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorInicio, 558, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorInicio;
    private javax.swing.JLabel logoGrandeInicio;
    private javax.swing.JLabel txtSubtituloInicio;
    private javax.swing.JLabel txtTituloBienvenidaInicio;
    // End of variables declaration//GEN-END:variables
}
