/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author JATIN
 */
public class RESOURCE_STARTUP extends javax.swing.JFrame {

    /**
     * Creates new form RESOURCE_STARTUP
     */
    public RESOURCE_STARTUP() {
        initComponents();
    }
    RESOURCE_STARTUP(int i){
        initComponents();
    ID.setText(i+"");
    String s1="",s2="";    
    try{       
      int n=0;
      Class.forName("com.mysql.jdbc.Driver");
     Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
     Statement s=c.createStatement();
      ResultSet r1=s.executeQuery("Select Name from employee where E_ID="+i);
     r1.next();
     Name.setText("Welcome, "+r1.getString(1));
     ResultSet r=s.executeQuery("Select * from D"+i+ " where Status='U'");
     while(r.next())
     {        
            n++;
     }
    if(n>0)
    {
        javax.swing.JOptionPane.showMessageDialog(this,"You have "+n+" Unread Messages");
    }
     r=s.executeQuery("Select * from project");
    while(r.next())
    {
        s1=r.getString(1);
        s2=r.getString(7);
        ORP.setText(s2+":"+s1+":"+"\n================\n"+ORP.getText());
   ORP.setEditable(false);
    }
        r=s.executeQuery("select * from Notice");
     while(r.next())
     {
         s1=r.getString(1);
         s2=r.getString(2);
         NA.setText(s1+":-----------\n"+s2+"\n"+NA.getText());
         NA.setEditable(false);
     }
    
  }catch(Exception e)
  {
      System.out.println(e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ORP = new javax.swing.JTextArea();
        Name = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        L2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        L3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        L4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        L5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        NA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 770));
        setUndecorated(true);
        getContentPane().setLayout(null);

        ORP.setBackground(new java.awt.Color(119, 237, 237));
        ORP.setColumns(20);
        ORP.setLineWrap(true);
        ORP.setRows(5);
        ORP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ONGOING AND COMPLETED PROJECTS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kristen ITC", 1, 14))); // NOI18N
        jScrollPane1.setViewportView(ORP);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 260, 383, 408);

        Name.setFont(new java.awt.Font("Andalus", 0, 30)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 204, 204));
        Name.setText("WELCOME, MR. JATIN BANGER");
        getContentPane().add(Name);
        Name.setBounds(70, 30, 473, 58);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1100, 70, 90, 23);

        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(60, 90, 683, 10);

        jLabel2.setText("E_ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(830, 10, 34, 20);

        ID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ID);
        ID.setBounds(870, 10, 100, 20);

        L1.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        L1.setText("CREATE EMPLOYEE ACCOUNT");
        L1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L1MouseExited(evt);
            }
        });
        getContentPane().add(L1);
        L1.setBounds(20, 242, 212, 27);

        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 275, 339, 10);

        L2.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        L2.setText("ACTIVE PROJECTS ");
        L2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L2MouseExited(evt);
            }
        });
        getContentPane().add(L2);
        L2.setBounds(20, 305, 139, 27);

        jSeparator3.setForeground(new java.awt.Color(0, 204, 204));
        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 335, 269, 2);

        L3.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        L3.setText("RESOURCES PENDING");
        L3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L3MouseExited(evt);
            }
        });
        getContentPane().add(L3);
        L3.setBounds(20, 369, 185, 20);

        jSeparator4.setForeground(new java.awt.Color(0, 204, 204));
        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(20, 395, 215, 10);

        L4.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        L4.setText("MAILING");
        L4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L4MouseExited(evt);
            }
        });
        getContentPane().add(L4);
        L4.setBounds(20, 430, 167, 19);

        jSeparator5.setForeground(new java.awt.Color(0, 204, 204));
        jSeparator5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(20, 465, 167, 10);

        L5.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        L5.setText("RESOURCE LOG");
        L5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L5MouseExited(evt);
            }
        });
        getContentPane().add(L5);
        L5.setBounds(20, 503, 144, 25);

        jSeparator6.setForeground(new java.awt.Color(0, 204, 204));
        jSeparator6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(20, 534, 126, 10);

        jButton1.setText("LOG OUT");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1090, 30, 110, 35);

        NA.setBackground(new java.awt.Color(119, 237, 237));
        NA.setColumns(20);
        NA.setLineWrap(true);
        NA.setRows(5);
        NA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Voice To ALL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MS Reference Sans Serif", 1, 14))); // NOI18N
        jScrollPane2.setViewportView(NA);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1080, 310, 290, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_1/7.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1420, 770);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(20, 660, 0, 2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseEntered
L1.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_L1MouseEntered

    private void L1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseExited
 L1.setForeground(Color.BLACK);       // TODO add your handling code here:
    }//GEN-LAST:event_L1MouseExited

    private void L2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseEntered
L2.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_L2MouseEntered

    private void L2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseExited
 L2.setForeground(Color.BLACK);       // TODO add your handling code here:
    }//GEN-LAST:event_L2MouseExited

    private void L3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseEntered
L3.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_L3MouseEntered

    private void L1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseClicked
                EMPLOYEE_DETAILS_0 o=new EMPLOYEE_DETAILS_0();
                o.setVisible(true);
    }//GEN-LAST:event_L1MouseClicked

    private void L3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseExited
       L3.setForeground(Color.BLACK);      // TODO add your handling code here:
    }//GEN-LAST:event_L3MouseExited

    private void L4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseEntered
L4.setForeground(Color.WHITE);                // TODO add your handling code here:
    }//GEN-LAST:event_L4MouseEntered

    private void L4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseExited
      L4.setForeground(Color.BLACK);       // TODO add your handling code here:
    }//GEN-LAST:event_L4MouseExited

    private void L5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseEntered
L5.setForeground(Color.WHITE);                // TODO add your handling code here:
    }//GEN-LAST:event_L5MouseEntered

    private void L5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseExited
        L5.setForeground(Color.BLACK);     // TODO add your handling code here:
    }//GEN-LAST:event_L5MouseExited

    private void L5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseClicked
RESOURCE_LOG r=new RESOURCE_LOG();
r.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_L5MouseClicked

    private void L3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseClicked
                R_PENDING r=new R_PENDING();
                r.setVisible(true);
    }//GEN-LAST:event_L3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        START_SCREEN s=new START_SCREEN();
        s.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void L4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseClicked
        new MY_INBOX(Integer.parseInt(ID.getText())).setVisible(true);
    }//GEN-LAST:event_L4MouseClicked

    private void L2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseClicked
       new PROJECTS_ACTIVE().setVisible(true);
    }//GEN-LAST:event_L2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       NA.setText("");
ORP.setText("");
        String s1="",s2="";
        try{       
      int n=0;
      Class.forName("com.mysql.jdbc.Driver");
     Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
     Statement s=c.createStatement();
     ResultSet r=s.executeQuery("Select * from D"+ID.getText().trim()+ " where Status='U'");
     while(r.next())
     {        
            n++;
     }
    if(n>0)
    {
        javax.swing.JOptionPane.showMessageDialog(this,"You have "+n+"Unread Mails");
    }
    r=s.executeQuery("Select * from project");
    while(r.next())
    {
        s1=r.getString(1);
        s2=r.getString(7);
        ORP.setText(s2+":"+s1+":"+"\n================\n"+ORP.getText());
          ORP.setEditable(false);
    }
        r=s.executeQuery("select * from Notice");
     while(r.next())
     {
         s1=r.getString(1);
         s2=r.getString(2);
         NA.setText(s1+":-----------\n"+s2+"\n"+NA.getText());
            NA.setEditable(false);
     }
  }catch(Exception e)
  {
      System.out.println(e);
  }        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RESOURCE_STARTUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RESOURCE_STARTUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RESOURCE_STARTUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RESOURCE_STARTUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RESOURCE_STARTUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JTextArea NA;
    private javax.swing.JLabel Name;
    private javax.swing.JTextArea ORP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}