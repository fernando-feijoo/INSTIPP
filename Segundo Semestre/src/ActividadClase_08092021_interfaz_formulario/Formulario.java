/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadClase_08092021_interfaz_formulario;

/**
 *
 * @author Fernando F. Feijoo
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_ver1 = new javax.swing.JButton();
        rb_futbol = new javax.swing.JRadioButton();
        rb_tenis = new javax.swing.JRadioButton();
        rb_voley = new javax.swing.JRadioButton();
        rb_karate = new javax.swing.JRadioButton();
        lbl_texto1 = new javax.swing.JLabel();
        chb_futbol = new javax.swing.JCheckBox();
        chb_tenis = new javax.swing.JCheckBox();
        chb_voley = new javax.swing.JCheckBox();
        chb_karate = new javax.swing.JCheckBox();
        btn_ver2 = new javax.swing.JButton();
        lbl_texto2 = new javax.swing.JLabel();
        cbx_lista = new javax.swing.JComboBox<>();
        btn_ver3 = new javax.swing.JButton();
        lbl_texto3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_ver1.setText("Ver");
        btn_ver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_futbol);
        rb_futbol.setText("Futbol");

        buttonGroup1.add(rb_tenis);
        rb_tenis.setText("Tenis");

        buttonGroup1.add(rb_voley);
        rb_voley.setText("Voley");

        buttonGroup1.add(rb_karate);
        rb_karate.setText("Karate");

        lbl_texto1.setText("<Seleccion>");

        chb_futbol.setText("Futbol");

        chb_tenis.setText("Tenis");

        chb_voley.setText("Voley");

        chb_karate.setText("Karate");

        btn_ver2.setText("Ver");
        btn_ver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver2ActionPerformed(evt);
            }
        });

        lbl_texto2.setText("<Seleccion>");

        cbx_lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futbol", "Tenis", "Voley", "Karate" }));
        cbx_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_listaActionPerformed(evt);
            }
        });

        btn_ver3.setText("Ver");
        btn_ver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver3ActionPerformed(evt);
            }
        });

        lbl_texto3.setText("<Seleccion>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_futbol)
                            .addComponent(rb_tenis)
                            .addComponent(rb_voley)
                            .addComponent(rb_karate)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_ver1)
                                    .addComponent(btn_ver3))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_texto3)
                                    .addComponent(lbl_texto1))))
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_ver2)
                                .addGap(52, 52, 52)
                                .addComponent(lbl_texto2))
                            .addComponent(chb_karate)
                            .addComponent(chb_voley)
                            .addComponent(chb_tenis)
                            .addComponent(chb_futbol))))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_futbol)
                    .addComponent(chb_futbol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_tenis)
                    .addComponent(chb_tenis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_voley)
                    .addComponent(chb_voley))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_karate)
                    .addComponent(chb_karate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ver1)
                    .addComponent(lbl_texto1)
                    .addComponent(btn_ver2)
                    .addComponent(lbl_texto2))
                .addGap(36, 36, 36)
                .addComponent(cbx_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ver3)
                    .addComponent(lbl_texto3))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver1ActionPerformed
        // TODO add your handling code here:
        if (rb_futbol.isSelected()) 
        {
            lbl_texto1.setText("Usted selecciono Futbol...");
        }else if(rb_karate.isSelected())
        {
            lbl_texto1.setText("Usted selecciono Karate...");
        }else if(rb_tenis.isSelected())
        {
            lbl_texto1.setText("Usted selecciono Tenis...");
        }else if(rb_voley.isSelected())
        {
            lbl_texto1.setText("Usted selecciono Voley...");
        }
        
    }//GEN-LAST:event_btn_ver1ActionPerformed

    private void btn_ver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver2ActionPerformed
        // TODO add your handling code here:
        int c = 0;
        String respuesta = "";
        if (chb_futbol.isSelected()) 
        {
            respuesta = ("Usted selecciono Futbol");
            c++;
        }
        if (chb_karate.isSelected()) 
        {
            if (c == 0) 
            {
                respuesta = ("Usted selecciono Karate");
                c++;
            }else if(c > 0)
            {
                respuesta = (respuesta + ", Karate");
            }
        }
        if (chb_tenis.isSelected()) 
        {
            if (c == 0) 
            {
                respuesta = ("Usted selecciono Tenis");
                c++;
            }else if(c > 0)
            {
                respuesta = (respuesta + ", Tenis");
            }
        }
        if (chb_voley.isSelected()) 
        {
            if (c == 0) 
            {
                respuesta = ("Usted selecciono Voley");
                c++;
            }else if(c > 0)
            {
                respuesta = (respuesta + ", Voley");
            }
        }
        lbl_texto2.setText(respuesta);
    }//GEN-LAST:event_btn_ver2ActionPerformed

    private void cbx_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_listaActionPerformed

    private void btn_ver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver3ActionPerformed
        // TODO add your handling code here:
        lbl_texto3.setText((String)cbx_lista.getSelectedItem());
    }//GEN-LAST:event_btn_ver3ActionPerformed

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
    private javax.swing.JButton btn_ver1;
    private javax.swing.JButton btn_ver2;
    private javax.swing.JButton btn_ver3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_lista;
    private javax.swing.JCheckBox chb_futbol;
    private javax.swing.JCheckBox chb_karate;
    private javax.swing.JCheckBox chb_tenis;
    private javax.swing.JCheckBox chb_voley;
    private javax.swing.JLabel lbl_texto1;
    private javax.swing.JLabel lbl_texto2;
    private javax.swing.JLabel lbl_texto3;
    private javax.swing.JRadioButton rb_futbol;
    private javax.swing.JRadioButton rb_karate;
    private javax.swing.JRadioButton rb_tenis;
    private javax.swing.JRadioButton rb_voley;
    // End of variables declaration//GEN-END:variables
}
