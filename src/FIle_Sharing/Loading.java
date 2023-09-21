/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FIle_Sharing;

public class Loading extends javax.swing.JFrame {

    public Loading() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        pBar = new javax.swing.JProgressBar();
        loadingValue = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(102, 0, 102));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        backgroundPanel.add(pBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 860, 10));

        loadingValue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loadingValue.setForeground(new java.awt.Color(255, 255, 255));
        loadingValue.setText("0%");
        backgroundPanel.add(loadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 30, 20));

        loading.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Loading....");
        backgroundPanel.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 70, 20));
        backgroundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 550, -1));

        jLabel1.setBackground(new java.awt.Color(102, 0, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to File Server System");
        backgroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 370, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/12.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        backgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        Loading load = new Loading();
        load.setVisible(true);
        
        Login login = new Login();
        try{
            for(int i=0;i<100;i++){
                Thread.sleep(60);
                load.pBar.setValue(i);
            }
        }
        catch(Exception e){
            
        }
        load.setVisible(false);
        login.setVisible(true);
        
        load.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel loading;
    private javax.swing.JLabel loadingValue;
    private javax.swing.JProgressBar pBar;
    // End of variables declaration//GEN-END:variables
}
