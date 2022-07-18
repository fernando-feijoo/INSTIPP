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
        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        cb_especie = new javax.swing.JComboBox<>();
        cb_sexo = new javax.swing.JComboBox<>();
        jp_contenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_tablaPacientes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txf_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_seleccionarFila = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(904, 715));
        setMinimumSize(new java.awt.Dimension(904, 715));
        setPreferredSize(new java.awt.Dimension(904, 715));

        jp_contenedorGeneral.setMaximumSize(new java.awt.Dimension(904, 694));
        jp_contenedorGeneral.setMinimumSize(new java.awt.Dimension(904, 694));
        jp_contenedorGeneral.setPreferredSize(new java.awt.Dimension(904, 694));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Datos del Paciente");

        javax.swing.GroupLayout jp_contenedorTituloLayout = new javax.swing.GroupLayout(jp_contenedorTitulo);
        jp_contenedorTitulo.setLayout(jp_contenedorTituloLayout);
        jp_contenedorTituloLayout.setHorizontalGroup(
            jp_contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_contenedorTituloLayout.setVerticalGroup(
            jp_contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_contenedorOpciones.setPreferredSize(new java.awt.Dimension(827, 277));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre: *");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Edad: *");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Especie: *");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Color: *");

        txf_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txf_edad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txf_color.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Sexo: *");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Raza: *");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Fecha de Nac. : *");

        txf_raza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txf_fechaNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_guardar.setBackground(new java.awt.Color(204, 204, 204));
        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_salir.setBackground(new java.awt.Color(204, 204, 204));
        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(102, 102, 102));
        btn_salir.setText("Salir");
        btn_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cb_especie.setBackground(new java.awt.Color(255, 255, 255));
        cb_especie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_especie.setForeground(new java.awt.Color(0, 0, 0));
        cb_especie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓" }));

        cb_sexo.setBackground(new java.awt.Color(255, 255, 255));
        cb_sexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_sexo.setForeground(new java.awt.Color(0, 0, 0));
        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "↓ Opción ↓", "M", "H" }));

        javax.swing.GroupLayout jp_contenedorOpcionesLayout = new javax.swing.GroupLayout(jp_contenedorOpciones);
        jp_contenedorOpciones.setLayout(jp_contenedorOpcionesLayout);
        jp_contenedorOpcionesLayout.setHorizontalGroup(
            jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txf_color, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_edad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_especie, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(30, 30, 30)
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txf_raza, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_fechaNacimiento)
                            .addComponent(cb_sexo, javax.swing.GroupLayout.Alignment.LEADING, 0, 251, Short.MAX_VALUE)))
                    .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorOpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jp_contenedorOpcionesLayout.setVerticalGroup(
            jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txf_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_especie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txf_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txf_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_salir))
                .addGap(24, 24, 24))
        );

        jp_contenedorTabla.setPreferredSize(new java.awt.Dimension(680, 276));

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

        jLabel8.setText("Buscar:");

        btn_buscar.setText("Buscar");

        btn_seleccionarFila.setBackground(new java.awt.Color(204, 204, 204));
        btn_seleccionarFila.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_seleccionarFila.setForeground(new java.awt.Color(102, 102, 102));
        btn_seleccionarFila.setText("Seleccionar Fila");
        btn_seleccionarFila.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Listado de Pacientes");

        javax.swing.GroupLayout jp_contenedorTablaLayout = new javax.swing.GroupLayout(jp_contenedorTabla);
        jp_contenedorTabla.setLayout(jp_contenedorTablaLayout);
        jp_contenedorTablaLayout.setHorizontalGroup(
            jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
            .addGroup(jp_contenedorTablaLayout.createSequentialGroup()
                .addComponent(btn_seleccionarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar)
                .addGap(22, 22, 22))
        );
        jp_contenedorTablaLayout.setVerticalGroup(
            jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorTablaLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_buscar)
                        .addComponent(jLabel9))
                    .addComponent(btn_seleccionarFila, javax.swing.GroupLayout.Alignment.TRAILING))
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
                    .addComponent(jp_contenedorOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(jp_contenedorLayout.createSequentialGroup()
                        .addComponent(jp_contenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jp_contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addContainerGap(8, Short.MAX_VALUE))
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
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_guardar;
    public javax.swing.JButton btn_salir;
    public javax.swing.JButton btn_seleccionarFila;
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
    private javax.swing.JPanel jp_contenedor;
    private javax.swing.JPanel jp_contenedorGeneral;
    private javax.swing.JPanel jp_contenedorOpciones;
    private javax.swing.JPanel jp_contenedorTabla;
    private javax.swing.JPanel jp_contenedorTitulo;
    public javax.swing.JTable jtb_tablaPacientes;
    private javax.swing.JLabel lbl_titulo;
    public javax.swing.JTextField txf_buscar;
    public javax.swing.JTextField txf_color;
    public javax.swing.JTextField txf_edad;
    public javax.swing.JTextField txf_fechaNacimiento;
    public javax.swing.JTextField txf_nombre;
    public javax.swing.JTextField txf_raza;
    // End of variables declaration//GEN-END:variables
}
