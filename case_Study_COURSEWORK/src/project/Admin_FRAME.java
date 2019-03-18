
package project;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;

import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.CENTER;

import javax.swing.border.Border;

import javax.swing.border.TitledBorder;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author foxst
 */
public class Admin_FRAME extends javax.swing.JFrame {
    private static HomeController controller = new HomeController();
    private static Extras_Notifier alert = new Extras_Notifier();
    
    protected DateTimer timerThread;
    
    static GraphicsConfiguration gc;
    /**
     * Creates new form Admin_Page
     */
    private JSONArray dataJson = new JSONArray();
    
    
    
    public Admin_FRAME() {
        initComponents();
        
        //label_username_left.setText(controller.varUser);
        dataJson=controller.getREMembersData();
        badge_count_request.setText(String.valueOf(dataJson.length()));
        
       
        timerThread = new DateTimer(_date, _time);
        timerThread.start();
        
        
        
    }

    
    public void displayUser()
    {
        
        //label_username_left.setText(controller.varUser);
        label_username_left.setText(controller.varUser);
        initRequestPanel();
        
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
        _date = new javax.swing.JLabel();
        _time = new javax.swing.JLabel();
        btn_logOut = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        right_panel_index = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1250, 700));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);
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

        _date.setText("<date>");

        _time.setText("<time>");

        btn_logOut.setText("Log Out");
        btn_logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logOutMouseClicked(evt);
            }
        });

        btn_exit.setText("Exit");
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout left_panelLayout = new javax.swing.GroupLayout(left_panel);
        left_panel.setLayout(left_panelLayout);
        left_panelLayout.setHorizontalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(left_panelLayout.createSequentialGroup()
                        .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upLabel_user_left)
                            .addComponent(label_username_left))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(left_panelLayout.createSequentialGroup()
                        .addComponent(_date, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_time, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, left_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_membersRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(badge_count_request, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, left_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        left_panelLayout.setVerticalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(badge_count_request, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(left_panelLayout.createSequentialGroup()
                        .addComponent(upLabel_user_left)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_username_left)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_date, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_time, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btn_membersRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void btn_logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logOutMouseClicked
      
        controller.logOut("admin");
        
        
    }//GEN-LAST:event_btn_logOutMouseClicked

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked

        timerThread.exitProcedure();
        
    }//GEN-LAST:event_btn_exitMouseClicked

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
    private javax.swing.JLabel _date;
    private javax.swing.JLabel _time;
    private javax.swing.JLabel badge_count_request;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JLabel btn_logOut;
    private javax.swing.JButton btn_membersRequest;
    public javax.swing.JLabel label_username_left;
    private javax.swing.JPanel left_panel;
    private javax.swing.JPanel right_panel_index;
    private javax.swing.JLabel upLabel_user_left;
    // End of variables declaration//GEN-END:variables

    private void initRequestPanel() {
        dataJson=controller.getREMembersData();//Reload Data onclick
        badge_count_request.setText(String.valueOf(dataJson.length()));//Update onClick
        
        
        right_panel_index.removeAll(); 
        MigLayout layout = new MigLayout("insets 2 2 2 2, fillx"); 
        right_panel_index.setLayout(layout);
        
        
        for(int x=0;x<dataJson.length();x++){
            JSONArray  Adata = new JSONArray ();
            Adata.put(dataJson.getJSONObject(x));
            Adata.forEach(index -> {
                JSONObject value = (JSONObject) index;
                right_panel_index.add(createButton(value.get("username").toString()), "wrap");
            
            });
        }
        
        
        pack();
        
        
    }
    
    /**
    *
    * Generate Dinamic Buttons on Request of new members for ClubAdvisor / ClubManager
    * Club Manager can have access to this button too - setITUP *****
    * 
     */
    private JButton createButton(String text) {
        

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
        //Dynamic event for each button
            public void actionPerformed(ActionEvent e){//event
                genMemberRequestFrame(text);
            }
        });
        
        
        return btn;
    }
    
    /**Frame after trigger event on MEMBER button */
    private void genMemberRequestFrame(String username){
        
        
        JSONArray  editUser = new JSONArray ();
        List<String>  sendData = new ArrayList();
        
        
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
                    editUser.put(6,value.get("date").toString());
                    editUser.put(7,value.get("gender").toString());
                    editUser.put(8,value.get("passwordEncrypt").toString());
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
        main.setSize(270, 500);
        main.toFront();
        main.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        main.setLocationRelativeTo(null);
        main.setResizable(false);
        
        main.setLayout(new FlowLayout());
        JTextField username_,email_,address_,date_ ;
        username_ = new JTextField(editUser.get(1).toString(), 20);
        email_ = new JTextField(editUser.get(2).toString(), 20);
        address_ = new JTextField(editUser.get(3).toString(), 20);
        date_ = new JTextField(editUser.get(6).toString(), 20);
        
        username_.setHorizontalAlignment(SwingConstants.CENTER);
        email_.setHorizontalAlignment(SwingConstants.CENTER);
        address_.setHorizontalAlignment(SwingConstants.CENTER);
        date_.setHorizontalAlignment(SwingConstants.CENTER);
        date_.setEnabled(false);
        
        
        JLabel user,im,addr,mship,stus,dateL;
        user=new JLabel("Username");
        im=new JLabel("E-mail");
        addr=new JLabel("Address");
        mship=new JLabel("Membership");
        stus=new JLabel("Status");
        dateL=new JLabel("Date");
        
        
        
        
        
        JComboBox membership_,status_;
        
        membership_= new JComboBox(new Object[] {"Silver","Gold","Platinum"});
        status_= new JComboBox(new Object[] {"0 - Normal","1 - Club Advisor","2 - Club Manager"});
        membership_.setPreferredSize(new Dimension(230,20));
        status_.setPreferredSize(new Dimension(230,20));
            
        
        System.out.println(editUser.get(4).toString());
        System.out.println(editUser.get(5).toString());
        
        if(editUser.get(4).toString().equals("silver")){
            membership_.setSelectedItem("Silver");
            
        }else if(editUser.get(4).toString().equals("gold")){
            membership_.setSelectedItem("Gold");
            
        }else if(editUser.get(4).toString().equals("platinum")){
            membership_.setSelectedItem("Platinum");
            
        }
        
        if(editUser.get(5).toString().equals("0")){
            status_.setSelectedItem("0 - Normal");
        }else if(editUser.get(5).toString().equals("1")){
            status_.setSelectedItem("1 - Club Advisor");
        }else if(editUser.get(5).toString().equals("2")){
            status_.setSelectedItem("2 - Club Manager");
        }
        
        
        
        JButton action=new JButton("Action");
        action.setSize(new Dimension(230,20));
        JButton delete=new JButton("Delete");
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
        
        
        main.add(dateL, BorderLayout.NORTH);
        main.add(date_, BorderLayout.NORTH);
        
        
        
        
        main.add(action, BorderLayout.NORTH);//event done
        
        main.add(delete, BorderLayout.NORTH);
        
        action.addActionListener(new ActionListener(){
        //Dynamic event for each button
            String statusValue;
            public void actionPerformed(ActionEvent e){//event
                System.out.println(status_.getSelectedItem().toString().substring(0, 1));
                
                sendData.add(0,editUser.get(0).toString());//MemberID
                sendData.add(1,username_.getText());//Username
                sendData.add(2,editUser.get(8).toString());//EncryptPW
                sendData.add(3,email_.getText());//email
                sendData.add(4,address_.getText());//Address
                sendData.add(5,membership_.getSelectedItem().toString().toLowerCase());//Membership
                
                sendData.add(6,status_.getSelectedItem().toString().substring(0, 1));//Status
                
                sendData.add(7,editUser.get(7).toString());//Gender
                sendData.add(8,_date.getText().replaceAll("\\s+",""));//Date
                
                
                
                System.out.println(sendData);
                
                
                
                
                
                if(alert.alertYesNo("Are you sure ?")){
                    
                    controller.insertNewMember(sendData);
                    controller.delREQmember(sendData.get(0));
                }else{
                    
                }
            }
        });
        
        main.setVisible(true);
            
    }
}
