/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebauno290523;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ANONYMOUS
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txb_lote = new javax.swing.JTextField();
        txb_codigo = new javax.swing.JTextField();
        txb_detalle = new javax.swing.JTextField();
        txb_fechaCaducidad = new javax.swing.JTextField();
        txb_pvp = new javax.swing.JTextField();
        txb_costo = new javax.swing.JTextField();
        txb_stock = new javax.swing.JTextField();
        txb_sucursal = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_respuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FORMULARIO");

        jLabel2.setText("CODIGO");

        jLabel3.setText("LOTE");

        jLabel4.setText("DETALLE");

        jLabel5.setText("FECHA DE CADUCIDAD");

        jLabel6.setText("COSTO");

        jLabel7.setText("P.V.P");

        jLabel8.setText("STOCK");

        jLabel9.setText("SUCURSAL");

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });

        btn_guardar.setText("GUARDAR");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });

        btn_listar.setText("LISTAR");
        btn_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listarMouseClicked(evt);
            }
        });

        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseClicked(evt);
            }
        });

        jLabel10.setText("Respuesta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(txb_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(txb_lote, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)
                        .addComponent(txb_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(txb_fechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel6)
                        .addGap(19, 19, 19)
                        .addComponent(txb_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel7)
                        .addGap(20, 20, 20)
                        .addComponent(txb_pvp, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel8)
                        .addGap(20, 20, 20)
                        .addComponent(txb_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel9)
                        .addGap(17, 17, 17)
                        .addComponent(txb_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_respuesta)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txb_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txb_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txb_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txb_fechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txb_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txb_pvp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txb_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txb_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar)
                    .addComponent(btn_listar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_respuesta))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        // TODO add your handling code here:
        String codigo = txb_codigo.getText();
        String lote = txb_lote.getText();
        String detalle = txb_detalle.getText();
        String fecha_caducidad = txb_fechaCaducidad.getText();
        String costo = txb_costo.getText();
        String pvp = txb_pvp.getText();
        String stock = txb_stock.getText();
        String sucursal = txb_sucursal.getText();

        List<String> respuesta = guardar(codigo, lote, detalle, fecha_caducidad, costo, pvp, stock, sucursal);
        JOptionPane.showMessageDialog(null, respuesta.get(0));

        System.out.println(respuesta.get(1));
        if (respuesta.get(1).equalsIgnoreCase("true")) {
            txb_codigo.setText("");
            txb_lote.setText("");
            txb_detalle.setText("");
            txb_fechaCaducidad.setText("");
            txb_costo.setText("");
            txb_pvp.setText("");
            txb_stock.setText("");
            txb_sucursal.setText("");

            txt_respuesta.setText("");
        }
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void btn_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listarMouseClicked
        // TODO add your handling code here:
        String codigo = txb_codigo.getText();
        List<String> respuesta = listar(codigo);
        StringBuilder resultado = new StringBuilder();
        int contador = 0;

        if (respuesta.get(8).equalsIgnoreCase("true")) {
            txb_codigo.setText(respuesta.get(0).toString());
            txb_lote.setText(respuesta.get(1).toString());
            txb_detalle.setText(respuesta.get(2).toString());
            txb_fechaCaducidad.setText(respuesta.get(3).toString());
            txb_costo.setText(respuesta.get(4).toString());
            txb_pvp.setText(respuesta.get(5).toString());
            txb_stock.setText(respuesta.get(6).toString());
            txb_sucursal.setText(respuesta.get(7).toString());

            for (String valor : respuesta) {
                resultado.append(valor + " ");
                contador++;
                if (contador >= 8) {
                    break;
                }
            }

            txt_respuesta.setText(resultado.toString());
        } else {
            System.out.println(respuesta.get(9));
        }

    }//GEN-LAST:event_btn_listarMouseClicked

    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
        // TODO add your handling code here:
        String codigo = txb_codigo.getText();
        String lote = txb_lote.getText();
        String detalle = txb_detalle.getText();
        String fecha_caducidad = txb_fechaCaducidad.getText();
        String costo = txb_costo.getText();
        String pvp = txb_pvp.getText();
        String stock = txb_stock.getText();
        String sucursal = txb_sucursal.getText();

        List<String> respuesta = actualizar(codigo, lote, detalle, fecha_caducidad, costo, pvp, stock, sucursal);
        JOptionPane.showMessageDialog(null, respuesta.get(0));

        System.out.println(respuesta.get(1));
        if (respuesta.get(1).equalsIgnoreCase("true")) {
            txb_codigo.setText("");
            txb_lote.setText("");
            txb_detalle.setText("");
            txb_fechaCaducidad.setText("");
            txb_costo.setText("");
            txb_pvp.setText("");
            txb_stock.setText("");
            txb_sucursal.setText("");

            txt_respuesta.setText("");
        }
    }//GEN-LAST:event_btn_actualizarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        // TODO add your handling code here:
        String codigo = txb_codigo.getText();

        List<String> respuesta = eliminar(codigo);
        JOptionPane.showMessageDialog(null, respuesta.get(0));

        System.out.println(respuesta.get(1));
        if (respuesta.get(1).equalsIgnoreCase("true")) {
            txb_codigo.setText("");
            txb_lote.setText("");
            txb_detalle.setText("");
            txb_fechaCaducidad.setText("");
            txb_costo.setText("");
            txb_pvp.setText("");
            txb_stock.setText("");
            txb_sucursal.setText("");

            txt_respuesta.setText("");
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txb_codigo;
    private javax.swing.JTextField txb_costo;
    private javax.swing.JTextField txb_detalle;
    private javax.swing.JTextField txb_fechaCaducidad;
    private javax.swing.JTextField txb_lote;
    private javax.swing.JTextField txb_pvp;
    private javax.swing.JTextField txb_stock;
    private javax.swing.JTextField txb_sucursal;
    private javax.swing.JLabel txt_respuesta;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> guardar(java.lang.String codigo, java.lang.String lote, java.lang.String detalle, java.lang.String fechaCaducidad, java.lang.String costo, java.lang.String pvp, java.lang.String stock, java.lang.String sucursal) {
        pruebauno290523.PruebaUnoWS_Service service = new pruebauno290523.PruebaUnoWS_Service();
        pruebauno290523.PruebaUnoWS port = service.getPruebaUnoWSPort();
        return port.guardar(codigo, lote, detalle, fechaCaducidad, costo, pvp, stock, sucursal);
    }

    private static java.util.List<java.lang.String> listar(java.lang.String codigo) {
        pruebauno290523.PruebaUnoWS_Service service = new pruebauno290523.PruebaUnoWS_Service();
        pruebauno290523.PruebaUnoWS port = service.getPruebaUnoWSPort();
        return port.listar(codigo);
    }

    private static java.util.List<java.lang.String> actualizar(java.lang.String codigo, java.lang.String lote, java.lang.String detalle, java.lang.String fechaCaducidad, java.lang.String costo, java.lang.String pvp, java.lang.String stock, java.lang.String sucursal) {
        pruebauno290523.PruebaUnoWS_Service service = new pruebauno290523.PruebaUnoWS_Service();
        pruebauno290523.PruebaUnoWS port = service.getPruebaUnoWSPort();
        return port.actualizar(codigo, lote, detalle, fechaCaducidad, costo, pvp, stock, sucursal);
    }

    private static java.util.List<java.lang.String> eliminar(java.lang.String codigo) {
        pruebauno290523.PruebaUnoWS_Service service = new pruebauno290523.PruebaUnoWS_Service();
        pruebauno290523.PruebaUnoWS port = service.getPruebaUnoWSPort();
        return port.eliminar(codigo);
    }

}