
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Steeven Armijos, Jhulissa Villamagua
 */
public class GUI_PantallaInicial extends javax.swing.JFrame {


    public GUI_PantallaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 646, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(204, 255, 204));
        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tap.png"))); // NOI18N
        btnIniciar.setText("CLIC PARA CONTINUAR");
        btnIniciar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 240, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pantalla6.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        //Jinternal_Cocomo81 c = new Jinternal_Cocomo81();
        String nombreProyecto = JOptionPane.showInputDialog("introduce el nombre del proyecto");
        
        if ((nombreProyecto != null) && (nombreProyecto.length() > 0)) {
            this.dispose();
            GUI_MenuOpciones form = new GUI_MenuOpciones();
            form.toFront();
            GUI_MenuOpciones.lblContenedorName.setText(nombreProyecto.toUpperCase());
            form.setVisible(true);

        } else {

            JOptionPane.showMessageDialog(null, "Se debe ingresar el nombre del proyecto");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PantallaInicial().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
