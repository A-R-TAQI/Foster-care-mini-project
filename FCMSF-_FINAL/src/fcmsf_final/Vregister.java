/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fcmsf_final;

import java.awt.event.KeyEvent;
import java.sql.*;

import javax.swing.JOptionPane;
/**
 *
 * @author asus
 */
public class Vregister extends javax.swing.JFrame {

    /**
     * Creates new form Vregister
     */
    public Vregister() {
        initComponents();
        setExtendedState(Home.MAXIMIZED_BOTH);
        yo.setVisible(true);
        yo.setSize(30,750);
        ho.setVisible(true);
        pa.setVisible(true);
        vo.setVisible(true);
        close.setContentAreaFilled(false);
        open.setContentAreaFilled(false);
        
        ocit.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rmain = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        con = new javax.swing.JLabel();
        forname = new javax.swing.JTextField();
        forcit = new javax.swing.JTextField();
        forcon = new javax.swing.JTextField();
        sub = new javax.swing.JButton();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        oid = new javax.swing.JLabel();
        oidc = new javax.swing.JComboBox<>();
        ocit = new javax.swing.JLabel();
        yo = new javax.swing.JPanel();
        ho = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        close = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        pa = new javax.swing.JButton();
        ch = new javax.swing.JButton();
        vo = new javax.swing.JButton();
        ad = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        he = new javax.swing.JPanel();
        open = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Rmain.setBackground(new java.awt.Color(255, 255, 255));
        Rmain.setLayout(null);

        name.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        name.setText("NAME");
        Rmain.add(name);
        name.setBounds(170, 130, 70, 30);

        city.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        city.setText("CITY");
        Rmain.add(city);
        city.setBounds(170, 210, 90, 30);

        con.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        con.setText("PHONE");
        Rmain.add(con);
        con.setBounds(170, 300, 90, 26);

        forname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fornameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fornameKeyTyped(evt);
            }
        });
        Rmain.add(forname);
        forname.setBounds(290, 130, 130, 30);

        forcit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forcitMouseClicked(evt);
            }
        });
        forcit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                forcitKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                forcitKeyTyped(evt);
            }
        });
        Rmain.add(forcit);
        forcit.setBounds(290, 210, 130, 30);

        forcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                forconKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                forconKeyReleased(evt);
            }
        });
        Rmain.add(forcon);
        forcon.setBounds(290, 300, 130, 30);

        sub.setBackground(new java.awt.Color(0, 0, 0));
        sub.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        sub.setForeground(new java.awt.Color(0, 204, 204));
        sub.setText("SUBMIT");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        Rmain.add(sub);
        sub.setBounds(730, 670, 150, 33);
        Rmain.add(r1);
        r1.setBounds(170, 180, 220, 20);
        Rmain.add(r2);
        r2.setBounds(170, 260, 220, 20);
        Rmain.add(r3);
        r3.setBounds(180, 340, 220, 30);

        oid.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        oid.setText("OID");
        Rmain.add(oid);
        oid.setBounds(170, 380, 100, 30);

        oidc.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        oidc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2 ", "3 ", "4 ", "5 " }));
        Rmain.add(oidc);
        oidc.setBounds(290, 380, 130, 30);

        ocit.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ocit.setText("<html><pir>1 - MANGLORE <br>\n2 - BANGLORE<br>\n3 - MYSORE<br>\n4 - HASSAN<br>\n5 - MADKERI<br>\n</pir>\n</html>");
        ocit.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Rmain.add(ocit);
        ocit.setBounds(460, 390, 110, 100);

        yo.setBackground(new java.awt.Color(255, 255, 255));
        yo.setForeground(new java.awt.Color(255, 255, 255));
        yo.setLayout(null);

        ho.setBackground(new java.awt.Color(0, 0, 0));
        ho.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ho.setForeground(new java.awt.Color(0, 204, 204));
        ho.setText("HOME");
        ho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoActionPerformed(evt);
            }
        });
        yo.add(ho);
        ho.setBounds(30, 70, 100, 30);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        yo.add(jSeparator1);
        jSeparator1.setBounds(0, 110, 130, 10);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        yo.add(jSeparator2);
        jSeparator2.setBounds(0, 170, 130, 10);

        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-go-back-30.png"))); // NOI18N
        close.setBorder(null);
        close.setOpaque(true);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        yo.add(close);
        close.setBounds(90, 10, 30, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-page-30.png"))); // NOI18N
        yo.add(jLabel4);
        jLabel4.setBounds(0, 70, 30, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-family-30.png"))); // NOI18N
        yo.add(jLabel9);
        jLabel9.setBounds(0, 130, 30, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-organization-chart-people-30.png"))); // NOI18N
        yo.add(jLabel10);
        jLabel10.setBounds(0, 310, 30, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-administrator-male-30.png"))); // NOI18N
        yo.add(jLabel11);
        jLabel11.setBounds(0, 370, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-school-girl-30.png"))); // NOI18N
        yo.add(jLabel2);
        jLabel2.setBounds(0, 190, 30, 30);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        yo.add(jSeparator3);
        jSeparator3.setBounds(0, 230, 130, 10);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        yo.add(jSeparator4);
        jSeparator4.setBounds(0, 50, 130, 10);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        yo.add(jSeparator5);
        jSeparator5.setBounds(0, 290, 130, 10);

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        yo.add(jSeparator6);
        jSeparator6.setBounds(0, 350, 130, 10);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        yo.add(jSeparator7);
        jSeparator7.setBounds(0, 410, 130, 10);

        pa.setBackground(new java.awt.Color(0, 0, 0));
        pa.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        pa.setForeground(new java.awt.Color(0, 204, 204));
        pa.setText("PARENT");
        pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paActionPerformed(evt);
            }
        });
        yo.add(pa);
        pa.setBounds(30, 130, 100, 30);

        ch.setBackground(new java.awt.Color(0, 0, 0));
        ch.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ch.setForeground(new java.awt.Color(0, 204, 204));
        ch.setText("CHILD");
        ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chActionPerformed(evt);
            }
        });
        yo.add(ch);
        ch.setBounds(30, 190, 100, 30);

        vo.setBackground(new java.awt.Color(0, 0, 0));
        vo.setForeground(new java.awt.Color(0, 204, 204));
        vo.setText("VOLUNTEER");
        vo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voActionPerformed(evt);
            }
        });
        yo.add(vo);
        vo.setBounds(30, 250, 100, 30);

        ad.setBackground(new java.awt.Color(0, 0, 0));
        ad.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ad.setForeground(new java.awt.Color(0, 204, 204));
        ad.setText("ADMIN");
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });
        yo.add(ad);
        ad.setBounds(30, 370, 100, 30);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 204, 204));
        jButton5.setText("ABOUT US");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        yo.add(jButton5);
        jButton5.setBounds(30, 310, 100, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-volunteer-30.jpeg.png"))); // NOI18N
        yo.add(jLabel8);
        jLabel8.setBounds(0, 250, 30, 30);

        Rmain.add(yo);
        yo.setBounds(0, 50, 130, 750);

        he.setBackground(new java.awt.Color(255, 255, 255));
        he.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 204)));
        he.setLayout(null);

        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-forward-button-30.png"))); // NOI18N
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        he.add(open);
        open.setBounds(10, 10, 30, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 153));
        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setText("<html>\n<pre>                                                  X FOSTER CARE");
        he.add(jLabel7);
        jLabel7.setBounds(0, 0, 1540, 50);

        Rmain.add(he);
        he.setBounds(0, 0, 1540, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/vol1.jpg"))); // NOI18N
        Rmain.add(background);
        background.setBounds(0, 50, 1540, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Rmain, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Rmain, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fornameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fornameKeyReleased
        r1.setText("");
    }//GEN-LAST:event_fornameKeyReleased

    private void fornameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fornameKeyTyped
        char d=evt.getKeyChar();

        if(!Character.isLetter(d) && !Character.isSpaceChar(d)){
            evt.consume();
    }//GEN-LAST:event_fornameKeyTyped
    }
    private void forcitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forcitKeyReleased
      r2.setText("");
    }//GEN-LAST:event_forcitKeyReleased

    private void forcitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forcitKeyTyped
        char d=evt.getKeyChar();

        if(!Character.isLetter(d) && !Character.isSpaceChar(d)){
            evt.consume();
    }//GEN-LAST:event_forcitKeyTyped
    }
    private void forconKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forconKeyPressed
        String PhoneNumber=forcon.getText();
        int length=PhoneNumber.length();
        char c=evt.getKeyChar();

        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
            if (length<10){
                forcon.setEditable(true);
            }else{
                forcon.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                forcon.setEditable(true);
            }
            else{
                forcon.setEditable(false);
            }
        }
    }//GEN-LAST:event_forconKeyPressed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        if(forname.getText().trim().isEmpty() &&forcit.getText().trim().isEmpty()&&forcon.getText().trim().isEmpty() ){
            r1.setText("This is a required field");
            r2.setText("This is a required field");
            r3.setText("This is a required field");
        }
        else if(forname.getText().trim().isEmpty() &&forcon.getText().trim().isEmpty()){
            r1.setText("This is a required field");
            r3.setText("This is a required field");
        }
         else if(forcit.getText().trim().isEmpty() &&forcon.getText().trim().isEmpty()){
            r2.setText("This is a required field");
            r3.setText("This is a required field");
        }
        else if(forname.getText().trim().isEmpty() &&forcit.getText().trim().isEmpty()){
            r1.setText("This is a required field");
            r2.setText("This is a required field");
        }
        else if(forname.getText().trim().isEmpty()){
            r1.setText("This is a required field");
        }
        else if(forcit.getText().trim().isEmpty()){
            r2.setText("This is a required field");
        }
        else if(forcon.getText().trim().isEmpty()){
            r3.setText("This is a required field");
        }
        else
        {
            
           
            //submitted su=new submitted();
            //su.show();
            //dispose();
           
            String NAME=forname.getText();
            String CITY=forcit.getText();
            String PHONE=forcon.getText();
            String OID=(String)oidc.getSelectedItem();
            
            try{
                Connection con=FCMSF_FINAL.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("insert into volunteer(NAME,CITY,PHONE,OID)values('"+NAME+"','"+CITY+"','"+PHONE+"','"+OID+"')");
                JOptionPane.showMessageDialog(null, "YOUR RESPONSE HAS BEEN SUBMITTED");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_subActionPerformed

    private void forconKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forconKeyReleased
         r3.setText("");
    }//GEN-LAST:event_forconKeyReleased

    private void forcitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forcitMouseClicked
       ocit.setVisible(true);
    }//GEN-LAST:event_forcitMouseClicked

    private void hoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoActionPerformed
        Home ho=new Home();//to open Home page
        ho.show();
        dispose();
    }//GEN-LAST:event_hoActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        yo.setVisible(true);              //to close yo sidepanel
        yo.setSize(30,750);
        ho.setVisible(true);
        ch.setVisible(true);
        vo.setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    private void paActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paActionPerformed
        Parent pa =new Parent();        //to open parent
        pa.show();
        dispose();
    }//GEN-LAST:event_paActionPerformed

    private void chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chActionPerformed
        child ch =new child();        //to open parent
        ch.show();
        dispose();
    }//GEN-LAST:event_chActionPerformed

    private void voActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voActionPerformed
        Volunteer vo=new Volunteer();        //To open Volunteer
        vo.show();
        dispose();
    }//GEN-LAST:event_voActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        admin ad=new admin();
        ad.show();
        dispose();
    }//GEN-LAST:event_adActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        org og=new org();
        og.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        yo.setVisible(true);               //to open yo side panel
        yo.setSize(130,750);
        ho.setVisible(true);
        ch.setVisible(true);
        vo.setVisible(true);
        //he.setVisible(false);
    }//GEN-LAST:event_openActionPerformed

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
            java.util.logging.Logger.getLogger(Vregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vregister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Rmain;
    private javax.swing.JButton ad;
    private javax.swing.JLabel background;
    private javax.swing.JButton ch;
    private javax.swing.JLabel city;
    private javax.swing.JButton close;
    private javax.swing.JLabel con;
    private javax.swing.JTextField forcit;
    private javax.swing.JTextField forcon;
    private javax.swing.JTextField forname;
    private javax.swing.JPanel he;
    private javax.swing.JButton ho;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel name;
    private javax.swing.JLabel ocit;
    private javax.swing.JLabel oid;
    private javax.swing.JComboBox<String> oidc;
    private javax.swing.JButton open;
    private javax.swing.JButton pa;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel r3;
    private javax.swing.JButton sub;
    private javax.swing.JButton vo;
    private javax.swing.JPanel yo;
    // End of variables declaration//GEN-END:variables
}
