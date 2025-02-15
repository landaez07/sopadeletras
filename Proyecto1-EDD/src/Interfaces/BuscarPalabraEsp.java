/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 * La clase {@code BuscarPalabraEsp} representa la ventana de búsqueda de
 * palabras en la sopa de letras utilizando el algoritmo de amplitud, pero solo
 * para palabras en español.
 *
 * @author Chris
 */
public class BuscarPalabraEsp extends javax.swing.JFrame {

    /**
     * La instancia de la ventana de carga de archivos.
     */
    public static Cargar v1;

    /**
     * Crea una nueva instancia de la clase {@code BuscarPalabraEsp}. Inicializa
     * los componentes y configura la ventana.
     *
     * @param v1 la instancia de la ventana de carga
     */
    public BuscarPalabraEsp(Cargar v1) {
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
        botonAtras = new javax.swing.JButton();
        icon2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        textoPalabra = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtras.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonAtras.setText("Atras");
        botonAtras.setActionCommand("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 40));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LupaEspecifica.png"))); // NOI18N
        jPanel1.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 60, 60));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Buscar palabra en específico");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 390, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Escribe la palabra que quieres buscar:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 320, 30));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Para buscar una palabra en especifico en la sopa de letras, se utilizara");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 590, 30));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("el método de búsqueda Breadth First Search (BFS).");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 590, 30));

        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 100, 40));

        textoPalabra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(textoPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 260, 30));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción realizada al presionar el botón "Atras". Oculta la ventana actual
     * y muestra la ventana principal del menú.
     *
     * @param evt el evento de acción
     */
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.setVisible(false);

        Bienvenida b = new Bienvenida();

        Menu menu = new Menu(v1);

        menu.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed
    /**
     * Acción realizada al presionar el botón de búsqueda. Realiza la búsqueda
     * de la palabra ingresada en el campo de texto y muestra un mensaje
     * indicando si la palabra fue encontrada o no.
     *
     * @param evt el evento de acción
     */
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        String palabra = this.textoPalabra.getText().toUpperCase();
        if (palabra.length() > 2) {
            if (v1.grafo.amplitud(palabra)) {
                JOptionPane.showMessageDialog(rootPane, "PALABRA ENCONTRADA");
            } else {
                JOptionPane.showMessageDialog(rootPane, "PALABRA NO ENCONTRADA");

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "LA PALABRA DEBE TENER AL MENOS 3 LETRAS");

        }
    }//GEN-LAST:event_botonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPalabraEsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPalabraEsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPalabraEsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPalabraEsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPalabraEsp(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoPalabra;
    // End of variables declaration//GEN-END:variables
}
