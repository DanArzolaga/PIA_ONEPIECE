/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author bean_
 */
public class Consultas extends javax.swing.JFrame {

    /**
     * Creates new form Consultas
     */
    public Consultas() {
        initComponents();
        
           setSize(1000,565);
        setResizable(false); //con este metodo evitamos que el usuario modifique la dimensiones de la ventana
        setTitle("Consultas");
        setLocationRelativeTo(null);
        
        ImageIcon background = new ImageIcon("src/imagenes/bgConsultas.png");
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

        bttTripulacion = new javax.swing.JButton();
        bttPiratas = new javax.swing.JButton();
        bttRegresar = new javax.swing.JButton();
        lbAnimacion = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttTripulacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bttCTripulacion.png"))); // NOI18N
        bttTripulacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttTripulacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bttCTripulacion.png"))); // NOI18N
        bttTripulacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttTripulacionMouseClicked(evt);
            }
        });
        getContentPane().add(bttTripulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 200, 160));

        bttPiratas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bttCPiratas.png"))); // NOI18N
        bttPiratas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttPiratas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bttCPiratas.png"))); // NOI18N
        bttPiratas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttPiratasMouseClicked(evt);
            }
        });
        getContentPane().add(bttPiratas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 200, 160));

        bttRegresar.setBackground(new java.awt.Color(255, 204, 153));
        bttRegresar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttRegresar.setText("Regresar");
        bttRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(bttRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 160, 40));

        lbAnimacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gfConsultas.gif"))); // NOI18N
        getContentPane().add(lbAnimacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 290, 280, 280));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bgConsultas.png"))); // NOI18N
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
        ConsultaPiratas cp = new ConsultaPiratas();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttPiratasMouseClicked

    private void bttTripulacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttTripulacionMouseClicked
        // TODO add your handling code here:
        ConsultaTripulacion ct = new ConsultaTripulacion();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttTripulacionMouseClicked

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttPiratas;
    private javax.swing.JButton bttRegresar;
    private javax.swing.JButton bttTripulacion;
    private javax.swing.JLabel lbAnimacion;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}