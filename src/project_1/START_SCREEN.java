/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author JATIN
 */
public class START_SCREEN extends javax.swing.JFrame {

    /**
     * Creates new form START_SCREEN
     */
    public START_SCREEN() {
        initComponents();
       this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        P1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(80, 177, 127));
        setMaximumSize(new java.awt.Dimension(1365, 728));
        setMinimumSize(new java.awt.Dimension(1365, 728));
        setPreferredSize(new java.awt.Dimension(1365, 728));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel1.setText("LOGIN ID");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(870, 340, 73, 34);

        T1.setText("22");
        getContentPane().add(T1);
        T1.setBounds(1010, 340, 107, 34);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel2.setText("PASSWORD");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(870, 430, 73, 33);
        getContentPane().add(P1);
        P1.setBounds(1010, 430, 107, 37);

        jLabel4.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 255));
        jLabel4.setText("WELCOME   TO  DOMESHARE");
        jLabel4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 50, 700, 120);
        jLabel4.getAccessibleContext().setAccessibleDescription("");

        jButton1.setText("MATCH IT!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(940, 530, 130, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_1/5.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(1366, 760));
        jLabel6.setMinimumSize(new java.awt.Dimension(1366, 760));
        jLabel6.setPreferredSize(new java.awt.Dimension(1366, 760));
        jLabel6.setRequestFocusEnabled(false);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -20, 1366, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                  try{
                      int i=Integer.parseInt(T1.getText());
                        String s=P1.getText();
                  
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
                        Statement q=c.createStatement();
                        ResultSet r=q.executeQuery("select * from login where E_ID="+i);

                        if(r.next())
                        {
                          if(s.equals(r.getString(2)))
                                  {
                                      if(r.getString(3).equals("M"))
                                      {
                                        new MD_STARTUP(i).setVisible(true);
                                      }
                                      else if(r.getString(3).equals("R"))
                                      {
                                          RESOURCE_STARTUP e=new RESOURCE_STARTUP(i);
                                          e.setVisible(true);
                                      }
                                      else if(r.getString(3).equals("L"))
                                      {
                                          LEADER_STARTUP e=new LEADER_STARTUP(i);
                                          e.setVisible(true);
                                      }
                                      else if(r.getString(3).equals("E"))
                                      {
                                         new EMPLOYEE_STARTUP(i).setVisible(true);
                                      }
                                                                     
                                      } else{
                                            javax.swing.JOptionPane.showMessageDialog(this, "Fill Password Carefully ");          
                                      }
                                          
                                  
                        }  else{
                                            javax.swing.JOptionPane.showMessageDialog(this, "Fill ID Carefully ");
                                           
                                            
                           }            
                                  this.dispose(); 
                    }catch(Exception e)
                    {
                        System.out.println(e);
                        javax.swing.JOptionPane.showMessageDialog(this, "Fill ID Carefully ");
                        T1.setText("");
                        P1.setText("");
                                           
                    }
                    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(START_SCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(START_SCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(START_SCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(START_SCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
new START_SCREEN();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField P1;
    private javax.swing.JTextField T1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
