

package project;
import java.util.ArrayList;
import java.util.List;




//another way to fetch Class methods 



/**
 *
 * @author deoiveij
 */
public class loginFrame extends javax.swing.JFrame {

    /**
     * Creates new form loginFrame
     */
    
    Extras_Notifier alert = new Extras_Notifier();
    EncryptClass encrypt= new EncryptClass();
    
    
    protected DateTimer timerThread;
    
    
    
    
    
    
    
    public loginFrame() {
        
        
        initComponents();
        
        
        
        
        login_Panel.setOpaque(true);
        register_panel.setOpaque(true);
        register_panel.setVisible(false);
        register_password_text.setEchoChar('+');
        register_password_text1.setEchoChar('+');
        
        label_info1.setText("<html>*After the creation of your account will to be verified by a  Club Advisor only then will be activated.</html>");
        
        gender_Box.addItem("Male");
        gender_Box.addItem("Female");
        
        
        timerThread = new DateTimer(label_Date, label_Time);
        timerThread.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register_panel = new javax.swing.JPanel();
        label_title_register_panel = new javax.swing.JLabel();
        register_username_text = new javax.swing.JTextField();
        register_email_text = new javax.swing.JTextField();
        label_username = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        label_mail = new javax.swing.JLabel();
        label_gender = new javax.swing.JLabel();
        back_btn = new javax.swing.JLabel();
        register_btn_action = new javax.swing.JButton();
        register_password_text1 = new javax.swing.JPasswordField();
        register_password_text = new javax.swing.JPasswordField();
        register_address_text = new javax.swing.JTextField();
        label_address = new javax.swing.JLabel();
        gender_Box = new javax.swing.JComboBox<>();
        label_password1 = new javax.swing.JLabel();
        label_info1 = new javax.swing.JLabel();
        login_Panel = new javax.swing.JPanel();
        username_text_login = new javax.swing.JTextField();
        btn_action = new javax.swing.JButton();
        register_label = new javax.swing.JLabel();
        password_text_login = new javax.swing.JPasswordField();
        labelUser_Login = new javax.swing.JLabel();
        labelPW_Login = new javax.swing.JLabel();
        label_Time = new javax.swing.JLabel();
        label_Date = new javax.swing.JLabel();
        hours_ = new javax.swing.JLabel();
        hours_1 = new javax.swing.JLabel();
        exit_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        setMaximumSize(new java.awt.Dimension(492, 431));
        setMinimumSize(new java.awt.Dimension(492, 431));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(492, 431));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register_panel.setMaximumSize(new java.awt.Dimension(400, 300));
        register_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_title_register_panel.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_title_register_panel.setText("Registration Area");
        register_panel.add(label_title_register_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 163, 36));
        register_panel.add(register_username_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 74, 167, 30));
        register_panel.add(register_email_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 167, 30));

        label_username.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_username.setText("Username");
        register_panel.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 54, -1, -1));

        label_password.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_password.setText("Password Again");
        register_panel.add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        label_mail.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_mail.setText("Email");
        register_panel.add(label_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        label_gender.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_gender.setText("Gender");
        register_panel.add(label_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 60, 30));

        back_btn.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        back_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back_btn.setText("Back");
        back_btn.setToolTipText("back to login");
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        register_panel.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 60, 30));

        register_btn_action.setText("Action");
        register_btn_action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btn_actionActionPerformed(evt);
            }
        });
        register_panel.add(register_btn_action, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 150, 50));
        register_panel.add(register_password_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 170, 30));
        register_panel.add(register_password_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 30));
        register_panel.add(register_address_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 167, 30));

        label_address.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_address.setText("Address");
        register_panel.add(label_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        register_panel.add(gender_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 100, 30));

        label_password1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_password1.setText("Password");
        register_panel.add(label_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        label_info1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_info1.setForeground(new java.awt.Color(255, 51, 0));
        label_info1.setToolTipText("");
        register_panel.add(label_info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 450, 30));

        getContentPane().add(register_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 450, 360));

        login_Panel.setMaximumSize(new java.awt.Dimension(250, 300));
        login_Panel.setMinimumSize(new java.awt.Dimension(250, 300));
        login_Panel.setPreferredSize(new java.awt.Dimension(250, 300));

        btn_action.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        btn_action.setText("ACTION");
        btn_action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actionActionPerformed(evt);
            }
        });

        register_label.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        register_label.setText("New Client?");
        register_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_labelMouseClicked(evt);
            }
        });

        labelUser_Login.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        labelUser_Login.setText("Username");

        labelPW_Login.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        labelPW_Login.setText("Password");

        javax.swing.GroupLayout login_PanelLayout = new javax.swing.GroupLayout(login_Panel);
        login_Panel.setLayout(login_PanelLayout);
        login_PanelLayout.setHorizontalGroup(
            login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_PanelLayout.createSequentialGroup()
                .addGroup(login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_PanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_action, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUser_Login)
                            .addComponent(username_text_login, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPW_Login)
                            .addComponent(password_text_login, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(login_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(register_label, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        login_PanelLayout.setVerticalGroup(
            login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelUser_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_text_login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPW_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_text_login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_action)
                .addGap(42, 42, 42)
                .addComponent(register_label)
                .addGap(66, 66, 66))
        );

        getContentPane().add(login_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 460, 250));

        label_Time.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_Time.setText("< h/m/s>");
        getContentPane().add(label_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 120, -1));

        label_Date.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        label_Date.setText("<yy/mm/dd>");
        getContentPane().add(label_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 120, 30));

        hours_.setText(" Date  :");
        getContentPane().add(hours_, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 40, 30));

        hours_1.setText("Hours : ");
        getContentPane().add(hours_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 415, -1, 20));

        exit_btn.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        exit_btn.setText("Close");
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });
        getContentPane().add(exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 60, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actionActionPerformed
       List<String> dataUSPW = new ArrayList<String>();
       
       
        if(username_text_login.getText().equals("") || password_text_login .getText().equals("")){
            alert.alertERROR("Empty");
            //
            
        }else{
            dataUSPW.add(username_text_login.getText());
            dataUSPW.add(password_text_login.getText());
            dataUSPW.set(1,encrypt.setPassword2Hash(dataUSPW.get(1)));
            alert.checkLogin(dataUSPW);
            
            
        };
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actionActionPerformed

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        register_panel.setVisible(false);
        login_Panel.setVisible(true);
    }//GEN-LAST:event_back_btnMouseClicked

    private void register_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_labelMouseClicked
        login_Panel.setVisible(false);
        register_panel.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_register_labelMouseClicked

    
/**
 *
 * Get data from textbox objects,
 * check if fields are empty
 * check if fields password are equal and more than 8 characters
 * check if email have email parameters
 * set password field with encryption
 * 
 * save it inside array and send back to controller(HomeController->Database),
 * 
 * 
 */    
    private void register_btn_actionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btn_actionActionPerformed

        
        List<String> data = new ArrayList<String>();
        
        System.out.println(label_Date.getText());
        System.out.println(label_Time.getText());
        if(register_username_text.getText().equals("")||register_password_text.getText().equals("")||register_password_text1.getText().equals("")||register_address_text.getText().equals("")||register_email_text.getText().equals("")||gender_Box.getSelectedItem().toString()==""){
        
        alert.alertERROR("Empty Field");
        
        }else{
        
            if(register_password_text.getText().equals(register_password_text1.getText())&& register_password_text.getDocument().getLength()>=8){
                if(alert.checkUsername(register_username_text.getText())==1){
                    
                    alert.alertERROR("Username "+register_username_text.getText()+" Already Exist");
                    
                }else{
                    if(register_email_text.getText().toString().indexOf(' ')>=0 ||register_email_text.getText().toString().indexOf('@')<0 || register_email_text.getText().toString().indexOf('.')<0 ){
                       
                        alert.alertERROR("Invalid Email");  
                    }else{
                        data.add(register_username_text.getText());//0
                        data.add(register_password_text.getText());//1
                        data.add(register_email_text.getText());//2
                        data.add(register_address_text.getText());//3
                        data.set(1,encrypt.setPassword2Hash(register_password_text.getText()));
                        
                        data.add(label_Date.getText().replaceAll("\\s+",""));//4
                        data.add(String.valueOf(gender_Box.getSelectedItem()));
                        //data.add(label_Time.getText());
                        
                        if(alert.registerMember(data)==1){
                            alert.alertINFO("Account Created Succesfully");
                        }else{
                            alert.alertERROR("Account Not Created");
                        } 
                      
                    }
                }
            }else{

                alert.alertERROR("Password : field not equal or not at least 8 digits");
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_register_btn_actionActionPerformed

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        timerThread.exitProcedure();
        // TODO add your handling code here:
    }//GEN-LAST:event_exit_btnMouseClicked

    /**
     * MAIN
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        
        
        
        /* Set the Nimbus look and feel 
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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_btn;
    private javax.swing.JButton btn_action;
    private javax.swing.JLabel exit_btn;
    private javax.swing.JComboBox<String> gender_Box;
    private javax.swing.JLabel hours_;
    private javax.swing.JLabel hours_1;
    private javax.swing.JLabel labelPW_Login;
    private javax.swing.JLabel labelUser_Login;
    private javax.swing.JLabel label_Date;
    private javax.swing.JLabel label_Time;
    private javax.swing.JLabel label_address;
    private javax.swing.JLabel label_gender;
    private javax.swing.JLabel label_info1;
    private javax.swing.JLabel label_mail;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_password1;
    private javax.swing.JLabel label_title_register_panel;
    private javax.swing.JLabel label_username;
    private javax.swing.JPanel login_Panel;
    private javax.swing.JPasswordField password_text_login;
    private javax.swing.JTextField register_address_text;
    private javax.swing.JButton register_btn_action;
    private javax.swing.JTextField register_email_text;
    private javax.swing.JLabel register_label;
    private javax.swing.JPanel register_panel;
    private javax.swing.JPasswordField register_password_text;
    private javax.swing.JPasswordField register_password_text1;
    private javax.swing.JTextField register_username_text;
    private javax.swing.JTextField username_text_login;
    // End of variables declaration//GEN-END:variables








}
