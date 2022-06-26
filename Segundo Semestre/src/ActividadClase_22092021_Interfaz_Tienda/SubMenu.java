package ActividadClase_22092021_Interfaz_Tienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SubMenu extends javax.swing.JInternalFrame {
    
    int stock;
    double pvp;
    String fecha;
    public SubMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txp_detalle = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txp_codigo = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txp_stock = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txp_pvp = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txp_fechaCaducidad = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_tabla = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("AGREGAR DATOS DE PRODUCTOS");

        jLabel2.setText("DETALLE:");

        jLabel3.setText("CODIGO:");

        jLabel4.setText("STOCK:");

        jLabel5.setText("PVP:");

        jLabel6.setText("FECHA DE CADUCIDAD:");

        jScrollPane1.setViewportView(txp_detalle);

        jScrollPane2.setViewportView(txp_codigo);

        jScrollPane3.setViewportView(txp_stock);

        jScrollPane4.setViewportView(txp_pvp);

        jScrollPane5.setViewportView(txp_fechaCaducidad);

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("DD/MM/AAAA");

        tb_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tb_tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(50, 50, 50)
                                .addComponent(jButton2)
                                .addGap(71, 71, 71)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jScrollPane3)
                                        .addComponent(jScrollPane4)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 223, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardar();
        cargar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actualizar();
        cargar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminar();
        cargar();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void guardar()
    { 
        stock = Integer.parseInt(txp_stock.getText());
        pvp = Double.parseDouble(txp_pvp.getText());
        fecha = txp_fechaCaducidad.getText();
         try
         {
            Class.forName("org.postgresql.Driver");
            Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/FeijooBD_POO2","postgres","FerDatos95"); 
            
            Statement consulta=(Statement) conecta.createStatement();            
            consulta.executeUpdate("INSERT INTO public.datostienda(detalle, codigo, stock, pvp, fecha_caducidad) VALUES ('"+txp_detalle.getText()+"', '"+txp_codigo.getText()+"', '"+stock+"', '"+pvp+"', '"+fecha+"');");
          
            conecta.close();
            JOptionPane.showMessageDialog(null,"Registro guardado correctamente");

         } catch(SQLException e)
         {
            JOptionPane.showMessageDialog(null,"Error al guardar datos");

         } catch(ClassNotFoundException e)
         {
            JOptionPane.showMessageDialog(null,"Error inesperado");
    }
         txp_detalle.setText("");
         txp_codigo.setText("");
         txp_stock.setText("");
         txp_pvp.setText("");
         txp_fechaCaducidad.setText("");
    }
    
    public void actualizar()
    { 
        stock = Integer.parseInt(txp_stock.getText());
        pvp = Double.parseDouble(txp_pvp.getText());
        fecha = txp_fechaCaducidad.getText();
         try
         {
            Class.forName("org.postgresql.Driver");
            Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/FeijooBD_POO2","postgres","FerDatos95"); 
            
            Statement consulta=(Statement) conecta.createStatement();            
            consulta.executeUpdate("UPDATE public.datostienda SET detalle = '"+txp_detalle.getText()+"', codigo = '"+txp_codigo.getText()+"', stock = '"+stock+"', pvp = '"+pvp+"', fecha_caducidad = '"+fecha+"' WHERE codigo = '"+txp_codigo.getText()+"';");
          
            conecta.close();
            JOptionPane.showMessageDialog(null,"Registro actualizado correctamente");

         } catch(SQLException e)
         {
            JOptionPane.showMessageDialog(null,"Error al actualizar datos");

         } catch(ClassNotFoundException e)
         {
            JOptionPane.showMessageDialog(null,"Error inesperado");
    }
         txp_detalle.setText("");
         txp_codigo.setText("");
         txp_stock.setText("");
         txp_pvp.setText("");
         txp_fechaCaducidad.setText("");
    }
    
    public void eliminar()
    { 
         try
         {
            Class.forName("org.postgresql.Driver");
            Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/FeijooBD_POO2","postgres","FerDatos95"); 
            
            Statement consulta=(Statement) conecta.createStatement();            
            consulta.executeUpdate("DELETE FROM public.datostienda WHERE codigo = '"+txp_codigo.getText()+"';");
          
            conecta.close();
            JOptionPane.showMessageDialog(null,"Registro eliminado correctamente");

         } catch(SQLException e)
         {
            JOptionPane.showMessageDialog(null,"Error al eliminado datos");

         } catch(ClassNotFoundException e)
         {
            JOptionPane.showMessageDialog(null,"Error inesperado");
    }
         txp_detalle.setText("");
         txp_codigo.setText("");
         txp_stock.setText("");
         txp_pvp.setText("");
         txp_fechaCaducidad.setText("");
    }
    
    public void cargar() 
    {
        String url="jdbc:postgresql://localhost:5432/FeijooBD_POO2"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
    
    
        DefaultTableModel tabla = new DefaultTableModel();
        String datos[] = new String[5];   
        tabla.addColumn("Detalle");
        tabla.addColumn("Codigo");
        tabla.addColumn("Stock");
        tabla.addColumn("P.V.P");
        tabla.addColumn("Fecha Caducidad");
        tb_tabla.setModel(tabla); 
        try 
        {
               
            Connection BaseDatos = null;
            Statement st = null;
            BaseDatos = DriverManager.getConnection(url, usuario, contrasena);
       
            st = BaseDatos.createStatement();
            ResultSet rs = st.executeQuery("SELECT detalle, codigo, stock, pvp, fecha_caducidad FROM public.datostienda;");                   
                   
            while    ( rs.next() ) 
            {
                    datos[0]  = rs.getString("detalle");
                    datos[1] = rs.getString("codigo");
                    datos[2] = rs.getString("stock");  
                    datos[3] = rs.getString("pvp");
                    datos[4] = rs.getString("fecha_caducidad");
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tb_tabla;
    private javax.swing.JTextPane txp_codigo;
    private javax.swing.JTextPane txp_detalle;
    private javax.swing.JTextPane txp_fechaCaducidad;
    private javax.swing.JTextPane txp_pvp;
    private javax.swing.JTextPane txp_stock;
    // End of variables declaration//GEN-END:variables
}
