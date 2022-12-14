/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rui
 */
public class Ventana4_ProyectoP1 extends javax.swing.JFrame {

    ArrayList<Personaje> personajes = new ArrayList<Personaje>();

    public static Personaje[][] array() {
        Personaje[][] array = new Personaje[1][2];
        return array;
    }

    public void add() {
        personajes.add(new Personaje("Santana", 1000.00, 150.00, 300.00, 250.00, "aire"));
        personajes.add(new Personaje("Aquamen", 1000.00, 100.00, 400.00, 150.00, "agua"));
        personajes.add(new Personaje("Fire Stick", 1000.00, 200.00, 170.00, 300.00, "fuego"));
        personajes.add(new Personaje("Joker", 1000.00, 170.00, 350.00, 120.00, "aire"));
        personajes.add(new Personaje("Lancer", 1000.00, 250.00, 200.00, 100.00, "tierra"));
    }

    public Ventana4_ProyectoP1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon_logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEnter = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelTextElemento = new javax.swing.JLabel();
        jLabelTextAtaque3 = new javax.swing.JLabel();
        jLabelTextAtaque2 = new javax.swing.JLabel();
        jLabelTextAtaque1 = new javax.swing.JLabel();
        jLabelTextNombre = new javax.swing.JLabel();
        jLabelText = new javax.swing.JLabel();
        jTextFieldAtaque2 = new javax.swing.JTextField();
        jTextFieldAtaque1 = new javax.swing.JTextField();
        jTextFieldAtaque3 = new javax.swing.JTextField();
        jTextFieldElemento = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEnter.setBackground(new java.awt.Color(204, 255, 255));
        jButtonEnter.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jButtonEnter.setForeground(new java.awt.Color(153, 0, 0));
        jButtonEnter.setText("L I S T O");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 760, -1));

        jButtonExit.setBackground(new java.awt.Color(0, 153, 153));
        jButtonExit.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(153, 0, 0));
        jButtonExit.setText("Salida");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        jLabelTextElemento.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabelTextElemento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextElemento.setText("Elemento:");
        getContentPane().add(jLabelTextElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 130, 30));

        jLabelTextAtaque3.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabelTextAtaque3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextAtaque3.setText("Ataque 3:");
        getContentPane().add(jLabelTextAtaque3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 30));

        jLabelTextAtaque2.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabelTextAtaque2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextAtaque2.setText("Ataque 2:");
        getContentPane().add(jLabelTextAtaque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, 30));

        jLabelTextAtaque1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabelTextAtaque1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextAtaque1.setText("Ataque 1:");
        getContentPane().add(jLabelTextAtaque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, 30));

        jLabelTextNombre.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabelTextNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextNombre.setText("Nombre:");
        getContentPane().add(jLabelTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 30));

        jLabelText.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabelText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelText.setText("Crea a tu personaje:");
        getContentPane().add(jLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 260, 30));

        jTextFieldAtaque2.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldAtaque2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jTextFieldAtaque2.setForeground(new java.awt.Color(153, 0, 0));
        jTextFieldAtaque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAtaque2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAtaque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 610, -1));

        jTextFieldAtaque1.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldAtaque1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jTextFieldAtaque1.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jTextFieldAtaque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 610, -1));

        jTextFieldAtaque3.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldAtaque3.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jTextFieldAtaque3.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jTextFieldAtaque3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 610, -1));

        jTextFieldElemento.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldElemento.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jTextFieldElemento.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jTextFieldElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 610, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldNombre.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 610, -1));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background.jpg"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1022, 567));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldAtaque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAtaque2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAtaque2ActionPerformed

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        boolean ataque1Vali = true;
        boolean ataque2Vali = true;
        boolean ataque3Vali = true;
        boolean elementoVali = true;
        String nombre = jTextFieldNombre.getText();
        String ataque1 = jTextFieldAtaque1.getText();
        String ataque2 = jTextFieldAtaque2.getText();
        String ataque3 = jTextFieldAtaque3.getText();
        String elemento = jTextFieldElemento.getText();
        String elemento2 = elemento.toLowerCase();
        /*for (int i = 0; i < ataque1.length(); i++) {
            int caracter = (int) ataque1.charAt(i);
            if (caracter != 48 || caracter != 49 || caracter != 50 || caracter != 51 || caracter != 52 || caracter != 53 || caracter != 54 || caracter != 55 || caracter != 56 || caracter != 57 || caracter != 46 || caracter != 0 || caracter != 1 || caracter != 2 || caracter != 3 || caracter != 4 || caracter != 5 || caracter != 6 || caracter != 7 || caracter != 8 || caracter != 9) {
                ataque1Vali = false;
            }
        }
        for (int i = 0; i < ataque2.length(); i++) {
            int caracter = (int) ataque2.charAt(i);
            if (caracter != 48 || caracter != 49 || caracter != 50 || caracter != 51 || caracter != 52 || caracter != 53 || caracter != 54 || caracter != 55 || caracter != 56 || caracter != 57 || caracter != 46 || caracter != 0 || caracter != 1 || caracter != 2 || caracter != 3 || caracter != 4 || caracter != 5 || caracter != 6 || caracter != 7 || caracter != 8 || caracter != 9) {
                ataque2Vali = false;
            }
        }
        for (int i = 0; i < ataque3.length(); i++) {
            int caracter = (int) ataque3.charAt(i);
            if (caracter != 48 || caracter != 49 || caracter != 50 || caracter != 51 || caracter != 52 || caracter != 53 || caracter != 54 || caracter != 55 || caracter != 56 || caracter != 57 || caracter != 46 || caracter != 0 || caracter != 1 || caracter != 2 || caracter != 3 || caracter != 4 || caracter != 5 || caracter != 6 || caracter != 7 || caracter != 8 || caracter != 9) {
                ataque3Vali = false;
            }
        } 
        switch (elemento2) {
            case "agua":
            case "aire":
            case "tierra":
            case "fuego":
                elementoVali = true;
            default:
                elementoVali = false;
        }*/
        if (elemento2.equalsIgnoreCase("agua") || elemento2.equalsIgnoreCase("fuego") || elemento2.equalsIgnoreCase("aire") || elemento2.equalsIgnoreCase("tierra")) {
            elementoVali = true;
        } else {
            elementoVali = false;
        }
        if (ataque1Vali == false || ataque2Vali == false || ataque3Vali == false) {
            JOptionPane.showMessageDialog(null, "Solo se pueden poner numeros", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (elementoVali == false) {
            JOptionPane.showMessageDialog(null, "Solo se pueden cuatro elementos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        double ataque11 = Double.parseDouble(ataque1);
        double ataque22 = Double.parseDouble(ataque1);
        double ataque33 = Double.parseDouble(ataque1);
        if (ataque1Vali == true && ataque2Vali == true && ataque3Vali == true && elementoVali == true) {
            personajes.add(new Personaje(nombre, 1000.00, ataque11, ataque22, ataque33, elemento));
            Ventana5_ProyectoP1 ventana5 = new Ventana5_ProyectoP1();
            ventana5.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonEnterActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana3_ProyectoP11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3_ProyectoP11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3_ProyectoP11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3_ProyectoP11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3_ProyectoP11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelText;
    private javax.swing.JLabel jLabelTextAtaque1;
    private javax.swing.JLabel jLabelTextAtaque2;
    private javax.swing.JLabel jLabelTextAtaque3;
    private javax.swing.JLabel jLabelTextElemento;
    private javax.swing.JLabel jLabelTextNombre;
    private javax.swing.JTextField jTextFieldAtaque1;
    private javax.swing.JTextField jTextFieldAtaque2;
    private javax.swing.JTextField jTextFieldAtaque3;
    private javax.swing.JTextField jTextFieldElemento;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}