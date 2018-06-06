/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.telas;

import br.com.business.LaboratorioBusiness;
import br.com.virtualrecipe.dominio.Laboratorio;

/**
 *
 * @author melis_000
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuP
     */
    public MenuAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_CadPac = new javax.swing.JButton();
        btn_CadMed = new javax.swing.JButton();
        btn_CadCons = new javax.swing.JButton();
        btn_CadLab = new javax.swing.JButton();
        btn_CadRec = new javax.swing.JButton();
        btn_CadEx = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setName("menu"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_CadPac.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_CadPac.setText("Cadastro de paciente");
        btn_CadPac.setFocusable(false);
        btn_CadPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadPacActionPerformed(evt);
            }
        });

        btn_CadMed.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_CadMed.setText("Cadastro de médico");
        btn_CadMed.setBorderPainted(false);
        btn_CadMed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_CadMed.setFocusPainted(false);
        btn_CadMed.setFocusable(false);
        btn_CadMed.setOpaque(false);
        btn_CadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadMedActionPerformed(evt);
            }
        });

        btn_CadCons.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_CadCons.setText("Cadastro de consultório");
        btn_CadCons.setFocusable(false);
        btn_CadCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadConsActionPerformed(evt);
            }
        });

        btn_CadLab.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_CadLab.setText("Cadastro de laboratório");
        btn_CadLab.setFocusable(false);
        btn_CadLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadLabActionPerformed(evt);
            }
        });

        btn_CadRec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_CadRec.setText("Cadastro de receita");
        btn_CadRec.setFocusable(false);
        btn_CadRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadRecActionPerformed(evt);
            }
        });

        btn_CadEx.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_CadEx.setText("Cadastro de exame");
        btn_CadEx.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Virtual Recipe");

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.setFocusCycleRoot(true);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Cadastro de farmácia");
        jButton2.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_CadCons)
                            .addComponent(btn_CadLab)
                            .addComponent(btn_CadPac)
                            .addComponent(btn_CadMed))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_CadEx)
                            .addComponent(btn_CadRec)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CadMed)
                    .addComponent(btn_CadEx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CadPac)
                    .addComponent(btn_CadRec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btn_CadLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_CadCons))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CadMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadMedActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CadastroMedicoTela medico = new CadastroMedicoTela();
        medico.setVisible(true);


        
    }//GEN-LAST:event_btn_CadMedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        MenuP menu = new MenuP();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_CadRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadRecActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        MedicoCadReceitaTela receita = new MedicoCadReceitaTela();
        receita.setVisible(true);
    }//GEN-LAST:event_btn_CadRecActionPerformed

    private void btn_CadPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadPacActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CadastroPacienteTela paciente = new CadastroPacienteTela();
        paciente.setVisible(true);
        
        
    }//GEN-LAST:event_btn_CadPacActionPerformed

    private void btn_CadConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadConsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CadastroConsultorioTela consultorio = new CadastroConsultorioTela();
        consultorio.setVisible(true);
        
    }//GEN-LAST:event_btn_CadConsActionPerformed

    private void btn_CadLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadLabActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CadLabTela lab = new CadLabTela();
        lab.setVisible(true);
        
        
    }//GEN-LAST:event_btn_CadLabActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CadCons;
    private javax.swing.JButton btn_CadEx;
    private javax.swing.JButton btn_CadLab;
    private javax.swing.JButton btn_CadMed;
    private javax.swing.JButton btn_CadPac;
    private javax.swing.JButton btn_CadRec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
