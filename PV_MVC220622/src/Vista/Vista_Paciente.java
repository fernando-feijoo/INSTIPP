/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Fabricio F. Feijoo
 */
public class Vista_Paciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_PacienteCanino
     */
    public Vista_Paciente() {
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

        jp_contenedorGeneral = new javax.swing.JPanel();
        jp_contenedor = new javax.swing.JPanel();
        jp_contenedorTitulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jp_botonSalir = new javax.swing.JPanel();
        lbl_botonSalir = new javax.swing.JLabel();
        jp_contenedorOpciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_nombre = new javax.swing.JTextField();
        txf_edad = new javax.swing.JTextField();
        txf_color = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txf_raza = new javax.swing.JTextField();
        txf_fechaNacimiento = new javax.swing.JTextField();
        cb_especie = new javax.swing.JComboBox<>();
        cb_sexo = new javax.swing.JComboBox<>();
        jp_botonGuardar = new javax.swing.JPanel();
        lbl_botonGuardar = new javax.swing.JLabel();
        jp_botonActualizar = new javax.swing.JPanel();
        lbl_botonActualizar = new javax.swing.JLabel();
        jp_botonEliminar = new javax.swing.JPanel();
        lbl_botonEliminar = new javax.swing.JLabel();
        lbl_nombreIncorrecto = new javax.swing.JLabel();
        lbl_edadIncorrecta = new javax.swing.JLabel();
        lbl_fechaNacimientoIncorrecta = new javax.swing.JLabel();
        jp_contenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_tablaPacientes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txf_buscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(904, 715));
        setMinimumSize(new java.awt.Dimension(904, 715));
        setPreferredSize(new java.awt.Dimension(904, 715));

        jp_contenedorGeneral.setMaximumSize(new java.awt.Dimension(904, 694));
        jp_contenedorGeneral.setMinimumSize(new java.awt.Dimension(904, 694));
        jp_contenedorGeneral.setPreferredSize(new java.awt.Dimension(904, 694));

        jp_contenedorTitulo.setPreferredSize(new java.awt.Dimension(754, 80));

        lbl_titulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Datos del Paciente");

        jp_botonSalir.setBackground(new java.awt.Color(204, 204, 204));
        jp_botonSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jp_botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_botonSalir.setMaximumSize(new java.awt.Dimension(130, 36));
        jp_botonSalir.setPreferredSize(new java.awt.Dimension(130, 36));

        lbl_botonSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
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

        javax.swing.GroupLayout jp_contenedorTituloLayout = new javax.swing.GroupLayout(jp_contenedorTitulo);
        jp_contenedorTitulo.setLayout(jp_contenedorTituloLayout);
        jp_contenedorTituloLayout.setHorizontalGroup(
            jp_contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_contenedorTituloLayout.setVerticalGroup(
            jp_contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jp_contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_contenedorOpciones.setPreferredSize(new java.awt.Dimension(827, 277));
        jp_contenedorOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel1.setText("Nombre: *");
        jp_contenedorOpciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel2.setText("Edad: *");
        jp_contenedorOpciones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 69, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel3.setText("Especie: *");
        jp_contenedorOpciones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 114, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel4.setText("Color: *");
        jp_contenedorOpciones.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 159, -1, -1));

        txf_nombre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jp_contenedorOpciones.add(txf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 25, 667, -1));

        txf_edad.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jp_contenedorOpciones.add(txf_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 70, 135, -1));

        txf_color.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jp_contenedorOpciones.add(txf_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 160, 135, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel5.setText("Sexo: *");
        jp_contenedorOpciones.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 69, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel6.setText("Raza: *");
        jp_contenedorOpciones.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 111, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel7.setText("Fecha de Nac. : *");
        jp_contenedorOpciones.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 159, -1, -1));

        txf_raza.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jp_contenedorOpciones.add(txf_raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 114, 251, -1));

        txf_fechaNacimiento.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jp_contenedorOpciones.add(txf_fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 160, 251, -1));

        cb_especie.setBackground(new java.awt.Color(255, 255, 255));
        cb_especie.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cb_especie.setForeground(new java.awt.Color(0, 0, 0));
        cb_especie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opción" }));
        jp_contenedorOpciones.add(cb_especie, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 115, 135, -1));

        cb_sexo.setBackground(new java.awt.Color(255, 255, 255));
        cb_sexo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cb_sexo.setForeground(new java.awt.Color(0, 0, 0));
        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opción", "M", "H" }));
        jp_contenedorOpciones.add(cb_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 70, 251, -1));

        jp_botonGuardar.setBackground(new java.awt.Color(204, 204, 204));
        jp_botonGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jp_botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_botonGuardar.setMaximumSize(new java.awt.Dimension(138, 36));
        jp_botonGuardar.setPreferredSize(new java.awt.Dimension(138, 36));

        lbl_botonGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
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
            .addGroup(jp_botonGuardarLayout.createSequentialGroup()
                .addComponent(lbl_botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jp_contenedorOpciones.add(jp_botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 226, -1, -1));

        jp_botonActualizar.setBackground(new java.awt.Color(204, 204, 204));
        jp_botonActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jp_botonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_botonActualizar.setMaximumSize(new java.awt.Dimension(138, 36));
        jp_botonActualizar.setPreferredSize(new java.awt.Dimension(138, 36));

        lbl_botonActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
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
            .addComponent(lbl_botonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jp_contenedorOpciones.add(jp_botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 226, -1, -1));

        jp_botonEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jp_botonEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jp_botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_botonEliminar.setMaximumSize(new java.awt.Dimension(138, 36));
        jp_botonEliminar.setPreferredSize(new java.awt.Dimension(138, 36));

        lbl_botonEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
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

        jp_contenedorOpciones.add(jp_botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 226, -1, -1));

        lbl_nombreIncorrecto.setFont(new java.awt.Font("Roboto Medium", 0, 9)); // NOI18N
        lbl_nombreIncorrecto.setForeground(new java.awt.Color(255, 0, 0));
        lbl_nombreIncorrecto.setText("* Ingreso de datos incorrectos, solo ingresar letras.");
        jp_contenedorOpciones.add(lbl_nombreIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 52, -1, -1));

        lbl_edadIncorrecta.setFont(new java.awt.Font("Roboto Medium", 0, 9)); // NOI18N
        lbl_edadIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        lbl_edadIncorrecta.setText("* Ingreso de datos incorrectos, solo ingresar numeros.");
        jp_contenedorOpciones.add(lbl_edadIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 98, -1, -1));

        lbl_fechaNacimientoIncorrecta.setFont(new java.awt.Font("Roboto Medium", 0, 9)); // NOI18N
        lbl_fechaNacimientoIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        lbl_fechaNacimientoIncorrecta.setText("* Ingreso de datos incorrectos, usar -  para separar fechas.");
        jp_contenedorOpciones.add(lbl_fechaNacimientoIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 189, -1, -1));

        jp_contenedorTabla.setPreferredSize(new java.awt.Dimension(680, 276));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(882, 250));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(882, 250));

        jtb_tablaPacientes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtb_tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtb_tablaPacientes);

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setText("Buscar:");

        txf_buscar.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Listado de Pacientes");

        javax.swing.GroupLayout jp_contenedorTablaLayout = new javax.swing.GroupLayout(jp_contenedorTabla);
        jp_contenedorTabla.setLayout(jp_contenedorTablaLayout);
        jp_contenedorTablaLayout.setHorizontalGroup(
            jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_contenedorTablaLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_contenedorTablaLayout.setVerticalGroup(
            jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorTablaLayout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jp_contenedorLayout = new javax.swing.GroupLayout(jp_contenedor);
        jp_contenedor.setLayout(jp_contenedorLayout);
        jp_contenedorLayout.setHorizontalGroup(
            jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_contenedorOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_contenedorLayout.createSequentialGroup()
                        .addComponent(jp_contenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jp_contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)))
        );
        jp_contenedorLayout.setVerticalGroup(
            jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_contenedorOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_contenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_contenedorGeneralLayout = new javax.swing.GroupLayout(jp_contenedorGeneral);
        jp_contenedorGeneral.setLayout(jp_contenedorGeneralLayout);
        jp_contenedorGeneralLayout.setHorizontalGroup(
            jp_contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jp_contenedorGeneralLayout.setVerticalGroup(
            jp_contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorGeneralLayout.createSequentialGroup()
                .addComponent(jp_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 904, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp_contenedorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp_contenedorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cb_especie;
    public javax.swing.JComboBox<String> cb_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel jp_botonActualizar;
    public javax.swing.JPanel jp_botonEliminar;
    public javax.swing.JPanel jp_botonGuardar;
    public javax.swing.JPanel jp_botonSalir;
    private javax.swing.JPanel jp_contenedor;
    private javax.swing.JPanel jp_contenedorGeneral;
    private javax.swing.JPanel jp_contenedorOpciones;
    private javax.swing.JPanel jp_contenedorTabla;
    private javax.swing.JPanel jp_contenedorTitulo;
    public javax.swing.JTable jtb_tablaPacientes;
    private javax.swing.JLabel lbl_botonActualizar;
    private javax.swing.JLabel lbl_botonEliminar;
    private javax.swing.JLabel lbl_botonGuardar;
    private javax.swing.JLabel lbl_botonSalir;
    public javax.swing.JLabel lbl_edadIncorrecta;
    public javax.swing.JLabel lbl_fechaNacimientoIncorrecta;
    public javax.swing.JLabel lbl_nombreIncorrecto;
    private javax.swing.JLabel lbl_titulo;
    public javax.swing.JTextField txf_buscar;
    public javax.swing.JTextField txf_color;
    public javax.swing.JTextField txf_edad;
    public javax.swing.JTextField txf_fechaNacimiento;
    public javax.swing.JTextField txf_nombre;
    public javax.swing.JTextField txf_raza;
    // End of variables declaration//GEN-END:variables
}
