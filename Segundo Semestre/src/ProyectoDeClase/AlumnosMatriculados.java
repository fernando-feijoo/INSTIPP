package ProyectoDeClase;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlumnosMatriculados extends javax.swing.JInternalFrame {

    Color ColorVerde1 = new Color(110, 222, 56);
    Color ColorOscuro1 = new Color(102,102,102);
    Color ColorVerde2 = new Color(255, 153, 153);
    Color ColorOscuro2 = new Color(153,153,153);
    MenuPrincipal MPrincipal = new MenuPrincipal();
    public AlumnosMatriculados() {
        initComponents();
        cargar();
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
        jPanel1 = new javax.swing.JPanel();
        tb_tablaContenedor = new javax.swing.JScrollPane();
        tb_tabla = new javax.swing.JTable();

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
        pnl_Matriculas.setPreferredSize(new java.awt.Dimension(390, 163));
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
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(pnl_MatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MatriculasLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MatriculasLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(46, 46, 46))))
        );

        tb_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_tablaContenedor.setViewportView(tb_tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_tablaContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_tablaContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_escritorioLayout = new javax.swing.GroupLayout(pnl_escritorio);
        pnl_escritorio.setLayout(pnl_escritorioLayout);
        pnl_escritorioLayout.setHorizontalGroup(
            pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_Atras, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl_Postulantes7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl_Cursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnl_Matriculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(18, 18, 18)
                        .addComponent(pnl_Matriculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 49, Short.MAX_VALUE)))
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

    public void cargar() 
    {
        String url="jdbc:postgresql://localhost:5432/postgres"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
    
    
        DefaultTableModel tabla = new DefaultTableModel();
        String[] datos = new String[5];   
        tabla.addColumn("Cedula");
        tabla.addColumn("Apellidos");
        tabla.addColumn("Nombres");
        tabla.addColumn("Cursos");
        tabla.addColumn("Edad");
        tb_tabla.setModel(tabla);
        try 
        {
            Connection BaseDatos = null;
            Statement st = null;
            BaseDatos = DriverManager.getConnection(url, usuario, contrasena);
       
            st = BaseDatos.createStatement();
            ResultSet rs = st.executeQuery("SELECT public.registrar_alumnos.cedula AS cedula, registrar_alumnos.apellidos AS apellidos, registrar_alumnos.nombres AS nombres, registrar_cursos.cursos_registrar AS curso, registrar_alumnos.edad AS edad FROM public.registrar_alumnos, public.registrar_cursos, public.registrar_matriculas WHERE registrar_alumnos.id = registrar_matriculas.id_registrar_alumnos AND registrar_cursos.id = registrar_matriculas.id_registrar_cursos;");                   
                   
            while    ( rs.next() ) 
            {
                    datos[0]  = rs.getString("cedula");
                    datos[1] = rs.getString("apellidos");
                    datos[2] = rs.getString("nombres");  
                    datos[3] = rs.getString("curso");
                    datos[4] = rs.getString("edad");
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
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Atras;
    private javax.swing.JPanel pnl_Cursos;
    private javax.swing.JPanel pnl_Matriculas;
    private javax.swing.JPanel pnl_Postulantes7;
    private javax.swing.JPanel pnl_RegistroCursos;
    private javax.swing.JPanel pnl_RegistroMatriculas;
    private javax.swing.JPanel pnl_RegistroPostulante7;
    private javax.swing.JPanel pnl_escritorio;
    private javax.swing.JTable tb_tabla;
    private javax.swing.JScrollPane tb_tablaContenedor;
    // End of variables declaration//GEN-END:variables
}
