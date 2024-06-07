/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Chris
 */
public class Bienvenida extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenida
     */
    public Bienvenida() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonSig = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Checkmark = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        SopaDeLetras = new javax.swing.JLabel();
        Flecha = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSig.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonSig.setText("Siguiente");
        botonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSigActionPerformed(evt);
            }
        });
        jPanel1.add(botonSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 120, 40));

        Titulo.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 255));
        Titulo.setText("Bienvenido");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Christian Rodríguez");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 170, 30));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Presiona el botón para continuar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 290, 30));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("y las palabras a buscar.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 570, 30));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Pedro Landaez");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 130, 30));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Este programa tiene como funcionalidad resolver una sopa de letras");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 570, 30));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("dado un archivo de texto que contenga las letras que la conforman");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 570, 30));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Integrantes:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 110, 30));

        Checkmark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Checkmark.png"))); // NOI18N
        jPanel1.add(Checkmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 30, 30));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 60, 60));

        SopaDeLetras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SopaDeLetras.png"))); // NOI18N
        jPanel1.add(SopaDeLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 230, 230));

        Flecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flecha.png"))); // NOI18N
        jPanel1.add(Flecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 120, 91));

        background.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        background.setText(".");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSigActionPerformed
        JOptionPane.showMessageDialog(null, "Debes de cargar una sopa de letras antes de comenzar el programa!");
        
        this.setVisible(false);
        
        Bienvenida b = new Bienvenida();
        
        Menu menu = new Menu(b);
        
        Cargar cargar = new Cargar(menu);
        
        cargar.setVisible(true);
        
    }//GEN-LAST:event_botonSigActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Checkmark;
    private javax.swing.JLabel Flecha;
    private javax.swing.JLabel SopaDeLetras;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel background;
    private javax.swing.JButton botonSig;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
