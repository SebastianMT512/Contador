/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Logica.Contador;

/**
 *
 * @author Estudiantes
 */
public class GuiContador extends javax.swing.JFrame {
private Contador contador = new Contador();
    /**
     * Creates new form GuiContador
     */
    public GuiContador() {
        initComponents();
        LblValor.setText(String.valueOf(contador.getValor()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblEtiquetaValor = new javax.swing.JLabel();
        LblTitulo = new javax.swing.JLabel();
        LblValor = new javax.swing.JLabel();
        BtnContar = new javax.swing.JButton();
        BtnDescontar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblEtiquetaValor.setFont(new java.awt.Font("SWRomnt", 0, 18)); // NOI18N
        LblEtiquetaValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblEtiquetaValor.setText("Valor:");

        LblTitulo.setFont(new java.awt.Font("SWRomnc", 1, 18)); // NOI18N
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("Contador Poo G87");

        LblValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LblValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblValor.setText("0");

        BtnContar.setFont(new java.awt.Font("SWTxt", 1, 14)); // NOI18N
        BtnContar.setText("Contar");
        BtnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContarActionPerformed(evt);
            }
        });

        BtnDescontar.setFont(new java.awt.Font("SWTxt", 1, 14)); // NOI18N
        BtnDescontar.setText("Descontar");
        BtnDescontar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDescontarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SWTxt", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(BtnDescontar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnContar)
                            .addComponent(LblEtiquetaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEtiquetaValor)
                    .addComponent(LblValor))
                .addGap(48, 48, 48)
                .addComponent(BtnContar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnDescontar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContarActionPerformed
        contador.Avanzar();
        LblValor.setText(String.valueOf(contador.getValor()));
    }//GEN-LAST:event_BtnContarActionPerformed

    private void BtnDescontarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDescontarActionPerformed
       contador.Retroceder();
        LblValor.setText(String.valueOf(contador.getValor()));
    }//GEN-LAST:event_BtnDescontarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        contador.Borrar();
        LblValor.setText(String.valueOf(contador.getValor()));
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GuiContador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiContador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiContador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiContador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiContador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContar;
    private javax.swing.JButton BtnDescontar;
    private javax.swing.JLabel LblEtiquetaValor;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JLabel LblValor;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
