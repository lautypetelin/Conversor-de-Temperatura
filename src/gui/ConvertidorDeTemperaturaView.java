package gui;

import javax.swing.JOptionPane;

public class ConvertidorDeTemperaturaView extends javax.swing.JFrame {

    public ConvertidorDeTemperaturaView() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jlTituloApp = new javax.swing.JLabel();
        jlDigiteTemp = new javax.swing.JLabel();
        jtfTemperatura = new javax.swing.JTextField();
        jbConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertidor de unidades de Temperaturas");

        jlTituloApp.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlTituloApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloApp.setText("Convertidor de Unidades de Temperatura");

        jlDigiteTemp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlDigiteTemp.setText("Ingrese Temperatura:");

        jtfTemperatura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jbConvertir.setText("Convertir");
        jbConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTituloApp, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jbConvertir))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jlDigiteTemp)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jlTituloApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDigiteTemp)
                    .addComponent(jtfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jbConvertir)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConvertirActionPerformed
        
        try{
            
            if(jtfTemperatura.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No debe dejar el campo vacío.");
                return;
            }
            
            double tempCelcius = Double.parseDouble(jtfTemperatura.getText());   
            double tempFahrenheit = tempCelcius * 9/5 + 32;

            JOptionPane.showMessageDialog(this, tempCelcius + "°C es equivalente a " + tempFahrenheit + "°F");
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar valores númericos.");
        }finally{
            jtfTemperatura.setText("");
        }
        
    }//GEN-LAST:event_jbConvertirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConvertidorDeTemperaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertidorDeTemperaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertidorDeTemperaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertidorDeTemperaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConvertidorDeTemperaturaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbConvertir;
    private javax.swing.JLabel jlDigiteTemp;
    private javax.swing.JLabel jlTituloApp;
    private javax.swing.JTextField jtfTemperatura;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    
}