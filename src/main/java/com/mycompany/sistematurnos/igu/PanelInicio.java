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

        logoGrandeInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoInicio-30%-350x313.png"))); // NOI18N

        txtTituloBienvenidaInicio.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        txtTituloBienvenidaInicio.setForeground(new java.awt.Color(74, 163, 223));
        txtTituloBienvenidaInicio.setText("Bienvenido a MawClinic");

        txtSubtituloInicio.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        txtSubtituloInicio.setForeground(new java.awt.Color(153, 153, 153));
        txtSubtituloInicio.setText("Administre médicos, pacientes y turnos de forma centralizada ");

        javax.swing.GroupLayout contenedorInicioLayout = new javax.swing.GroupLayout(contenedorInicio);
        contenedorInicio.setLayout(contenedorInicioLayout);
        contenedorInicioLayout.setHorizontalGroup(
            contenedorInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInicioLayout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(logoGrandeInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInicioLayout.createSequentialGroup()
                .addGap(0, 321, Short.MAX_VALUE)
                .addComponent(txtSubtituloInicio)
                .addGap(321, 321, 321))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTituloBienvenidaInicio)
                .addGap(366, 366, 366))
        );
        contenedorInicioLayout.setVerticalGroup(
            contenedorInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInicioLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(txtTituloBienvenidaInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubtituloInicio)
                .addGap(47, 47, 47)
                .addComponent(logoGrandeInicio)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorInicio, 1038, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
