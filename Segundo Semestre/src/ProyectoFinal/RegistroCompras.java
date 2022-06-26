package ProyectoFinal;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroCompras extends javax.swing.JInternalFrame {

    Color ColorVerde1 = new Color(110, 222, 56);
    Color ColorOscuro1 = new Color(102,102,102);
    Color ColorVerde2 = new Color(255, 153, 153);
    Color ColorOscuro2 = new Color(153,153,153);
    MenuPrincipal MPrincipal = new MenuPrincipal();
    String[] busquedaUsuario = new String[8];
    String[] busquedaProducto = new String[6];
    String[] busquedaPrecio = new String[1];
    int contador = 0, cantidad;
    String[] x = new String[2];
    String[] datos = new String[7];
    DecimalFormat formato = new DecimalFormat("#.00");
    public RegistroCompras() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_escritorio = new javax.swing.JPanel();
        lbl_Atras = new javax.swing.JLabel();
        pnl_Postulantes7 = new javax.swing.JPanel();
        pnl_RegistroPostulante7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnl_DatosMatriculados = new javax.swing.JPanel();
        pnl_AlumnosMatriculados = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pnl_Cursos = new javax.swing.JPanel();
        pnl_RegistroCursos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txf_cedula = new javax.swing.JTextField();
        lbl_botonBusqueda = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txf_cantidad = new javax.swing.JTextField();
        lbl_botonCarritoCompra = new javax.swing.JLabel();
        lbl_botonBorrar = new javax.swing.JLabel();
        tb_contenedora = new javax.swing.JScrollPane();
        tb_compras = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txf_fechaVenta = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txf_codigoProducto = new javax.swing.JTextField();
        lbl_usuarioBuscado = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txf_iva = new javax.swing.JTextField();
        txf_bubTotal = new javax.swing.JTextField();
        txf_total = new javax.swing.JTextField();
        lbl_botonGuardar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(null);
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

        pnl_Postulantes7.setBackground(new java.awt.Color(153, 153, 153));
        pnl_Postulantes7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Postulantes7.setPreferredSize(new java.awt.Dimension(390, 163));
        pnl_Postulantes7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_Postulantes7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_Postulantes7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_Postulantes7MouseExited(evt);
            }
        });

        pnl_RegistroPostulante7.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout pnl_RegistroPostulante7Layout = new javax.swing.GroupLayout(pnl_RegistroPostulante7);
        pnl_RegistroPostulante7.setLayout(pnl_RegistroPostulante7Layout);
        pnl_RegistroPostulante7Layout.setHorizontalGroup(
            pnl_RegistroPostulante7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnl_RegistroPostulante7Layout.setVerticalGroup(
            pnl_RegistroPostulante7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/RPostulante 125px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("REGISTRAR");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("USUARIOS");

        javax.swing.GroupLayout pnl_Postulantes7Layout = new javax.swing.GroupLayout(pnl_Postulantes7);
        pnl_Postulantes7.setLayout(pnl_Postulantes7Layout);
        pnl_Postulantes7Layout.setHorizontalGroup(
            pnl_Postulantes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Postulantes7Layout.createSequentialGroup()
                .addComponent(pnl_RegistroPostulante7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(pnl_Postulantes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addContainerGap())
        );
        pnl_Postulantes7Layout.setVerticalGroup(
            pnl_Postulantes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroPostulante7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Postulantes7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(33, 33, 33))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_DatosMatriculadosLayout.setVerticalGroup(
            pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_AlumnosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addGroup(pnl_DatosMatriculadosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_Cursos.setBackground(new java.awt.Color(153, 153, 153));
        pnl_Cursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Cursos.setPreferredSize(new java.awt.Dimension(390, 141));
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
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnl_CursosLayout.setVerticalGroup(
            pnl_CursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroCursos, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
            .addGroup(pnl_CursosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 252));
        jPanel1.setMaximumSize(new java.awt.Dimension(1003, 476));
        jPanel1.setPreferredSize(new java.awt.Dimension(1003, 476));

        jLabel17.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("REGISTRO DE COMPRAS");

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("CEDULA:");

        lbl_botonBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/buscar 24px.png"))); // NOI18N
        lbl_botonBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonBusquedaMouseClicked(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("CODIGO PRODUCTO:");

        lbl_botonCarritoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/CarritoCompras 24px.png"))); // NOI18N
        lbl_botonCarritoCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_botonCarritoCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonCarritoCompraMouseClicked(evt);
            }
        });

        lbl_botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/ComprasBorrar 24px.png"))); // NOI18N
        lbl_botonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_botonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonBorrarMouseClicked(evt);
            }
        });

        tb_compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_contenedora.setViewportView(tb_compras);

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("FECHA VENTA:");

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("CANTIDAD:");

        lbl_usuarioBuscado.setForeground(new java.awt.Color(0, 0, 0));

        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("CLIENTE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_contenedora)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(214, 214, 214)
                        .addComponent(jLabel17)
                        .addGap(179, 179, 179)
                        .addComponent(lbl_botonBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_botonCarritoCompra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_usuarioBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txf_fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(lbl_botonBusqueda)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_botonCarritoCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(lbl_botonBusqueda)
                            .addComponent(lbl_usuarioBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txf_codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(tb_contenedora, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SUB TOTAL:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("I.V.A:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TOTAL:");

        txf_iva.setEditable(false);
        txf_iva.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txf_bubTotal.setEditable(false);
        txf_bubTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txf_total.setEditable(false);
        txf_total.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbl_botonGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_botonGuardar.setForeground(new java.awt.Color(102, 102, 102));
        lbl_botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/btn Guardar 32px.png"))); // NOI18N
        lbl_botonGuardar.setText("GUARDAR");
        lbl_botonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_escritorioLayout = new javax.swing.GroupLayout(pnl_escritorio);
        pnl_escritorio.setLayout(pnl_escritorioLayout);
        pnl_escritorioLayout.setHorizontalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_escritorioLayout.createSequentialGroup()
                        .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Atras)
                            .addComponent(pnl_DatosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_Postulantes7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_Cursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txf_bubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txf_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_escritorioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_botonGuardar)))
                .addContainerGap())
        );
        pnl_escritorioLayout.setVerticalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_escritorioLayout.createSequentialGroup()
                        .addComponent(lbl_Atras)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_Postulantes7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_DatosMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_escritorioLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txf_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_bubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lbl_botonGuardar)
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

    private void pnl_Postulantes7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_Postulantes7MouseClicked
        RegistroUsuarios PanelPostulantes = new RegistroUsuarios();
        setVisible(false);
        Principal.escritorio.add(PanelPostulantes);
        PanelPostulantes.toFront();
        PanelPostulantes.setVisible(true);
    }//GEN-LAST:event_pnl_Postulantes7MouseClicked

    private void pnl_Postulantes7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_Postulantes7MouseEntered
        pnl_RegistroPostulante7.setBackground(ColorVerde1);
        pnl_Postulantes7.setBackground(ColorOscuro1);
    }//GEN-LAST:event_pnl_Postulantes7MouseEntered

    private void pnl_Postulantes7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_Postulantes7MouseExited
        pnl_RegistroPostulante7.setBackground(ColorVerde2);
        pnl_Postulantes7.setBackground(ColorOscuro2);
    }//GEN-LAST:event_pnl_Postulantes7MouseExited

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

    private void lbl_botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonGuardarMouseClicked
         if (txf_cedula.getText().equalsIgnoreCase("")) 
         {
                JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS");
         }else
         {
                int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS GUARDAR LOS DATOS?", "GUARDAR DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) 
                {
                    tb_compras.setVisible(false);
                    txf_cedula.setText("");
                    txf_cantidad.setText("");
                    txf_codigoProducto.setText("");
                    txf_fechaVenta.setText("");
                    txf_iva.setText("");
                    txf_total.setText("");
                    txf_bubTotal.setText("");
                }
         }
    }//GEN-LAST:event_lbl_botonGuardarMouseClicked

    private void lbl_botonBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonBusquedaMouseClicked
         if(isEcuadorianDocumentValid(txf_cedula.getText()))
         {
             cargar();
             tb_compras.setVisible(true);
             busquedaIDUsuario();
             calculo();
         }else
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR UNA CEDULA CORRECTA");
         }
    }//GEN-LAST:event_lbl_botonBusquedaMouseClicked

    private void lbl_botonCarritoCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonCarritoCompraMouseClicked
        
        if(isEcuadorianDocumentValid(txf_cedula.getText()))
         {
             cargar();
             busquedaIDProducto();
             busquedaIDUsuario();
             guardar();
             calculo();
         }else
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR UNA CEDULA CORRECTA");
         }
    }//GEN-LAST:event_lbl_botonCarritoCompraMouseClicked

    private void lbl_botonBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonBorrarMouseClicked
        if(isEcuadorianDocumentValid(txf_cedula.getText()))
         {
             cargar();
             busquedaIDProducto();
             busquedaIDUsuario();
             eliminar();
             calculo();
         }else
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR UNA CEDULA CORRECTA");
         }
    }//GEN-LAST:event_lbl_botonBorrarMouseClicked
    
    public void guardar()
    { 
         contador = 0;
         if (txf_cedula.getText().equalsIgnoreCase("") || txf_codigoProducto.getText().equalsIgnoreCase("") || txf_cantidad.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS");
         }else
         {
                cantidad = (Integer.parseInt(txf_cantidad.getText()) * -1);
                double subtotal = Double.parseDouble(busquedaProducto[4]) * Double.parseDouble(txf_cantidad.getText());
                int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS AGREGAR PRODUCTOS?", "AÑADIR AL CARRITO", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) 
                {
                    try
                    {
                       Class.forName("org.postgresql.Driver");
                       Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_final","postgres","FerDatos95"); 

                       Statement consulta = (Statement) conecta.createStatement();            
                       consulta.executeUpdate("INSERT INTO public.factura (id_registro_usuario, id_registro_producto, fecha_venta, cantidad, subtotal) VALUES ('"+Integer.parseInt(busquedaUsuario[0])+"', '"+Integer.parseInt(busquedaProducto[0])+"', '"+txf_fechaVenta.getText()+"', '"+txf_cantidad.getText()+"', '"+subtotal+"');");
                       consulta.executeUpdate("INSERT INTO public.registro_producto (codigo, producto, valor_unidad, marca, stock)VALUES ('"+busquedaProducto[2]+"', '"+busquedaProducto[3]+"', '"+Double.parseDouble(busquedaProducto[4])+"', '"+busquedaProducto[5]+"', '"+cantidad+"');");
                       
                       conecta.close();
                       JOptionPane.showMessageDialog(null,"Registro guardado correctamente");
                       cargar();
                       
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
            }
    }
    
    public void eliminar()
    { 
         contador = 0;
         if (txf_cedula.getText().equalsIgnoreCase("") || txf_codigoProducto.getText().equalsIgnoreCase("") || txf_cantidad.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS");
         }else
         {
                cantidad = (Integer.parseInt(txf_cantidad.getText()) * 1);
                int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS ELIMINAR EL PRODUCTO?", "QUITAR AL CARRITO", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) 
                {
                    try
                    {
                       Class.forName("org.postgresql.Driver");
                       Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_final","postgres","FerDatos95"); 

                       Statement consulta = (Statement) conecta.createStatement();            
                       consulta.executeUpdate("DELETE FROM public.factura WHERE id_registro_usuario = '"+Integer.parseInt(busquedaUsuario[0])+"' AND id_registro_producto = '"+Integer.parseInt(busquedaProducto[0])+"' AND fecha_venta = '"+txf_fechaVenta.getText()+"' AND cantidad = '"+Integer.parseInt(txf_cantidad.getText())+"';");
                       consulta.executeUpdate("INSERT INTO public.registro_producto (codigo, producto, valor_unidad, marca, stock)VALUES ('"+busquedaProducto[2]+"', '"+busquedaProducto[3]+"', '"+Double.parseDouble(busquedaProducto[4])+"', '"+busquedaProducto[5]+"', '"+cantidad+"');");
                       
                       conecta.close();
                       JOptionPane.showMessageDialog(null,"Registro guardado correctamente");
                       cargar();
                       
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
            }
    }
    
    public void cargar() 
    {
        String url="jdbc:postgresql://localhost:5432/proyecto_final"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
    
    
        DefaultTableModel tabla = new DefaultTableModel();
        String[] datos = new String[5];   
        tabla.addColumn("Cantidad");
        tabla.addColumn("Codigo");
        tabla.addColumn("Producto");
        tabla.addColumn("Costo Unitario");
        tabla.addColumn("SubTotal");
        tb_compras.setModel(tabla);
        try 
        {
            Connection BaseDatos = null;
            Statement st = null;
            BaseDatos = DriverManager.getConnection(url, usuario, contrasena);
       
            st = BaseDatos.createStatement();
            ResultSet rs = st.executeQuery("SELECT public.factura.cantidad AS stock, registro_producto.codigo AS codigo, registro_producto.producto AS producto, registro_producto.valor_unidad AS valor_unidad, factura.subtotal AS subtotal FROM public.factura, public.registro_producto, public.registro_usuario WHERE factura.id_registro_producto = registro_producto.id AND factura.fecha_venta = '"+txf_fechaVenta.getText()+"' AND registro_usuario.cedula = '"+txf_cedula.getText()+"';");                   
                   
            while    ( rs.next() ) 
            {
                    datos[0]  = rs.getString("stock");
                    datos[1] = rs.getString("codigo");
                    datos[2] = rs.getString("producto");  
                    datos[3] = rs.getString("valor_unidad");
                    datos[4] = rs.getString("subtotal");
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
    
    public void calculo() 
    {
        String url="jdbc:postgresql://localhost:5432/proyecto_final"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
        contador = 0;
         if (txf_cedula.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS");
         }else
         {
            try 
            {
                Connection BaseDatos = null;
                Statement st = null;
                BaseDatos = DriverManager.getConnection(url, usuario, contrasena);

                st = BaseDatos.createStatement();
                ResultSet rs = st.executeQuery("SELECT SUM(subtotal) AS subtotal FROM public.factura, public.registro_usuario WHERE factura.fecha_venta = '"+txf_fechaVenta.getText()+"' AND registro_usuario.cedula = '"+txf_cedula.getText()+"';");                   
                while (rs.next()) 
                {
                    busquedaPrecio[0]  = rs.getString("subtotal");
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
                double iva =  (Double.parseDouble(busquedaPrecio[0]) * 0.12);
                double total = (Double.parseDouble(busquedaPrecio[0]) * 1.12);
                txf_bubTotal.setText(busquedaPrecio[0]);
                txf_iva.setText(formato.format(iva));
                txf_total.setText(formato.format(total));
            }
         }
    }
    
    public void busquedaIDProducto() 
    {
        String url="jdbc:postgresql://localhost:5432/proyecto_final"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
        contador = 0;
         if (txf_codigoProducto.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR EL CODIGO DEL PRODUCTO");
         }else
         {
            try 
            {
                Connection BaseDatos = null;
                Statement st = null;
                BaseDatos = DriverManager.getConnection(url, usuario, contrasena);

                st = BaseDatos.createStatement();
                ResultSet rs = st.executeQuery("SELECT MIN (id) AS id, SUM (stock) AS stock, codigo, producto, valor_unidad, marca FROM public.registro_producto WHERE codigo = '"+txf_codigoProducto.getText()+"' GROUP BY codigo, producto, valor_unidad, marca;");                   
                while (rs.next()) 
                {
                    busquedaProducto[0]  = rs.getString("id");
                    busquedaProducto[1]  = rs.getString("stock");
                    busquedaProducto[2] = rs.getString("codigo");
                    busquedaProducto[3] = rs.getString("producto");  
                    busquedaProducto[4] = rs.getString("valor_unidad");
                    busquedaProducto[5] = rs.getString("marca");
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
                
            }
         }
    }
    
    public void busquedaIDUsuario() 
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
                ResultSet rs = st.executeQuery("SELECT id, apellidos, nombres, celular, direccion_domicilio, ciudad, provincia, fecha_registro FROM public.registro_usuario WHERE cedula = '"+txf_cedula.getText()+"';;");                   
                while (rs.next()) 
                {
                    busquedaUsuario[0]  = rs.getString("id");
                    busquedaUsuario[1]  = rs.getString("apellidos");
                    busquedaUsuario[2] = rs.getString("nombres");
                    busquedaUsuario[3] = rs.getString("celular");  
                    busquedaUsuario[4] = rs.getString("direccion_domicilio");
                    busquedaUsuario[5] = rs.getString("ciudad");
                    busquedaUsuario[6] = rs.getString("provincia");
                    busquedaUsuario[7] = rs.getString("fecha_registro");
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
                lbl_usuarioBuscado.setText(busquedaUsuario[1] + " " + busquedaUsuario[2]);
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
        txf_cantidad.setText("");
        txf_codigoProducto.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Atras;
    private javax.swing.JLabel lbl_botonBorrar;
    private javax.swing.JLabel lbl_botonBusqueda;
    private javax.swing.JLabel lbl_botonCarritoCompra;
    private javax.swing.JLabel lbl_botonGuardar;
    private javax.swing.JLabel lbl_usuarioBuscado;
    private javax.swing.JPanel pnl_AlumnosMatriculados;
    private javax.swing.JPanel pnl_Cursos;
    private javax.swing.JPanel pnl_DatosMatriculados;
    private javax.swing.JPanel pnl_Postulantes7;
    private javax.swing.JPanel pnl_RegistroCursos;
    private javax.swing.JPanel pnl_RegistroPostulante7;
    private javax.swing.JPanel pnl_escritorio;
    private javax.swing.JTable tb_compras;
    private javax.swing.JScrollPane tb_contenedora;
    private javax.swing.JTextField txf_bubTotal;
    private javax.swing.JTextField txf_cantidad;
    private javax.swing.JTextField txf_cedula;
    private javax.swing.JTextField txf_codigoProducto;
    private javax.swing.JTextField txf_fechaVenta;
    private javax.swing.JTextField txf_iva;
    private javax.swing.JTextField txf_total;
    // End of variables declaration//GEN-END:variables
}
