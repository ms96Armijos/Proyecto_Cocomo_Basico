package GUI;

/**
 *
 * @author Steeven Armijos, Jhulissa Villamagua
 */
public class Jframe_Contenedor extends javax.swing.JFrame {

    String nombreProyecto;

    Jinternal_Cocomo81 Cocomo81;
    Jinternal_informacion Informacion;

    public Jframe_Contenedor() {
        initComponents();
        lblContenedorName.setVisible(false);
        //inicializo la instancia
        Cocomo81 = new Jinternal_Cocomo81();
        /**
         * Definimos el tamaño máximo del Jframe para que abarque todo el tamaño
         * de la pantalla
         */
        this.setExtendedState(MAXIMIZED_BOTH);
        /**
         * Dentro del Desktop Pane (escritorio) se agrega el objeto instanciado
         * del JinternalFrame para que pueda aparecer dentro o que lo contenga
         */
        escritorio.add(Cocomo81);
        /**
         * Finalemente se lo muestra dentro del Desktop Pane y se visualiza en
         * pantalla
         */
        Cocomo81.show();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblContenedorName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_Inicio = new javax.swing.JMenu();
        menu_Informacion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblContenedorName.setForeground(new java.awt.Color(255, 255, 51));
        lblContenedorName.setText("jLabel1");

        escritorio.setLayer(lblContenedorName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblContenedorName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(699, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblContenedorName)
                .addContainerGap(509, Short.MAX_VALUE))
        );

        menu_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/project.png"))); // NOI18N
        menu_Inicio.setText("COCOMO81");
        menu_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_InicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_Inicio);

        menu_Informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        menu_Informacion.setText("INFORMACIÓN");
        menu_Informacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_InformacionMouseClicked(evt);
            }
        });
        menu_Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_InformacionActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_Informacion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_InformacionActionPerformed

    }//GEN-LAST:event_menu_InformacionActionPerformed

    private void menu_InformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_InformacionMouseClicked
        /**
         * Se cierra el Jinternalframe Cocomo81 y se inicializa el
         * Jinternalframe informacion
         */
        nombreProyecto = lblContenedorName.getText().toString();
        Informacion = new Jinternal_informacion();
        if (Cocomo81.isShowing()) {
            Cocomo81.dispose();
        }
        escritorio.add(Informacion);
        Informacion.show();


    }//GEN-LAST:event_menu_InformacionMouseClicked

    private void menu_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_InicioMouseClicked

        nombreProyecto = lblContenedorName.getText().toString();
        Cocomo81 = new Jinternal_Cocomo81();
        if (Informacion.isShowing()) {
            Informacion.dispose();
        }
        escritorio.add(Cocomo81);
        Jinternal_Cocomo81.lblNombre_Proyecto.setText(nombreProyecto);
        Cocomo81.show();
    }//GEN-LAST:event_menu_InicioMouseClicked

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
            java.util.logging.Logger.getLogger(Jframe_Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_Contenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JLabel lblContenedorName;
    private javax.swing.JMenu menu_Informacion;
    private javax.swing.JMenu menu_Inicio;
    // End of variables declaration//GEN-END:variables
}
