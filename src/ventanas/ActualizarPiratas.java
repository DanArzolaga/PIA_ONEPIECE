
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author bean_
 */
public class ActualizarPiratas extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarPiratas
     */
    public ActualizarPiratas() {
        initComponents();
        
           setSize(1000,565);
        setResizable(false); //con este metodo evitamos que el usuario modifique la dimensiones de la ventana
        setTitle("Actualizar Piratas");
        setLocationRelativeTo(null);
        
        ImageIcon background = new ImageIcon("src/imagenes/bgAPiratas.png");
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

        bttActualizar = new javax.swing.JButton();
        bttRegresar = new javax.swing.JButton();
        txtFecNac = new javax.swing.JFormattedTextField();
        lbFecNac = new javax.swing.JLabel();
        lbRecompensa = new javax.swing.JLabel();
        txtRecompensa = new javax.swing.JTextField();
        rbShichibukaiN = new javax.swing.JRadioButton();
        rbEmperadorN = new javax.swing.JRadioButton();
        rbShichibukaiS = new javax.swing.JRadioButton();
        rbEmperadorS = new javax.swing.JRadioButton();
        lbEmperador = new javax.swing.JLabel();
        lbShichibukai = new javax.swing.JLabel();
        cbEstatus = new javax.swing.JComboBox<>();
        lbEstatus = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lbEstado = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtIdPirata = new javax.swing.JTextField();
        lbIDPirata = new javax.swing.JLabel();
        bttBuscar = new javax.swing.JButton();
        lbAnimacion = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttActualizar.setBackground(new java.awt.Color(255, 51, 51));
        bttActualizar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttActualizar.setText("Actualizar");
        getContentPane().add(bttActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 120, 30));

        bttRegresar.setBackground(new java.awt.Color(255, 51, 51));
        bttRegresar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttRegresar.setText("Regresar");
        bttRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(bttRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 120, 30));
        getContentPane().add(txtFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 180, -1));

        lbFecNac.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbFecNac.setText("Fecha de Nacimiento:");
        getContentPane().add(lbFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 170, 20));

        lbRecompensa.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbRecompensa.setText("Recompensa:");
        getContentPane().add(lbRecompensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 100, 20));
        getContentPane().add(txtRecompensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 190, -1));

        rbShichibukaiN.setText("No");
        getContentPane().add(rbShichibukaiN, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        rbEmperadorN.setText("No");
        getContentPane().add(rbEmperadorN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        rbShichibukaiS.setText("Si");
        getContentPane().add(rbShichibukaiS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        rbEmperadorS.setText("Si");
        getContentPane().add(rbEmperadorS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        lbEmperador.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbEmperador.setText("Emperador:");
        getContentPane().add(lbEmperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 90, 20));

        lbShichibukai.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbShichibukai.setText("Shichibukai: ");
        getContentPane().add(lbShichibukai, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 100, 20));

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 110, -1));

        lbEstatus.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbEstatus.setText("Estatus:");
        getContentPane().add(lbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 70, 20));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vivo", "Muerto" }));
        getContentPane().add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 110, -1));

        lbEstado.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbEstado.setText("Estado:");
        getContentPane().add(lbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 60, 20));

        lbNombre.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbNombre.setText("Nombre:");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 70, 20));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 190, 20));

        txtIdPirata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPirataActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdPirata, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, 20));

        lbIDPirata.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        lbIDPirata.setText("IdPirata:");
        getContentPane().add(lbIDPirata, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 70, 20));

        bttBuscar.setBackground(new java.awt.Color(255, 51, 51));
        bttBuscar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        bttBuscar.setText("Buscar");
        getContentPane().add(bttBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 120, 30));

        lbAnimacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bgAPiratas.gif"))); // NOI18N
        getContentPane().add(lbAnimacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 250, 230));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bgAPiratas.png"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarPiratas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarPiratas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarPiratas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarPiratas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarPiratas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttActualizar;
    private javax.swing.JButton bttBuscar;
    private javax.swing.JButton bttRegresar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JLabel lbAnimacion;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbEmperador;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbEstatus;
    private javax.swing.JLabel lbFecNac;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbIDPirata;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRecompensa;
    private javax.swing.JLabel lbShichibukai;
    private javax.swing.JRadioButton rbEmperadorN;
    private javax.swing.JRadioButton rbEmperadorS;
    private javax.swing.JRadioButton rbShichibukaiN;
    private javax.swing.JRadioButton rbShichibukaiS;
    private javax.swing.JFormattedTextField txtFecNac;
    private javax.swing.JTextField txtIdPirata;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRecompensa;
    // End of variables declaration//GEN-END:variables
}
