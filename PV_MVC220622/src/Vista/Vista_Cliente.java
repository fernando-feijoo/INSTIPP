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

        btng_grupoOpciones = new javax.swing.ButtonGroup();
        jp_contenedor = new javax.swing.JPanel();
        jp_titulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jp_botonSalir = new javax.swing.JPanel();
        lbl_botonSalir = new javax.swing.JLabel();
        jp_contenedorOpciones = new javax.swing.JPanel();
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
        jp_botonActualizar = new javax.swing.JPanel();
        lbl_botonActualizar = new javax.swing.JLabel();
        jp_botonEliminar = new javax.swing.JPanel();
        lbl_botonEliminar = new javax.swing.JLabel();
        jp_botonGuardar = new javax.swing.JPanel();
        lbl_botonGuardar = new javax.swing.JLabel();
        jp_contenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_tablaClientes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txf_buscar = new javax.swing.JTextField();
        jrb_nombres = new javax.swing.JRadioButton();
        jrb_identificacion = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(904, 715));
        setMinimumSize(new java.awt.Dimension(904, 715));
        setPreferredSize(new java.awt.Dimension(904, 715));

        jp_titulo.setPreferredSize(new java.awt.Dimension(767, 80));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Datos del Cliente");

        jp_botonSalir.setBackground(new java.awt.Color(204, 204, 204));
        jp_botonSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jp_botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_botonSalir.setMaximumSize(new java.awt.Dimension(130, 36));
        jp_botonSalir.setPreferredSize(new java.awt.Dimension(130, 36));

        lbl_botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        lbl_botonSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/logout_24px.png"))); // NOI18N
        lbl_botonSalir.setText("SALIR");
        lbl_botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_botonSalir.setMaximumSize(new java.awt.Dimension(74, 36));
        lbl_botonSalir.setMinimumSize(new java.awt.Dimension(74, 36));
        lbl_botonSalir.setPreferredSize(new java.awt.Dimension(74, 36));

        javax.swing.GroupLayout jp_botonSalirLayout = new javax.swing.GroupLayout(jp_botonSalir);
        jp_botonSalir.setLayout(jp_botonSalirLayout);
        jp_botonSalirLayout.setHorizontalGroup(
            jp_botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        jp_botonSalirLayout.setVerticalGroup(
            jp_botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_tituloLayout = new javax.swing.GroupLayout(jp_titulo);
        jp_titulo.setLayout(jp_tituloLayout);
        jp_tituloLayout.setHorizontalGroup(
            jp_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_tituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_tituloLayout.setVerticalGroup(
            jp_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_tituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jp_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombres: *");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("N° identifiación: *");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Tpo de cliente: *");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Estado Civil:");

        txf_nombresCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txf_numeroIdentificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Tipo de identificación: *");

        cb_tipoIdentificacion.setBackground(new java.awt.Color(255, 255, 255));
        cb_tipoIdentificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_tipoIdentificacion.setForeground(new java.awt.Color(0, 0, 0));
        cb_tipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓" }));

        cb_tipoCliente.setBackground(new java.awt.Color(255, 255, 255));
        cb_tipoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_tipoCliente.setForeground(new java.awt.Color(0, 0, 0));
        cb_tipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓" }));

        cb_estadoCivil.setBackground(new java.awt.Color(255, 255, 255));
        cb_estadoCivil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_estadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        cb_estadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓", "SOLTERO/A", "CASADO/A", "DIVORCIADO/A", "UNION LIBRE" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Sexo:");

        cb_sexo.setBackground(new java.awt.Color(255, 255, 255));
        cb_sexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_sexo.setForeground(new java.awt.Color(0, 0, 0));
        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓", "H", "M" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Estado: *");

        cb_estado.setBackground(new java.awt.Color(255, 255, 255));
        cb_estado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_estado.setForeground(new java.awt.Color(0, 0, 0));
        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓", "A", "I" }));

        jp_botonActualizar.setBackground(new java.awt.Color(204, 204, 204));
        jp_botonActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jp_botonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_botonActualizar.setMaximumSize(new java.awt.Dimension(138, 36));
        jp_botonActualizar.setPreferredSize(new java.awt.Dimension(138, 36));

        lbl_botonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_botonActualizar.setForeground(new java.awt.Color(0, 0, 0));
        lbl_botonActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/refresh_24px.png"))); // NOI18N
        lbl_botonActualizar.setText("ACTUALIZAR");
        lbl_botonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_botonActualizarLayout = new javax.swing.GroupLayout(jp_botonActualizar);
        jp_botonActualizar.setLayout(jp_botonActualizarLayout);
        jp_botonActualizarLayout.setHorizontalGroup(
            jp_botonActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_botonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );
        jp_botonActualizarLayout.setVerticalGroup(
            jp_botonActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_botonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jp_botonEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jp_botonEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jp_botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_botonEliminar.setMaximumSize(new java.awt.Dimension(138, 36));
        jp_botonEliminar.setPreferredSize(new java.awt.Dimension(138, 36));

        lbl_botonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_botonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        lbl_botonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/trash_24px.png"))); // NOI18N
        lbl_botonEliminar.setText("ELIMINAR");
        lbl_botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_botonEliminar.setMaximumSize(new java.awt.Dimension(101, 40));
        lbl_botonEliminar.setMinimumSize(new java.awt.Dimension(101, 40));
        lbl_botonEliminar.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout jp_botonEliminarLayout = new javax.swing.GroupLayout(jp_botonEliminar);
        jp_botonEliminar.setLayout(jp_botonEliminarLayout);
        jp_botonEliminarLayout.setHorizontalGroup(
            jp_botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );
        jp_botonEliminarLayout.setVerticalGroup(
            jp_botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
        );

        jp_botonGuardar.setBackground(new java.awt.Color(204, 204, 204));
        jp_botonGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jp_botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_botonGuardar.setMaximumSize(new java.awt.Dimension(138, 36));
        jp_botonGuardar.setPreferredSize(new java.awt.Dimension(138, 36));

        lbl_botonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_botonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        lbl_botonGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/save_24px.png"))); // NOI18N
        lbl_botonGuardar.setText("GUARDAR");
        lbl_botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_botonGuardar.setMaximumSize(new java.awt.Dimension(104, 40));
        lbl_botonGuardar.setMinimumSize(new java.awt.Dimension(104, 40));
        lbl_botonGuardar.setPreferredSize(new java.awt.Dimension(104, 40));

        javax.swing.GroupLayout jp_botonGuardarLayout = new javax.swing.GroupLayout(jp_botonGuardar);
        jp_botonGuardar.setLayout(jp_botonGuardarLayout);
        jp_botonGuardarLayout.setHorizontalGroup(
            jp_botonGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_botonGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );
        jp_botonGuardarLayout.setVerticalGroup(
            jp_botonGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jp_contenedorOpcionesLayout = new javax.swing.GroupLayout(jp_contenedorOpciones);
        jp_contenedorOpciones.setLayout(jp_contenedorOpcionesLayout);
        jp_contenedorOpcionesLayout.setHorizontalGroup(
            jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
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
                            .addComponent(cb_tipoIdentificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorOpcionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jp_botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jp_botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jp_botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jp_botonActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jp_botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jp_botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jScrollPane1.setMinimumSize(new java.awt.Dimension(882, 250));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(882, 250));

        jtb_tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtb_tablaClientes);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Listado de Clientes");

        jLabel9.setText("Buscar:");

        jrb_nombres.setText("Nombres");

        jrb_identificacion.setText("N° identificación");

        javax.swing.GroupLayout jp_contenedorTablaLayout = new javax.swing.GroupLayout(jp_contenedorTabla);
        jp_contenedorTabla.setLayout(jp_contenedorTablaLayout);
        jp_contenedorTablaLayout.setHorizontalGroup(
            jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_contenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_nombres)
                .addGap(44, 44, 44)
                .addComponent(jrb_identificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_contenedorTablaLayout.setVerticalGroup(
            jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorTablaLayout.createSequentialGroup()
                .addGroup(jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jrb_nombres)
                    .addComponent(jrb_identificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jp_contenedorLayout = new javax.swing.GroupLayout(jp_contenedor);
        jp_contenedor.setLayout(jp_contenedorLayout);
        jp_contenedorLayout.setHorizontalGroup(
            jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(jp_contenedorLayout.createSequentialGroup()
                        .addGroup(jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_contenedorOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jp_contenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
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
    public javax.swing.ButtonGroup btng_grupoOpciones;
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
    public javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel jp_botonActualizar;
    public javax.swing.JPanel jp_botonEliminar;
    public javax.swing.JPanel jp_botonGuardar;
    public javax.swing.JPanel jp_botonSalir;
    public javax.swing.JPanel jp_contenedor;
    public javax.swing.JPanel jp_contenedorOpciones;
    public javax.swing.JPanel jp_contenedorTabla;
    public javax.swing.JPanel jp_titulo;
    public javax.swing.JRadioButton jrb_identificacion;
    public javax.swing.JRadioButton jrb_nombres;
    public javax.swing.JTable jtb_tablaClientes;
    public javax.swing.JLabel lbl_botonActualizar;
    public javax.swing.JLabel lbl_botonEliminar;
    public javax.swing.JLabel lbl_botonGuardar;
    public javax.swing.JLabel lbl_botonSalir;
    public javax.swing.JLabel lbl_titulo;
    public javax.swing.JTextField txf_buscar;
    public javax.swing.JTextField txf_nombresCliente;
    public javax.swing.JTextField txf_numeroIdentificacion;
    // End of variables declaration//GEN-END:variables
}
