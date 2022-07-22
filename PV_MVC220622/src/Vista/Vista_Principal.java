/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Fabricio F. Feijoo
 */
public class Vista_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Principal
     */
    public Vista_Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_contenedor = new javax.swing.JPanel();
        jp_contenedorOpciones = new javax.swing.JPanel();
        jp_textoLogo = new javax.swing.JPanel();
        txf_logoPrincipal = new javax.swing.JLabel();
        jp_contenedorMenu = new javax.swing.JPanel();
        jp_opcionUno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jp_opcionDos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jp_opcionTres = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jp_opcionCuatro = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jp_opcionCinco = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jp_resultadoOpcion = new javax.swing.JPanel();
        jp_bienvenida = new javax.swing.JPanel();
        lbl_textoSuperior = new javax.swing.JLabel();
        lbl_textoInferior = new javax.swing.JLabel();
        jp_exit = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jp_contenedor.setBackground(new java.awt.Color(204, 204, 204));
        jp_contenedor.setPreferredSize(new java.awt.Dimension(1222, 700));

        jp_contenedorOpciones.setBackground(new java.awt.Color(253, 253, 252));

        jp_textoLogo.setBackground(new java.awt.Color(253, 253, 252));
        jp_textoLogo.setMaximumSize(new java.awt.Dimension(87, 107));

        txf_logoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/LogoVeterinaria.png"))); // NOI18N

        javax.swing.GroupLayout jp_textoLogoLayout = new javax.swing.GroupLayout(jp_textoLogo);
        jp_textoLogo.setLayout(jp_textoLogoLayout);
        jp_textoLogoLayout.setHorizontalGroup(
            jp_textoLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txf_logoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );
        jp_textoLogoLayout.setVerticalGroup(
            jp_textoLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_textoLogoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(txf_logoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jp_contenedorMenu.setBackground(new java.awt.Color(253, 253, 252));

        jp_opcionUno.setBackground(new java.awt.Color(204, 204, 204));
        jp_opcionUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_opcionUno.setMaximumSize(new java.awt.Dimension(300, 50));
        jp_opcionUno.setMinimumSize(new java.awt.Dimension(300, 50));
        jp_opcionUno.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/veterinarian_32px.png"))); // NOI18N
        jLabel1.setText("Pacientes");

        javax.swing.GroupLayout jp_opcionUnoLayout = new javax.swing.GroupLayout(jp_opcionUno);
        jp_opcionUno.setLayout(jp_opcionUnoLayout);
        jp_opcionUnoLayout.setHorizontalGroup(
            jp_opcionUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_opcionUnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_opcionUnoLayout.setVerticalGroup(
            jp_opcionUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_opcionUnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_opcionDos.setBackground(new java.awt.Color(204, 204, 204));
        jp_opcionDos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_opcionDos.setMaximumSize(new java.awt.Dimension(300, 50));
        jp_opcionDos.setMinimumSize(new java.awt.Dimension(300, 50));
        jp_opcionDos.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/customer_32px.png"))); // NOI18N
        jLabel2.setText("Clientes");

        javax.swing.GroupLayout jp_opcionDosLayout = new javax.swing.GroupLayout(jp_opcionDos);
        jp_opcionDos.setLayout(jp_opcionDosLayout);
        jp_opcionDosLayout.setHorizontalGroup(
            jp_opcionDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_opcionDosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_opcionDosLayout.setVerticalGroup(
            jp_opcionDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_opcionDosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_opcionTres.setBackground(new java.awt.Color(204, 204, 204));
        jp_opcionTres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_opcionTres.setMaximumSize(new java.awt.Dimension(300, 50));
        jp_opcionTres.setMinimumSize(new java.awt.Dimension(300, 50));
        jp_opcionTres.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/botella-de-pastillas_32px.png"))); // NOI18N
        jLabel3.setText("Medicinas");

        javax.swing.GroupLayout jp_opcionTresLayout = new javax.swing.GroupLayout(jp_opcionTres);
        jp_opcionTres.setLayout(jp_opcionTresLayout);
        jp_opcionTresLayout.setHorizontalGroup(
            jp_opcionTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_opcionTresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_opcionTresLayout.setVerticalGroup(
            jp_opcionTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_opcionTresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_opcionCuatro.setBackground(new java.awt.Color(204, 204, 204));
        jp_opcionCuatro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_opcionCuatro.setMaximumSize(new java.awt.Dimension(300, 50));
        jp_opcionCuatro.setMinimumSize(new java.awt.Dimension(300, 50));
        jp_opcionCuatro.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/pdf_32px.png"))); // NOI18N
        jLabel5.setText("Reportes");

        javax.swing.GroupLayout jp_opcionCuatroLayout = new javax.swing.GroupLayout(jp_opcionCuatro);
        jp_opcionCuatro.setLayout(jp_opcionCuatroLayout);
        jp_opcionCuatroLayout.setHorizontalGroup(
            jp_opcionCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_opcionCuatroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_opcionCuatroLayout.setVerticalGroup(
            jp_opcionCuatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_opcionCuatroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_opcionCinco.setBackground(new java.awt.Color(204, 204, 204));
        jp_opcionCinco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp_opcionCinco.setMaximumSize(new java.awt.Dimension(300, 50));
        jp_opcionCinco.setMinimumSize(new java.awt.Dimension(300, 50));
        jp_opcionCinco.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/configuraciones_32px.png"))); // NOI18N
        jLabel4.setText("Configuración");

        javax.swing.GroupLayout jp_opcionCincoLayout = new javax.swing.GroupLayout(jp_opcionCinco);
        jp_opcionCinco.setLayout(jp_opcionCincoLayout);
        jp_opcionCincoLayout.setHorizontalGroup(
            jp_opcionCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_opcionCincoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_opcionCincoLayout.setVerticalGroup(
            jp_opcionCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_opcionCincoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_contenedorMenuLayout = new javax.swing.GroupLayout(jp_contenedorMenu);
        jp_contenedorMenu.setLayout(jp_contenedorMenuLayout);
        jp_contenedorMenuLayout.setHorizontalGroup(
            jp_contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jp_opcionUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_opcionDos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_opcionTres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_opcionCuatro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_opcionCinco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_contenedorMenuLayout.setVerticalGroup(
            jp_contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorMenuLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jp_opcionUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_opcionDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_opcionTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_opcionCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jp_opcionCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jp_contenedorOpcionesLayout = new javax.swing.GroupLayout(jp_contenedorOpciones);
        jp_contenedorOpciones.setLayout(jp_contenedorOpcionesLayout);
        jp_contenedorOpcionesLayout.setHorizontalGroup(
            jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_textoLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_contenedorMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_contenedorOpcionesLayout.setVerticalGroup(
            jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                .addComponent(jp_textoLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_contenedorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jp_resultadoOpcion.setMaximumSize(new java.awt.Dimension(904, 700));
        jp_resultadoOpcion.setMinimumSize(new java.awt.Dimension(904, 700));
        jp_resultadoOpcion.setPreferredSize(new java.awt.Dimension(904, 700));

        jp_bienvenida.setMaximumSize(new java.awt.Dimension(886, 700));
        jp_bienvenida.setMinimumSize(new java.awt.Dimension(886, 700));
        jp_bienvenida.setPreferredSize(new java.awt.Dimension(886, 700));

        lbl_textoSuperior.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        lbl_textoSuperior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_textoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/BannerMascotas.png"))); // NOI18N

        lbl_textoInferior.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        lbl_textoInferior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_textoInferior.setText("BIENVENIDO/A");
        lbl_textoInferior.setRequestFocusEnabled(false);

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");

        javax.swing.GroupLayout jp_exitLayout = new javax.swing.GroupLayout(jp_exit);
        jp_exit.setLayout(jp_exitLayout);
        jp_exitLayout.setHorizontalGroup(
            jp_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jp_exitLayout.setVerticalGroup(
            jp_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_bienvenidaLayout = new javax.swing.GroupLayout(jp_bienvenida);
        jp_bienvenida.setLayout(jp_bienvenidaLayout);
        jp_bienvenidaLayout.setHorizontalGroup(
            jp_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_bienvenidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_bienvenidaLayout.createSequentialGroup()
                        .addGroup(jp_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_textoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_textoSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jp_bienvenidaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jp_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jp_bienvenidaLayout.setVerticalGroup(
            jp_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_bienvenidaLayout.createSequentialGroup()
                .addComponent(jp_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(lbl_textoInferior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(lbl_textoSuperior)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jp_resultadoOpcionLayout = new javax.swing.GroupLayout(jp_resultadoOpcion);
        jp_resultadoOpcion.setLayout(jp_resultadoOpcionLayout);
        jp_resultadoOpcionLayout.setHorizontalGroup(
            jp_resultadoOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_resultadoOpcionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jp_resultadoOpcionLayout.setVerticalGroup(
            jp_resultadoOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_resultadoOpcionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jp_contenedorLayout = new javax.swing.GroupLayout(jp_contenedor);
        jp_contenedor.setLayout(jp_contenedorLayout);
        jp_contenedorLayout.setHorizontalGroup(
            jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorLayout.createSequentialGroup()
                .addComponent(jp_contenedorOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jp_resultadoOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_contenedorLayout.setVerticalGroup(
            jp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_contenedorOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jp_resultadoOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jp_bienvenida;
    public javax.swing.JPanel jp_contenedor;
    public javax.swing.JPanel jp_contenedorMenu;
    public javax.swing.JPanel jp_contenedorOpciones;
    public javax.swing.JPanel jp_exit;
    public javax.swing.JPanel jp_opcionCinco;
    public javax.swing.JPanel jp_opcionCuatro;
    public javax.swing.JPanel jp_opcionDos;
    public javax.swing.JPanel jp_opcionTres;
    public javax.swing.JPanel jp_opcionUno;
    public javax.swing.JPanel jp_resultadoOpcion;
    public javax.swing.JPanel jp_textoLogo;
    public javax.swing.JLabel lbl_textoInferior;
    public javax.swing.JLabel lbl_textoSuperior;
    public javax.swing.JLabel txf_logoPrincipal;
    // End of variables declaration//GEN-END:variables
}
