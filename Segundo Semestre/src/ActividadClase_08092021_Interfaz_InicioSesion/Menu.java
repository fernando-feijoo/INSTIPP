/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadClase_08092021_Interfaz_InicioSesion;

/**
 *
 * @author Fernando F. Feijoo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        btn_salir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_calculadora = new javax.swing.JMenu();
        mit_AbrirCalculadora = new javax.swing.JMenuItem();
        mn_formulario = new javax.swing.JMenu();
        mit_AbrirFormulario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mit_AbrirCalculadoraVieja = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(400, 400));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        mn_calculadora.setText("Calculadora");

        mit_AbrirCalculadora.setText("Abrir Calculadora");
        mit_AbrirCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mit_AbrirCalculadoraActionPerformed(evt);
            }
        });
        mn_calculadora.add(mit_AbrirCalculadora);

        jMenuBar1.add(mn_calculadora);

        mn_formulario.setText("Formulario");

        mit_AbrirFormulario.setText("Abrir Formulario");
        mit_AbrirFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mit_AbrirFormularioActionPerformed(evt);
            }
        });
        mn_formulario.add(mit_AbrirFormulario);

        jMenuBar1.add(mn_formulario);

        jMenu1.setText("Calculadora Vieja");

        mit_AbrirCalculadoraVieja.setText("Abrir Calculadora Vieja");
        mit_AbrirCalculadoraVieja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mit_AbrirCalculadoraViejaActionPerformed(evt);
            }
        });
        jMenu1.add(mit_AbrirCalculadoraVieja);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mit_AbrirCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mit_AbrirCalculadoraActionPerformed
        // TODO add your handling code here:
        calculadora cl = new calculadora();
        cl.show();
    }//GEN-LAST:event_mit_AbrirCalculadoraActionPerformed

    private void mit_AbrirFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mit_AbrirFormularioActionPerformed
        // TODO add your handling code here:
        Formulario fr = new Formulario();
        fr.show();
    }//GEN-LAST:event_mit_AbrirFormularioActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void mit_AbrirCalculadoraViejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mit_AbrirCalculadoraViejaActionPerformed
        // TODO add your handling code here:
        CalculadoraVieja clv = new CalculadoraVieja();
        clv.show();
    }//GEN-LAST:event_mit_AbrirCalculadoraViejaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mit_AbrirCalculadora;
    private javax.swing.JMenuItem mit_AbrirCalculadoraVieja;
    private javax.swing.JMenuItem mit_AbrirFormulario;
    private javax.swing.JMenu mn_calculadora;
    private javax.swing.JMenu mn_formulario;
    // End of variables declaration//GEN-END:variables
}