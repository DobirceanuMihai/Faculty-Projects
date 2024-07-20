package event;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class UserInterface extends javax.swing.JFrame {
    DefaultListModel<String> listModel = new DefaultListModel();
    DefaultListModel<String> listModel2 = new DefaultListModel();

    public UserInterface() {
        initComponents();
    }
    
    public UserInterface(String username, int userid) throws IOException, ParseException {
        initComponents();
        
        RegisterToEventButton.setEnabled(false);
        UnregisterToEventButton.setEnabled(false);
        BuyTicketsButton.setEnabled(false);
        
        UsernameLabel.setText(username);
        PreferencesEventsList.setModel(listModel);
        RegisteredEventsList.setModel(listModel2);
            
        if(User.checkCategory(userid, "Concert")){
            Event.checkEvent("Concert", listModel);
        }
        if(User.checkCategory(userid, "Art")){
            Event.checkEvent("Art", listModel);
        }
        if(User.checkCategory(userid, "Movie")){
            Event.checkEvent("Movie", listModel);
        }
        if(User.checkCategory(userid, "Festival")){
            Event.checkEvent("Festival", listModel);
        }
        if(User.checkCategory(userid, "Other")){
            Event.checkEvent("Other", listModel);
        }
        
        File eventfile = new File("events.txt");
        Scanner myReader = new Scanner(eventfile);
        
        List<String> regEvents = User.getEvents(userid);

        for(int i = 0; i < regEvents.size(); ++i) {
            Event.checkEventReg((String)regEvents.get(i), this.listModel2);
        }
        
        Announce.setText(Event.announceEvent());

}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        PreferencesEventsList = new javax.swing.JList<>();
        PreferencesButton = new javax.swing.JLabel();
        LogOutUseerButton = new javax.swing.JButton();
        ChangePreferencesButton = new javax.swing.JButton();
        MenuLabel = new javax.swing.JLabel();
        ParticipatingLabel = new javax.swing.JLabel();
        RegisterToEventButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RegisteredEventsList = new javax.swing.JList<>();
        BuyTicketsButton = new javax.swing.JButton();
        WelcomeLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        ChangePassword = new javax.swing.JButton();
        UnregisterToEventButton = new javax.swing.JButton();
        Announce = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PreferencesEventsList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PreferencesEventsList.setForeground(new java.awt.Color(0, 102, 102));
        PreferencesEventsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        PreferencesEventsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PreferencesEventsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PreferencesEventsList);

        PreferencesButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PreferencesButton.setForeground(new java.awt.Color(0, 102, 102));
        PreferencesButton.setText("Events that fit your preferences:");

        LogOutUseerButton.setBackground(new java.awt.Color(0, 153, 153));
        LogOutUseerButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LogOutUseerButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutUseerButton.setText("Log out");
        LogOutUseerButton.setToolTipText("");
        LogOutUseerButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogOutUseerButton.setBorderPainted(false);
        LogOutUseerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutUseerButtonActionPerformed(evt);
            }
        });

        ChangePreferencesButton.setBackground(new java.awt.Color(0, 153, 153));
        ChangePreferencesButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ChangePreferencesButton.setForeground(new java.awt.Color(255, 255, 255));
        ChangePreferencesButton.setText("Change preferences");
        ChangePreferencesButton.setToolTipText("");
        ChangePreferencesButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChangePreferencesButton.setBorderPainted(false);
        ChangePreferencesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePreferencesButtonActionPerformed(evt);
            }
        });

        MenuLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        MenuLabel.setForeground(new java.awt.Color(0, 102, 102));
        MenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuLabel.setText("Menu");
        MenuLabel.setFocusable(false);

        ParticipatingLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ParticipatingLabel.setForeground(new java.awt.Color(0, 102, 102));
        ParticipatingLabel.setText("Events you are interested in:");

        RegisterToEventButton.setBackground(new java.awt.Color(0, 153, 153));
        RegisterToEventButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RegisterToEventButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterToEventButton.setText("Register to an event");
        RegisterToEventButton.setToolTipText("");
        RegisterToEventButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegisterToEventButton.setBorderPainted(false);
        RegisterToEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterToEventButtonActionPerformed(evt);
            }
        });

        RegisteredEventsList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RegisteredEventsList.setForeground(new java.awt.Color(0, 102, 102));
        RegisteredEventsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        RegisteredEventsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisteredEventsListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(RegisteredEventsList);

        BuyTicketsButton.setBackground(new java.awt.Color(0, 153, 153));
        BuyTicketsButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BuyTicketsButton.setForeground(new java.awt.Color(255, 255, 255));
        BuyTicketsButton.setText("Buy tickets");
        BuyTicketsButton.setToolTipText("");
        BuyTicketsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BuyTicketsButton.setBorderPainted(false);
        BuyTicketsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyTicketsButtonActionPerformed(evt);
            }
        });

        WelcomeLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(0, 102, 102));
        WelcomeLabel.setText("Welcome");

        UsernameLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(0, 153, 153));
        UsernameLabel.setText("User");

        ChangePassword.setBackground(new java.awt.Color(0, 153, 153));
        ChangePassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        ChangePassword.setText("Change password");
        ChangePassword.setToolTipText("");
        ChangePassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChangePassword.setBorderPainted(false);
        ChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordActionPerformed(evt);
            }
        });

        UnregisterToEventButton.setBackground(new java.awt.Color(0, 153, 153));
        UnregisterToEventButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UnregisterToEventButton.setForeground(new java.awt.Color(255, 255, 255));
        UnregisterToEventButton.setText("Unregister to an event");
        UnregisterToEventButton.setToolTipText("");
        UnregisterToEventButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UnregisterToEventButton.setBorderPainted(false);
        UnregisterToEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnregisterToEventButtonActionPerformed(evt);
            }
        });

        Announce.setEditable(false);
        Announce.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Announce.setForeground(new java.awt.Color(102, 102, 0));
        Announce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnounceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LogOutUseerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ChangePreferencesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RegisterToEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UnregisterToEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BuyTicketsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PreferencesButton)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ParticipatingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(WelcomeLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(UsernameLabel))
                                    .addComponent(Announce, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(MenuLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuLabel)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Announce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreferencesButton)
                    .addComponent(ParticipatingLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LogOutUseerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ChangePreferencesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RegisterToEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UnregisterToEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuyTicketsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutUseerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutUseerButtonActionPerformed
        dispose();
        new LogInWindow().setVisible(true);
    }//GEN-LAST:event_LogOutUseerButtonActionPerformed

    private void ChangePreferencesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePreferencesButtonActionPerformed
        dispose();
        new UserPreferencesInterface().setVisible(true);
    }//GEN-LAST:event_ChangePreferencesButtonActionPerformed

    private void RegisterToEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterToEventButtonActionPerformed
        
        try {
            File eventfile = new File("events.txt");
            Scanner myReader = new Scanner(eventfile);
            
            List<String> regEvents = User.getEvents(Authentification.userid);
            boolean check = false;
            for(int i = 0; i < regEvents.size(); ++i) {
                if(Event.compareEvent((String)regEvents.get(i), PreferencesEventsList.getSelectedValue())){
                    check = false;
                    break;
                }else{
                    check = true;

                }
            }
            
            if(check){
                new RegisterToEventUserInterface(PreferencesEventsList.getSelectedValue()).setVisible(true);            
                dispose();                
            }else{
                JOptionPane.showMessageDialog(null, "You are already registered to this event.");
            }
        } catch (IOException | ParseException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RegisterToEventButtonActionPerformed

    private void BuyTicketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyTicketsButtonActionPerformed
        if(!PreferencesEventsList.isSelectionEmpty())
            new BuyTicketsUserInterface(PreferencesEventsList.getSelectedValue()).setVisible(true);
        if(!RegisteredEventsList.isSelectionEmpty())
            new BuyTicketsUserInterface(RegisteredEventsList.getSelectedValue()).setVisible(true);
    }//GEN-LAST:event_BuyTicketsButtonActionPerformed

    private void PreferencesEventsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreferencesEventsListMouseClicked
       if(PreferencesEventsList.getSelectedIndex() > -1){
            RegisteredEventsList.clearSelection();
            RegisterToEventButton.setEnabled(true);
            BuyTicketsButton.setEnabled(true);
            UnregisterToEventButton.setEnabled(false);
       }
    }//GEN-LAST:event_PreferencesEventsListMouseClicked

    private void ChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordActionPerformed
        dispose();
        new ChangePasswordWindow(UsernameLabel.getText()).setVisible(true);
    }//GEN-LAST:event_ChangePasswordActionPerformed

    private void UnregisterToEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnregisterToEventButtonActionPerformed
        dispose();
        new UnregisterToEventUserInterface(RegisteredEventsList.getSelectedValue()).setVisible(true);
    }//GEN-LAST:event_UnregisterToEventButtonActionPerformed

    private void RegisteredEventsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisteredEventsListMouseClicked
        if(RegisteredEventsList.getSelectedIndex() > -1){
            PreferencesEventsList.clearSelection();
            UnregisterToEventButton.setEnabled(true);
            BuyTicketsButton.setEnabled(true);
            RegisterToEventButton.setEnabled(false);
       }
    }//GEN-LAST:event_RegisteredEventsListMouseClicked

    private void AnnounceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnounceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnnounceActionPerformed

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Announce;
    private javax.swing.JButton BuyTicketsButton;
    private javax.swing.JButton ChangePassword;
    private javax.swing.JButton ChangePreferencesButton;
    private javax.swing.JButton LogOutUseerButton;
    private javax.swing.JLabel MenuLabel;
    private javax.swing.JLabel ParticipatingLabel;
    private javax.swing.JLabel PreferencesButton;
    private javax.swing.JList<String> PreferencesEventsList;
    private javax.swing.JButton RegisterToEventButton;
    public javax.swing.JList<String> RegisteredEventsList;
    private javax.swing.JButton UnregisterToEventButton;
    public static javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
