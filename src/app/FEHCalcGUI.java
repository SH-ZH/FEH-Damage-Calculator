/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Joseph
 */
public class FEHCalcGUI extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public FEHCalcGUI() {
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

        adeptRadioGroup = new javax.swing.ButtonGroup();
        adeptRadio1 = new javax.swing.JRadioButton();
        attackLabel = new javax.swing.JLabel();
        adeptRadio2 = new javax.swing.JRadioButton();
        defenseLabel = new javax.swing.JLabel();
        adeptRadio3 = new javax.swing.JRadioButton();
        attackInput = new javax.swing.JTextField();
        adeptRadioNone = new javax.swing.JRadioButton();
        defenseInput = new javax.swing.JTextField();
        calcButton = new javax.swing.JButton();
        adeptLabel = new javax.swing.JLabel();
        damageOutput = new javax.swing.JTextField();
        damageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adeptRadioGroup.add(adeptRadio1);
        adeptRadio1.setText("相性激化1");

        attackLabel.setLabelFor(attackInput);
        attackLabel.setText("Attack");

        adeptRadioGroup.add(adeptRadio2);
        adeptRadio2.setText("相性激化2");

        defenseLabel.setLabelFor(defenseInput);
        defenseLabel.setText("Defense");

        adeptRadioGroup.add(adeptRadio3);
        adeptRadio3.setText("相性激化3");

        attackInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackInputActionPerformed(evt);
            }
        });

        adeptRadioGroup.add(adeptRadioNone);
        adeptRadioNone.setSelected(true);
        adeptRadioNone.setText("None");

        calcButton.setText("Calculate");
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        adeptLabel.setText("相性激化");

        damageOutput.setEnabled(false);

        damageLabel.setText("Damage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(damageOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(damageLabel))
                            .addComponent(calcButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adeptRadio1)
                                .addGap(18, 18, 18)
                                .addComponent(adeptRadio2)
                                .addGap(18, 18, 18)
                                .addComponent(adeptRadio3)
                                .addGap(18, 18, 18)
                                .addComponent(adeptRadioNone)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adeptLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(defenseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attackInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(defenseLabel)
                                    .addComponent(attackLabel))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {damageOutput, defenseInput});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attackLabel)
                    .addComponent(attackInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defenseLabel)
                    .addComponent(defenseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(adeptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adeptRadio1)
                    .addComponent(adeptRadio2)
                    .addComponent(adeptRadio3)
                    .addComponent(adeptRadioNone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(calcButton)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(damageOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(damageLabel))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        System.out.println("Calculate Started");
    }//GEN-LAST:event_calcButtonActionPerformed

    private void attackInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attackInputActionPerformed

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
            java.util.logging.Logger.getLogger(FEHCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEHCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEHCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEHCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEHCalcGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adeptLabel;
    private javax.swing.JRadioButton adeptRadio1;
    private javax.swing.JRadioButton adeptRadio2;
    private javax.swing.JRadioButton adeptRadio3;
    private javax.swing.ButtonGroup adeptRadioGroup;
    private javax.swing.JRadioButton adeptRadioNone;
    private javax.swing.JTextField attackInput;
    private javax.swing.JLabel attackLabel;
    private javax.swing.JButton calcButton;
    private javax.swing.JLabel damageLabel;
    private javax.swing.JTextField damageOutput;
    private javax.swing.JTextField defenseInput;
    private javax.swing.JLabel defenseLabel;
    // End of variables declaration//GEN-END:variables
}
