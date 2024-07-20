package event;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dobir
 */
public class RegisterToEventUserInterface extends javax.swing.JFrame {

    /**
     * Creates new form RegisterToEventUserInterface
     */
    public RegisterToEventUserInterface() {
        initComponents();
    }
    
    public RegisterToEventUserInterface(String value) throws IOException {
        initComponents();
        
        
            
        try (BufferedReader br = new BufferedReader(new FileReader("events.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String eventName = value.substring(0, value.indexOf(" - "));
                String[] parts = line.split(" / ");
                if (parts[1].trim().equals(eventName.trim())) {
                    SelectedEventForm.setText(parts[1]);
                    CountryField.setText(parts[5]);
                    CityField.setText(parts[6]);
                    AddressField.setText(parts[7]);
                    DateOfEventField.setText(parts[3]);
                    TicketsAvailableField.setText(parts[8]);
                    PriceOfTicketsField.setText(parts[9]);
                }
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterToAnEventLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        SelectedEventLabel = new javax.swing.JLabel();
        SelectedEventForm = new javax.swing.JTextField();
        DateOfTheEventLabel = new javax.swing.JLabel();
        DateOfEventField = new javax.swing.JTextField();
        DateOfTheEventLabel1 = new javax.swing.JLabel();
        TicketsAvailableField = new javax.swing.JTextField();
        PriceOfTicketsLabel = new javax.swing.JLabel();
        PriceOfTicketsField = new javax.swing.JTextField();
        CountryLabel = new javax.swing.JLabel();
        CountryField = new javax.swing.JTextField();
        CityField = new javax.swing.JTextField();
        CityLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        FinishButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        RegisterToAnEventLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        RegisterToAnEventLabel.setForeground(new java.awt.Color(0, 102, 102));
        RegisterToAnEventLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterToAnEventLabel.setText("Register to an event");
        RegisterToAnEventLabel.setFocusable(false);

        SelectedEventLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SelectedEventLabel.setForeground(new java.awt.Color(0, 102, 102));
        SelectedEventLabel.setText("Selected event:");

        SelectedEventForm.setEditable(false);
        SelectedEventForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectedEventFormActionPerformed(evt);
            }
        });

        DateOfTheEventLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DateOfTheEventLabel.setForeground(new java.awt.Color(0, 102, 102));
        DateOfTheEventLabel.setText("Date of the event:");

        DateOfEventField.setEditable(false);

        DateOfTheEventLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DateOfTheEventLabel1.setForeground(new java.awt.Color(0, 102, 102));
        DateOfTheEventLabel1.setText("Tickets available:");

        TicketsAvailableField.setEditable(false);

        PriceOfTicketsLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PriceOfTicketsLabel.setForeground(new java.awt.Color(0, 102, 102));
        PriceOfTicketsLabel.setText("Price of the tickets:");

        PriceOfTicketsField.setEditable(false);
        PriceOfTicketsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceOfTicketsFieldActionPerformed(evt);
            }
        });

        CountryLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CountryLabel.setForeground(new java.awt.Color(0, 102, 102));
        CountryLabel.setText("Country:");

        CountryField.setEditable(false);
        CountryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryFieldActionPerformed(evt);
            }
        });

        CityField.setEditable(false);
        CityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityFieldActionPerformed(evt);
            }
        });

        CityLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CityLabel.setForeground(new java.awt.Color(0, 102, 102));
        CityLabel.setText("City:");

        AddressLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AddressLabel.setForeground(new java.awt.Color(0, 102, 102));
        AddressLabel.setText("Address:");

        AddressField.setEditable(false);
        AddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressFieldActionPerformed(evt);
            }
        });

        FinishButton.setBackground(new java.awt.Color(0, 153, 153));
        FinishButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        FinishButton.setForeground(new java.awt.Color(255, 255, 255));
        FinishButton.setText("Finish");
        FinishButton.setToolTipText("");
        FinishButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FinishButton.setBorderPainted(false);
        FinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(CountryLabel)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(CountryField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(24, 24, 24)
                                                    .addComponent(CityLabel)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(SelectedEventLabel)
                                                    .addGap(34, 34, 34)
                                                    .addComponent(SelectedEventForm, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(AddressLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(DateOfTheEventLabel)
                                                .addComponent(DateOfTheEventLabel1))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TicketsAvailableField)
                                                .addComponent(DateOfEventField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PriceOfTicketsLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(PriceOfTicketsField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(FinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterToAnEventLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2))))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RegisterToAnEventLabel)
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectedEventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectedEventForm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CountryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CountryField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateOfTheEventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateOfEventField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateOfTheEventLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TicketsAvailableField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PriceOfTicketsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceOfTicketsField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(FinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SelectedEventFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectedEventFormActionPerformed
        
    }//GEN-LAST:event_SelectedEventFormActionPerformed

    private void CountryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountryFieldActionPerformed

    private void CityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityFieldActionPerformed

    private void AddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressFieldActionPerformed

    private void FinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            String eventid = "0";
            
            BufferedReader br = new BufferedReader(new FileReader("events.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" / ");
                if (parts[1].trim().equals(SelectedEventForm.getText())) {
                    eventid = parts[0];
                }
            }
            br.close();
            User.addEvent(Authentification.userid, eventid);
            dispose();
            new UserInterface(UserInterface.UsernameLabel.getText(), Authentification.userid).setVisible(true);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(RegisterToEventUserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FinishButtonActionPerformed

    private void PriceOfTicketsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceOfTicketsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceOfTicketsFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterToEventUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterToEventUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterToEventUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterToEventUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterToEventUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField CityField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CountryField;
    private javax.swing.JLabel CountryLabel;
    private javax.swing.JTextField DateOfEventField;
    private javax.swing.JLabel DateOfTheEventLabel;
    private javax.swing.JLabel DateOfTheEventLabel1;
    private javax.swing.JButton FinishButton;
    private javax.swing.JTextField PriceOfTicketsField;
    private javax.swing.JLabel PriceOfTicketsLabel;
    private javax.swing.JLabel RegisterToAnEventLabel;
    private javax.swing.JTextField SelectedEventForm;
    private javax.swing.JLabel SelectedEventLabel;
    private javax.swing.JTextField TicketsAvailableField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
