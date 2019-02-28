

package project;
import com.google.gson.JsonArray;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deoiveij
 */
public class loginFrame extends javax.swing.JFrame {

    /**
     * Creates new form loginFrame
     */
    
    public void centerFrame() {
        //call to center Frames to center of actual Screen
          
        Dimension windowSize = getSize();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Point centerPoint = ge.getCenterPoint();

            int dx = centerPoint.x - windowSize.width / 2;
            int dy = centerPoint.y - windowSize.height / 2;    
            setLocation(dx, dy);
    
    };
    Extras_Notifier alert = new Extras_Notifier();
    public loginFrame() {
        
        initComponents();
        centerFrame();
        register_panel.setVisible(false);
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
        label_info = new javax.swing.JLabel();
        register_username_text = new javax.swing.JTextField();
        register_email_text = new javax.swing.JTextField();
        register_password_text = new javax.swing.JTextField();
        register_address_text = new javax.swing.JTextField();
        label_username = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        label_mail = new javax.swing.JLabel();
        label_address = new javax.swing.JLabel();
        register_password_text1 = new javax.swing.JTextField();
        back_btn = new javax.swing.JLabel();
        register_btn_action = new javax.swing.JButton();
        login_Panel = new javax.swing.JPanel();
        username_text_login = new javax.swing.JTextField();
        password_text_login = new javax.swing.JTextField();
        btn_action = new javax.swing.JButton();
        register_label = new javax.swing.JLabel();
        exit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(472, 400));
        setMinimumSize(new java.awt.Dimension(472, 400));
        setUndecorated(true);
        getContentPane().setLayout(null);

        register_panel.setMaximumSize(new java.awt.Dimension(400, 300));
        register_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_title_register_panel.setText("Register Area");
        register_panel.add(label_title_register_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 163, 36));

        label_info.setText("*After the creation of your account need to be verify by Advisor to be activated.");
        register_panel.add(label_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 395, -1, -1));
        register_panel.add(register_username_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 74, 167, -1));
        register_panel.add(register_email_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 166, 167, -1));
        register_panel.add(register_password_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 120, 167, -1));
        register_panel.add(register_address_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 212, 167, -1));

        label_username.setText("Username");
        register_panel.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 54, -1, -1));

        label_password.setText("Password");
        register_panel.add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 99, -1, -1));

        label_mail.setText("Email");
        register_panel.add(label_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 145, -1, -1));

        label_address.setText("Address");
        register_panel.add(label_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 191, -1, -1));
        register_panel.add(register_password_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 120, 167, -1));

        back_btn.setText("back");
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        register_panel.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        register_btn_action.setText("Action");
        register_panel.add(register_btn_action, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 150, -1));

        getContentPane().add(register_panel);
        register_panel.setBounds(40, 40, 420, 440);

        login_Panel.setMaximumSize(new java.awt.Dimension(400, 300));

        btn_action.setText("ACTION");
        btn_action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actionActionPerformed(evt);
            }
        });

        register_label.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        register_label.setText("New Client?");
        register_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout login_PanelLayout = new javax.swing.GroupLayout(login_Panel);
        login_Panel.setLayout(login_PanelLayout);
        login_PanelLayout.setHorizontalGroup(
            login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_PanelLayout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(register_label, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(login_PanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_action)
                    .addComponent(password_text_login, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_text_login, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_PanelLayout.setVerticalGroup(
            login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_PanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(username_text_login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(password_text_login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_action)
                .addGap(76, 76, 76)
                .addComponent(register_label)
                .addGap(9, 9, 9))
        );

        getContentPane().add(login_Panel);
        login_Panel.setBounds(0, 20, 470, 320);

        exit_btn.setBorderPainted(false);
        exit_btn.setFocusable(false);
        exit_btn.setLabel("Close");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(exit_btn);
        exit_btn.setBounds(400, 0, 61, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actionActionPerformed
        System.out.println(username_text_login.getText().toString());                                          
        System.out.println(password_text_login.getText().toString());
        //logic error
        if(username_text_login.getText().toString()=="" || password_text_login.getText().toString()==""){
            alert.alertINFO(username_text_login.getText());
        }else{
            alert.alertWARR("Empty fields");
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

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        
        
        
        JsonArray dataJson = new JsonArray();
        dataJson=HomeController.getMembersData();
        //dataJson = dd.toString()
        System.out.println(dataJson.size());
        for (int x = 0; x < dataJson.size(); x++) {
            
            System.out.println(dataJson.get(x));
        
        }
        
        
        
        
        
        
        
        
        
        
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
                //new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_btn;
    private javax.swing.JButton btn_action;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel label_address;
    private javax.swing.JLabel label_info;
    private javax.swing.JLabel label_mail;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_title_register_panel;
    private javax.swing.JLabel label_username;
    private javax.swing.JPanel login_Panel;
    private javax.swing.JTextField password_text_login;
    private javax.swing.JTextField register_address_text;
    private javax.swing.JButton register_btn_action;
    private javax.swing.JTextField register_email_text;
    private javax.swing.JLabel register_label;
    private javax.swing.JPanel register_panel;
    private javax.swing.JTextField register_password_text;
    private javax.swing.JTextField register_password_text1;
    private javax.swing.JTextField register_username_text;
    private javax.swing.JTextField username_text_login;
    // End of variables declaration//GEN-END:variables
}