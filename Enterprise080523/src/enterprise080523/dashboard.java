/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise080523;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ANONYMOUS
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_sueldo = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        txt_respuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CODIGO:");

        jLabel2.setText("CEDULA:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("DIRECCION:");

        jLabel6.setText("SUELDO:");

        btn_guardar.setText("GUARDAR");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });

        jLabel7.setText("FORMULARIO DE REGISTRO");

        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseClicked(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });

        btn_listar.setText("LISTAR");
        btn_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listarMouseClicked(evt);
            }
        });

        txt_respuesta.setText("Respuesta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel7)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_respuesta)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_listar)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_listar))
                .addGap(18, 18, 18)
                .addComponent(txt_respuesta)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        // TODO add your handling code here:

        String codigo = txt_codigo.getText();
        String cedula = txt_cedula.getText();
        String apellido = txt_apellido.getText();
        String nombre = txt_nombre.getText();
        String direccion = txt_direccion.getText();
        String sueldo = txt_sueldo.getText();
        
        List<String> respuesta = guardar(codigo, cedula, apellido, nombre, direccion, sueldo);
        JOptionPane.showMessageDialog(null, respuesta.get(0));

        System.out.println(respuesta.get(1));
        if (respuesta.get(1).equalsIgnoreCase("true")) {
            txt_codigo.setText("");
            txt_cedula.setText("");
            txt_apellido.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_sueldo.setText("");
        }
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
        // TODO add your handling code here:
        String codigo = txt_codigo.getText();
        String cedula = txt_cedula.getText();
        String apellido = txt_apellido.getText();
        String nombre = txt_nombre.getText();
        String direccion = txt_direccion.getText();
        String sueldo = txt_sueldo.getText();
        
        List<String> respuesta = actualizar(codigo, cedula, apellido, nombre, direccion, sueldo);
        JOptionPane.showMessageDialog(null, respuesta.get(0));

        System.out.println(respuesta.get(1));
        if (respuesta.get(1).equalsIgnoreCase("true")) {
            txt_codigo.setText("");
            txt_cedula.setText("");
            txt_apellido.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_sueldo.setText("");
        }
    }//GEN-LAST:event_btn_actualizarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        // TODO add your handling code here:
        String codigo = txt_codigo.getText();
                
        List<String> respuesta = eliminar(codigo);
        JOptionPane.showMessageDialog(null, respuesta.get(0));

        System.out.println(respuesta.get(1));
        if (respuesta.get(1).equalsIgnoreCase("true")) {
            txt_codigo.setText("");
            txt_cedula.setText("");
            txt_apellido.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_sueldo.setText("");
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listarMouseClicked
        // TODO add your handling code here:
        String codigo = txt_codigo.getText();
        
        
        String respuesta = listarPorCodigo(codigo);
        JOptionPane.showMessageDialog(null, respuesta);

        txt_respuesta.setText(respuesta);
    }//GEN-LAST:event_btn_listarMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_guardar;
    public javax.swing.JButton btn_listar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField txt_apellido;
    public javax.swing.JTextField txt_cedula;
    public javax.swing.JTextField txt_codigo;
    public javax.swing.JTextField txt_direccion;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JLabel txt_respuesta;
    public javax.swing.JTextField txt_sueldo;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> guardar(java.lang.String codigo, java.lang.String cedula, java.lang.String apellido, java.lang.String nombre, java.lang.String direccion, java.lang.String sueldo) {
        enterprise080523.ConexionEnterprise_Service service = new enterprise080523.ConexionEnterprise_Service();
        enterprise080523.ConexionEnterprise port = service.getConexionEnterprisePort();
        return port.guardar(codigo, cedula, apellido, nombre, direccion, sueldo);
    }

    private static java.util.List<java.lang.String> actualizar(java.lang.String codigo, java.lang.String cedula, java.lang.String apellido, java.lang.String nombre, java.lang.String direccion, java.lang.String sueldo) {
        enterprise080523.ConexionEnterprise_Service service = new enterprise080523.ConexionEnterprise_Service();
        enterprise080523.ConexionEnterprise port = service.getConexionEnterprisePort();
        return port.actualizar(codigo, cedula, apellido, nombre, direccion, sueldo);
    }

    private static java.util.List<java.lang.String> eliminar(java.lang.String codigo) {
        enterprise080523.ConexionEnterprise_Service service = new enterprise080523.ConexionEnterprise_Service();
        enterprise080523.ConexionEnterprise port = service.getConexionEnterprisePort();
        return port.eliminar(codigo);
    }

    private static String listarPorCodigo(java.lang.String codigo) {
        enterprise080523.ConexionEnterprise_Service service = new enterprise080523.ConexionEnterprise_Service();
        enterprise080523.ConexionEnterprise port = service.getConexionEnterprisePort();
        return port.listarPorCodigo(codigo);
    }

}
