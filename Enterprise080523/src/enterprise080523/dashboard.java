/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise080523;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;
import org.w3c.dom.*;
import javax.xml.parsers.*;

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
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_xml = new javax.swing.JButton();
        btn_buscarXML = new javax.swing.JButton();
        btn_buscarXML_WEB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CODIGO:");

        jLabel2.setText("CEDULA:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("DIRECCION:");

        jLabel6.setText("SUELDO:");

        jLabel7.setText("FORMULARIO DE REGISTRO");

        jButton1.setText("Buscar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

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

        btn_guardar.setText("GUARDAR");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });

        btn_xml.setText("XML");
        btn_xml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xmlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_guardar)
                .addGap(18, 18, 18)
                .addComponent(btn_actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_listar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xml)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_listar)
                    .addComponent(btn_xml))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_buscarXML.setText("Buscar XML");
        btn_buscarXML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarXMLMouseClicked(evt);
            }
        });

        btn_buscarXML_WEB.setText("Buscar XML WEB");
        btn_buscarXML_WEB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarXML_WEBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscarXML)
                            .addComponent(btn_buscarXML_WEB))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscarXML, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btn_buscarXML_WEB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jLabel6))))
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
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

        // txt_respuesta.setText(respuesta);
    }//GEN-LAST:event_btn_listarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String codigo = txt_codigo.getText();
        List<String> respuesta = consulta(codigo);

        if (respuesta.get(6).equalsIgnoreCase("true")) {
            txt_cedula.setText(respuesta.get(0).toString());
            txt_apellido.setText(respuesta.get(1).toString());
            txt_nombre.setText(respuesta.get(2).toString());
            txt_direccion.setText(respuesta.get(3).toString());
            txt_sueldo.setText(respuesta.get(4).toString());
        } else {
            System.out.println(respuesta.get(6));
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_xmlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xmlMouseClicked
        // TODO add your handling code here:
        String codigo = txt_codigo.getText();
        String cedula = txt_cedula.getText();
        String apellido = txt_apellido.getText();
        String nombre = txt_nombre.getText();
        String direccion = txt_direccion.getText();
        String sueldo = txt_sueldo.getText();
        boolean validar = false;

        try {
            //String rutaArchivo = "C:/Users/USUARIO PC/Documents/NetBeansProjects/Enterprise080523/src/enterprise080523/Archivo" + codigo + ".xml";
            String rutaArchivo = "C:/Users/User/Documents/NetBeansProjects/Enterprise080523/src/enterprise080523/Archivo" + codigo + ".xml";
            File archivoXML = new File(rutaArchivo);

            FileWriter escritor = new FileWriter(archivoXML);

            escritor.write("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n");
            escritor.write("<datos>\n");
            escritor.write("    <codigo>" + codigo + "</codigo>\n");
            escritor.write("    <cedula>" + cedula + "</cedula>\n");
            escritor.write("    <apellido>" + apellido + "</apellido>\n");
            escritor.write("    <nombre>" + nombre + "</nombre>\n");
            escritor.write("    <direccion>" + direccion + "</direccion>\n");
            escritor.write("    <sueldo>" + sueldo + "</sueldo>\n");
            escritor.write("</datos>\n");

            escritor.close();

            validar = true;

            Path archivoXMLPath = Paths.get(rutaArchivo);
            // Leer el contenido del archivo XML en una sola llamada 
            StringBuilder contenidoXMLBuilder = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(archivoXMLPath.toFile()))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    contenidoXMLBuilder.append(linea).append("\n");
                }
            }
            String contenidoXML = contenidoXMLBuilder.toString();

            // Imprimir el contenido del archivo en la consola
            System.out.println(contenidoXML);

            List<String> respuesta = xmlGuardar(codigo, contenidoXML);

            JOptionPane.showMessageDialog(null, "Archivo XML generado correctamente.");
            if (respuesta.get(1).equalsIgnoreCase("true")) {
                JOptionPane.showMessageDialog(null, respuesta.get(0));
            } else {
                JOptionPane.showMessageDialog(null, respuesta.get(0));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el archivo XML: " + e.getMessage());
        }
        if (validar) {
            txt_codigo.setText("");
            txt_cedula.setText("");
            txt_apellido.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_sueldo.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Error al generar el archivo XML");
        }
    }//GEN-LAST:event_btn_xmlMouseClicked

    private void btn_buscarXMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarXMLMouseClicked
        // TODO add your handling code here:
        String codigoArchivo = txt_codigo.getText();
        try {
            //String rutaArchivo = "C:/Users/USUARIO PC/Documents/NetBeansProjects/Enterprise080523/src/enterprise080523/Archivo" + codigoArchivo + ".xml";
            String rutaArchivo = "C:/Users/User/Documents/NetBeansProjects/Enterprise080523/src/enterprise080523/Archivo" + codigoArchivo + ".xml";
            File archivoXML = new File(rutaArchivo);

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document documento = dBuilder.parse(archivoXML);

            documento.getDocumentElement().normalize();

            NodeList nodeList = documento.getElementsByTagName("datos");
            Node nodo = nodeList.item(0);

            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nodo;

                String codigo = elemento.getElementsByTagName("codigo").item(0).getTextContent();
                String cedula = elemento.getElementsByTagName("cedula").item(0).getTextContent();
                String apellido = elemento.getElementsByTagName("apellido").item(0).getTextContent();
                String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                String direccion = elemento.getElementsByTagName("direccion").item(0).getTextContent();
                String sueldo = elemento.getElementsByTagName("sueldo").item(0).getTextContent();

                // Llenar los campos correspondientes
                txt_codigo.setText(codigo);
                txt_cedula.setText(cedula);
                txt_apellido.setText(apellido);
                txt_nombre.setText(nombre);
                txt_direccion.setText(direccion);
                txt_sueldo.setText(sueldo);
            }
            JOptionPane.showMessageDialog(null, "Archivo XML leído correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo XML: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_buscarXMLMouseClicked

    private void btn_buscarXML_WEBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarXML_WEBMouseClicked
        // TODO add your handling code here:
        String codigo = txt_codigo.getText();

        List<String> respuesta = xmlBusqueda(codigo);

        if (respuesta.get(2).equalsIgnoreCase("true")) {
            System.out.println(respuesta.get(0));
            JOptionPane.showMessageDialog(null, respuesta.get(1));
            try {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document documento = dBuilder.parse(respuesta.get(0));

                Element rootElement = documento.getDocumentElement();
                txt_codigo.setText(rootElement.getAttribute("codigo"));
                txt_cedula.setText(rootElement.getAttribute("cedula"));
                txt_apellido.setText(rootElement.getAttribute("apellido"));
                txt_nombre.setText(rootElement.getAttribute("nombre"));
                txt_direccion.setText(rootElement.getAttribute("direccion"));
                txt_sueldo.setText(rootElement.getAttribute("sueldo"));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al leer el archivo XML WEB: " + e.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, respuesta.get(1));
        }
    }//GEN-LAST:event_btn_buscarXML_WEBMouseClicked

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
    private javax.swing.JButton btn_buscarXML;
    private javax.swing.JButton btn_buscarXML_WEB;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_guardar;
    public javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_xml;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_apellido;
    public javax.swing.JTextField txt_cedula;
    public javax.swing.JTextField txt_codigo;
    public javax.swing.JTextField txt_direccion;
    public javax.swing.JTextField txt_nombre;
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

    private static java.util.List<java.lang.String> consulta(java.lang.String codigo) {
        enterprise080523.ConexionEnterprise_Service service = new enterprise080523.ConexionEnterprise_Service();
        enterprise080523.ConexionEnterprise port = service.getConexionEnterprisePort();
        return port.consulta(codigo);
    }

    private static java.util.List<java.lang.String> xmlGuardar(java.lang.String codigo, java.lang.String xml) {
        enterprise080523.ConexionEnterprise_Service service = new enterprise080523.ConexionEnterprise_Service();
        enterprise080523.ConexionEnterprise port = service.getConexionEnterprisePort();
        return port.xmlGuardar(codigo, xml);
    }

    private static java.util.List<java.lang.String> xmlBusqueda(java.lang.String codigo) {
        enterprise080523.ConexionEnterprise_Service service = new enterprise080523.ConexionEnterprise_Service();
        enterprise080523.ConexionEnterprise port = service.getConexionEnterprisePort();
        return port.xmlBusqueda(codigo);
    }

}
