
package trianglelocalization.trianlgelocalization;

import javax.swing.*;

public class IntroducereTriunghi extends javax.swing.JFrame {

    LocalizareTriunghiNetBeans lt = new LocalizareTriunghiNetBeans();

    /**
     * Creates new form IntroducereTriunghi
     */
    public IntroducereTriunghi() {
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

        jLabel1 = new javax.swing.JLabel();
        ABC_OK = new javax.swing.JButton();
        A_x = new javax.swing.JTextField();
        B_x = new javax.swing.JTextField();
        C_x = new javax.swing.JTextField();
        A_Label = new javax.swing.JLabel();
        B_Label = new javax.swing.JLabel();
        C_Label = new javax.swing.JLabel();
        A_y = new javax.swing.JTextField();
        B_y = new javax.swing.JTextField();
        C_y = new javax.swing.JTextField();
        x_Label = new javax.swing.JLabel();
        y_Label = new javax.swing.JLabel();
        CloseApplication = new javax.swing.JButton();
        M = new javax.swing.JLabel();
        M_x = new javax.swing.JTextField();
        M_y = new javax.swing.JTextField();
        x_Label1 = new javax.swing.JLabel();
        y_Label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Introduceti coordonatele triunghiului A B C");

        ABC_OK.setText("OK");
        ABC_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABC_OKActionPerformed(evt);
            }
        });

        A_x.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A_x.setActionCommand("<Not Set>");
        A_x.setDoubleBuffered(true);
        A_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_xActionPerformed(evt);
            }
        });

        B_x.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_xActionPerformed(evt);
            }
        });

        C_x.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        A_Label.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        A_Label.setText("A");

        B_Label.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        B_Label.setText("B");

        C_Label.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        C_Label.setText("C");

        A_y.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B_y.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_yActionPerformed(evt);
            }
        });

        C_y.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        x_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        x_Label.setText("x");
        x_Label.setToolTipText("");
        x_Label.setAlignmentX(0.5F);

        y_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        y_Label.setText("y");
        y_Label.setAlignmentX(0.5F);

        CloseApplication.setText("Close");
        CloseApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseApplicationActionPerformed(evt);
            }
        });

        M.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        M.setText("M");

        M_x.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        M_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_xActionPerformed(evt);
            }
        });

        M_y.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        M_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_yActionPerformed(evt);
            }
        });

        x_Label1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        x_Label1.setText("x");
        x_Label1.setToolTipText("");
        x_Label1.setAlignmentX(0.5F);

        y_Label1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        y_Label1.setText("y");
        y_Label1.setAlignmentX(0.5F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CloseApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ABC_OK))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(A_Label)
                            .addComponent(B_Label)
                            .addComponent(C_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(x_Label))
                                    .addComponent(C_x, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(y_Label))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(C_y, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(A_x)
                                    .addComponent(B_x, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(A_y)
                                    .addComponent(B_y, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(M)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(x_Label1))
                                    .addComponent(M_x, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(y_Label1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(M_y, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_Label)
                        .addComponent(M))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x_Label1)
                            .addComponent(y_Label1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Label))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x_Label)
                    .addComponent(y_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ABC_OK)
                    .addComponent(CloseApplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void A_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_xActionPerformed
        
    }//GEN-LAST:event_A_xActionPerformed

    private void B_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_xActionPerformed

    private void B_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_yActionPerformed

    private void ABC_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABC_OKActionPerformed

        if(A_x.getText().isEmpty() || A_y.getText().isEmpty() || B_x.getText().isEmpty() || B_y.getText().isEmpty() || C_x.getText().isEmpty() || C_y.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Va rog sa completati toate campurile de text");
        }else{
            lt.A[0] = Double.parseDouble(A_x.getText());
            lt.A[1] = Double.parseDouble(A_y.getText());

            lt.B[0] = Double.parseDouble(B_x.getText());
            lt.B[1] = Double.parseDouble(B_y.getText());

            lt.C[0] = Double.parseDouble(C_x.getText());
            lt.C[1] = Double.parseDouble(C_y.getText());
            
            lt.M[0] = Double.parseDouble(M_x.getText());
            lt.M[1] = Double.parseDouble(M_y.getText());

            lt.Verifica();
        }
    }//GEN-LAST:event_ABC_OKActionPerformed

    private void CloseApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseApplicationActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CloseApplicationActionPerformed

    private void M_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M_xActionPerformed

    private void M_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M_yActionPerformed

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
            java.util.logging.Logger.getLogger(IntroducereTriunghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroducereTriunghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroducereTriunghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroducereTriunghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroducereTriunghi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABC_OK;
    private javax.swing.JLabel A_Label;
    public javax.swing.JTextField A_x;
    public javax.swing.JTextField A_y;
    private javax.swing.JLabel B_Label;
    public javax.swing.JTextField B_x;
    public javax.swing.JTextField B_y;
    private javax.swing.JLabel C_Label;
    public javax.swing.JTextField C_x;
    public javax.swing.JTextField C_y;
    private javax.swing.JButton CloseApplication;
    private javax.swing.JLabel M;
    public javax.swing.JTextField M_x;
    public javax.swing.JTextField M_y;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel x_Label;
    private javax.swing.JLabel x_Label1;
    private javax.swing.JLabel y_Label;
    private javax.swing.JLabel y_Label1;
    // End of variables declaration//GEN-END:variables
}