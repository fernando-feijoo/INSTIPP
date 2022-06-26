package ProyectoFinal;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroProductos extends javax.swing.JInternalFrame {

    Color ColorVerde1 = new Color(110, 222, 56);
    Color ColorOscuro1 = new Color(102,102,102);
    Color ColorVerde2 = new Color(255, 153, 153);
    Color ColorOscuro2 = new Color(153,153,153);
    MenuPrincipal MPrincipal = new MenuPrincipal();
    String[] busquedaProducto = new String[5];
    int contador = 0, validador = 0;
    public RegistroProductos() {
        initComponents();
        lbl_botonMasOpciones.setVisible(false);
        lbl_botonBusqueda.setVisible(true);
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_escritorio = new javax.swing.JPanel();
        lbl_Atras = new javax.swing.JLabel();
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
        pnl_Postulantes7 = new javax.swing.JPanel();
        pnl_RegistroPostulante7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_botonEliminar = new javax.swing.JLabel();
        lbl_botonActualizar = new javax.swing.JLabel();
        lbl_botonGuardar = new javax.swing.JLabel();
        lbl_botonMasOpciones = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txf_codigo = new javax.swing.JTextField();
        txf_producto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txf_marca = new javax.swing.JTextField();
        txf_valorUnidad = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txf_stock = new javax.swing.JTextField();
        lbl_botonBusqueda = new javax.swing.JLabel();
        contenedorTabla = new javax.swing.JPanel();
        tb_contenedora = new javax.swing.JScrollPane();
        tb_tablaProductos = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1435, 663));
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

        pnl_Matriculas.setBackground(new java.awt.Color(153, 153, 153));
        pnl_Matriculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap(60, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_DatosMatriculadosLayout.setVerticalGroup(
            pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_AlumnosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DatosMatriculadosLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(48, 48, 48))
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 252));
        jPanel1.setMaximumSize(new java.awt.Dimension(1003, 476));
        jPanel1.setPreferredSize(new java.awt.Dimension(1003, 476));

        jPanel2.setBackground(new java.awt.Color(255, 255, 252));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(157, 132));
        jPanel2.setMinimumSize(new java.awt.Dimension(156, 206));
        jPanel2.setPreferredSize(new java.awt.Dimension(157, 132));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_botonEliminar)
                    .addComponent(lbl_botonActualizar)
                    .addComponent(lbl_botonGuardar))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_botonEliminar)
                .addGap(18, 18, 18)
                .addComponent(lbl_botonActualizar)
                .addGap(18, 18, 18)
                .addComponent(lbl_botonGuardar)
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 252));

        jLabel17.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("REGISTRO DE PRODUCTOS");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("PRODUCTO:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CODIGO:");

        txf_codigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txf_producto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("VALOR UNIDAD:");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("MARCA:");

        txf_marca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txf_valorUnidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("STOCK:");

        txf_stock.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbl_botonBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoFinal/buscar 24px.png"))); // NOI18N
        lbl_botonBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonBusquedaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txf_marca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addComponent(txf_valorUnidad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_producto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_codigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_stock))
                        .addGap(3, 3, 3)
                        .addComponent(lbl_botonBusqueda)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel17)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_botonBusqueda))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txf_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txf_valorUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        tb_tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_contenedora.setViewportView(tb_tablaProductos);

        javax.swing.GroupLayout contenedorTablaLayout = new javax.swing.GroupLayout(contenedorTabla);
        contenedorTabla.setLayout(contenedorTablaLayout);
        contenedorTablaLayout.setHorizontalGroup(
            contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_contenedora, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        contenedorTablaLayout.setVerticalGroup(
            contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_contenedora, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_botonMasOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(lbl_botonMasOpciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 423, Short.MAX_VALUE)
                    .addComponent(contenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout pnl_escritorioLayout = new javax.swing.GroupLayout(pnl_escritorio);
        pnl_escritorio.setLayout(pnl_escritorioLayout);
        pnl_escritorioLayout.setHorizontalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Atras)
                    .addComponent(pnl_DatosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Matriculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Postulantes7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(499, 499, 499))
        );
        pnl_escritorioLayout.setVerticalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                    .addGroup(pnl_escritorioLayout.createSequentialGroup()
                        .addComponent(lbl_Atras)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_Postulantes7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lbl_botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonEliminarMouseClicked
        validador++;
        txf_producto.setEditable(false);
        txf_valorUnidad.setEditable(false);
        txf_marca.setEditable(false);
        txf_stock.setEditable(false);
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
            validador = 0;
        }
    }//GEN-LAST:event_lbl_botonEliminarMouseClicked

    private void lbl_botonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonActualizarMouseClicked
        validador++;
        txf_stock.setEditable(false);
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
            validador = 0;
        }
    }//GEN-LAST:event_lbl_botonGuardarMouseClicked

    private void lbl_botonMasOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonMasOpcionesMouseClicked
        borrarDatos();
        txf_stock.setEditable(true);
        txf_producto.setEditable(true);
        txf_valorUnidad.setEditable(true);
        txf_marca.setEditable(true);
        txf_stock.setEditable(true);
        lbl_botonMasOpciones.setVisible(false);
        lbl_botonBusqueda.setVisible(false);
        lbl_botonEliminar.setVisible(true);
        lbl_botonActualizar.setVisible(true);
        lbl_botonGuardar.setVisible(true);
        validador = 0;
    }//GEN-LAST:event_lbl_botonMasOpcionesMouseClicked

    private void lbl_botonBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonBusquedaMouseClicked
        // TODO add your handling code here:
        busquedaID();
    }//GEN-LAST:event_lbl_botonBusquedaMouseClicked
    
    public void guardar()
    { 
         contador = 0;
         if (txf_codigo.getText().equalsIgnoreCase("") || txf_producto.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS");
         }else
         {
                int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS GUARDAR LOS DATOS?", "CREACIÓN DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) 
                {
                    //validacion de Double precio >pendiente<
                    try
                    {
                       Class.forName("org.postgresql.Driver");
                       Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_final","postgres","FerDatos95"); 

                       Statement consulta = (Statement) conecta.createStatement();            
                       consulta.executeUpdate("INSERT INTO public.registro_producto (codigo, producto, valor_unidad, marca, stock)VALUES ('"+txf_codigo.getText()+"', '"+txf_producto.getText()+"', '"+Double.parseDouble(txf_valorUnidad.getText())+"', '"+txf_marca.getText()+"', '"+txf_stock.getText()+"');");
                                               
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
         if (txf_codigo.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS DE CODIGO");
         }else
         {
             int codigo=JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS ELIMINAR LOS DATOS?", "ELIMINACION DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
             if (codigo == JOptionPane.YES_OPTION) 
             {
                 try
                 {
                    Class.forName("org.postgresql.Driver");
                    Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_final","postgres","FerDatos95"); 

                    Statement consulta=(Statement) conecta.createStatement();            
                    consulta.executeUpdate("DELETE FROM public.registro_producto WHERE codigo = '"+txf_codigo.getText()+"';");

                    conecta.close();
                    JOptionPane.showMessageDialog(null,"Registro eliminado correctamente");
                    cargar();
                    
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
              }
           }
     }
    
    public void actualizar()
    { 
         contador = 0;
         if (txf_codigo.getText().equalsIgnoreCase("") || txf_producto.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS");
         }else
         {
                int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS ACTUALIZAR LOS DATOS?", "ACTUALIZACIÓN DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) 
                {
                    try
                    {
                       Class.forName("org.postgresql.Driver");
                       Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_final","postgres","FerDatos95"); 

                       Statement consulta = (Statement) conecta.createStatement();            
                       consulta.executeUpdate("UPDATE public.registro_producto SET codigo = '"+txf_codigo.getText()+"', producto = '"+txf_producto.getText()+"', valor_unidad = '"+Double.parseDouble(txf_valorUnidad.getText())+"', marca = '"+txf_marca.getText()+"' WHERE codigo = '"+txf_codigo.getText()+"';");
                                               
                       conecta.close();
                       JOptionPane.showMessageDialog(null,"Registro guardado correctamente");
                       cargar();

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
    }
    
    public void cargar() 
    {
        String url="jdbc:postgresql://localhost:5432/proyecto_final"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
    
    
        DefaultTableModel tabla = new DefaultTableModel();
        String[] datos = new String[4];   
        tabla.addColumn("Stock");
        tabla.addColumn("Codigo");
        tabla.addColumn("Productos");
        tabla.addColumn("P.V.P");
        tb_tablaProductos.setModel(tabla);
        try 
        {
            Connection BaseDatos = null;
            Statement st = null;
            BaseDatos = DriverManager.getConnection(url, usuario, contrasena);
       
            st = BaseDatos.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(stock) AS stock, codigo, producto, valor_unidad FROM public.registro_producto GROUP BY codigo, producto, valor_unidad;");                   
                   
            while    ( rs.next() ) 
            {
                    datos[0]  = rs.getString("stock");
                    datos[1] = rs.getString("codigo");
                    datos[2] = rs.getString("producto");  
                    datos[3] = rs.getString("valor_unidad");
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
         if (txf_codigo.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS DE CODIGO");
         }else
         {
            try 
            {
                Connection BaseDatos = null;
                Statement st = null;
                BaseDatos = DriverManager.getConnection(url, usuario, contrasena);

                st = BaseDatos.createStatement();
                ResultSet rs = st.executeQuery("SELECT SUM (stock) AS stock, codigo, producto, valor_unidad, marca FROM public.registro_producto WHERE codigo = '"+txf_codigo.getText()+"' GROUP BY codigo, producto, valor_unidad, marca;");                   
                while (rs.next()) 
                {
                    busquedaProducto[0]  = rs.getString("stock");
                    busquedaProducto[1] = rs.getString("codigo");
                    busquedaProducto[2] = rs.getString("producto");  
                    busquedaProducto[3] = rs.getString("valor_unidad");
                    busquedaProducto[4] = rs.getString("marca");
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
                txf_producto.setText(busquedaProducto[2]);
                txf_valorUnidad.setText(busquedaProducto[3]);
                txf_marca.setText(busquedaProducto[4]);
                txf_stock.setText(busquedaProducto[0]);
            }
         }
    }
    
    public void borrarDatos()
    {
        txf_codigo.setText("");
        txf_producto.setText("");
        txf_valorUnidad.setText("");
        txf_marca.setText("");
        txf_stock.setText("");
    }
    
    public boolean validacionInteger(String cadena)
    {
        int num;
        try
        {
            num = Integer.parseInt(cadena);
            return true;
        }catch(Exception e)
        {
            return false;
        }
    }
    
    public boolean validacionDouble(String cadena)
    {
        double num;
        try
        {
            num = Double.parseDouble(cadena);
            return true;
        }catch(Exception e)
        {
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorTabla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_Atras;
    private javax.swing.JLabel lbl_botonActualizar;
    private javax.swing.JLabel lbl_botonBusqueda;
    private javax.swing.JLabel lbl_botonEliminar;
    private javax.swing.JLabel lbl_botonGuardar;
    private javax.swing.JLabel lbl_botonMasOpciones;
    private javax.swing.JPanel pnl_AlumnosMatriculados;
    private javax.swing.JPanel pnl_DatosMatriculados;
    private javax.swing.JPanel pnl_Matriculas;
    private javax.swing.JPanel pnl_Postulantes7;
    private javax.swing.JPanel pnl_RegistroMatriculas;
    private javax.swing.JPanel pnl_RegistroPostulante7;
    private javax.swing.JPanel pnl_escritorio;
    private javax.swing.JScrollPane tb_contenedora;
    private javax.swing.JTable tb_tablaProductos;
    private javax.swing.JTextField txf_codigo;
    private javax.swing.JTextField txf_marca;
    private javax.swing.JTextField txf_producto;
    private javax.swing.JTextField txf_stock;
    private javax.swing.JTextField txf_valorUnidad;
    // End of variables declaration//GEN-END:variables
}
