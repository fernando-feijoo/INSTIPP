package ProyectoDeClase;
import java.awt.event.KeyEvent;
public class Acceso extends javax.swing.JFrame {
    public Acceso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Cerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_InicioSesion = new javax.swing.JLabel();
        lbl_Usuario = new javax.swing.JLabel();
        txf_Usuario = new javax.swing.JTextField();
        lbl_Passsword = new javax.swing.JLabel();
        psf_Password = new javax.swing.JPasswordField();
        btn_Entrar = new javax.swing.JButton();
        lbl_Validador = new javax.swing.JLabel();
        lbl_FotoUser = new javax.swing.JLabel();
        lbl_FotoPassword = new javax.swing.JLabel();
        lbl_FotoEscudoPolicia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(62, 141, 239));

        lbl_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/cancelar.png"))); // NOI18N
        lbl_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CerrarMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(62, 141, 239));

        lbl_InicioSesion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_InicioSesion.setForeground(new java.awt.Color(204, 204, 204));
        lbl_InicioSesion.setText("INICIO DE SESIÓN");

        lbl_Usuario.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbl_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Usuario.setText("Usuario:");

        txf_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        txf_Usuario.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txf_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txf_UsuarioKeyTyped(evt);
            }
        });

        lbl_Passsword.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbl_Passsword.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Passsword.setText("Contraseña:");

        psf_Password.setBackground(new java.awt.Color(255, 255, 255));
        psf_Password.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        psf_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                psf_PasswordKeyTyped(evt);
            }
        });

        btn_Entrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Entrar.setText("Entrar");
        btn_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EntrarMouseClicked(evt);
            }
        });
        btn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarActionPerformed(evt);
            }
        });

        lbl_Validador.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lbl_Validador.setForeground(new java.awt.Color(255, 255, 102));
        lbl_Validador.setAlignmentX(0.5F);

        lbl_FotoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/usuario.png"))); // NOI18N

        lbl_FotoPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/contrasena.png"))); // NOI18N

        lbl_FotoEscudoPolicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoDeClase/PoliciaEcuador 125px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_FotoEscudoPolicia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Usuario)
                            .addComponent(lbl_Passsword))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Validador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(psf_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txf_Usuario))))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_FotoUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_FotoPassword))
                .addGap(98, 98, 98))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(lbl_InicioSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_InicioSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_FotoEscudoPolicia)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_FotoUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Usuario)
                            .addComponent(txf_Usuario))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_FotoPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_Passsword)
                                .addComponent(psf_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Validador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(btn_Entrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Cerrar)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Cerrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_CerrarMouseClicked

    private void btn_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EntrarMouseClicked
        Principal p1 = new Principal();
        //validacion usuario Contraseña
        String user = txf_Usuario.getText();
        String pass = psf_Password.getText();
        if (user.equalsIgnoreCase("fernando") && pass.equals("123f")) 
        {
            dispose();
            p1.show();
        }else
        {
            lbl_Validador.setText("USUARIO / CONTRASEÑA INCORRECTOS");
        }
    }//GEN-LAST:event_btn_EntrarMouseClicked

    private void psf_PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psf_PasswordKeyTyped
        char Teclas = evt.getKeyChar();
        if (Teclas == KeyEvent.VK_ENTER) 
        {
            btn_Entrar.doClick();
        }
    }//GEN-LAST:event_psf_PasswordKeyTyped

    private void txf_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_UsuarioKeyTyped
        char Teclas = evt.getKeyChar();
        if (Teclas == KeyEvent.VK_ENTER) 
        {
            btn_Entrar.doClick();
        }
    }//GEN-LAST:event_txf_UsuarioKeyTyped

    private void btn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarActionPerformed
        Principal p1 = new Principal();
        //validacion usuario Contraseña
        String user = txf_Usuario.getText();
        String pass = psf_Password.getText();
        if (user.equalsIgnoreCase("fernando") && pass.equals("123f")) 
        {
            dispose();
            p1.show();
        }else
        {
            lbl_Validador.setText("USUARIO / CONTRASEÑA INCORRECTOS");
        }
    }//GEN-LAST:event_btn_EntrarActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Cerrar;
    private javax.swing.JLabel lbl_FotoEscudoPolicia;
    private javax.swing.JLabel lbl_FotoPassword;
    private javax.swing.JLabel lbl_FotoUser;
    private javax.swing.JLabel lbl_InicioSesion;
    private javax.swing.JLabel lbl_Passsword;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JLabel lbl_Validador;
    private javax.swing.JPasswordField psf_Password;
    private javax.swing.JTextField txf_Usuario;
    // End of variables declaration//GEN-END:variables
}
