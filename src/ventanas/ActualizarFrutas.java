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
public class ActualizarFrutas extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarFrutas
     */
    public ActualizarFrutas() {
        initComponents();
        
         setSize(1000,565);
        setResizable(false); //con este metodo evitamos que el usuario modifique la dimensiones de la ventana
        setTitle("Actualizar Frutas");
        setLocationRelativeTo(null);
        
        ImageIcon background = new ImageIcon("src/imagenes/bgAFrutas.png");
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
        bttActualizar = new javax.swing.JButton();
        bttBuscar = new javax.swing.JButton();
        cbTipoFruta = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtSignificado = new javax.swing.JTextField();
        txtPoder = new javax.swing.JTextField();
        txtIdFruta = new javax.swing.JTextField();
        lbPoder = new javax.swing.JLabel();
        lbSignificado = new javax.swing.JLabel();
        lbTipoFruta = new javax.swing.JLabel();
        lbIdFruta = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbAnimacion = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttRegresar.setBackground(new java.awt.Color(204, 102, 255));
        bttRegresar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttRegresar.setText("Regresar");
        bttRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(bttRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 120, 30));

        bttActualizar.setBackground(new java.awt.Color(204, 102, 255));
        bttActualizar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttActualizar.setText("Actualizar");
        getContentPane().add(bttActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 120, 30));

        bttBuscar.setBackground(new java.awt.Color(204, 102, 255));
        bttBuscar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttBuscar.setText("Buscar");
        getContentPane().add(bttBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 100, 30));

        cbTipoFruta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zoan", "Paramecia", "Logia", "Artificial" }));
        getContentPane().add(cbTipoFruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 140, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 260, -1));
        getContentPane().add(txtSignificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 240, -1));
        getContentPane().add(txtPoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 270, -1));
        getContentPane().add(txtIdFruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 160, -1));

        lbPoder.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbPoder.setText("Poder:");
        getContentPane().add(lbPoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 60, 20));

        lbSignificado.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbSignificado.setText("Significado:");
        getContentPane().add(lbSignificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 90, 30));

        lbTipoFruta.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbTipoFruta.setText("Tipo de Fruta:");
        getContentPane().add(lbTipoFruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 110, 30));

        lbIdFruta.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbIdFruta.setText("IdFruta:");
        getContentPane().add(lbIdFruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 70, 20));

        lbNombre.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbNombre.setText("Nombre:");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 20));

        lbAnimacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gfAFrutas.gif"))); // NOI18N
        getContentPane().add(lbAnimacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 360, 300, 250));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bgAFrutas.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ActualizarFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarFrutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttActualizar;
    private javax.swing.JButton bttBuscar;
    private javax.swing.JButton bttRegresar;
    private javax.swing.JComboBox<String> cbTipoFruta;
    private javax.swing.JLabel lbAnimacion;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbIdFruta;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPoder;
    private javax.swing.JLabel lbSignificado;
    private javax.swing.JLabel lbTipoFruta;
    private javax.swing.JTextField txtIdFruta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoder;
    private javax.swing.JTextField txtSignificado;
    // End of variables declaration//GEN-END:variables
}