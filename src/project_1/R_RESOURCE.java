/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author JATIN
 */
public class R_RESOURCE extends javax.swing.JFrame {

    /**
     * Creates new form R_RESOURCE
     */
    public R_RESOURCE() {
        initComponents();
          PN.setVisible(true);
    CD.setVisible(true);
    CM.setVisible(true);
    CY.setVisible(true);
    RC.setVisible(false);
        RD.setVisible(false);
        SD.setVisible(true);
        AC.setVisible(false);
    }
R_RESOURCE(int E_ID)
{   initComponents();
    PN.setVisible(false);
    CD.setVisible(false);
    CM.setVisible(false);
    CY.setVisible(false);
     SD.setVisible(false);
     AC.setVisible(true);
try{ 
     Class.forName("com.mysql.jdbc.Driver");
     Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
     Statement s=c.createStatement();
        ResultSet r=s.executeQuery("select * from resource where E_ID="+E_ID);
    while(r.next()){
        RID.setText(E_ID+"");
        RNM.setText(r.getString(3));   
        RC.setText(r.getString(4));
        RD.setText(r.getString(5));
        RR.setText(r.getString(6));
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RNM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SD = new javax.swing.JButton();
        CY = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        CD = new javax.swing.JComboBox();
        CM = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        RR = new javax.swing.JTextArea();
        RC = new javax.swing.JTextField();
        RD = new javax.swing.JTextField();
        AC = new javax.swing.JButton();
        PN = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(709, 560));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vijaya", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("RESOURCE REQUEST ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 446, 50);

        jLabel2.setText("E_ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 110, 97, 32);
        getContentPane().add(RID);
        RID.setBounds(370, 110, 141, 32);

        jLabel4.setText("NAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 170, 97, 32);
        getContentPane().add(RNM);
        RNM.setBounds(370, 170, 141, 32);

        jLabel5.setText("PROJECT NAME");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 230, 97, 32);

        jLabel7.setText("RESOURCE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 360, 97, 32);

        SD.setText("SEND");
        SD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDActionPerformed(evt);
            }
        });
        getContentPane().add(SD);
        SD.setBounds(300, 480, 86, 33);

        CY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        CY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(CY);
        CY.setBounds(500, 310, 80, 20);

        jLabel6.setText("Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 310, 60, 20);

        CD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        CD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(CD);
        CD.setBounds(368, 310, 50, 20);

        CM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" }));
        CM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(CM);
        CM.setBounds(420, 310, 80, 20);

        RR.setColumns(20);
        RR.setRows(5);
        jScrollPane1.setViewportView(RR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 360, 290, 110);
        getContentPane().add(RC);
        RC.setBounds(370, 230, 140, 30);
        getContentPane().add(RD);
        RD.setBounds(370, 310, 140, 20);

        AC.setText("ACCEPT");
        AC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACMouseClicked(evt);
            }
        });
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });
        getContentPane().add(AC);
        AC.setBounds(260, 483, 170, 30);
        getContentPane().add(PN);
        PN.setBounds(370, 230, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACMouseClicked
      
        
    }//GEN-LAST:event_ACMouseClicked

    private void SDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDActionPerformed
  String g=CD.getSelectedItem().toString()+":"+CM.getSelectedItem().toString().trim()+":"+CY.getSelectedItem().toString();
        try{ 
     Class.forName("com.mysql.jdbc.Driver");
     Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
      PreparedStatement s=c.prepareStatement("Insert into resource(E_ID,Name,Project,Date,Resource) values(?,?,?,?,?)");
      s.setString(1,RID.getText());
      s.setString(2,RNM.getText());
      s.setString(3,PN.getText());
      s.setString(4,g);
      s.setString(5,RR.getText());
       int i=s.executeUpdate();
         if(i>0)
           {
               javax.swing.JOptionPane.showMessageDialog(this, "Request Sent");
           }
            else
           {
               javax.swing.JOptionPane.showMessageDialog(this, "Try Again"); 
           }
         this.dispose();
       }catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_SDActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
          try{ 
     Class.forName("com.mysql.jdbc.Driver");
     Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
      PreparedStatement s=c.prepareStatement("Update resource set Status ='A' where E_ID='"+RID.getText().trim()+"'");
       int i=s.executeUpdate();
           if(i>0)
           {
               javax.swing.JOptionPane.showMessageDialog(this, "Allocated");
           }
            else
           {
               javax.swing.JOptionPane.showMessageDialog(this, "Error While Allocating"); 
           }
      this.dispose();
          }catch(Exception e)
       {
           System.out.println(e);
       }
      
    }//GEN-LAST:event_ACActionPerformed

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
            java.util.logging.Logger.getLogger(R_RESOURCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(R_RESOURCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(R_RESOURCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(R_RESOURCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new R_RESOURCE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JComboBox CD;
    private javax.swing.JComboBox CM;
    private javax.swing.JComboBox CY;
    private javax.swing.JTextField PN;
    private javax.swing.JTextField RC;
    private javax.swing.JTextField RD;
    private javax.swing.JTextField RID;
    private javax.swing.JTextField RNM;
    private javax.swing.JTextArea RR;
    private javax.swing.JButton SD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
