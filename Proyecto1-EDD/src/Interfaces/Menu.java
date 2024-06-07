/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Chris
 */
public class Menu extends javax.swing.JFrame {

    public static Bienvenida v1;

    /**
     * Creates new form Menu
     */
    public Menu(Bienvenida v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
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
        botonCargar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonBuscarEsp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Añadir = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        Titulo3 = new javax.swing.JLabel();
        Titulo4 = new javax.swing.JLabel();
        Titulo5 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCargar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 90, 40));

        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 100, 40));

        botonBuscarEsp.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonBuscarEsp.setText("Buscar");
        botonBuscarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarEspActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscarEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 100, 40));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Selecciona una opción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 250, 30));

        Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Añadir.png"))); // NOI18N
        jPanel1.add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 30, 30));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Archivo.png"))); // NOI18N
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 60, 60));

        Titulo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 255));
        Titulo.setText("Buscar palabra");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        Titulo1.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(51, 51, 255));
        Titulo1.setText("Menú principal");
        jPanel1.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        Titulo2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(51, 51, 255));
        Titulo2.setText("Cargar");
        jPanel1.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        Titulo3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(51, 51, 255));
        Titulo3.setText("Buscar palabras:");
        jPanel1.add(Titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        Titulo4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo4.setForeground(new java.awt.Color(51, 51, 255));
        Titulo4.setText("en específico:");
        jPanel1.add(Titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        Titulo5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo5.setForeground(new java.awt.Color(51, 51, 255));
        Titulo5.setText("diccionario:");
        jPanel1.add(Titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LupaEspecifica.png"))); // NOI18N
        jPanel1.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 60, 60));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 60, 60));

        background.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        background.setText(".");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        this.setVisible(false);

        Cargar cargar = new Cargar(this);

        cargar.setVisible(true);
    }//GEN-LAST:event_botonCargarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        this.setVisible(false);

        BuscarPalabra buscar = new BuscarPalabra(this);

        buscar.setVisible(true);
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonBuscarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarEspActionPerformed
       this.setVisible(false);
       
       BuscarPalabraEsp buscarEsp = new BuscarPalabraEsp(this);
       
       buscarEsp.setVisible(true);
    }//GEN-LAST:event_botonBuscarEspActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Añadir;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel Titulo4;
    private javax.swing.JLabel Titulo5;
    private javax.swing.JLabel background;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonBuscarEsp;
    private javax.swing.JButton botonCargar;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
