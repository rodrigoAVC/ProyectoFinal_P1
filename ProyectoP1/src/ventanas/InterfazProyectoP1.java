
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;

public class InterfazProyectoP1 extends javax.swing.JFrame {

    public InterfazProyectoP1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon_logo.png"));
        return retValue;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExit = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jLabelBattle_Logo = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExit.setBackground(new java.awt.Color(0, 153, 153));
        jButtonExit.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(153, 0, 0));
        jButtonExit.setText("Salida");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jButtonNext.setBackground(new java.awt.Color(0, 153, 153));
        jButtonNext.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButtonNext.setForeground(new java.awt.Color(153, 0, 0));
        jButtonNext.setText("N E X T");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 250, 50));

        jLabelBattle_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/battle_logo.png"))); // NOI18N
        jLabelBattle_Logo.setMaximumSize(new java.awt.Dimension(100, 150));
        jLabelBattle_Logo.setMinimumSize(new java.awt.Dimension(100, 150));
        jLabelBattle_Logo.setPreferredSize(new java.awt.Dimension(100, 150));
        getContentPane().add(jLabelBattle_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 390, 320));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background.jpg"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1022, 567));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed

        Ventana2_ProyectoP1 main = new Ventana2_ProyectoP1();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonNextActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazProyectoP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazProyectoP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazProyectoP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazProyectoP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazProyectoP1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelBattle_Logo;
    // End of variables declaration//GEN-END:variables
}
