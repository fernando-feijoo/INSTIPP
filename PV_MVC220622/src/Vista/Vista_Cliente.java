/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Fabricio F. Feijoo
 */
public class Vista_Cliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_PacienteCanino
     */
    public Vista_Cliente() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_contenedor = new javax.swing.JPanel();
        jp_titulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jp_contenedorOpciones = new javax.swing.JPanel();
        btn_salir = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_nombresCliente = new javax.swing.JTextField();
        txf_numeroIdentificacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_tipoIdentificacion = new javax.swing.JComboBox<>();
        cb_tipoCliente = new javax.swing.JComboBox<>();
        cb_estadoCivil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cb_sexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cb_estado = new javax.swing.JComboBox<>();
        jp_contenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(851, 655));
        setMinimumSize(new java.awt.Dimension(851, 655));
        setPreferredSize(new java.awt.Dimension(851, 655));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Datos del Cliente");

        javax.swing.GroupLayout jp_tituloLayout = new javax.swing.GroupLayout(jp_titulo);
        jp_titulo.setLayout(jp_tituloLayout);
        jp_tituloLayout.setHorizontalGroup(
            jp_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_tituloLayout.setVerticalGroup(
            jp_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_salir.setBackground(new java.awt.Color(204, 204, 204));
        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(102, 102, 102));
        btn_salir.setText("Salir");
        btn_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_guardar.setBackground(new java.awt.Color(204, 204, 204));
        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombres:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("N° identifiación:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Tpo de cliente:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Estado Civil:");

        txf_nombresCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txf_numeroIdentificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Tipo de identificación:");

        cb_tipoIdentificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_tipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓" }));

        cb_tipoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_tipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓" }));

        cb_estadoCivil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_estadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Sexo:");

        cb_sexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Estado:");

        cb_estado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓" }));

        javax.swing.GroupLayout jp_contenedorOpcionesLayout = new javax.swing.GroupLayout(jp_contenedorOpciones);
        jp_contenedorOpciones.setLayout(jp_contenedorOpcionesLayout);
        jp_contenedorOpcionesLayout.setHorizontalGroup(
            jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_contenedorOpcionesLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(12, 12, 12)
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txf_nombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                                        .addComponent(txf_numeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cb_estadoCivil, javax.swing.GroupLayout.Alignment.LEADING, 0, 177, Short.MAX_VALUE)
                                            .addComponent(cb_tipoCliente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cb_tipoIdentificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jp_contenedorOpcionesLayout.setVerticalGroup(
            jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorOpcionesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txf_nombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_numeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cb_tipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_tipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir)
                    .addComponent(btn_guardar))
                .addGap(24, 24, 24))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Listado de Clientes");

        javax.swing.GroupLayout jp_contenedorTablaLayout = new javax.swing.GroupLayout(jp_contenedorTabla);
        jp_contenedorTabla.setLayout(jp_contenedorTablaLayout);
        jp_contenedorTablaLayout.setHorizontalGroup(
            jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jp_contenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_contenedorTablaLayout.setVerticalGroup(
            jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorTablaLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jp_contenedorLayout = new javax.swing.GroupLayout(jp_contenedor);
        jp_contenedor.setLayout(jp_contenedorLayout);
        jp_contenedorLayout.setHorizontalGroup(
            jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_contenedorOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_contenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_contenedorLayout.setVerticalGroup(
            jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_contenedorOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_contenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_guardar;
    public javax.swing.JButton btn_salir;
    public javax.swing.JComboBox<String> cb_estado;
    public javax.swing.JComboBox<String> cb_estadoCivil;
    public javax.swing.JComboBox<String> cb_sexo;
    public javax.swing.JComboBox<String> cb_tipoCliente;
    public javax.swing.JComboBox<String> cb_tipoIdentificacion;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JPanel jp_contenedor;
    public javax.swing.JPanel jp_contenedorOpciones;
    public javax.swing.JPanel jp_contenedorTabla;
    public javax.swing.JPanel jp_titulo;
    public javax.swing.JLabel lbl_titulo;
    public javax.swing.JTextField txf_nombresCliente;
    public javax.swing.JTextField txf_numeroIdentificacion;
    // End of variables declaration//GEN-END:variables
}
