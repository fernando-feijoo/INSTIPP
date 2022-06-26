package ProyectoFinal;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroUsuarios extends javax.swing.JInternalFrame {

    Color ColorVerde1 = new Color(110, 222, 56);
    Color ColorOscuro1 = new Color(102,102,102);
    Color ColorVerde2 = new Color(255, 153, 153);
    Color ColorOscuro2 = new Color(153,153,153);
    MenuPrincipal MPrincipal = new MenuPrincipal();
    int contador = 0, validador = 0;
    String[] busquedaUsuario = new String[7];
    public RegistroUsuarios() {
        initComponents();
        lbl_botonMasOpciones.setVisible(false);
        lbl_botonBusqueda.setVisible(false);
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_escritorio = new javax.swing.JPanel();
        lbl_Atras = new javax.swing.JLabel();
        pnl_Cursos = new javax.swing.JPanel();
        pnl_RegistroCursos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnl_Matriculas = new javax.swing.JPanel();
        pnl_RegistroMatriculas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnl_DatosMatriculados = new javax.swing.JPanel();
        pnl_AlumnosMatriculados = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pnl_formulario = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_botonEliminar = new javax.swing.JLabel();
        lbl_botonActualizar = new javax.swing.JLabel();
        lbl_botonGuardar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txf_cedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txf_apellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txf_nombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txf_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txf_celular = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txf_ciudad = new javax.swing.JTextField();
        txf_fechaRegistro = new javax.swing.JTextField();
        txf_provincia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lbl_botonBusqueda = new javax.swing.JLabel();
        lbl_botonMasOpciones = new javax.swing.JLabel();
        contenedorTabla = new javax.swing.JPanel();
        tb_contenedora = new javax.swing.JScrollPane();
        tb_usuarios = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(null);
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1435, 663));
        setVisible(false);

        pnl_escritorio.setBackground(new java.awt.Color(204, 204, 204));

        lbl_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/Inicio 64px.png"))); // NOI18N
        lbl_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AtrasMouseClicked(evt);
            }
        });

        pnl_Cursos.setBackground(new java.awt.Color(153, 153, 153));
        pnl_Cursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Cursos.setPreferredSize(new java.awt.Dimension(390, 143));
        pnl_Cursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_CursosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_CursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_CursosMouseExited(evt);
            }
        });

        pnl_RegistroCursos.setBackground(new java.awt.Color(255, 153, 153));
        pnl_RegistroCursos.setPreferredSize(new java.awt.Dimension(25, 190));

        javax.swing.GroupLayout pnl_RegistroCursosLayout = new javax.swing.GroupLayout(pnl_RegistroCursos);
        pnl_RegistroCursos.setLayout(pnl_RegistroCursosLayout);
        pnl_RegistroCursosLayout.setHorizontalGroup(
            pnl_RegistroCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnl_RegistroCursosLayout.setVerticalGroup(
            pnl_RegistroCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/RCursos 128px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("REGISTRAR");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setText("PRODUCTOS");

        javax.swing.GroupLayout pnl_CursosLayout = new javax.swing.GroupLayout(pnl_Cursos);
        pnl_Cursos.setLayout(pnl_CursosLayout);
        pnl_CursosLayout.setHorizontalGroup(
            pnl_CursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CursosLayout.createSequentialGroup()
                .addComponent(pnl_RegistroCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(pnl_CursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_CursosLayout.setVerticalGroup(
            pnl_CursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroCursos, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CursosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(33, 33, 33))
        );

        pnl_Matriculas.setBackground(new java.awt.Color(153, 153, 153));
        pnl_Matriculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Matriculas.setPreferredSize(new java.awt.Dimension(390, 141));
        pnl_Matriculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_MatriculasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_MatriculasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_MatriculasMouseExited(evt);
            }
        });

        pnl_RegistroMatriculas.setBackground(new java.awt.Color(255, 153, 153));
        pnl_RegistroMatriculas.setPreferredSize(new java.awt.Dimension(25, 190));

        javax.swing.GroupLayout pnl_RegistroMatriculasLayout = new javax.swing.GroupLayout(pnl_RegistroMatriculas);
        pnl_RegistroMatriculas.setLayout(pnl_RegistroMatriculasLayout);
        pnl_RegistroMatriculasLayout.setHorizontalGroup(
            pnl_RegistroMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnl_RegistroMatriculasLayout.setVerticalGroup(
            pnl_RegistroMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/RMatricula 128px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("REGISTRAR");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("COMPRAS");

        javax.swing.GroupLayout pnl_MatriculasLayout = new javax.swing.GroupLayout(pnl_Matriculas);
        pnl_Matriculas.setLayout(pnl_MatriculasLayout);
        pnl_MatriculasLayout.setHorizontalGroup(
            pnl_MatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MatriculasLayout.createSequentialGroup()
                .addComponent(pnl_RegistroMatriculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(pnl_MatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_MatriculasLayout.setVerticalGroup(
            pnl_MatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroMatriculas, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addGroup(pnl_MatriculasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_DatosMatriculados.setBackground(new java.awt.Color(153, 153, 153));
        pnl_DatosMatriculados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_DatosMatriculados.setPreferredSize(new java.awt.Dimension(390, 163));
        pnl_DatosMatriculados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_DatosMatriculadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_DatosMatriculadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_DatosMatriculadosMouseExited(evt);
            }
        });

        pnl_AlumnosMatriculados.setBackground(new java.awt.Color(255, 153, 153));
        pnl_AlumnosMatriculados.setPreferredSize(new java.awt.Dimension(25, 190));

        javax.swing.GroupLayout pnl_AlumnosMatriculadosLayout = new javax.swing.GroupLayout(pnl_AlumnosMatriculados);
        pnl_AlumnosMatriculados.setLayout(pnl_AlumnosMatriculadosLayout);
        pnl_AlumnosMatriculadosLayout.setHorizontalGroup(
            pnl_AlumnosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnl_AlumnosMatriculadosLayout.setVerticalGroup(
            pnl_AlumnosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/RFactura.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setText("CONSULTA DE");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setText("FACTURAS");

        javax.swing.GroupLayout pnl_DatosMatriculadosLayout = new javax.swing.GroupLayout(pnl_DatosMatriculados);
        pnl_DatosMatriculados.setLayout(pnl_DatosMatriculadosLayout);
        pnl_DatosMatriculadosLayout.setHorizontalGroup(
            pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DatosMatriculadosLayout.createSequentialGroup()
                .addComponent(pnl_AlumnosMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnl_DatosMatriculadosLayout.setVerticalGroup(
            pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_AlumnosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addGroup(pnl_DatosMatriculadosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );

        pnl_formulario.setBackground(new java.awt.Color(255, 255, 252));
        pnl_formulario.setMaximumSize(new java.awt.Dimension(1003, 476));
        pnl_formulario.setPreferredSize(new java.awt.Dimension(1003, 476));

        jPanel1.setBackground(new java.awt.Color(255, 255, 252));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(157, 132));
        jPanel1.setMinimumSize(new java.awt.Dimension(156, 206));

        lbl_botonEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_botonEliminar.setForeground(new java.awt.Color(102, 102, 102));
        lbl_botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/Eliminar 32px.png"))); // NOI18N
        lbl_botonEliminar.setText("ELIMINAR");
        lbl_botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonEliminarMouseClicked(evt);
            }
        });

        lbl_botonActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_botonActualizar.setForeground(new java.awt.Color(102, 102, 102));
        lbl_botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/actualizar 32px.png"))); // NOI18N
        lbl_botonActualizar.setText("ACTUALIZAR");
        lbl_botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonActualizarMouseClicked(evt);
            }
        });

        lbl_botonGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_botonGuardar.setForeground(new java.awt.Color(102, 102, 102));
        lbl_botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/btn Guardar 32px.png"))); // NOI18N
        lbl_botonGuardar.setText("GUARDAR");
        lbl_botonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_botonEliminar)
                    .addComponent(lbl_botonActualizar)
                    .addComponent(lbl_botonGuardar))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_botonEliminar)
                .addGap(18, 18, 18)
                .addComponent(lbl_botonActualizar)
                .addGap(18, 18, 18)
                .addComponent(lbl_botonGuardar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 252));
        jPanel2.setMaximumSize(new java.awt.Dimension(644, 476));
        jPanel2.setMinimumSize(new java.awt.Dimension(644, 476));

        jLabel17.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("REGISTRO DE USUARIOS");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CEDULA:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("APELLIDOS:");

        txf_cedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRES:");

        txf_apellidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CELULAR:");

        txf_nombres.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DIRECCION:");

        txf_direccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PROVINCIA:");

        txf_celular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("FECHA DE REGISTRO:");

        txf_ciudad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txf_fechaRegistro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txf_provincia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("CIUDAD");

        lbl_botonBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/buscar 24px.png"))); // NOI18N
        lbl_botonBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonBusquedaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(112, 112, 112)
                        .addComponent(txf_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(91, 91, 91)
                        .addComponent(txf_apellidos))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(96, 96, 96)
                        .addComponent(txf_nombres))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(104, 104, 104)
                        .addComponent(txf_celular))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(90, 90, 90)
                        .addComponent(txf_direccion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_fechaRegistro)
                            .addComponent(txf_provincia)
                            .addComponent(txf_ciudad))))
                .addGap(4, 4, 4)
                .addComponent(lbl_botonBusqueda)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_botonBusqueda))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txf_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txf_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txf_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txf_fechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbl_botonMasOpciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_botonMasOpciones.setForeground(new java.awt.Color(102, 102, 102));
        lbl_botonMasOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/Regresar 32px.png"))); // NOI18N
        lbl_botonMasOpciones.setText("MAS OPCIONES");
        lbl_botonMasOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonMasOpcionesMouseClicked(evt);
            }
        });

        tb_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_contenedora.setViewportView(tb_usuarios);

        javax.swing.GroupLayout contenedorTablaLayout = new javax.swing.GroupLayout(contenedorTabla);
        contenedorTabla.setLayout(contenedorTablaLayout);
        contenedorTablaLayout.setHorizontalGroup(
            contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_contenedora)
        );
        contenedorTablaLayout.setVerticalGroup(
            contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_contenedora, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_formularioLayout = new javax.swing.GroupLayout(pnl_formulario);
        pnl_formulario.setLayout(pnl_formularioLayout);
        pnl_formularioLayout.setHorizontalGroup(
            pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_formularioLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_botonMasOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
            .addComponent(contenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_formularioLayout.setVerticalGroup(
            pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_formularioLayout.createSequentialGroup()
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_formularioLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(lbl_botonMasOpciones)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_escritorioLayout = new javax.swing.GroupLayout(pnl_escritorio);
        pnl_escritorio.setLayout(pnl_escritorioLayout);
        pnl_escritorioLayout.setHorizontalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Atras)
                    .addComponent(pnl_Cursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_DatosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Matriculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnl_formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_escritorioLayout.setVerticalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_formulario, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                    .addGroup(pnl_escritorioLayout.createSequentialGroup()
                        .addComponent(lbl_Atras)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_Matriculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_DatosMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AtrasMouseClicked
        setVisible(false);
        Principal.escritorio.add(MPrincipal);
        MPrincipal.toFront();
        MPrincipal.setVisible(true);
    }//GEN-LAST:event_lbl_AtrasMouseClicked

    private void pnl_CursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_CursosMouseClicked
        RegistroProductos PanelCurso = new RegistroProductos();
        setVisible(false);
        Principal.escritorio.add(PanelCurso);
        PanelCurso.toFront();
        PanelCurso.setVisible(true);
    }//GEN-LAST:event_pnl_CursosMouseClicked

    private void pnl_CursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_CursosMouseEntered
        pnl_RegistroCursos.setBackground(ColorVerde1);
        pnl_Cursos.setBackground(ColorOscuro1);
    }//GEN-LAST:event_pnl_CursosMouseEntered

    private void pnl_CursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_CursosMouseExited
        pnl_RegistroCursos.setBackground(ColorVerde2);
        pnl_Cursos.setBackground(ColorOscuro2);
    }//GEN-LAST:event_pnl_CursosMouseExited

    private void pnl_MatriculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_MatriculasMouseClicked
        RegistroCompras PanelMatriculas = new RegistroCompras();
        setVisible(false);
        Principal.escritorio.add(PanelMatriculas);
        PanelMatriculas.toFront();
        PanelMatriculas.setVisible(true);
    }//GEN-LAST:event_pnl_MatriculasMouseClicked

    private void pnl_MatriculasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_MatriculasMouseEntered
        pnl_RegistroMatriculas.setBackground(ColorVerde1);
        pnl_Matriculas.setBackground(ColorOscuro1);
    }//GEN-LAST:event_pnl_MatriculasMouseEntered

    private void pnl_MatriculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_MatriculasMouseExited
        pnl_RegistroMatriculas.setBackground(ColorVerde2);
        pnl_Matriculas.setBackground(ColorOscuro2);
    }//GEN-LAST:event_pnl_MatriculasMouseExited

    private void pnl_DatosMatriculadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DatosMatriculadosMouseClicked
        GenerarFacturas PanelBaseDatos = new GenerarFacturas();
        setVisible(false);
        Principal.escritorio.add(PanelBaseDatos);
        PanelBaseDatos.toFront();
        PanelBaseDatos.setVisible(true);
    }//GEN-LAST:event_pnl_DatosMatriculadosMouseClicked

    private void pnl_DatosMatriculadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DatosMatriculadosMouseEntered
        pnl_AlumnosMatriculados.setBackground(ColorVerde1);
        pnl_DatosMatriculados.setBackground(ColorOscuro1);
    }//GEN-LAST:event_pnl_DatosMatriculadosMouseEntered

    private void pnl_DatosMatriculadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DatosMatriculadosMouseExited
        pnl_AlumnosMatriculados.setBackground(ColorVerde2);
        pnl_DatosMatriculados.setBackground(ColorOscuro2);
    }//GEN-LAST:event_pnl_DatosMatriculadosMouseExited

    private void lbl_botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonEliminarMouseClicked
        validador++;
        txf_apellidos.setEditable(false);
        txf_nombres.setEditable(false);
        txf_celular.setEditable(false);
        txf_direccion.setEditable(false);
        txf_ciudad.setEditable(false);
        txf_provincia.setEditable(false);
        txf_fechaRegistro.setEditable(false);
        if (validador == 1) 
        {
            lbl_botonMasOpciones.setVisible(true);
            lbl_botonBusqueda.setVisible(true);
            lbl_botonEliminar.setVisible(true);
            lbl_botonActualizar.setVisible(false);
            lbl_botonGuardar.setVisible(false);
            
        }else if (validador == 2) 
        {
            eliminar();
            cargar();
            validador = 0;
        }
    }//GEN-LAST:event_lbl_botonEliminarMouseClicked

    private void lbl_botonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonActualizarMouseClicked
        validador++;
        txf_fechaRegistro.setEditable(false);
        if (validador == 1) 
        {
            lbl_botonMasOpciones.setVisible(true);
            lbl_botonBusqueda.setVisible(true);
            lbl_botonEliminar.setVisible(false);
            lbl_botonActualizar.setVisible(true);
            lbl_botonGuardar.setVisible(false);
            
        }else if (validador == 2) 
        {
            actualizar();
            cargar();
            validador = 0;
        }
    }//GEN-LAST:event_lbl_botonActualizarMouseClicked

    private void lbl_botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonGuardarMouseClicked
        validador++;
        if (validador == 1) 
        {
            lbl_botonMasOpciones.setVisible(true);
            lbl_botonBusqueda.setVisible(false);
            lbl_botonEliminar.setVisible(false);
            lbl_botonActualizar.setVisible(false);
            lbl_botonGuardar.setVisible(true);
            
        }else if (validador == 2) 
        {
            guardar();
            cargar();
            validador = 0;
        }
    }//GEN-LAST:event_lbl_botonGuardarMouseClicked

    private void lbl_botonMasOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonMasOpcionesMouseClicked
        borrarDatos();  
        txf_apellidos.setEditable(true);
        txf_nombres.setEditable(true);
        txf_celular.setEditable(true);
        txf_direccion.setEditable(true);
        txf_ciudad.setEditable(true);
        txf_provincia.setEditable(true);
        txf_fechaRegistro.setEditable(true);
        lbl_botonMasOpciones.setVisible(false);
        lbl_botonBusqueda.setVisible(false);
        lbl_botonEliminar.setVisible(true);
        lbl_botonActualizar.setVisible(true);
        lbl_botonGuardar.setVisible(true);
        validador = 0;
    }//GEN-LAST:event_lbl_botonMasOpcionesMouseClicked

    private void lbl_botonBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonBusquedaMouseClicked
         if(isEcuadorianDocumentValid(txf_cedula.getText()))
         {
             busquedaID();
         }else
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR UNA CEDULA CORRECTA");
         }
    }//GEN-LAST:event_lbl_botonBusquedaMouseClicked
    
    public void guardar()
    { 
         contador = 0;
         if (txf_cedula.getText().equalsIgnoreCase("") || txf_apellidos.getText().equalsIgnoreCase("") || txf_nombres.getText().equalsIgnoreCase("") || txf_celular.getText().equalsIgnoreCase("") || txf_fechaRegistro.getText().equalsIgnoreCase("") || txf_ciudad.getText().equalsIgnoreCase("") || txf_direccion.getText().equalsIgnoreCase("")) 
         {
             JOptionPane.showMessageDialog(null, "DEBE COLOCAR TODOS LOS DATOS");
         }
         if(isEcuadorianDocumentValid(txf_cedula.getText()) && !txf_cedula.getText().equalsIgnoreCase("2222222222"))
         {
                int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS GUARDAR LOS DATOS?", "CREACIÓN DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) 
                {
                    try
                    {
                       Class.forName("org.postgresql.Driver");
                       Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_final","postgres","FerDatos95"); 

                       Statement consulta = (Statement) conecta.createStatement();            
                       consulta.executeUpdate("INSERT INTO public.registro_usuario (cedula, apellidos, nombres, celular, direccion_domicilio, ciudad, provincia, fecha_registro) VALUES ('"+txf_cedula.getText()+"', '"+txf_apellidos.getText()+"', '"+txf_nombres.getText()+"', '"+txf_celular.getText()+"', '"+txf_direccion.getText()+"', '"+txf_ciudad.getText()+"', '"+txf_provincia.getText()+"', '"+txf_fechaRegistro.getText()+"');");

                       conecta.close();
                       JOptionPane.showMessageDialog(null,"Registro guardado correctamente");

                    } catch(SQLException e)
                    {
                       JOptionPane.showMessageDialog(null,"Error al guardar datos");
                       contador++;

                    } catch(ClassNotFoundException e)
                    {
                       JOptionPane.showMessageDialog(null,"Error inesperado");
                       contador++;
                    }
                    if (contador != 1) 
                    {
                       borrarDatos();
                    }
                }
         }else
         {
                JOptionPane.showMessageDialog(null, "DEBE COLOCAR UNA CEDULA CORRECTA");
         }
    }
    
    public void eliminar()
    { 
         contador = 0;
         if (txf_cedula.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LA CEDULA");
         }
         if(isEcuadorianDocumentValid(txf_cedula.getText()))
         {
            int codigo=JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS ELIMINAR LOS DATOS?", "ELIMINACION DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (codigo == JOptionPane.YES_OPTION) 
            {
                try
                {
                   Class.forName("org.postgresql.Driver");
                   Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_final","postgres","FerDatos95"); 

                   Statement consulta=(Statement) conecta.createStatement();            
                   consulta.executeUpdate("DELETE FROM public.registro_usuario WHERE cedula = '"+txf_cedula.getText()+"';");

                   conecta.close();
                   JOptionPane.showMessageDialog(null,"Registro eliminado correctamente");

                } catch(SQLException e)
                {
                   JOptionPane.showMessageDialog(null,"Error al eliminar datos");
                   contador++;

                } catch(ClassNotFoundException e)
                {
                   JOptionPane.showMessageDialog(null,"Error inesperado");
                   contador++;
                }
                if (contador != 1) 
                {
                  borrarDatos();
                }
          }else
          {
                JOptionPane.showMessageDialog(null, "DEBE COLOCAR UNA CEDULA CORRECTA");
          }
       }
    }
     
    public void actualizar()
    { 
         contador = 0;
         if (txf_cedula.getText().equalsIgnoreCase("") || txf_apellidos.getText().equalsIgnoreCase("") || txf_nombres.getText().equalsIgnoreCase("") || txf_celular.getText().equalsIgnoreCase("") || txf_fechaRegistro.getText().equalsIgnoreCase("") || txf_ciudad.getText().equalsIgnoreCase("") || txf_direccion.getText().equalsIgnoreCase(""))
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR TODOS LOS DATOS");
         }
         if(isEcuadorianDocumentValid(txf_cedula.getText()))
         {
                int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS ACTUALIZAR LOS DATOS?", "ACTUALIZACIÓN DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) 
                {
                    try
                    {
                       Class.forName("org.postgresql.Driver");
                       Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_final","postgres","FerDatos95"); 

                       Statement consulta=(Statement) conecta.createStatement();            
                       consulta.executeUpdate("UPDATE public.registro_usuario SET cedula = '"+txf_cedula.getText()+"', apellidos ='"+txf_apellidos.getText()+"', nombres = '"+txf_nombres.getText()+"', celular = '"+txf_celular.getText()+"', direccion_domicilio = '"+txf_direccion.getText()+"', ciudad = '"+txf_ciudad.getText()+"', provincia = '"+txf_provincia.getText()+"', fecha_registro = '"+txf_fechaRegistro.getText()+"' WHERE cedula = '"+txf_cedula.getText()+"';");

                       conecta.close();
                       JOptionPane.showMessageDialog(null,"Registro actualizado correctamente");

                    } catch(SQLException e)
                    {
                       JOptionPane.showMessageDialog(null,"Error al actualizar datos");
                       contador++;

                    } catch(ClassNotFoundException e)
                    {
                       JOptionPane.showMessageDialog(null,"Error inesperado");
                       contador++;
                    }
                    if (contador != 1) 
                    {
                       borrarDatos();
                    }
                 }
         }
         else
         {
                JOptionPane.showMessageDialog(null, "DEBE COLOCAR UNA CEDULA CORRECTA");
         }
    }
    
    public void cargar() 
    {
        String url="jdbc:postgresql://localhost:5432/proyecto_final"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
    
    
        DefaultTableModel tabla = new DefaultTableModel();
        String[] datos = new String[7];   
        tabla.addColumn("Cedula");
        tabla.addColumn("Apellidos");
        tabla.addColumn("Nombres");
        tabla.addColumn("Celular");
        tabla.addColumn("Direccion");
        tabla.addColumn("Ciudad");
        tabla.addColumn("Provincia");
        tb_usuarios.setModel(tabla);
        try 
        {
            Connection BaseDatos = null;
            Statement st = null;
            BaseDatos = DriverManager.getConnection(url, usuario, contrasena);
       
            st = BaseDatos.createStatement();
            ResultSet rs = st.executeQuery("SELECT cedula, apellidos, nombres, celular, direccion_domicilio, ciudad, provincia FROM public.registro_usuario;");                   
                   
            while    ( rs.next() ) 
            {
                    datos[0]  = rs.getString("cedula");
                    datos[1] = rs.getString("apellidos");
                    datos[2] = rs.getString("nombres");  
                    datos[3] = rs.getString("celular");
                    datos[4] = rs.getString("direccion_domicilio");
                    datos[5] = rs.getString("ciudad");
                    datos[6] = rs.getString("provincia");
                    tabla.addRow(datos);  
            } 
                 rs.close();
                 st.close();
                 BaseDatos.close();
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this,"Error al cargar datos"+ e);
        } 
    }
    
    public void busquedaID() 
    {
        String url="jdbc:postgresql://localhost:5432/proyecto_final"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
        contador = 0;
         if (txf_cedula.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS DE CEDULA");
         }else
         {
            try 
            {
                Connection BaseDatos = null;
                Statement st = null;
                BaseDatos = DriverManager.getConnection(url, usuario, contrasena);

                st = BaseDatos.createStatement();
                ResultSet rs = st.executeQuery("SELECT apellidos, nombres, celular, direccion_domicilio, ciudad, provincia, fecha_registro FROM public.registro_usuario WHERE cedula = '"+txf_cedula.getText()+"';;");                   
                while (rs.next()) 
                {
                    busquedaUsuario[0]  = rs.getString("apellidos");
                    busquedaUsuario[1] = rs.getString("nombres");
                    busquedaUsuario[2] = rs.getString("celular");  
                    busquedaUsuario[3] = rs.getString("direccion_domicilio");
                    busquedaUsuario[4] = rs.getString("ciudad");
                    busquedaUsuario[5] = rs.getString("provincia");
                    busquedaUsuario[6] = rs.getString("fecha_registro");
                }
                rs.close();
                st.close();
                BaseDatos.close();

            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(this,"Error al cargar datos");
                contador++;
            }
            if (contador != 1)
            {
                txf_apellidos.setText(busquedaUsuario[0]);
                txf_nombres.setText(busquedaUsuario[1]);
                txf_celular.setText(busquedaUsuario[2]);
                txf_direccion.setText(busquedaUsuario[3]);
                txf_ciudad.setText(busquedaUsuario[4]);
                txf_provincia.setText(busquedaUsuario[5]);
                txf_fechaRegistro.setText(busquedaUsuario[6]);
             }
         }
    }
    
    public boolean isEcuadorianDocumentValid(String document) 
    {
        byte sum = 0;
        try {
            if (document.trim().length() != 10)
                return false;
            String[] data = document.split("");
            byte verifier = Byte.parseByte(data[0] + data[1]);
            if (verifier < 1 || verifier > 24)
                return false;
            byte[] digits = new byte[data.length];
            for (byte i = 0; i < digits.length; i++)
                digits[i] = Byte.parseByte(data[i]);
            if (digits[2] > 6)
                return false;
            for (byte i = 0; i < digits.length - 1; i++) {
                if (i % 2 == 0) {
                    verifier = (byte) (digits[i] * 2);
                    if (verifier > 9)
                        verifier = (byte) (verifier - 9);
                } else
                    verifier = (byte) (digits[i] * 1);
                sum = (byte) (sum + verifier);
            }
            if ((sum - (sum % 10) + 10 - sum) == digits[9])
                return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
}
    
    public void borrarDatos()
    {
       txf_cedula.setText("");
       txf_apellidos.setText("");
       txf_nombres.setText("");
       txf_celular.setText("");
       txf_direccion.setText("");
       txf_ciudad.setText("");
       txf_provincia.setText("");
       txf_fechaRegistro.setText("");
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Atras;
    private javax.swing.JLabel lbl_botonActualizar;
    private javax.swing.JLabel lbl_botonBusqueda;
    private javax.swing.JLabel lbl_botonEliminar;
    private javax.swing.JLabel lbl_botonGuardar;
    private javax.swing.JLabel lbl_botonMasOpciones;
    private javax.swing.JPanel pnl_AlumnosMatriculados;
    private javax.swing.JPanel pnl_Cursos;
    private javax.swing.JPanel pnl_DatosMatriculados;
    private javax.swing.JPanel pnl_Matriculas;
    private javax.swing.JPanel pnl_RegistroCursos;
    private javax.swing.JPanel pnl_RegistroMatriculas;
    private javax.swing.JPanel pnl_escritorio;
    private javax.swing.JPanel pnl_formulario;
    private javax.swing.JScrollPane tb_contenedora;
    private javax.swing.JTable tb_usuarios;
    private javax.swing.JTextField txf_apellidos;
    private javax.swing.JTextField txf_cedula;
    private javax.swing.JTextField txf_celular;
    private javax.swing.JTextField txf_ciudad;
    private javax.swing.JTextField txf_direccion;
    private javax.swing.JTextField txf_fechaRegistro;
    private javax.swing.JTextField txf_nombres;
    private javax.swing.JTextField txf_provincia;
    // End of variables declaration//GEN-END:variables
}
