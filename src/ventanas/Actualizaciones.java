/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import ventanas.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author bean_
 */
public class Actualizaciones extends javax.swing.JFrame {

    /**
     * Creates new form Actualizadores
     */
    public Actualizaciones() {
        initComponents();
        
        initComponents();
        setSize(1000,563);
        setResizable(false); //con este metodo evitamos que el usuario modifique la dimensiones de la ventana
        setTitle("Actualizacion");
        setLocationRelativeTo(null);
        
        ImageIcon background = new ImageIcon("src/imagenes/bgActualizacion.png");
        Icon icono = new ImageIcon(background.getImage().getScaledInstance(lbBackground.getWidth(), lbBackground.getHeight(), Image.SCALE_DEFAULT));
        lbBackground.setIcon(icono);
        this.repaint(); //esta linea es para confirmar que se vea el jLabel de fondo
        
        //Imagen para icono
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image lcono_pantalla = toolkit.getImage("src/imagenes/icono.png");
        setIconImage(lcono_pantalla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttRegresar = new javax.swing.JButton();
        bttPiratasT = new javax.swing.JButton();
        bttTripulacion = new javax.swing.JButton();
        bttPiratas = new javax.swing.JButton();
        bttFrutasU = new javax.swing.JButton();
        bttFrutas = new javax.swing.JButton();
        lbAnimacion = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 565));
        setSize(new java.awt.Dimension(1000, 565));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttRegresar.setBackground(new java.awt.Color(102, 102, 255));
        bttRegresar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttRegresar.setText("Regresar");
        bttRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(bttRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 160, 40));

        bttPiratasT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bttPiratasT.png"))); // NOI18N
        bttPiratasT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttPiratasT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttPiratasTMouseClicked(evt);
            }
        });
        getContentPane().add(bttPiratasT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 120, 110));

        bttTripulacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bttATripulacion.png"))); // NOI18N
        bttTripulacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttTripulacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttTripulacionMouseClicked(evt);
            }
        });
        getContentPane().add(bttTripulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 120, 110));

        bttPiratas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bttAPiratas.png"))); // NOI18N
        bttPiratas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttPiratas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttPiratasMouseClicked(evt);
            }
        });
        getContentPane().add(bttPiratas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, 110));

        bttFrutasU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bttFrutasU.png"))); // NOI18N
        bttFrutasU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttFrutasU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttFrutasUMouseClicked(evt);
            }
        });
        getContentPane().add(bttFrutasU, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 120, 110));

        bttFrutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bttAFrutas.png"))); // NOI18N
        bttFrutas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttFrutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttFrutasMouseClicked(evt);
            }
        });
        getContentPane().add(bttFrutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 120, 110));

        lbAnimacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gfActualizaciones.gif"))); // NOI18N
        getContentPane().add(lbAnimacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 380, 280));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bgActualizacion.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttRegresarMouseClicked
        // TODO add your handling code here:
        Inicio ini = new Inicio();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttRegresarMouseClicked

    private void bttPiratasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttPiratasMouseClicked
        // TODO add your handling code here:
        ActualizarPiratas ap = new ActualizarPiratas();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttPiratasMouseClicked

    private void bttPiratasTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttPiratasTMouseClicked
        // TODO add your handling code here:
        ActualizarPiratasT apt = new ActualizarPiratasT();
        apt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttPiratasTMouseClicked

    private void bttTripulacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttTripulacionMouseClicked
        // TODO add your handling code here:
        ActualizarTripulacion at = new ActualizarTripulacion();
        at.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttTripulacionMouseClicked

    private void bttFrutasUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttFrutasUMouseClicked
        // TODO add your handling code here:
        ActualizarFrutasU aft = new ActualizarFrutasU();
        aft.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttFrutasUMouseClicked

    private void bttFrutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttFrutasMouseClicked
        // TODO add your handling code here:
        ActualizarFrutas af = new ActualizarFrutas();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttFrutasMouseClicked

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
            java.util.logging.Logger.getLogger(Actualizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttFrutas;
    private javax.swing.JButton bttFrutasU;
    private javax.swing.JButton bttPiratas;
    private javax.swing.JButton bttPiratasT;
    private javax.swing.JButton bttRegresar;
    private javax.swing.JButton bttTripulacion;
    private javax.swing.JLabel lbAnimacion;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
