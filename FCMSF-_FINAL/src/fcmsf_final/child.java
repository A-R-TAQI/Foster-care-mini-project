/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fcmsf_final;



import fcmsf_final.FCMSF_FINAL;
import fcmsf_final.Parent;
import fcmsf_final.Parent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class child extends javax.swing.JFrame {

    /**
     * Creates new form Child
     */
    public child() {
        initComponents();
       setExtendedState(Home.MAXIMIZED_BOTH);
        yo.setVisible(true);
        yo.setSize(30,750);
        ho.setVisible(true);
        ch.setVisible(true);
        vo.setVisible(true);
        close.setContentAreaFilled(false);
        open.setContentAreaFilled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();
        sho = new javax.swing.JButton();
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
        setBackground(new java.awt.Color(153, 204, 255));
        getContentPane().setLayout(null);

        main.setLayout(null);

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        ctable.setForeground(new java.awt.Color(0, 153, 153));
        ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CID", "NAME", "GENDER", "RELIGION", "DOB", "HEIGHT", "WEIGHT", "OID"
            }
        ));
        ctable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(ctable);

        main.add(jScrollPane1);
        jScrollPane1.setBounds(430, 160, 790, 400);

        sho.setBackground(new java.awt.Color(0, 0, 0));
        sho.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        sho.setForeground(new java.awt.Color(0, 204, 204));
        sho.setText("SHOW");
        sho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoActionPerformed(evt);
            }
        });
        main.add(sho);
        sho.setBounds(780, 70, 72, 25);

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

        main.add(yo);
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

        main.add(he);
        he.setBounds(0, 0, 1540, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chframe1.jpg"))); // NOI18N
        main.add(background);
        background.setBounds(0, 50, 1540, 750);

        getContentPane().add(main);
        main.setBounds(0, 0, 1540, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoActionPerformed
        sho.setVisible(false);
        try{
            Connection con=FCMSF_FINAL .getCon();
            Statement st=con.createStatement();
            String sql="select * from child";
            ResultSet rs=st.executeQuery(sql);

            while(rs.next()){
                String CID= rs.getString("CID");
                String NAME= rs.getString("NAME");
                String GENDER= rs.getString("GENDER");
                String RELIGION= rs.getString("RELIGION");
                String DOB= rs.getString("DOB");             
                String HEIGHT= rs.getString("HEIGHT");
                String WEIGHT= rs.getString("WEIGHT");
                String OID= rs.getString("OID");

                String tbData[]={CID,NAME,GENDER,RELIGION,DOB,HEIGHT,WEIGHT,OID};
                DefaultTableModel tblModel= (DefaultTableModel)ctable.getModel();
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_shoActionPerformed

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
            java.util.logging.Logger.getLogger(child.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(child.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(child.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(child.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new child().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ad;
    private javax.swing.JLabel background;
    private javax.swing.JButton ch;
    private javax.swing.JButton close;
    private javax.swing.JTable ctable;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel main;
    private javax.swing.JButton open;
    private javax.swing.JButton pa;
    private javax.swing.JButton sho;
    private javax.swing.JButton vo;
    private javax.swing.JPanel yo;
    // End of variables declaration//GEN-END:variables
}
