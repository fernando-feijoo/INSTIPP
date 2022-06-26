package ProyectoDeClase;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegistroPostulantes extends javax.swing.JInternalFrame {

    Color ColorVerde1 = new Color(110, 222, 56);
    Color ColorOscuro1 = new Color(102,102,102);
    Color ColorVerde2 = new Color(255, 153, 153);
    Color ColorOscuro2 = new Color(153,153,153);
    MenuPrincipal MPrincipal = new MenuPrincipal();
    int contador = 0;
    public RegistroPostulantes() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txf_cedula = new javax.swing.JTextField();
        txf_apellidos = new javax.swing.JTextField();
        txf_nombres = new javax.swing.JTextField();
        cbx_nivelEstudio = new javax.swing.JComboBox<>();
        txf_edad = new javax.swing.JTextField();
        cbx_cursoPostular = new javax.swing.JComboBox<>();
        txf_estatura = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cbx_sexo = new javax.swing.JComboBox<>();
        lbl_botonActualizar = new javax.swing.JLabel();
        lbl_botonEliminar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(null);
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1435, 663));
        setVisible(false);

        pnl_escritorio.setBackground(new java.awt.Color(204, 204, 204));

        lbl_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/Inicio 64px.png"))); // NOI18N
        lbl_Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AtrasMouseClicked(evt);
            }
        });

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

        pnl_Matriculas.setBackground(new java.awt.Color(153, 153, 153));
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/RMatricula 128px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("REGISTRAR");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("MATRICULAS");

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
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnl_MatriculasLayout.setVerticalGroup(
            pnl_MatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroMatriculas, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MatriculasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(pnl_MatriculasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DatosMatriculadosLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(20, 20, 20))
            .addGroup(pnl_DatosMatriculadosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_formulario.setBackground(new java.awt.Color(255, 255, 252));
        pnl_formulario.setPreferredSize(new java.awt.Dimension(1003, 616));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CEDULA:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("APELLIDOS:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRES:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NIVEL DE ESTUDIO:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("EDAD:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CURSO A POSTULAR:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("ESTATURA:");

        txf_cedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txf_apellidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txf_nombres.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cbx_nivelEstudio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbx_nivelEstudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "EDUCACION BASICA", "EDUCACION SECUNDARIA", "EDUCACION SUPERIOR" }));

        txf_edad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cbx_cursoPostular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbx_cursoPostular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "OFICIAL", "TROPA", "ESPECIALISTA" }));

        txf_estatura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("REGISTRO DE POSTULANTES");

        btn_guardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("SEXO:");

        cbx_sexo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbx_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "MASCULINO", "FEMENINO" }));

        lbl_botonActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_botonActualizar.setForeground(new java.awt.Color(102, 102, 102));
        lbl_botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/actualizar 32px.png"))); // NOI18N
        lbl_botonActualizar.setText("ACTUALIZAR");
        lbl_botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonActualizarMouseClicked(evt);
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

        javax.swing.GroupLayout pnl_formularioLayout = new javax.swing.GroupLayout(pnl_formulario);
        pnl_formulario.setLayout(pnl_formularioLayout);
        pnl_formularioLayout.setHorizontalGroup(
            pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_formularioLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_formularioLayout.createSequentialGroup()
                        .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_formularioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_guardar))
                            .addGroup(pnl_formularioLayout.createSequentialGroup()
                                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel18))
                                .addGap(30, 30, 30)
                                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_sexo, 0, 341, Short.MAX_VALUE)
                                    .addComponent(txf_estatura)
                                    .addComponent(cbx_cursoPostular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txf_edad)
                                    .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txf_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                        .addComponent(txf_apellidos)
                                        .addComponent(txf_nombres)
                                        .addComponent(cbx_nivelEstudio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(15, 15, 15)))
                .addGap(75, 75, 75)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_botonActualizar)
                    .addComponent(lbl_botonEliminar))
                .addContainerGap())
        );
        pnl_formularioLayout.setVerticalGroup(
            pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_formularioLayout.createSequentialGroup()
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_formularioLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel17))
                    .addGroup(pnl_formularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_botonEliminar)
                        .addGap(21, 21, 21)
                        .addComponent(lbl_botonActualizar)))
                .addGap(49, 49, 49)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txf_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_nivelEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cbx_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbx_cursoPostular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txf_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btn_guardar)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_escritorioLayout = new javax.swing.GroupLayout(pnl_escritorio);
        pnl_escritorio.setLayout(pnl_escritorioLayout);
        pnl_escritorioLayout.setHorizontalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_Matriculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_DatosMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Atras))
                .addGap(18, 18, 18)
                .addComponent(pnl_formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_escritorioLayout.setVerticalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_escritorioLayout.createSequentialGroup()
                        .addComponent(lbl_Atras)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl_Matriculas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void pnl_MatriculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_MatriculasMouseClicked
        RegistroMatriculas PanelMatriculas = new RegistroMatriculas();
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

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        guardar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void lbl_botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonEliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_lbl_botonEliminarMouseClicked

    private void lbl_botonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonActualizarMouseClicked
        actualizar();
    }//GEN-LAST:event_lbl_botonActualizarMouseClicked
    
    public void guardar()
    { 
         contador = 0;
         if (txf_cedula.getText().equalsIgnoreCase("") || txf_apellidos.getText().equalsIgnoreCase("") || txf_nombres.getText().equalsIgnoreCase("") || txf_estatura.getText().equalsIgnoreCase("") || txf_edad.getText().equalsIgnoreCase("")) 
         {
             JOptionPane.showMessageDialog(null, "DEBE COLOCAR TODOS LOS DATOS");
         }else if(Integer.parseInt(txf_edad.getText()) < 18)
         {
             JOptionPane.showMessageDialog(null, "DEBE SER  MAYOR DE EDAD");
         }else
         {
            boolean v = validacionInteger(txf_edad.getText());
            boolean v2 = validacionDouble(txf_estatura.getText());
            if (v != false && v2 != false) 
            {
                int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS GUARDAR LOS DATOS?", "CREACIÓN DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) 
                {
                    int edad = Integer.parseInt(txf_edad.getText());
                    double estatura = Double.parseDouble(txf_estatura.getText());
                    try
                    {
                       Class.forName("org.postgresql.Driver");
                       Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","FerDatos95"); 

                       Statement consulta = (Statement) conecta.createStatement();            
                       consulta.executeUpdate("INSERT INTO public.registrar_alumnos(cedula, apellidos, nombres, nivel_estudios, edad, sexo, curso_postular, estatura)VALUES "
                                               + "('"+txf_cedula.getText()+"', '"+txf_apellidos.getText()+"', '"+txf_nombres.getText()+"', '"+cbx_nivelEstudio.getSelectedItem()+"', '"+edad+"', '"+cbx_sexo.getSelectedItem()+"', '"+cbx_cursoPostular.getSelectedItem()+"', '"+estatura+"');");

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
                       txf_cedula.setText("");
                       txf_apellidos.setText("");
                       txf_nombres.setText("");
                       cbx_nivelEstudio.setSelectedItem("Seleccione una opción");
                       txf_edad.setText("");
                       cbx_sexo.setSelectedItem("Seleccione una opción");
                       cbx_cursoPostular.setSelectedItem("Seleccione una opción");
                       txf_estatura.setText("");
                    }
                }
            }else if(v == false)
            {
                JOptionPane.showMessageDialog(null, "ERROR EN EDAD");
            }else
            {
                JOptionPane.showMessageDialog(null, "ERROR EN LA ESTATURA");
            }
         }
    }
    
    public void eliminar()
    { 
         contador = 0;
         if (txf_cedula.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR LA CEDULA");
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
                    consulta.executeUpdate("DELETE FROM public.registrar_alumnos WHERE cedula = '"+txf_cedula.getText()+"';");

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
                    txf_cedula.setText("");
                    txf_apellidos.setText("");
                    txf_nombres.setText("");
                    cbx_nivelEstudio.setSelectedItem("Seleccione una opción");
                    txf_edad.setText("");
                    cbx_sexo.setSelectedItem("Seleccione una opción");
                    cbx_cursoPostular.setSelectedItem("Seleccione una opción");
                    txf_estatura.setText("");
                 }
              }
           }
     }
     
    public void actualizar()
    { 
         contador = 0;
         if (txf_cedula.getText().equalsIgnoreCase("") || txf_apellidos.getText().equalsIgnoreCase("") || txf_nombres.getText().equalsIgnoreCase("") || txf_estatura.getText().equalsIgnoreCase("") || txf_edad.getText().equalsIgnoreCase("")) 
         {
            JOptionPane.showMessageDialog(null, "DEBE COLOCAR TODOS LOS DATOS");
         }else
         {
            boolean v = validacionInteger(txf_edad.getText());
            boolean v2 = validacionDouble(txf_estatura.getText());
            if (v != false && v2 != false) 
            {
                int codigo = JOptionPane.showConfirmDialog(null, "¿SEGURO DESEAS ACTUALIZAR LOS DATOS?", "ACTUALIZACIÓN DE DATOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (codigo == JOptionPane.YES_OPTION) 
                {
                    int edad = Integer.parseInt(txf_edad.getText());
                    double estatura = Double.parseDouble(txf_estatura.getText());
                    try
                    {
                       Class.forName("org.postgresql.Driver");
                       Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","FerDatos95"); 

                       Statement consulta=(Statement) conecta.createStatement();            
                       consulta.executeUpdate("UPDATE public.registrar_alumnos SET cedula = '"+txf_cedula.getText()+"', apellidos = '"+txf_apellidos.getText()+"', nombres = '"+txf_nombres.getText()+"', nivel_estudios = '"+cbx_nivelEstudio.getSelectedItem()+"', edad = '"+edad+"', sexo = '"+cbx_sexo.getSelectedItem()+"', curso_postular = '"+cbx_cursoPostular.getSelectedItem()+"', estatura = '"+estatura+"' WHERE cedula = '"+txf_cedula.getText()+"';");

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
                       txf_cedula.setText("");
                       txf_apellidos.setText("");
                       txf_nombres.setText("");
                       cbx_nivelEstudio.setSelectedItem("Seleccione una opción");
                       txf_edad.setText("");
                       cbx_sexo.setSelectedItem("Seleccione una opción");
                       cbx_cursoPostular.setSelectedItem("Seleccione una opción");
                       txf_estatura.setText("");
                    }
                 }
            }else if(v == false)
            {
                JOptionPane.showMessageDialog(null, "ERROR EN EDAD");
            }else
            {
                JOptionPane.showMessageDialog(null, "ERROR EN LA ESTATURA");
            }
         }
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
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cbx_cursoPostular;
    private javax.swing.JComboBox<String> cbx_nivelEstudio;
    private javax.swing.JComboBox<String> cbx_sexo;
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
    private javax.swing.JLabel lbl_Atras;
    private javax.swing.JLabel lbl_botonActualizar;
    private javax.swing.JLabel lbl_botonEliminar;
    private javax.swing.JPanel pnl_AlumnosMatriculados;
    private javax.swing.JPanel pnl_Cursos;
    private javax.swing.JPanel pnl_DatosMatriculados;
    private javax.swing.JPanel pnl_Matriculas;
    private javax.swing.JPanel pnl_RegistroCursos;
    private javax.swing.JPanel pnl_RegistroMatriculas;
    private javax.swing.JPanel pnl_escritorio;
    private javax.swing.JPanel pnl_formulario;
    private javax.swing.JTextField txf_apellidos;
    private javax.swing.JTextField txf_cedula;
    private javax.swing.JTextField txf_edad;
    private javax.swing.JTextField txf_estatura;
    private javax.swing.JTextField txf_nombres;
    // End of variables declaration//GEN-END:variables
}
