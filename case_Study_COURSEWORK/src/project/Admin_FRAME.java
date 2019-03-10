/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;

import org.json.JSONArray;
import org.json.JSONObject;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import net.miginfocom.swing.MigLayout;

import javax.swing.plaf.metal.MetalLookAndFeel;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/**
 *
 * @author foxst
 */
public class Admin_FRAME extends javax.swing.JFrame {
    public static HomeController controller = new HomeController();
    public static Extras_Notifier alert = new Extras_Notifier();
    static GraphicsConfiguration gc;
    /**
     * Creates new form Admin_Page
     */
    private JSONArray dataJson = new JSONArray();
    private int counter = 0;
    
    
    public Admin_FRAME() {
        initComponents();
        setTitle("Welcome m");
        //label_username_left.setText(controller.varUser);
        dataJson=controller.getREMembersData();
        badge_count_request.setText(String.valueOf(dataJson.length()));
        
        
  
        
        
        
    }

    
    public void displayUser()
    {
        
        //label_username_left.setText(controller.varUser);
        label_username_left.setText("m");
        
    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left_panel = new javax.swing.JPanel();
        btn_membersRequest = new javax.swing.JButton();
        label_username_left = new javax.swing.JLabel();
        upLabel_user_left = new javax.swing.JLabel();
        badge_count_request = new javax.swing.JLabel();
        right_panel_index = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1250, 700));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setPreferredSize(new java.awt.Dimension(1250, 700));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        left_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Settings", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("HelvLight", 2, 11))); // NOI18N
        left_panel.setMaximumSize(new java.awt.Dimension(300, 600));
        left_panel.setMinimumSize(new java.awt.Dimension(300, 600));
        left_panel.setPreferredSize(new java.awt.Dimension(300, 600));

        btn_membersRequest.setText("Members Request");
        btn_membersRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_membersRequestActionPerformed(evt);
            }
        });

        label_username_left.setText("<Advisor Username>");

        upLabel_user_left.setText("Welcome");

        badge_count_request.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout left_panelLayout = new javax.swing.GroupLayout(left_panel);
        left_panel.setLayout(left_panelLayout);
        left_panelLayout.setHorizontalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(left_panelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(label_username_left))
                    .addGroup(left_panelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(upLabel_user_left)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, left_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_membersRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(badge_count_request, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        left_panelLayout.setVerticalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(upLabel_user_left)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_username_left)
                .addGap(34, 34, 34)
                .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(badge_count_request, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_membersRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        right_panel_index.setBackground(left_panel.getBackground());
        right_panel_index.setAutoscrolls(true);
        right_panel_index.setMaximumSize(new java.awt.Dimension(925, 600));
        right_panel_index.setMinimumSize(new java.awt.Dimension(925, 600));
        right_panel_index.setPreferredSize(new java.awt.Dimension(925, 600));
        right_panel_index.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(left_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(right_panel_index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right_panel_index, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(left_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_membersRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_membersRequestActionPerformed
    initRequestPanel();
        


        // TODO add your handling code here:
    }//GEN-LAST:event_btn_membersRequestActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

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
            java.util.logging.Logger.getLogger(Admin_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_FRAME().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel badge_count_request;
    private javax.swing.JButton btn_membersRequest;
    public javax.swing.JLabel label_username_left;
    private javax.swing.JPanel left_panel;
    private javax.swing.JPanel right_panel_index;
    private javax.swing.JLabel upLabel_user_left;
    // End of variables declaration//GEN-END:variables

    private void initRequestPanel() {
        counter=0;
        right_panel_index.removeAll(); 
        MigLayout layout = new MigLayout("insets 2 2 2 2, fillx"); 
        right_panel_index.setLayout(layout);
        
        
        for(int x=0;x<dataJson.length();x++){
            JSONArray  Ass = new JSONArray ();
            Ass.put(dataJson.getJSONObject(x));
            Ass.forEach(index -> {
                JSONObject value = (JSONObject) index;
                right_panel_index.add(createButton(value.get("username").toString()), "wrap");
            
            });
        }
        
        
        pack();
        
        
    }
    
    /**
    *
    * Generate Dinamic Buttons for Number of new members to verify
    * 
     */
    private JButton createButton(String text) {
        counter++;

        Border empty;
        empty = BorderFactory.createEmptyBorder();
        
        TitledBorder title;
        
        JButton btn = new JButton(text);
        btn.setFont(new Font("Arial", Font.ITALIC, 40));
        btn.setPreferredSize(new Dimension(right_panel_index.getWidth(), 100));
        title = BorderFactory.createTitledBorder(empty, "New Member Request");
        title.setTitleJustification(TitledBorder.LEFT);
        btn.setBorder(title);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                genMemberRequestFrame(text);
            }
        });
        
        
        return btn;
    }
    
    private void genMemberRequestFrame(String username){
        
        
        JSONArray  editUser = new JSONArray ();
        
        for(int x=0;x<dataJson.length();x++){
            JSONArray  All = new JSONArray ();
            All.put(dataJson.getJSONObject(x));
            All.forEach(index -> {
                JSONObject value = (JSONObject) index;
                if(value.get("username").toString().toLowerCase()==username.toLowerCase()){


                    editUser.put(0,value.get("member_id").toString());
                    editUser.put(1,value.get("username").toString());
                    editUser.put(2,value.get("email").toString());
                    editUser.put(3,value.get("address").toString());
                    editUser.put(4,value.get("membership").toString());
                    editUser.put(5,value.get("status").toString());
                }
            });
        }
        
        
        /*
                System.out.println(editUser.get(0).toString());//member REQ ID
                System.out.println(editUser.get(1).toString());//Username
                System.out.println(editUser.get(2).toString());//Email
                System.out.println(editUser.get(3).toString());//address
                System.out.println(editUser.get(4).toString());//membership
                System.out.println(editUser.get(5).toString());//status
           */
                
        
        JFrame main = new JFrame(gc);
        main.setTitle("Request Approval");
        main.setSize(280, 500);
        main.toFront();
        main.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        main.setLocationRelativeTo(null);
        main.setResizable(false);
        
        main.setLayout(new FlowLayout());
        JTextField username_,email_,address_ ;
        username_ = new JTextField(editUser.get(1).toString(), 20);
        email_ = new JTextField(editUser.get(2).toString(), 20);
        address_ = new JTextField(editUser.get(3).toString(), 20);
        
        
        JLabel user,im,addr,mship,stus;
        user=new JLabel("Username");
        im=new JLabel("E-mail");
        addr=new JLabel("Address");
        mship=new JLabel("Membership");
        stus=new JLabel("Status");
        
        
        String[] MSlist={"Silver","Gold","Platinum"};
        String[] STlist={"0 - Normal","1 - Club Advisor","2 - Club Manager"};
        JComboBox membership_,status_;
        
        membership_= new JComboBox(MSlist);
        status_= new JComboBox(STlist);
        membership_.setPreferredSize(new Dimension(230,20));
        status_.setPreferredSize(new Dimension(230,20));
        
        
        JButton action=new JButton("Action");
        action.setSize(new Dimension(230,20));
        
        main.add(user, BorderLayout.NORTH);
        main.add(username_, BorderLayout.NORTH);
        
        main.add(im, BorderLayout.NORTH);
        main.add(email_, BorderLayout.NORTH);
        
        main.add(addr, BorderLayout.NORTH);
        main.add(address_, BorderLayout.NORTH);
        
        main.add(mship, BorderLayout.NORTH);
        main.add(membership_, BorderLayout.NORTH);
        
        main.add(stus, BorderLayout.NORTH);
        main.add(status_, BorderLayout.NORTH);
        
        
        main.add(action, BorderLayout.NORTH);
        main.setVisible(true);
            
    }
}
