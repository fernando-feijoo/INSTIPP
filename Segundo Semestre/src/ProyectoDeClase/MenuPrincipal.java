package ProyectoDeClase;
import java.awt.Color;
public class MenuPrincipal extends javax.swing.JInternalFrame {

    Color ColorVerde1 = new Color(110, 222, 56);
    Color ColorOscuro1 = new Color(102,102,102);
    Color ColorVerde2 = new Color(255, 153, 153);
    Color ColorOscuro2 = new Color(153,153,153);
    public MenuPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_escritorio2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnl_Postulantes = new javax.swing.JPanel();
        pnl_RegistroPostulante = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnl_Cursos = new javax.swing.JPanel();
        pnl_RegistroCursos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnl_DatosMatriculados = new javax.swing.JPanel();
        pnl_AlumnosMatriculados = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pnl_Matriculas = new javax.swing.JPanel();
        pnl_RegistroMatriculas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1435, 663));

        pnl_escritorio2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/PoliciaAnimadoM.png"))); // NOI18N

        pnl_Postulantes.setBackground(new java.awt.Color(153, 153, 153));
        pnl_Postulantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_PostulantesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_PostulantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_PostulantesMouseExited(evt);
            }
        });

        pnl_RegistroPostulante.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout pnl_RegistroPostulanteLayout = new javax.swing.GroupLayout(pnl_RegistroPostulante);
        pnl_RegistroPostulante.setLayout(pnl_RegistroPostulanteLayout);
        pnl_RegistroPostulanteLayout.setHorizontalGroup(
            pnl_RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnl_RegistroPostulanteLayout.setVerticalGroup(
            pnl_RegistroPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/RPostulante 125px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("REGISTRAR");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("POSTULANTES");

        javax.swing.GroupLayout pnl_PostulantesLayout = new javax.swing.GroupLayout(pnl_Postulantes);
        pnl_Postulantes.setLayout(pnl_PostulantesLayout);
        pnl_PostulantesLayout.setHorizontalGroup(
            pnl_PostulantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PostulantesLayout.createSequentialGroup()
                .addComponent(pnl_RegistroPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(pnl_PostulantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        pnl_PostulantesLayout.setVerticalGroup(
            pnl_PostulantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PostulantesLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(pnl_PostulantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PostulantesLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PostulantesLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
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
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(pnl_CursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_CursosLayout.setVerticalGroup(
            pnl_CursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CursosLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
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

        pnl_DatosMatriculados.setBackground(new java.awt.Color(153, 153, 153));
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
                .addGap(37, 37, 37)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        pnl_DatosMatriculadosLayout.setVerticalGroup(
            pnl_DatosMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_AlumnosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_DatosMatriculadosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DatosMatriculadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(59, 59, 59))
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
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(pnl_MatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_MatriculasLayout.setVerticalGroup(
            pnl_MatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroMatriculas, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
            .addGroup(pnl_MatriculasLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MatriculasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout pnl_escritorio2Layout = new javax.swing.GroupLayout(pnl_escritorio2);
        pnl_escritorio2.setLayout(pnl_escritorio2Layout);
        pnl_escritorio2Layout.setHorizontalGroup(
            pnl_escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_escritorio2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_Matriculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Postulantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(pnl_escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_Cursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_DatosMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        pnl_escritorio2Layout.setVerticalGroup(
            pnl_escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_escritorio2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(pnl_escritorio2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(pnl_escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnl_escritorio2Layout.createSequentialGroup()
                        .addComponent(pnl_Postulantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(pnl_Matriculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_escritorio2Layout.createSequentialGroup()
                        .addComponent(pnl_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(pnl_DatosMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_escritorio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_escritorio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_PostulantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_PostulantesMouseClicked
        RegistroPostulantes PanelPostulantes = new RegistroPostulantes();
        setVisible(false);
        Principal.escritorio.add(PanelPostulantes);
        PanelPostulantes.toFront();
        PanelPostulantes.setVisible(true);
    }//GEN-LAST:event_pnl_PostulantesMouseClicked

    private void pnl_PostulantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_PostulantesMouseEntered
        pnl_RegistroPostulante.setBackground(ColorVerde1);
        pnl_Postulantes.setBackground(ColorOscuro1);
    }//GEN-LAST:event_pnl_PostulantesMouseEntered

    private void pnl_PostulantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_PostulantesMouseExited
        pnl_RegistroPostulante.setBackground(ColorVerde2);
        pnl_Postulantes.setBackground(ColorOscuro2);
    }//GEN-LAST:event_pnl_PostulantesMouseExited

    private void pnl_CursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_CursosMouseEntered
        pnl_RegistroCursos.setBackground(ColorVerde1);
        pnl_Cursos.setBackground(ColorOscuro1);
    }//GEN-LAST:event_pnl_CursosMouseEntered

    private void pnl_CursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_CursosMouseExited
        pnl_RegistroCursos.setBackground(ColorVerde2);
        pnl_Cursos.setBackground(ColorOscuro2);
    }//GEN-LAST:event_pnl_CursosMouseExited

    private void pnl_DatosMatriculadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DatosMatriculadosMouseEntered
        pnl_AlumnosMatriculados.setBackground(ColorVerde1);
        pnl_DatosMatriculados.setBackground(ColorOscuro1);
    }//GEN-LAST:event_pnl_DatosMatriculadosMouseEntered

    private void pnl_DatosMatriculadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DatosMatriculadosMouseExited
        pnl_AlumnosMatriculados.setBackground(ColorVerde2);
        pnl_DatosMatriculados.setBackground(ColorOscuro2);
    }//GEN-LAST:event_pnl_DatosMatriculadosMouseExited

    private void pnl_MatriculasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_MatriculasMouseEntered
        pnl_RegistroMatriculas.setBackground(ColorVerde1);
        pnl_Matriculas.setBackground(ColorOscuro1);
    }//GEN-LAST:event_pnl_MatriculasMouseEntered

    private void pnl_MatriculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_MatriculasMouseExited
        pnl_RegistroMatriculas.setBackground(ColorVerde2);
        pnl_Matriculas.setBackground(ColorOscuro2);
    }//GEN-LAST:event_pnl_MatriculasMouseExited

    private void pnl_CursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_CursosMouseClicked
        RegistroCurso PanelCurso = new RegistroCurso();
        setVisible(false);
        Principal.escritorio.add(PanelCurso);
        PanelCurso.toFront();
        PanelCurso.setVisible(true);
    }//GEN-LAST:event_pnl_CursosMouseClicked

    private void pnl_MatriculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_MatriculasMouseClicked
        RegistroMatriculas PanelMatriculas = new RegistroMatriculas();
        setVisible(false);
        Principal.escritorio.add(PanelMatriculas);
        PanelMatriculas.toFront();
        PanelMatriculas.setVisible(true);
    }//GEN-LAST:event_pnl_MatriculasMouseClicked

    private void pnl_DatosMatriculadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DatosMatriculadosMouseClicked
        AlumnosMatriculados PanelBaseDatos = new AlumnosMatriculados();
        setVisible(false);
        Principal.escritorio.add(PanelBaseDatos);
        PanelBaseDatos.toFront();
        PanelBaseDatos.setVisible(true);
    }//GEN-LAST:event_pnl_DatosMatriculadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnl_AlumnosMatriculados;
    private javax.swing.JPanel pnl_Cursos;
    private javax.swing.JPanel pnl_DatosMatriculados;
    private javax.swing.JPanel pnl_Matriculas;
    private javax.swing.JPanel pnl_Postulantes;
    private javax.swing.JPanel pnl_RegistroCursos;
    private javax.swing.JPanel pnl_RegistroMatriculas;
    private javax.swing.JPanel pnl_RegistroPostulante;
    public static javax.swing.JPanel pnl_escritorio2;
    // End of variables declaration//GEN-END:variables
}
