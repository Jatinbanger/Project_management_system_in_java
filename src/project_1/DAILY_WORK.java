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
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;

/**
 *
 * @author JATIN
 */
public class DAILY_WORK extends javax.swing.JFrame {
 String s="";
   java.util.Date c;

    /**
     * Creates new form DAILY_WORK
     */
    public DAILY_WORK() {
        initComponents();
        //s=javax.swing.JOptionPane.showInputDialog("Enter the Project Name");
        //if(s.equals(null))
        //{
            
        //}
        /*try{
          Class.forName("com.mysql.jdbc.Driver");
     Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
     Statement s=c.createStatement();    
    }*/
    }
    public DAILY_WORK(int i,String s1) {
        initComponents();
        ID1.setText(i+"");
        Leaders_Update.setVisible(false);
        Assign_work.setVisible(false);
         Problems.setVisible(false);
         TM.setVisible(false);
         CW.setVisible(false);
        s=s1;
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
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Leaders_Update = new javax.swing.JInternalFrame();
        CD = new javax.swing.JComboBox();
        CM = new javax.swing.JComboBox();
        CY = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PT = new javax.swing.JTextArea();
        Assign_work = new javax.swing.JInternalFrame();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tab1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Work = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Problems = new javax.swing.JInternalFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        PB = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        P_box = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        ID1 = new javax.swing.JLabel();
        TM = new javax.swing.JInternalFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tab3 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        CW = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tab2 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        WR = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1066, 660));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 134, 50));
        jLabel1.setText("DAILY WORK");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 410, 69);

        jSeparator1.setForeground(new java.awt.Color(43, 134, 50));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(211, 86, 532, 10);

        jButton1.setText("Leaders Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 200, 142, 70);

        jButton2.setText("Assign Work");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 270, 142, 70);

        jButton3.setText("Problems");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 340, 142, 80);

        jButton4.setText("Show Team");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 420, 142, 80);

        Leaders_Update.setClosable(true);
        Leaders_Update.setTitle("Leaders Update");
        Leaders_Update.setMaximumSize(new java.awt.Dimension(500, 580));
        Leaders_Update.setMinimumSize(new java.awt.Dimension(500, 580));
        Leaders_Update.setNormalBounds(new java.awt.Rectangle(100, 200, 500, 580));
        Leaders_Update.setPreferredSize(new java.awt.Dimension(500, 580));
        Leaders_Update.setVisible(true);
        Leaders_Update.getContentPane().setLayout(null);

        CD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        CD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Leaders_Update.getContentPane().add(CD);
        CD.setBounds(260, 40, 48, 20);

        CM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" }));
        CM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Leaders_Update.getContentPane().add(CM);
        CM.setBounds(310, 40, 90, 20);

        CY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020" }));
        CY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Leaders_Update.getContentPane().add(CY);
        CY.setBounds(400, 40, 80, 20);

        jLabel3.setText("Date");
        Leaders_Update.getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 40, 61, 39);

        jLabel2.setText("Project Name");
        Leaders_Update.getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 130, 100, 14);
        Leaders_Update.getContentPane().add(PN);
        PN.setBounds(260, 120, 177, 30);

        jLabel4.setText("Project Track");
        Leaders_Update.getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 200, 100, 21);

        jButton6.setText("Publish");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Leaders_Update.getContentPane().add(jButton6);
        jButton6.setBounds(260, 340, 100, 54);

        PT.setColumns(20);
        PT.setLineWrap(true);
        PT.setRows(5);
        jScrollPane1.setViewportView(PT);

        Leaders_Update.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 200, 229, 96);

        getContentPane().add(Leaders_Update);
        Leaders_Update.setBounds(20, 130, 30, 40);

        Assign_work.setClosable(true);
        Assign_work.setTitle("Assign_Work");
        Assign_work.setMaximumSize(new java.awt.Dimension(500, 580));
        Assign_work.setMinimumSize(new java.awt.Dimension(500, 580));
        Assign_work.setNormalBounds(new java.awt.Rectangle(100, 200, 500, 580));
        Assign_work.setPreferredSize(new java.awt.Dimension(500, 580));
        Assign_work.setVisible(true);
        Assign_work.getContentPane().setLayout(null);

        jButton7.setText("Display Team");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Assign_work.getContentPane().add(jButton7);
        jButton7.setBounds(0, 30, 120, 50);

        Tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "E_ID", "Name", "Age", "Highest Qualification", "Speciality"
            }
        ));
        jScrollPane2.setViewportView(Tab1);

        Assign_work.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(140, 10, 642, 107);

        jLabel5.setText("E_ID");
        Assign_work.getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 170, 50, 14);
        Assign_work.getContentPane().add(ID);
        ID.setBounds(310, 160, 137, 30);

        jLabel6.setText("Work");
        Assign_work.getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 250, 50, 14);

        Work.setColumns(20);
        Work.setLineWrap(true);
        Work.setRows(5);
        jScrollPane3.setViewportView(Work);

        Assign_work.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(310, 250, 270, 113);

        jButton8.setText("Assign");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Assign_work.getContentPane().add(jButton8);
        jButton8.setBounds(290, 400, 101, 42);

        jLabel11.setText("** Never assign work multiple times on a single day");
        Assign_work.getContentPane().add(jLabel11);
        jLabel11.setBounds(220, 370, 360, 14);

        jLabel12.setText("**");
        Assign_work.getContentPane().add(jLabel12);
        jLabel12.setBounds(580, 250, 12, 14);

        getContentPane().add(Assign_work);
        Assign_work.setBounds(140, 120, 650, 500);

        Problems.setClosable(true);
        Problems.setTitle("Problems");
        Problems.setToolTipText("");
        Problems.setMaximumSize(new java.awt.Dimension(500, 580));
        Problems.setMinimumSize(new java.awt.Dimension(500, 580));
        Problems.setNormalBounds(new java.awt.Rectangle(100, 200, 500, 580));
        Problems.setPreferredSize(new java.awt.Dimension(500, 580));
        Problems.setVisible(true);
        Problems.getContentPane().setLayout(null);

        PB.setColumns(20);
        PB.setLineWrap(true);
        PB.setRows(5);
        jScrollPane5.setViewportView(PB);

        Problems.getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(260, 160, 324, 189);

        jButton5.setText("Reply");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Problems.getContentPane().add(jButton5);
        jButton5.setBounds(260, 380, 103, 33);

        jLabel8.setText("Problem");
        Problems.getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 170, 60, 14);

        jLabel9.setText("Select ID");
        Problems.getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 70, 60, 14);

        P_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_boxActionPerformed(evt);
            }
        });
        Problems.getContentPane().add(P_box);
        P_box.setBounds(260, 70, 190, 20);

        getContentPane().add(Problems);
        Problems.setBounds(60, 120, 630, 510);

        jLabel7.setText("E_ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 10, 34, 20);

        ID1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ID1);
        ID1.setBounds(870, 10, 100, 20);

        TM.setClosable(true);
        TM.setTitle("Team Members");
        TM.setMaximumSize(new java.awt.Dimension(500, 580));
        TM.setMinimumSize(new java.awt.Dimension(500, 580));
        TM.setPreferredSize(new java.awt.Dimension(500, 580));
        TM.setVisible(true);

        Tab3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "E_ID", "Name", "Highest Qualification", "Speciality"
            }
        ));
        jScrollPane6.setViewportView(Tab3);

        javax.swing.GroupLayout TMLayout = new javax.swing.GroupLayout(TM.getContentPane());
        TM.getContentPane().setLayout(TMLayout);
        TMLayout.setHorizontalGroup(
            TMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        TMLayout.setVerticalGroup(
            TMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TM);
        TM.setBounds(280, 130, 630, 510);

        jButton9.setText("Completed WORK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(20, 500, 140, 70);

        CW.setVisible(true);

        Tab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "E_ID", "Name"
            }
        ));
        Tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tab2);

        jButton10.setText("Show Members");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        WR.setColumns(20);
        WR.setLineWrap(true);
        WR.setRows(5);
        jScrollPane7.setViewportView(WR);

        jLabel10.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        jLabel10.setText("WORK");

        javax.swing.GroupLayout CWLayout = new javax.swing.GroupLayout(CW.getContentPane());
        CW.getContentPane().setLayout(CWLayout);
        CWLayout.setHorizontalGroup(
            CWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CWLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CWLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(CWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)))
                    .addGroup(CWLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton10)))
                .addContainerGap())
        );
        CWLayout.setVerticalGroup(
            CWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CWLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CWLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CWLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        getContentPane().add(CW);
        CW.setBounds(220, 120, 662, 495);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Leaders_Update.setVisible(true);
         Assign_work.setVisible(false);
         Problems.setVisible(false);
         TM.setVisible(false);
         CW.setVisible(false);
         Leaders_Update.setBounds(200, 100, 700, 520);
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try{
           String s1=CD.getSelectedItem()+"\\"+CM.getSelectedItem()+"\\"+CY.getSelectedItem();
           String s2=PN.getText();
           String s3=PT.getText();
              Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
            PreparedStatement s=c.prepareStatement("insert into Screen(Date,Project_Name,Project_track) values(?,?,?)");
            
            s.setString(1, s1);
            s.setString(2, s2);
            s.setString(3, s3); 
            int i=s.executeUpdate();
            if(i>0)
            {
                javax.swing.JOptionPane.showMessageDialog(this, "Published");
                PN.setText("");
                PT.setText("");
            }
            else
                javax.swing.JOptionPane.showMessageDialog(this, "Problem Encountered");
       }catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      
        try{
               c=new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
             String q3=sdf.format(c);
      java.util.ArrayList<Integer> k=new java.util.ArrayList();
              javax.swing.table.DefaultTableModel d = (javax.swing.table.DefaultTableModel) Tab1.getModel();
       Class.forName("com.mysql.jdbc.Driver");
           Connection g =DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root", "");
           Statement x=g.createStatement();
              ResultSet r=x.executeQuery("select * from employee_pro where Project_under='"+s+"'");
          d.setRowCount(0);
          while(r.next())
          {
              int E_ID=r.getInt(1);
              k.add(E_ID);
          }
          Object p[]=k.toArray();
            for (Object p1 : p) {
                r = x.executeQuery("select * from employee where E_ID=" + p1);
                if(r.next()){
                    String E_ID=r.getString(1);
                    String Name=r.getString(2);
                    String Age=r.getString(6);
                    String HQ=r.getString(15);
                    String Speciality=r.getString(16);
                    String s3[]=Age.split("-");            
                    String r_age=((Integer.parseInt(q3))-(Integer.parseInt(s3[2])) )+"";  
                            d.addRow(new String[] {E_ID,Name,r_age,HQ,Speciality});
                }
            }
          Tab1.disable();
          }catch(Exception e)
      {
          System.out.println(e);
      }    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try{
            c=new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            int q1=Integer.parseInt(ID.getText());
            String q2=Work.getText().trim();
              String q3=sdf.format(c);
            Class.forName("com.mysql.jdbc.Driver");
            Connection n=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
            PreparedStatement s=n.prepareStatement("insert into D"+q1+"(Date,Content,Status) values(?,?,?)");
            s.setString(1,q3);
            s.setString(2,q2);
            s.setString(3,"W");
            int i= s.executeUpdate();
            if(i>0)
                javax.swing.JOptionPane.showMessageDialog(this, "ASSIGNED");        
           else
                 javax.swing.JOptionPane.showMessageDialog(this, "SORRY,Not Assigned");
            ID.setText("");
            Work.setText("");
        }catch(Exception e)
        {
            System.out.println(e);
        }        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Problems.setVisible(true);
      Leaders_Update.setVisible(false);
        Assign_work.setVisible(false);
           TM.setVisible(false);
           CW.setVisible(false);
    Problems.setBounds(200, 100, 700, 520);
     try{
             int IDP=Integer.parseInt(ID1.getText());
             Class.forName("com.mysql.jdbc.Driver");
            Connection n=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
            PreparedStatement s=n.prepareStatement("Select * from D"+IDP+" where Status='P'");
            ResultSet r=s.executeQuery();
            while(r.next())
            {
                String s1=r.getString(3);
                P_box.addItem(s1);
            }
         }catch(Exception t)
         {
             System.out.println(t);
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       new Mail().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TM.setVisible(true);
        TM.setLocation(100,200);
      Leaders_Update.setVisible(false);
        Assign_work.setVisible(false);
         Problems.setVisible(false);
         CW.setVisible(false);
            TM.setBounds(200, 100, 700, 520);       
         try{
      java.util.ArrayList<Integer> k=new java.util.ArrayList();
              javax.swing.table.DefaultTableModel d = (javax.swing.table.DefaultTableModel) Tab3.getModel();
       Class.forName("com.mysql.jdbc.Driver");
           Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root", "");
           Statement x=c.createStatement();
              ResultSet r=x.executeQuery("select * from employee_pro where Project_under='"+s+"'");
          d.setRowCount(0);
          while(r.next())
          {
              int E_ID=r.getInt(1);
              k.add(E_ID);
          }
          Object p[]=k.toArray();
        r.first();
           d.setRowCount(0);
          for (int m=0;m<p.length;m++)
          {        
              r=x.executeQuery("select * from employee where E_ID="+p[m]);
              if(r.next()){
          String E_ID=r.getString(1);
              String Name=r.getString(2);
              String HQ=r.getString(15);              
              String Speciality=r.getString(16);
              d.addRow(new String[] {E_ID,Name,HQ,Speciality});
              }
          }
          Tab3.disable();
          }catch(NumberFormatException | ClassNotFoundException | SQLException e)
      {
          System.out.println(e);
      }    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Assign_work.setVisible(true);
      Leaders_Update.setVisible(false);
      Problems.setVisible(false);
      TM.setVisible(false);
      Assign_work.setBounds(200, 100, 800, 520);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void P_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_boxActionPerformed
     try{
         PB.setText("");
         String sp="",s1="",s2="",s3="";   
         int IDP=Integer.parseInt(ID1.getText());
         String sw=P_box.getSelectedItem().toString().trim();
        
          Class.forName("com.mysql.jdbc.Driver");
           Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root", "");
           Statement x=c.createStatement();
              ResultSet r=x.executeQuery("select * from D"+IDP+" where M_From='"+sw+"' and Status='P'");
             while(r.next())
             {
                 s1=r.getString(1);
                 s3=r.getString(2);
                 
                 s2=r.getString(4);
                 PB.setText(PB.getText()+"\n"+s1+":::: Subject --: "+ s3 +"\n Matter ::"+s2);
             }
     }catch(Exception e)
     {
         System.out.println(e);
     }
    }//GEN-LAST:event_P_boxActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
              try{
      java.util.ArrayList<Integer> k=new java.util.ArrayList();
              javax.swing.table.DefaultTableModel d = (javax.swing.table.DefaultTableModel) Tab2.getModel();
       Class.forName("com.mysql.jdbc.Driver");
           Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root", "");
           Statement x=c.createStatement();
              ResultSet r=x.executeQuery("select * from employee_pro where Project_under='"+s+"'");
          d.setRowCount(0);
          while(r.next())
          {
              int E_ID=r.getInt(1);
              k.add(E_ID);
          }
          Object p[]=k.toArray();
        r.first();
           d.setRowCount(0);
          for (int m=0;m<p.length;m++)
          {        
              r=x.executeQuery("select * from employee where E_ID="+p[m]);
              if(r.next()){
          String E_ID=r.getString(1);
              String Name=r.getString(2);
              d.addRow(new String[] {E_ID,Name});
              }
          }
          
          }catch(NumberFormatException | ClassNotFoundException | SQLException e)
      {
          System.out.println(e);
      }    
            
            
    }//GEN-LAST:event_jButton10ActionPerformed

    private void Tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab2MouseClicked
                 JTable target = (JTable)evt.getSource();
        Object e=   Tab2.getModel().getValueAt(target.getSelectedRow(),0);
        String z=e+"";
        int i=Integer.parseInt(z);
    try{
        Class.forName("com.mysql.jdbc.Driver");
     Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_1","root","");
     Statement x=c.createStatement();
        ResultSet r=x.executeQuery("select * from D"+i+" where Status ='WC'" );
        while(r.next())
        {
            String s1=r.getString(1);
            String s2=r.getString(4);
            WR.setText(s1+":"+s2+"\n"+WR.getText());
        }
    }catch(Exception d)
    {
        System.out.println(d);
    }  
    }//GEN-LAST:event_Tab2MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     Assign_work.setVisible(false);
      Leaders_Update.setVisible(false);
      Problems.setVisible(false);
      TM.setVisible(false);
      CW.setVisible(true);
      CW.setBounds(200, 100, 800, 520);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(DAILY_WORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DAILY_WORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DAILY_WORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DAILY_WORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DAILY_WORK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame Assign_work;
    private javax.swing.JComboBox CD;
    private javax.swing.JComboBox CM;
    private javax.swing.JInternalFrame CW;
    private javax.swing.JComboBox CY;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel ID1;
    private javax.swing.JInternalFrame Leaders_Update;
    private javax.swing.JTextArea PB;
    private javax.swing.JTextField PN;
    private javax.swing.JTextArea PT;
    private javax.swing.JComboBox P_box;
    private javax.swing.JInternalFrame Problems;
    private javax.swing.JInternalFrame TM;
    private javax.swing.JTable Tab1;
    private javax.swing.JTable Tab2;
    private javax.swing.JTable Tab3;
    private javax.swing.JTextArea WR;
    private javax.swing.JTextArea Work;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
