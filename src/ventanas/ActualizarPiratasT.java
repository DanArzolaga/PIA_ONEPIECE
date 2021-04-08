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
public class ActualizarPiratasT extends javax.swing.JFrame {

    /**
     * Creates new form PiratasTripulacion
     */
    public ActualizarPiratasT() {
        initComponents();
        
          setSize(1000,565);
        setResizable(false); //con este metodo evitamos que el usuario modifique la dimensiones de la ventana
        setTitle("Piratas con Tripulacion");
        setLocationRelativeTo(null);
        
        ImageIcon background = new ImageIcon("src/imagenes/bgPiratasT.png");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bttActualizar = new javax.swing.JButton();
        bttRegresar = new javax.swing.JButton();
        bttBuscar = new javax.swing.JButton();
        txtIdPirata = new javax.swing.JTextField();
        lbIDPirata = new javax.swing.JLabel();
        lbAnimacion = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "idTripulacion", "Activo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 300, 220));

        bttActualizar.setBackground(new java.awt.Color(255, 204, 102));
        bttActualizar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttActualizar.setText("Actualizar");
        getContentPane().add(bttActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 120, 30));

        bttRegresar.setBackground(new java.awt.Color(255, 204, 102));
        bttRegresar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttRegresar.setText("Regresar");
        bttRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(bttRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 120, 30));

        bttBuscar.setBackground(new java.awt.Color(255, 204, 102));
        bttBuscar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttBuscar.setText("Buscar");
        getContentPane().add(bttBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 163, 120, 30));

        txtIdPirata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPirataActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdPirata, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 140, 20));

        lbIDPirata.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbIDPirata.setText("IdPirata:");
        getContentPane().add(lbIDPirata, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 70, 20));

        lbAnimacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gfPiratasT.gif"))); // NOI18N
        getContentPane().add(lbAnimacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 330, 310));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bgPiratasT.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPirataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPirataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPirataActionPerformed

    private void bttRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttRegresarMouseClicked
        // TODO add your handling code here:
        Actualizaciones act = new Actualizaciones();
        act.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttRegresarMouseClicked

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
            java.util.logging.Logger.getLogger(ActualizarPiratasT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarPiratasT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarPiratasT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarPiratasT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarPiratasT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttActualizar;
    private javax.swing.JButton bttBuscar;
    private javax.swing.JButton bttRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbAnimacion;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbIDPirata;
    private javax.swing.JTextField txtIdPirata;
    // End of variables declaration//GEN-END:variables
}