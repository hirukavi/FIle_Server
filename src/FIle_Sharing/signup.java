/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FIle_Sharing;

import javax.swing.JOptionPane;
import model.User;
import dao.Userdao;

public class signup extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mnumberPattern = "^[0-9]*$";
    
    public signup() {
        initComponents();
        btnSave.setEnabled(false);
    }

    public void clear(){
        txtname.setText("");
        txtemail.setText("");
        txtmnumber.setText("");
        txtpassword.setText("");
        btnSave.setEnabled(false);
    }
    
    public void validateFields(){
        String name = txtname.getText();
        String email = txtemail.getText();
        String mnumber = txtmnumber.getText();
        String password = txtpassword.getText();
        if(!name.equals("") && email.matches(emailPattern) && mnumber.matches(mnumberPattern) && mnumber.length() == 10 && !password.equals(""))
            btnSave.setEnabled(true);
        else
            btnSave.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtmnumber = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 111, 159));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("SIGN UP");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 170, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Name :");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("E-mail :");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Mobile No :");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Password :");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        txtname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtname.setPreferredSize(new java.awt.Dimension(350, 25));
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        txtemail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtemail.setPreferredSize(new java.awt.Dimension(350, 25));
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        txtmnumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtmnumber.setPreferredSize(new java.awt.Dimension(350, 25));
        txtmnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmnumberKeyReleased(evt);
            }
        });
        jPanel1.add(txtmnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        txtpassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtpassword.setPreferredSize(new java.awt.Dimension(350, 25));
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(100, 25));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setPreferredSize(new java.awt.Dimension(100, 25));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        btnLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 102, 51));
        btnLogin.setText("Login");
        btnLogin.setPreferredSize(new java.awt.Dimension(100, 25));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       int a = JOptionPane.showConfirmDialog(null, "Do you really want to exit?","Select",JOptionPane.YES_NO_OPTION);
       if(a==0){
           System.exit(0);
       }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        User user = new User();
        user.setName(txtname.getText());
        user.setEmail(txtemail.getText());
        user.setMnumber(txtmnumber.getText());
        user.setPassword(txtpassword.getText());
        Userdao.save(user);
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        validateFields();
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        validateFields();
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtmnumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmnumberKeyReleased
        validateFields();
    }//GEN-LAST:event_txtmnumberKeyReleased

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        validateFields();
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmnumber;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
