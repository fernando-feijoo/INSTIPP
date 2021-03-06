package ProgramacionVisual;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FormInicioSesion150622_CPractica extends javax.swing.JFrame {

    String usuario = "Fernando", contraseña = "123f";
    String userNew = null, passNew = null;
            
    public FormInicioSesion150622_CPractica() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_iniciarSesion = new javax.swing.JButton();
        btn_salir = new javax.swing.JToggleButton();
        lbl_registro = new javax.swing.JLabel();
        passW_contraseña = new javax.swing.JPasswordField();
        txtfile_usuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                centrarJfram(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        btn_iniciarSesion.setText("Iniciar Sesión");
        btn_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarSesionActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        lbl_registro.setForeground(new java.awt.Color(51, 51, 255));
        lbl_registro.setText("¿No posee cuenta? Registrarse");
        lbl_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_registroMouseClicked(evt);
            }
        });

        passW_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passW_contraseñaKeyTyped(evt);
            }
        });

        txtfile_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfile_usuarioKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(134, 134, 134));
        jLabel3.setText("INICIO DE SESION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel3)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_iniciarSesion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtfile_usuario)
                                            .addComponent(passW_contraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(39, 39, 39))
                            .addComponent(lbl_registro, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(281, 281, 281))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfile_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passW_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_iniciarSesion)
                    .addComponent(btn_salir))
                .addGap(18, 18, 18)
                .addComponent(lbl_registro)
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarSesionActionPerformed
        System.out.println("Usuario 1. " + txtfile_usuario.getText().equalsIgnoreCase(usuario) + " , " + passW_contraseña.getText().equals(contraseña));
        System.out.println("Usuario 2. " + txtfile_usuario.getText().equalsIgnoreCase(userNew) + " , " + passW_contraseña.getText().equals(passNew) + "\n");
        if (txtfile_usuario.getText().equalsIgnoreCase(usuario) && passW_contraseña.getText().equals(contraseña))
        {
            JOptionPane.showMessageDialog(this, "Ud. ha iniciado sesión de manera correcta.");
        }else if (txtfile_usuario.getText().equalsIgnoreCase(userNew) && passW_contraseña.getText().equals(passNew))
        {
            JOptionPane.showMessageDialog(this, "Ud. ha iniciado sesión de manera correcta.");
        }else
        {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_iniciarSesionActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro desea salir del programa?", "Mensaje", JOptionPane.YES_NO_OPTION);
        switch (opcion) 
        {
            case 0:
                JOptionPane.showMessageDialog(this, "Gracias por usar nuestro sistema.");
                System.exit(0);
                break;
            case 1:
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txtfile_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfile_usuarioKeyTyped
        char Teclas = evt.getKeyChar();
        if (Teclas == KeyEvent.VK_ENTER) 
        {
            btn_iniciarSesion.doClick();
        }
    }//GEN-LAST:event_txtfile_usuarioKeyTyped

    private void passW_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passW_contraseñaKeyTyped
        char Teclas = evt.getKeyChar();
        if (Teclas == KeyEvent.VK_ENTER) 
        {
            btn_iniciarSesion.doClick();
        }
    }//GEN-LAST:event_passW_contraseñaKeyTyped

    private void lbl_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registroMouseClicked
        usuarioNuevo();
    }//GEN-LAST:event_lbl_registroMouseClicked

    private void centrarJfram(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_centrarJfram
        //Centro el contenido dentro de un JPanel, centro el jPanel1 en este caso.
        int panelX = (getWidth() - jPanel1.getWidth() - getInsets().left - getInsets().right) / 2;
	int panelY = ((getHeight() - jPanel1.getHeight() - getInsets().top - getInsets().bottom) / 2);
        jPanel1.setLocation(panelX, panelY);
    }//GEN-LAST:event_centrarJfram

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FormInicioSesion150622_CPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicioSesion150622_CPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicioSesion150622_CPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicioSesion150622_CPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicioSesion150622_CPractica().setVisible(true);
            }
        });
    }
    
    public void usuarioNuevo ()
    {
        System.out.println("Usuario nuevo\n");
        userNew = JOptionPane.showInputDialog(null, "Usuario", "Ingrese su usuario: ", JOptionPane.PLAIN_MESSAGE);
        if (userNew != null && userNew.length() > 0) 
        {
            passNew = JOptionPane.showInputDialog(null, "Contraseña", "Ingrese su contraseña: ", JOptionPane.PLAIN_MESSAGE);
        }
        System.out.println(userNew + " , " + passNew + "\n");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciarSesion;
    private javax.swing.JToggleButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_registro;
    private javax.swing.JPasswordField passW_contraseña;
    private javax.swing.JTextField txtfile_usuario;
    // End of variables declaration//GEN-END:variables
}
