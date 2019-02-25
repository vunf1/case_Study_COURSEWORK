/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.*;



/**
 *
 * @author deoiveij
 */

public class index_FRAME extends javax.swing.JFrame {
    
    public String progressValue;
    DataBase_mySQL conn = new DataBase_mySQL();
    
    
    
    
    
        
    private void alertWAR(String s){
        
        
        JOptionPane optionPane = new JOptionPane(s,JOptionPane.WARNING_MESSAGE);
        JDialog dialog = optionPane.createDialog("Warning!");
        dialog.setAlwaysOnTop(true); // to show top of all other application
        dialog.setVisible(true); // to visible the dialog
    };
    private void alertINFO(String s){
        JOptionPane optionPane = new JOptionPane(s,JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Information!");
        dialog.setAlwaysOnTop(true); // to show top of all other application
        dialog.setVisible(true); // to visible the dialog
    };
    private void alertERROR(String s){
        JOptionPane optionPane = new JOptionPane(s,JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog("Error!");
        dialog.setAlwaysOnTop(true); // to show top of all other application
        dialog.setVisible(true); // to visible the dialog
    };
    
    private void centerFrame() {
        
        
        //call to center Frames to center of actual Screen
            Dimension windowSize = getSize();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Point centerPoint = ge.getCenterPoint();

            int dx = centerPoint.x - windowSize.width / 2;
            int dy = centerPoint.y - windowSize.height / 2;    
            setLocation(dx, dy);
    };
    
    public index_FRAME() {
        
        initComponents();
        centerFrame();
        
        this.trigger_alert.setVisible(false);
        this.index_Panel.setVisible(false);
        this.accSettings_Panel.setVisible(false);
        this.update_Panel.setVisible(false);
        this.book_Panel.setVisible(false);
        
        this.menu_item_1.setText("<html><center>"+"Check"+"<br>"+"Membership"+"</center></html>");
        
        
        this.menu_item_2.setText("<html><center>"+"Book"+"<br>"+"Class"+"</center></html>");
        String[] arrayOfGymClass = new String[]{"Yoga","Swimming","Box","Zumba","Running","Other"};
        this.listOFclass_comboBox.setModel(new javax.swing.DefaultComboBoxModel(arrayOfGymClass));//load array into comboBox
        
        this.menu_item_3.setText("<html><center>"+"Update"+"<br>"+"Membership"+"</center></html>");
        this.menu_item_4.setText("<html><center>"+"Account"+"<br>"+"Settings"+"</center></html>");
        
        String[] arrayOfMembership = new String[]{"Silver","Gold","Platinium"};
        this.list_membership.setModel(new javax.swing.DefaultComboBoxModel(arrayOfMembership));//load array into comboBox
        
        
        
        /*need +10 to convert to gold
            upgrade to platinum fee £100
        */
        progressValue= "30";
        
        /*CHECK PROGESSS*/
        this.n_actual_class_booked.setText(progressValue);
        this.progressBar_membership.setValue(Integer.parseInt(this.n_actual_class_booked.getText()));
        /*UPDATE PROGESSS*/        
        this.n_actual_class_booked1.setText(progressValue);
        this.progressBar_membership1.setValue(Integer.parseInt(this.n_actual_class_booked.getText()));
        /*BOOK PROGESSS*/
        this.n_actual_class_booked2.setText(progressValue);
        this.progressBar_membership2.setValue(Integer.parseInt(this.n_actual_class_booked.getText()));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_Panel = new javax.swing.JPanel();
        menu_item_1 = new javax.swing.JButton();
        menu_item_2 = new javax.swing.JButton();
        menu_item_4 = new javax.swing.JButton();
        menu_item_3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        trigger_alert = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        index_Panel = new javax.swing.JPanel();
        label_name = new javax.swing.JLabel();
        label_membership = new javax.swing.JLabel();
        label_something = new javax.swing.JLabel();
        member_next_goal2 = new javax.swing.JLabel();
        progressBar_membership2 = new javax.swing.JProgressBar();
        n_actual_class_booked2 = new javax.swing.JLabel();
        label_title_CLASS2 = new javax.swing.JLabel();
        image_panel = new javax.swing.JPanel();
        book_Panel = new javax.swing.JPanel();
        label_name1 = new javax.swing.JLabel();
        label_something1 = new javax.swing.JLabel();
        member_next_goal1 = new javax.swing.JLabel();
        progressBar_membership = new javax.swing.JProgressBar();
        n_actual_class_booked = new javax.swing.JLabel();
        label_title_CLASS = new javax.swing.JLabel();
        listOFclass_comboBox = new javax.swing.JComboBox<>();
        buttom_add2Book = new javax.swing.JButton();
        label_text_AvaiableClass = new javax.swing.JLabel();
        update_Panel = new javax.swing.JPanel();
        label_name2 = new javax.swing.JLabel();
        label_something2 = new javax.swing.JLabel();
        member_next_goal3 = new javax.swing.JLabel();
        progressBar_membership1 = new javax.swing.JProgressBar();
        n_actual_class_booked1 = new javax.swing.JLabel();
        label_title_CLASS1 = new javax.swing.JLabel();
        list_membership = new javax.swing.JComboBox<>();
        buttom_add2Book1 = new javax.swing.JButton();
        label_text_AvaiableClass1 = new javax.swing.JLabel();
        label_info = new javax.swing.JLabel();
        label_info_static1 = new javax.swing.JLabel();
        accSettings_Panel = new javax.swing.JPanel();
        buttom_add2Book2 = new javax.swing.JButton();
        textBox_newPW = new javax.swing.JTextField();
        texBox_Address = new javax.swing.JTextField();
        textBox_username = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        label_address = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        textBox_oldPW = new javax.swing.JTextField();
        label_displayName = new javax.swing.JLabel();
        textBox_displayName = new javax.swing.JTextField();
        button_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Membeship Panel");
        setBackground(java.awt.Color.lightGray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("mainFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_Panel.setBackground(new java.awt.Color(181, 206, 179));
        menu_Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_item_1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        menu_item_1.setText("Check Membership");
        menu_item_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_1ActionPerformed(evt);
            }
        });
        menu_Panel.add(menu_item_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 130, 40));

        menu_item_2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        menu_item_2.setText("Book");
        menu_item_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_2ActionPerformed(evt);
            }
        });
        menu_Panel.add(menu_item_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 110, 40));

        menu_item_4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        menu_item_4.setText("--*-----");
        menu_item_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_4ActionPerformed(evt);
            }
        });
        menu_Panel.add(menu_item_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 110, 40));

        menu_item_3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        menu_item_3.setText("Update");
        menu_item_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_3ActionPerformed(evt);
            }
        });
        menu_Panel.add(menu_item_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 110, 40));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel1.setText("Member Area");
        menu_Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Hello <display name>");
        menu_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        trigger_alert.setText("alert");
        trigger_alert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trigger_alertActionPerformed(evt);
            }
        });
        menu_Panel.add(trigger_alert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menu_Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 40, -1));

        getContentPane().add(menu_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 750, 80));

        index_Panel.setBackground(java.awt.Color.lightGray);
        index_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_name.setText("<Username>");
        index_Panel.add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        label_membership.setText("<e-mail>");
        index_Panel.add(label_membership, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        label_something.setText("<actual membership>");
        index_Panel.add(label_something, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        member_next_goal2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        member_next_goal2.setText("<Next Goal>");
        index_Panel.add(member_next_goal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        progressBar_membership2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        index_Panel.add(progressBar_membership2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 460, -1));

        n_actual_class_booked2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        n_actual_class_booked2.setText("<number class Y>");
        index_Panel.add(n_actual_class_booked2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        label_title_CLASS2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        label_title_CLASS2.setText("Membership Update Progress");
        index_Panel.add(label_title_CLASS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        javax.swing.GroupLayout image_panelLayout = new javax.swing.GroupLayout(image_panel);
        image_panel.setLayout(image_panelLayout);
        image_panelLayout.setHorizontalGroup(
            image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        image_panelLayout.setVerticalGroup(
            image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        index_Panel.add(image_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, -1));

        getContentPane().add(index_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 740, 360));

        book_Panel.setBackground(java.awt.Color.lightGray);
        book_Panel.setToolTipText("Book a Class");
        book_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_name1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        label_name1.setText("<Username>");
        book_Panel.add(label_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        label_something1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        label_something1.setText("<actual membership>");
        book_Panel.add(label_something1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        member_next_goal1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        member_next_goal1.setText("<Next Goal>");
        book_Panel.add(member_next_goal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        progressBar_membership.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        book_Panel.add(progressBar_membership, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 460, -1));

        n_actual_class_booked.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        n_actual_class_booked.setText("<number class Y>");
        book_Panel.add(n_actual_class_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        label_title_CLASS.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        label_title_CLASS.setText("Membership Update Progress");
        book_Panel.add(label_title_CLASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        listOFclass_comboBox.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        listOFclass_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        book_Panel.add(listOFclass_comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 190, -1));

        buttom_add2Book.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        buttom_add2Book.setText("Click to Book");
        book_Panel.add(buttom_add2Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        label_text_AvaiableClass.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        label_text_AvaiableClass.setText("Avaiable Classes");
        book_Panel.add(label_text_AvaiableClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        getContentPane().add(book_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 740, 360));

        update_Panel.setBackground(java.awt.Color.lightGray);
        update_Panel.setToolTipText("Update Membership");
        update_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_name2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        label_name2.setText("<Username>");
        update_Panel.add(label_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        label_something2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        label_something2.setText("<actual membership>");
        update_Panel.add(label_something2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        member_next_goal3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        member_next_goal3.setText("<Next Goal>");
        update_Panel.add(member_next_goal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        progressBar_membership1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        update_Panel.add(progressBar_membership1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 460, -1));

        n_actual_class_booked1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        n_actual_class_booked1.setText("<number class Y>");
        update_Panel.add(n_actual_class_booked1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        label_title_CLASS1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        label_title_CLASS1.setText("Membership Update Progress");
        update_Panel.add(label_title_CLASS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        list_membership.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        list_membership.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        list_membership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_membershipActionPerformed(evt);
            }
        });
        update_Panel.add(list_membership, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 190, -1));

        buttom_add2Book1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        buttom_add2Book1.setText("Click to Update");
        update_Panel.add(buttom_add2Book1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        label_text_AvaiableClass1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        label_text_AvaiableClass1.setText("Avaiable Membership");
        update_Panel.add(label_text_AvaiableClass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));
        update_Panel.add(label_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 370, 80));

        label_info_static1.setText("Information:");
        update_Panel.add(label_info_static1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 10));

        getContentPane().add(update_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 740, 360));

        accSettings_Panel.setBackground(java.awt.Color.lightGray);
        accSettings_Panel.setToolTipText("Membership Settings");
        accSettings_Panel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                accSettings_PanelPropertyChange(evt);
            }
        });
        accSettings_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttom_add2Book2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        buttom_add2Book2.setText("Edit");
        buttom_add2Book2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_add2Book2ActionPerformed(evt);
            }
        });
        accSettings_Panel.add(buttom_add2Book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        textBox_newPW.setText("<new pw>");
        accSettings_Panel.add(textBox_newPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 180, -1));

        texBox_Address.setText("<address>");
        accSettings_Panel.add(texBox_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 180, -1));

        textBox_username.setText("<username>");
        accSettings_Panel.add(textBox_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, -1));

        label_password.setText("Password");
        accSettings_Panel.add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        label_address.setText("Address");
        accSettings_Panel.add(label_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        label_username.setText("Username");
        accSettings_Panel.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        textBox_oldPW.setText("< old pw>");
        accSettings_Panel.add(textBox_oldPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, -1));

        label_displayName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_displayName.setText("Display name");
        accSettings_Panel.add(label_displayName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 30));

        textBox_displayName.setText("<display name>");
        accSettings_Panel.add(textBox_displayName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, -1));

        button_submit.setText("Submit");
        accSettings_Panel.add(button_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 70, -1));

        getContentPane().add(accSettings_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 740, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_item_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_2ActionPerformed
        
        /**
         BOOK BUTTON
         */
        this.index_Panel.setVisible(false);
        this.accSettings_Panel.setVisible(false);
        this.update_Panel.setVisible(false);
        
        this.book_Panel.setVisible(true);
    }//GEN-LAST:event_menu_item_2ActionPerformed

    private void menu_item_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_1ActionPerformed
        /**
         CHECK BUTTON
         */
        
        
        this.book_Panel.setVisible(false);
        this.accSettings_Panel.setVisible(false);
        this.update_Panel.setVisible(false);
        
        this.index_Panel.setVisible(true);
        
        
    }//GEN-LAST:event_menu_item_1ActionPerformed

    private void menu_item_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_3ActionPerformed
        
        /**
         MEMBERSHIP UPDATE BUTTON
         */
        this.book_Panel.setVisible(false);
        this.index_Panel.setVisible(false);
        this.accSettings_Panel.setVisible(false);
        
        this.update_Panel.setVisible(true);

    }//GEN-LAST:event_menu_item_3ActionPerformed

    private void menu_item_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_4ActionPerformed
        /**
         ACC SETTINGS BUTTON
         */
        this.book_Panel.setVisible(false);
        this.index_Panel.setVisible(false);
        this.update_Panel.setVisible(false);
        
        this.accSettings_Panel.setVisible(true);
    }//GEN-LAST:event_menu_item_4ActionPerformed

    
    
    
    private void accSettings_PanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_accSettings_PanelPropertyChange
        /*ON LOAD Panel ACC-SETTINGS*/
        this.textBox_username.setEditable(false);
        this.textBox_username.setEnabled(false);
        
        this.textBox_oldPW.setEnabled(false);
        this.textBox_oldPW.setEditable(false);
        
        this.textBox_newPW.setVisible(false);
        
        
        this.textBox_displayName.setEnabled(false);
        this.textBox_displayName.setEditable(false);
        
        this.texBox_Address.setEnabled(false);
        this.texBox_Address.setEditable(false);
        
        
        
    }//GEN-LAST:event_accSettings_PanelPropertyChange

    private void buttom_add2Book2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_add2Book2ActionPerformed

        this.textBox_username.setEnabled(true);
        this.textBox_username.setEditable(true);
        
        
        
        this.textBox_oldPW.setEnabled(true);
        this.textBox_oldPW.setEditable(true);
        this.textBox_newPW.setVisible(true);
        
        
        this.textBox_displayName.setEnabled(true);
        this.textBox_displayName.setEditable(true);
        
        this.texBox_Address.setEnabled(true);
        this.texBox_Address.setEditable(true);
        
        this.buttom_add2Book2.setVisible(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_buttom_add2Book2ActionPerformed

    
    
    
    
    
    
    
    private void trigger_alertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trigger_alertActionPerformed
    alertWAR("Warning");
    alertINFO("Information");
    alertERROR("Error");
        
        
    }//GEN-LAST:event_trigger_alertActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void list_membershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_membershipActionPerformed
        
        if(this.list_membership.getSelectedItem()=="Gold"){
            this.label_info.setText("");
            alertINFO(this.list_membership.getSelectedItem().toString());
        }
        
        if(this.list_membership.getSelectedItem()=="Silver"){
            this.label_info.setText("");
            alertINFO(this.list_membership.getSelectedItem().toString());
        }
        
        if(this.list_membership.getSelectedItem()=="Platinium"){
            alertINFO(this.list_membership.getSelectedItem().toString());
            
            this.label_info.setText("<html><center>You need first have membership Gold for only then choose Platinium, costs £100 p/year<center></html>");
        }
        
    }//GEN-LAST:event_list_membershipActionPerformed

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
            java.util.logging.Logger.getLogger(index_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new loginFrame().setVisible(true);
                new index_FRAME().setVisible(false);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accSettings_Panel;
    private javax.swing.JPanel book_Panel;
    private javax.swing.JButton buttom_add2Book;
    private javax.swing.JButton buttom_add2Book1;
    private javax.swing.JButton buttom_add2Book2;
    private javax.swing.JButton button_submit;
    private javax.swing.JPanel image_panel;
    private javax.swing.JPanel index_Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_address;
    private javax.swing.JLabel label_displayName;
    private javax.swing.JLabel label_info;
    private javax.swing.JLabel label_info_static1;
    private javax.swing.JLabel label_membership;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_name1;
    private javax.swing.JLabel label_name2;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_something;
    private javax.swing.JLabel label_something1;
    private javax.swing.JLabel label_something2;
    private javax.swing.JLabel label_text_AvaiableClass;
    private javax.swing.JLabel label_text_AvaiableClass1;
    private javax.swing.JLabel label_title_CLASS;
    private javax.swing.JLabel label_title_CLASS1;
    private javax.swing.JLabel label_title_CLASS2;
    private javax.swing.JLabel label_username;
    private javax.swing.JComboBox<String> listOFclass_comboBox;
    private javax.swing.JComboBox<String> list_membership;
    private javax.swing.JLabel member_next_goal1;
    private javax.swing.JLabel member_next_goal2;
    private javax.swing.JLabel member_next_goal3;
    private javax.swing.JPanel menu_Panel;
    private javax.swing.JButton menu_item_1;
    private javax.swing.JButton menu_item_2;
    private javax.swing.JButton menu_item_3;
    private javax.swing.JButton menu_item_4;
    public javax.swing.JLabel n_actual_class_booked;
    public javax.swing.JLabel n_actual_class_booked1;
    public javax.swing.JLabel n_actual_class_booked2;
    public javax.swing.JProgressBar progressBar_membership;
    public javax.swing.JProgressBar progressBar_membership1;
    public javax.swing.JProgressBar progressBar_membership2;
    private javax.swing.JTextField texBox_Address;
    private javax.swing.JTextField textBox_displayName;
    private javax.swing.JTextField textBox_newPW;
    private javax.swing.JTextField textBox_oldPW;
    private javax.swing.JTextField textBox_username;
    private javax.swing.JButton trigger_alert;
    private javax.swing.JPanel update_Panel;
    // End of variables declaration//GEN-END:variables
}
