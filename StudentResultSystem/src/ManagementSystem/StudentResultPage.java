/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagementSystem;

import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author anand
 */
public class StudentResultPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultPage
     */
    public StudentResultPage() {
        initComponents();
    }
    public StudentResultPage(String rollNo) {
        initComponents();
        jTextField1.setText(rollNo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        jLabel17.setIcon(new javax.swing.ImageIcon("D:\\Accio\\NetBens\\StudentResultSystem\\src\\ManagementSystem\\schoolPic2.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Roll No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 110, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Branch");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Course");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 110, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 110, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 110, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 110, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 110, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Total Marks");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Passing Marks");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Marks Obtained");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setText("Physics-1");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setText("Mathematics-1");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("Mechanical");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setText("Chemistry-1");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel14.setText("Electrical");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField7.setText("100");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 40, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField8.setText("100");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 40, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField9.setText("100");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 40, -1));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField10.setText("100");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 40, -1));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField11.setText("100");
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 40, -1));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField12.setText("40");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 30, -1));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField13.setText("40");
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 30, -1));

        jTextField14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField14.setText("40");
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 30, -1));

        jTextField15.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField15.setText("40");
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 30, -1));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField16.setText("40");
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 30, -1));

        jTextField17.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 50, -1));

        jTextField18.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 50, -1));

        jTextField19.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 50, -1));

        jTextField20.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 50, -1));

        jTextField21.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 50, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setText("Verdict");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 60, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("Total");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 50, -1));

        jTextField22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 520, 90, -1));

        jTextField23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 90, -1));

        Back.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon("D:\\Accio\\NetBens\\StudentResultSystem\\src\\ManagementSystem\\icons8-cancel-24.png")); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, -1, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\Accio\\NetBens\\StudentResultSystem\\src\\ManagementSystem\\schoolPic2.png")); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        int flag = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit this page ...", "exit", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            setVisible(false);
            StudentHome frame = new StudentHome();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_BackActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollNo = jTextField1.getText();
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("SELECT * FROM student INNER JOIN result WHERE student.rollNo='"+rollNo+"' AND result.rollNo='"+rollNo+"'");
            if(!rs.first()){
                JOptionPane.showMessageDialog(null,"RollNo. doesn't exist ");
            }
            else{
//                Collecting Information table to show this pages; 
                
                jTextField2.setText(rs.getString(1));
                jTextField3.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
                jTextField5.setText(rs.getString(3));
                jTextField6.setText(rs.getString(6));
                
  //  presenting all marks coresponding the coloumn to popout the table to page
                
                jTextField17.setText(rs.getString(8));
                jTextField18.setText(rs.getString(9));
                jTextField19.setText(rs.getString(10));
                jTextField20.setText(rs.getString(11));
                jTextField21.setText(rs.getString(12));
// Presenting Total Marks               
                
               jTextField23.setText(rs.getString(13));
//  presenting all marks coresponding the coloumn to popout the table to store integer value to check <40 or not             
               int m1 = Integer.parseInt(rs.getString(8));
               int m2 = Integer.parseInt(rs.getString(9));
               int m3 = Integer.parseInt(rs.getString(10));
               int m4 = Integer.parseInt(rs.getString(11));
               int m5 = Integer.parseInt(rs.getString(12));
               
//Predicting the marks               

               if(m1<40 || m2<40 || m3<40 || m4<40 || m5<40){
                    jTextField22.setText("Fail");
                }
                else{
                    jTextField22.setText("Pass");
                }
//               no one edit any thing after showing the result
               
               jTextField1.setEditable(false);
               jTextField2.setEditable(false);
               jTextField3.setEditable(false);
               jTextField4.setEditable(false);
               jTextField5.setEditable(false);
               jTextField6.setEditable(false);
               jTextField7.setEditable(false);
               jTextField8.setEditable(false);
               jTextField9.setEditable(false);
               jTextField10.setEditable(false);
               jTextField11.setEditable(false);
               jTextField12.setEditable(false);
               jTextField13.setEditable(false);
               jTextField14.setEditable(false);
               jTextField15.setEditable(false);
               jTextField16.setEditable(false);
               jTextField17.setEditable(false);
               jTextField18.setEditable(false);
               jTextField19.setEditable(false);
               jTextField20.setEditable(false);
               jTextField21.setEditable(false);
               jTextField22.setEditable(false);
               jTextField23.setEditable(false);
               
               
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
