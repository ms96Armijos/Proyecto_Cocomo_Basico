
package GUI;

import cocomo_basico.Calculos;
import cocomo_basico.Comprobaciones;
import cocomo_basico.leerLDC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Steeven Armijos, Jhulissa Villamagua
 */
public class GUI_Cocomo extends javax.swing.JFrame {

    Calculos calculando = new Calculos();
    Comprobaciones comprobaciones = new Comprobaciones();
    /**
     * Se crea una instancia de JFileChooser para poder utilizarla en el
     * combobox
     */
    JFileChooser buscador;
    /**
     * FileNameExtensionFilter nos permite asignar una serie de tipos de
     * archivos que pueda leer este programa, con el fin de solo aceptar
     * archivos provenientes de algún lenguaje de programación
     */
    private FileNameExtensionFilter filtradoDeArchivos = new FileNameExtensionFilter("Formato de archivos", "java",
            "js", "php", "py", "net", "ts", "cpp", "c", "json", "html", "css", "vb", "h");

    int cont, line = 0;

    double constante_a;
    double constante_b;
    double constante_c;
    double constante_d;

    double resultadoEsfuerzo;
    double resultadoTiempoDesarrollo;
    double resultadoTrabajadores;
    double resultadoProductividad;
    double resultadoCostoTotalDelProyecto;

    
    public GUI_Cocomo() {
        initComponents();
        this.setLocation(350, 60);

        flecha_Organico.setEnabled(false);
        flecha_Semiacoplado.setEnabled(false);
        flecha_Empotrado.setEnabled(false);
        cboCostoProyecto.setEnabled(false);
        btnCalcularCOCOMO.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNombre_Proyecto = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnNuevaEstimación = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        rdbOrganico = new javax.swing.JRadioButton();
        rdbsemiacoplado = new javax.swing.JRadioButton();
        rdbempotrado = new javax.swing.JRadioButton();
        flecha_Organico = new javax.swing.JLabel();
        flecha_Semiacoplado = new javax.swing.JLabel();
        flecha_Empotrado = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cbo_KLOC = new javax.swing.JComboBox<>();
        txt_NumeroLineas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEsfuerzo = new javax.swing.JLabel();
        lblTiempoDesarrollo = new javax.swing.JLabel();
        lblesfuer = new javax.swing.JLabel();
        lblesTdesarrollo = new javax.swing.JLabel();
        lblpersonal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblProductividad = new javax.swing.JLabel();
        lblProductividadText = new javax.swing.JLabel();
        lblTrabajadores = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblcostoTotal = new javax.swing.JLabel();
        lblCostoTotalProyecto = new javax.swing.JLabel();
        cboCostoProyecto = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btnCalcularCOCOMO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNombre_Proyecto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre_Proyecto.setForeground(new java.awt.Color(0, 0, 204));
        lblNombre_Proyecto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre_Proyecto.setText("COCOMO 81 O COCOMO BÁSICO");

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        btnNuevaEstimación.setBackground(new java.awt.Color(0, 102, 102));
        btnNuevaEstimación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brush1.png"))); // NOI18N
        btnNuevaEstimación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaEstimaciónActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNuevaEstimación, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(btnNuevaEstimación, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Proyecto a estimar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre_Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombre_Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione el tipo de proyecto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        buttonGroup1.add(rdbOrganico);
        rdbOrganico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbOrganico.setSelected(true);
        rdbOrganico.setText("ORGÁNICO");
        rdbOrganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOrganicoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbsemiacoplado);
        rdbsemiacoplado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbsemiacoplado.setText("SEMIACOPLADO");
        rdbsemiacoplado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbsemiacopladoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbempotrado);
        rdbempotrado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbempotrado.setText("EMPOTRADO");
        rdbempotrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbempotradoActionPerformed(evt);
            }
        });

        flecha_Organico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flecha_Organico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N

        flecha_Semiacoplado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flecha_Semiacoplado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N

        flecha_Empotrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flecha_Empotrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rdbempotrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbsemiacoplado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(rdbOrganico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flecha_Semiacoplado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flecha_Organico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flecha_Empotrado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flecha_Organico, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(rdbOrganico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flecha_Semiacoplado, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(rdbsemiacoplado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flecha_Empotrado, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(rdbempotrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elija cómo subir el archivo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        cbo_KLOC.setBackground(new java.awt.Color(204, 204, 255));
        cbo_KLOC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbo_KLOC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Archivo", "Carpeta" }));
        cbo_KLOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_KLOCActionPerformed(evt);
            }
        });

        txt_NumeroLineas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_NumeroLineas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NumeroLineas.setText("0");
        txt_NumeroLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NumeroLineasActionPerformed(evt);
            }
        });
        txt_NumeroLineas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_NumeroLineasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_NumeroLineasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NumeroLineasKeyTyped(evt);
            }
        });

        jLabel7.setText("LDC Expresadas en miles:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbo_KLOC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_NumeroLineas)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(cbo_KLOC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_NumeroLineas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTIMACIÓN DE RESULTADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Esfuerzo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Tiempo de Desarrollo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Trabajadores:");

        lblEsfuerzo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEsfuerzo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEsfuerzo.setText("0");

        lblTiempoDesarrollo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTiempoDesarrollo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTiempoDesarrollo.setText("0");

        lblesfuer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblesTdesarrollo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblpersonal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Productividad");

        lblProductividad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProductividad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductividad.setText("0");

        lblProductividadText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTrabajadores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTrabajadores.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Costo del Proyecto:");

        lblcostoTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcostoTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblcostoTotal.setText("0");

        lblCostoTotalProyecto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cboCostoProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calcular: ", "LDC", "Salario" }));
        cboCostoProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboCostoProyectoMouseClicked(evt);
            }
        });
        cboCostoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCostoProyectoActionPerformed(evt);
            }
        });
        cboCostoProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cboCostoProyectoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProductividad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(lblTrabajadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTiempoDesarrollo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEsfuerzo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcostoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblesfuer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblesTdesarrollo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpersonal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProductividadText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCostoTotalProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboCostoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblesfuer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEsfuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblesTdesarrollo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTiempoDesarrollo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductividadText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProductividad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCostoTotalProyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblcostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cboCostoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calcular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        btnCalcularCOCOMO.setBackground(new java.awt.Color(0, 102, 102));
        btnCalcularCOCOMO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcularCOCOMO.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularCOCOMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/processing.png"))); // NOI18N
        btnCalcularCOCOMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCOCOMOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCalcularCOCOMO, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnCalcularCOCOMO, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaEstimaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaEstimaciónActionPerformed

        /**
        * Deshabilitando los botones para nueva estimación
        */
        btnCalcularCOCOMO.setEnabled(false);
        flecha_Organico.setEnabled(false);
        flecha_Semiacoplado.setEnabled(false);
        flecha_Empotrado.setEnabled(false);
        cboCostoProyecto.setEnabled(false);
        /**
        * Limpiando las etiquetas y campos de texto
        */
        txt_NumeroLineas.setText("0");
        lblProductividadText.setText("");
        lblEsfuerzo.setText("");
        lblTiempoDesarrollo.setText("");
        lblTrabajadores.setText("");
        lblProductividad.setText("");
        lblpersonal.setText("");
        lblesTdesarrollo.setText("");
        lblesfuer.setText("");
        lblcostoTotal.setText("");
        lblCostoTotalProyecto.setText("");
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cont=0;
        line=0;
    }//GEN-LAST:event_btnNuevaEstimaciónActionPerformed

    private void rdbOrganicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOrganicoActionPerformed
        // TODO add your handling code here:
        if (Double.parseDouble(txt_NumeroLineas.getText().toString()) >= 1000) {
            if (rdbOrganico.isSelected() == true) {
                //JOptionPane.showMessageDialog(null, "Carpeta: " + rdbOrganico.getText().toString());
                btnCalcularCOCOMO.setEnabled(true);
                constante_a = 2.4;
                constante_b = 1.05;
                constante_c = 2.50;
                constante_d = 0.38;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se requiere líneas de código");
        }
    }//GEN-LAST:event_rdbOrganicoActionPerformed

    private void rdbsemiacopladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbsemiacopladoActionPerformed
        // TODO add your handling code here:
        if (Double.parseDouble(txt_NumeroLineas.getText().toString()) >= 1000) {
            if (rdbsemiacoplado.isSelected() == true) {
                //JOptionPane.showMessageDialog(null, "Carpeta: " + rdbsemiacoplado.getText().toString());
                btnCalcularCOCOMO.setEnabled(true);
                constante_a = 3.0;
                constante_b = 1.12;
                constante_c = 2.50;
                constante_d = 0.35;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se requiere más líneas de código");
        }
    }//GEN-LAST:event_rdbsemiacopladoActionPerformed

    private void rdbempotradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbempotradoActionPerformed
        // TODO add your handling code here:
        if (Double.parseDouble(txt_NumeroLineas.getText().toString()) >= 1000) {
            if (rdbempotrado.isSelected() == true) {
                //JOptionPane.showMessageDialog(null, "Carpeta: " + rdbempotrado.getText().toString());
                btnCalcularCOCOMO.setEnabled(true);
                constante_a = 3.6;
                constante_b = 1.20;
                constante_c = 2.50;
                constante_d = 0.32;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se requiere más líneas de código");
        }
    }//GEN-LAST:event_rdbempotradoActionPerformed

    private void cbo_KLOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_KLOCActionPerformed

        buscador = new JFileChooser();//INICIALIZAR EL JFileChooser
        /**
        * SE CAPTURA EL ITEM SELECCIONADO EN EL COMBOBOX
        */
        String seleccionado = cbo_KLOC.getSelectedItem().toString();

        /**
        * MEDIANTE UN SWITCH REALIZAMOS QUE SE BUSQUE YA SEA UN ARCHIVO O UNA
        * CARPETA QUE CONTIENE LOS ARQUIVOS Y CONTAR LAS LÍNEAS DE CÓDIGO
        */
        switch (seleccionado) {

            /**
            * EN EL PRIMER CASO SE PROCEDERÁ A BUSCAR POR ARCHIVOS
            */
            case "Archivo":

            //JOptionPane.showMessageDialog(null, "Archivo: " + seleccionado);
            buscador.setFileFilter(filtradoDeArchivos);

            if (buscador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                try {
                    String UbicacionArchivo = buscador.getSelectedFile().getAbsolutePath();

                    leerLDC TipoDeLecturaDeArchivos = new leerLDC();

                    int LineasContadas = TipoDeLecturaDeArchivos.leerPorArchivos(UbicacionArchivo);

                    line += LineasContadas;
                    txt_NumeroLineas.setText("" + (line));

                    comprobaciones.TipoDeProyecto(line, flecha_Organico, flecha_Semiacoplado, flecha_Empotrado);
                } catch (FileNotFoundException ex) {

                } catch (IOException ex) {

                }
            } else {
                System.out.println("Se canceló la búsqueda");
            }
            break;
            /**
            * EN EL SEGUNDO CASO SE PROCEDERÁ A BUSCAR POR CARPETAS
            */
            case "Carpeta":
            //JOptionPane.showMessageDialog(null, "Carpeta: " + seleccionado);
            buscador.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            if (buscador.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                leerLDC TipoDeLecturaDeArchivos = new leerLDC();
                try {
                    File folderFile = new File(buscador.getSelectedFile().toString());
                    int LineasContadas = TipoDeLecturaDeArchivos.leerProyectoCompleto(folderFile);
                    line += LineasContadas;
                    txt_NumeroLineas.setText("" + (line));

                    comprobaciones.TipoDeProyecto(line, flecha_Organico, flecha_Semiacoplado, flecha_Empotrado);
                } catch (IOException ex) {

                }
            } else {
                System.out.println("Se canceló la búsqueda");
            }
            break;
        }
    }//GEN-LAST:event_cbo_KLOCActionPerformed

    private void txt_NumeroLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NumeroLineasActionPerformed

    }//GEN-LAST:event_txt_NumeroLineasActionPerformed

    private void txt_NumeroLineasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NumeroLineasKeyPressed

    }//GEN-LAST:event_txt_NumeroLineasKeyPressed

    private void txt_NumeroLineasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NumeroLineasKeyReleased

    }//GEN-LAST:event_txt_NumeroLineasKeyReleased

    private void txt_NumeroLineasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NumeroLineasKeyTyped

        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
            || (caracter > '9'))
        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
        evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txt_NumeroLineasKeyTyped

    private void cboCostoProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboCostoProyectoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCostoProyectoMouseClicked

    private void cboCostoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCostoProyectoActionPerformed

        DecimalFormat redondearSalario = new DecimalFormat("#.00");
        String seleccionado = cboCostoProyecto.getSelectedItem().toString();

        switch (seleccionado) {
            case "Salario":
            /**
            * CALCULANDO EL COSTO TOTAL DEL PROYECTO
            */
            resultadoCostoTotalDelProyecto = 0;

            double SalarioCapturado = comprobaciones.ValidadPeticionSueldo();

            //Se obtiene el costo total del proyecto por SALARIO sin sumar los imprevistos
            double ResultadoSalarioCalculado = calculando.CostoTotalProyectoPorSalario(
                Double.parseDouble(lblTrabajadores.getText().toString().replace(",", ".")),
                SalarioCapturado, Double.parseDouble(lblTiempoDesarrollo.getText().toString().replace(",", ".")));
            //calculamos el costo de imprevistos y lo guardamos en la variable
            //para poder sumarla al costo total
            double CalcularImprevistosSalario = calculando.CalculoDeImprevistos(ResultadoSalarioCalculado);

            //se suma ambos costos para imprimir en pantalla
            resultadoCostoTotalDelProyecto = ResultadoSalarioCalculado + CalcularImprevistosSalario;

            System.out.println("Sin AUM resultadoCostoTotalDelProyectoSalario: " + ResultadoSalarioCalculado);
            System.out.println("resultadoCostoTotalDelProyectoSalario: " + resultadoCostoTotalDelProyecto);
            lblcostoTotal.setText(redondearSalario.format(resultadoCostoTotalDelProyecto));
            lblCostoTotalProyecto.setText(" Dólares");
            break;
            case "LDC":
            resultadoCostoTotalDelProyecto = 0;
            /**
            * CALCULANDO EL COSTO TOTAL DEL PROYECTO
            */
            //Se obtiene el costo total del proyecto por LDC sin sumar los imprevistos
            double ResultadoLDCCalculado = calculando.CostoProyectoPorLDC(Double.parseDouble(txt_NumeroLineas.getText().toString()), Double.parseDouble(lblProductividad.getText().toString().replace(",", ".")));
            //calculamos el costo de imprevistos y lo guardamos en la variable
            //para poder sumarla al costo total
            double CalcularImprevistosLDC = calculando.CalculoDeImprevistos(ResultadoLDCCalculado);

            //se suma ambos costos para imprimir en pantalla
            resultadoCostoTotalDelProyecto = ResultadoLDCCalculado + CalcularImprevistosLDC;
            //                System.out.println("sin AUM resultadoCostoTotalDelProyectoLDC: " + ResultadoLDCCalculado);
            //                System.out.println("resultadoCostoTotalDelProyectoSalario: " + resultadoCostoTotalDelProyecto);

            lblcostoTotal.setText(redondearSalario.format(resultadoCostoTotalDelProyecto));
            lblCostoTotalProyecto.setText(" Dólares");
            break;
        }
    }//GEN-LAST:event_cboCostoProyectoActionPerformed

    private void cboCostoProyectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboCostoProyectoKeyTyped

    }//GEN-LAST:event_cboCostoProyectoKeyTyped

    private void btnCalcularCOCOMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCOCOMOActionPerformed

        if (Double.parseDouble(txt_NumeroLineas.getText().toString()) >= 1000) {
            DecimalFormat redondearEsfuerzo = new DecimalFormat("#.00");
            DecimalFormat redondearTiempoDesarrollo = new DecimalFormat("#.0");
            DecimalFormat redondearTrabajadores = new DecimalFormat("#");

            /**
            * CALCULANDO EL ESFUERZO
            */
            resultadoEsfuerzo = calculando.Esfuerzo(constante_a, Double.parseDouble(txt_NumeroLineas.getText().toString()), constante_b);

            System.out.println("resultadoEsfuerzo: " + resultadoEsfuerzo);
            lblEsfuerzo.setText(redondearEsfuerzo.format(resultadoEsfuerzo));
            lblesfuer.setText("Esfuerzo nominal en persona-mes");

            /**
            * CALCULANDO EL TIEMPO DE DESARROLLO
            */
            resultadoTiempoDesarrollo = calculando.TiempoDeDesarrollo(constante_c, resultadoEsfuerzo, constante_d);
            System.out.println("resultadoTiempoDesarrollo: " + resultadoTiempoDesarrollo);
            lblTiempoDesarrollo.setText(redondearTiempoDesarrollo.format(resultadoTiempoDesarrollo));
            lblesTdesarrollo.setText("Meses");

            /**
            * CALCULANDO EL NÚMERO DE TRABAJADORES
            */
            resultadoTrabajadores = calculando.Personal(resultadoEsfuerzo, resultadoTiempoDesarrollo);
            System.out.println("resultadoTrabajadores: " + resultadoTrabajadores);
            lblTrabajadores.setText(redondearTrabajadores.format(resultadoTrabajadores));
            lblpersonal.setText("Personas en el proyecto");

            /**
            * CALCULANDO LA PRODUCTIVIDAD
            */
            resultadoProductividad = calculando.Personal(Double.parseDouble(txt_NumeroLineas.getText().toString()), resultadoEsfuerzo);
            System.out.println("resultadoProductividad: " + resultadoProductividad);
            lblProductividad.setText(redondearTrabajadores.format(resultadoProductividad));
            lblProductividadText.setText("Líneas de código por persona");

            cboCostoProyecto.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Se requiere más líneas de código");
        }
        btnCalcularCOCOMO.setEnabled(false);

    }//GEN-LAST:event_btnCalcularCOCOMOActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Cocomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Cocomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Cocomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Cocomo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Cocomo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularCOCOMO;
    private javax.swing.JButton btnNuevaEstimación;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboCostoProyecto;
    private javax.swing.JComboBox<String> cbo_KLOC;
    private javax.swing.JLabel flecha_Empotrado;
    private javax.swing.JLabel flecha_Organico;
    private javax.swing.JLabel flecha_Semiacoplado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblCostoTotalProyecto;
    private javax.swing.JLabel lblEsfuerzo;
    public static javax.swing.JLabel lblNombre_Proyecto;
    private javax.swing.JLabel lblProductividad;
    private javax.swing.JLabel lblProductividadText;
    private javax.swing.JLabel lblTiempoDesarrollo;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel lblcostoTotal;
    private javax.swing.JLabel lblesTdesarrollo;
    private javax.swing.JLabel lblesfuer;
    private javax.swing.JLabel lblpersonal;
    private javax.swing.JRadioButton rdbOrganico;
    private javax.swing.JRadioButton rdbempotrado;
    private javax.swing.JRadioButton rdbsemiacoplado;
    private javax.swing.JTextField txt_NumeroLineas;
    // End of variables declaration//GEN-END:variables
}
