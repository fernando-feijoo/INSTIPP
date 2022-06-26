package ProyectoDeClase;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegistroMatriculas extends javax.swing.JInternalFrame {

    Color ColorVerde1 = new Color(110, 222, 56);
    Color ColorOscuro1 = new Color(102,102,102);
    Color ColorVerde2 = new Color(255, 153, 153);
    Color ColorOscuro2 = new Color(153,153,153);
    MenuPrincipal MPrincipal = new MenuPrincipal();
    int contador;
    String[] x = new String[2];
    String[] datos = new String[7];
    public RegistroMatriculas() {
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
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txf_fecha = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_observaciones = new javax.swing.JTextArea();
        btn_guardar = new javax.swing.JButton();
        txf_alumnoBuscado = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txf_alumnoResultado = new javax.swing.JTextField();
        lbl_busquedaBoton = new javax.swing.JLabel();
        lbl_botonEliminar = new javax.swing.JLabel();
        lbl_botonActualizar = new javax.swing.JLabel();
        txf_curso = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1435, 663));
        setVisible(false);

        pnl_escritorio.setBackground(new java.awt.Color(204, 204, 204));

        lbl_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/Inicio 64px.png"))); // NOI18N
        lbl_Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AtrasMouseClicked(evt);
            }
        });

        pnl_Postulantes7.setBackground(new java.awt.Color(153, 153, 153));
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/RPostulante 125px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("REGISTRAR");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("POSTULANTES");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Postulantes7Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(pnl_Postulantes7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_DatosMatriculados.setBackground(new java.awt.Color(153, 153, 153));
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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/IcoBaseDatos 128px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setText("ALUMNOS");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setText("MARTICULADOS");

        javax.swing.GroupLayout pnl_DatosMatriculadosLayout = new javax.swing.GroupLayout(pnl_DatosMatriculados);
        pnl_DatosMatriculados.setLayout(pnl_DatosMatriculadosLayout);
        pnl_DatosMatriculadosLayout.setHorizontalGroup(
            pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DatosMatriculadosLayout.createSequentialGroup()
                .addComponent(pnl_AlumnosMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap())
        );
        pnl_DatosMatriculadosLayout.setVerticalGroup(
            pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_AlumnosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addGroup(pnl_DatosMatriculadosLayout.createSequentialGroup()
                .addGroup(pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_DatosMatriculadosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel13))
                    .addGroup(pnl_DatosMatriculadosLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnl_Cursos.setBackground(new java.awt.Color(153, 153, 153));
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/RCursos 128px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("REGISTRAR");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setText("CURSOS");

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
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnl_CursosLayout.setVerticalGroup(
            pnl_CursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroCursos, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CursosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_CursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CursosLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CursosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(58, 58, 58))))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 252));

        jLabel17.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("REGISTRO DE MATRICULAS");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("CEDULA ASPIRANTE:");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("CURSO:");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("FECHA POSTULA:");

        txf_fecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("OBSERVACIONES:");

        txa_observaciones.setColumns(20);
        txa_observaciones.setRows(5);
        jScrollPane1.setViewportView(txa_observaciones);

        btn_guardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        txf_alumnoBuscado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("RESULTADO BUSQUEDA:");

        txf_alumnoResultado.setEditable(false);
        txf_alumnoResultado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbl_busquedaBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/buscar 24px.png"))); // NOI18N
        lbl_busquedaBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_busquedaBotonMouseClicked(evt);
            }
        });

        lbl_botonEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_botonEliminar.setForeground(new java.awt.Color(102, 102, 102));
        lbl_botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/Eliminar 32px.png"))); // NOI18N
        lbl_botonEliminar.setText("ELIMINAR");
        lbl_botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonEliminarMouseClicked(evt);
            }
        });

        lbl_botonActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_botonActualizar.setForeground(new java.awt.Color(102, 102, 102));
        lbl_botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/actualizar 32px.png"))); // NOI18N
        lbl_botonActualizar.setText("ACTUALIZAR");
        lbl_botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonActualizarMouseClicked(evt);
            }
        });

        txf_curso.setEditable(false);
        txf_curso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btn_limpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel17))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(txf_alumnoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_guardar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txf_fecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(txf_curso))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txf_alumnoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbl_busquedaBoton)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_botonActualizar)
                            .addComponent(lbl_botonEliminar))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel17)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txf_alumnoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_botonEliminar)
                        .addGap(21, 21, 21)
                        .addComponent(lbl_botonActualizar)
                        .addGap(41, 41, 41)
                        .addComponent(lbl_busquedaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txf_alumnoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txf_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_limpiar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout pnl_escritorioLayout = new javax.swing.GroupLayout(pnl_escritorio);
        pnl_escritorio.setLayout(pnl_escritorioLayout);
        pnl_escritorioLayout.setHorizontalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Atras)
                    .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnl_DatosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl_Postulantes7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_escritorioLayout.setVerticalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_escritorioLayout.createSequentialGroup()
                        .addComponent(lbl_Atras)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_Postulantes7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
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

    private void pnl_Postulantes7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_Postulantes7MouseClicked
        RegistroPostulantes PanelPostulantes = new RegistroPostulantes();
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
        AlumnosMatriculados PanelBaseDatos = new AlumnosMatriculados();
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
        RegistroCurso PanelCurso = new RegistroCurso();
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

    private void lbl_busquedaBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_busquedaBotonMouseClicked
        Busqueda();
    }//GEN-LAST:event_lbl_busquedaBotonMouseClicked

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        busquedaID();
        guardar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txf_alumnoBuscado.setText("");
        txf_fecha.setText("");
        txa_observaciones.setText("");
        txf_alumnoResultado.setText("");
        txf_curso.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void lbl_botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonEliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_lbl_botonEliminarMouseClicked

    private void lbl_botonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonActualizarMouseClicked
        busquedaID();
        actualizar();
    }//GEN-LAST:event_lbl_botonActualizarMouseClicked
    
    public void Busqueda() 
    {
        String url="jdbc:postgresql://localhost:5432/postgres"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
           
        try 
        {
            Connection BaseDatos = null;
            Statement st = null;
            BaseDatos = DriverManager.getConnection(url, usuario, contrasena);
       
            st = BaseDatos.createStatement();
            ResultSet rs = st.executeQuery("SELECT id, apellidos, nombres, nivel_estudios, edad, curso_postular, estatura FROM public.registrar_alumnos WHERE cedula = '"+txf_alumnoBuscado.getText()+"';");                   
            while (rs.next()) 
            {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("apellidos");
                datos[2] = rs.getString("nombres");
                datos[3] = rs.getString("nivel_estudios");
                datos[4] = rs.getString("edad");
                datos[5] = rs.getString("curso_postular");
                datos[6] = rs.getString("estatura");
            }
            rs.close();
            st.close();
            BaseDatos.close();
            if (datos[1] != null && datos[2] != null) 
            {
                txf_alumnoResultado.setText(datos[1] + " " + datos[2]);
                txf_curso.setText(datos[5]);
                
            }else
            {
                txf_alumnoResultado.setText("NO HAY COINCIDENCIAS");
                txf_curso.setText("NO HAY COINCIDENCIAS");
            }
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this,"Error al cargar datos");
        } 
    }
    
    public void busquedaID() 
    {
        String url="jdbc:postgresql://localhost:5432/postgres"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
    
        try 
        {
            Connection BaseDatos = null;
            Statement st = null;
            BaseDatos = DriverManager.getConnection(url, usuario, contrasena);
       
            st = BaseDatos.createStatement();
            ResultSet rs = st.executeQuery("SELECT public.registrar_alumnos.id AS idAlumno, registrar_cursos.id AS idCurso FROM public.registrar_alumnos, public.registrar_cursos WHERE registrar_alumnos.curso_postular = registrar_cursos.cursos_registrar AND registrar_alumnos.cedula = '"+txf_alumnoBuscado.getText()+"';");                   
            while (rs.next()) 
            {
                x[0] = rs.getString("idAlumno");
                x[1] = rs.getString("idCurso");
            }
            rs.close();
            st.close();
            BaseDatos.close();
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error al cargar datos");
        }
    }
    
    public void guardar()
    { 
         int val = 0;
         if (txf_alumnoBuscado.getText().equalsIgnoreCase("")) 
         {
           JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS DE BUSQUEDA");
         }
         if(datos[5].equalsIgnoreCase("ESPECIALISTA"))
         {
             if(Double.parseDouble(datos[6]) <= 1.69 || !datos[3].equalsIgnoreCase("educacion superior"))
             {
                JOptionPane.showMessageDialog(null, "NO CUMPLE CON LOS REQUISITOS PARA ESPECIALISTA");
             }
             val++;
         }
            if(datos[5].equalsIgnoreCase("oficial") && Double.parseDouble(datos[6]) <= 1.69)
            {
                JOptionPane.showMessageDialog(null, "NO CUMPLE CON LOS REQUISITOS PARA OFICIAL");
            }else
            {

           contador = 0;
           if(txf_fecha.getText().equalsIgnoreCase(""))
           {
               JOptionPane.showMessageDialog(null, "DEBE COLOCAR LA FECHA");
           }else
           {
                  int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS GUARDAR LOS DATOS?", "CREACIÓN DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                  if (codigo == JOptionPane.YES_OPTION) 
                  {
                      int idAlumno = Integer.parseInt(x[0]);
                      int idCurso = Integer.parseInt(x[1]);
                      try
                      {
                         Class.forName("org.postgresql.Driver");
                         Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","FerDatos95"); 

                         Statement consulta = (Statement) conecta.createStatement();            
                         consulta.executeUpdate("INSERT INTO public.registrar_matriculas(id_registrar_alumnos, id_registrar_cursos, fecha_registro, observacion) VALUES ('"+idAlumno+"', '"+idCurso+"', '"+txf_fecha.getText()+"', '"+txa_observaciones.getText()+"');");

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
                         txf_alumnoBuscado.setText("");
                         txf_fecha.setText("");
                         txa_observaciones.setText("");
                         txf_alumnoResultado.setText("");
                         txf_curso.setText("");
                      }
                  }
              }
         }
    }
    
    public void eliminar()
    { 
         contador = 0;
         if (txf_alumnoBuscado.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS DE BUSQUEDA");
         }else
         {
             int codigo=JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS ELIMINAR LOS DATOS?", "ELIMINACION DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
             if (codigo == JOptionPane.YES_OPTION) 
             {
                 try
                 {
                    Class.forName("org.postgresql.Driver");
                    Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","FerDatos95"); 

                    Statement consulta=(Statement) conecta.createStatement();            
                    consulta.executeUpdate("DELETE FROM public.registrar_matriculas WHERE id = '"+Integer.parseInt(datos[0])+"';");

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
                    txf_alumnoBuscado.setText("");
                    txf_fecha.setText("");
                    txa_observaciones.setText("");
                    txf_alumnoResultado.setText("");
                    txf_curso.setText("");
                 }
              }
           }
     }
    
    public void actualizar()
    { 
         contador = 0;
         if (txf_alumnoBuscado.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LOS DATOS DE BUSQUEDA");
         }else
         {
                int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS ACTUALIZAR LOS DATOS?", "ACTUALIZACIÓN DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) 
                {
                    int idAlumno = Integer.parseInt(x[0]);
                    int idCurso = Integer.parseInt(x[1]);
                    try
                    {
                       Class.forName("org.postgresql.Driver");
                       Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","FerDatos95"); 

                       Statement consulta = (Statement) conecta.createStatement();            
                       consulta.executeUpdate("UPDATE public.registrar_matriculas SET id_registrar_alumnos = '"+idAlumno+"', id_registrar_cursos = '"+idCurso+"', fecha_registro = '"+txf_fecha.getText()+"', observacion = '"+txa_observaciones.getText()+"' WHERE id = '"+Integer.parseInt(datos[0])+"';");
                                               
                       conecta.close();
                       JOptionPane.showMessageDialog(null,"Registro guardado correctamente");

                    } catch(SQLException e)
                    {
                       JOptionPane.showMessageDialog(null,"Error al actualizar datos ");
                       contador++;

                    } catch(ClassNotFoundException e)
                    {
                       JOptionPane.showMessageDialog(null,"Error inesperado");
                       contador++;
                    }
                    if (contador != 1) 
                    {
                       txf_alumnoBuscado.setText("");
                       txf_fecha.setText("");
                       txa_observaciones.setText("");
                       txf_alumnoResultado.setText("");
                       txf_curso.setText("");
                    }
                }
         }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Atras;
    private javax.swing.JLabel lbl_botonActualizar;
    private javax.swing.JLabel lbl_botonEliminar;
    private javax.swing.JLabel lbl_busquedaBoton;
    private javax.swing.JPanel pnl_AlumnosMatriculados;
    private javax.swing.JPanel pnl_Cursos;
    private javax.swing.JPanel pnl_DatosMatriculados;
    private javax.swing.JPanel pnl_Postulantes7;
    private javax.swing.JPanel pnl_RegistroCursos;
    private javax.swing.JPanel pnl_RegistroPostulante7;
    private javax.swing.JPanel pnl_escritorio;
    private javax.swing.JTextArea txa_observaciones;
    private javax.swing.JTextField txf_alumnoBuscado;
    private javax.swing.JTextField txf_alumnoResultado;
    private javax.swing.JTextField txf_curso;
    private javax.swing.JTextField txf_fecha;
    // End of variables declaration//GEN-END:variables
}
