/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author ANONYMOUS
 */
public class Vista_Estudiante extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Estudiante
     */
    public Vista_Estudiante() {
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

        jp_contenedorOpciones = new javax.swing.JPanel();
        jp_contenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_tablaDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txf_nombre = new javax.swing.JTextField();
        txf_cedula = new javax.swing.JTextField();
        cb_curso = new javax.swing.JComboBox<>();
        txf_fechaMatricula = new javax.swing.JTextField();
        cb_carrera = new javax.swing.JComboBox<>();

        jtb_tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtb_tablaDatos);

        javax.swing.GroupLayout jp_contenedorTablaLayout = new javax.swing.GroupLayout(jp_contenedorTabla);
        jp_contenedorTabla.setLayout(jp_contenedorTablaLayout);
        jp_contenedorTablaLayout.setHorizontalGroup(
            jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        jp_contenedorTablaLayout.setVerticalGroup(
            jp_contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        jLabel1.setText("CEDULA:");

        jLabel2.setText("NOMBRES:");

        jLabel3.setText("CURSO:");

        jLabel4.setText("CARRERA:");

        jLabel5.setText("FECHA MATRICULA:");

        txf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nombreActionPerformed(evt);
            }
        });

        cb_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        cb_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        javax.swing.GroupLayout jp_contenedorOpcionesLayout = new javax.swing.GroupLayout(jp_contenedorOpciones);
        jp_contenedorOpciones.setLayout(jp_contenedorOpcionesLayout);
        jp_contenedorOpcionesLayout.setHorizontalGroup(
            jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_contenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txf_cedula)
                            .addComponent(cb_curso, 0, 137, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_fechaMatricula)
                            .addComponent(cb_carrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_contenedorOpcionesLayout.setVerticalGroup(
            jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_contenedorOpcionesLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_contenedorOpcionesLayout.createSequentialGroup()
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(cb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_contenedorOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txf_fechaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jp_contenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_contenedorOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_contenedorOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cb_carrera;
    public javax.swing.JComboBox<String> cb_curso;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel jp_contenedorOpciones;
    public javax.swing.JPanel jp_contenedorTabla;
    public javax.swing.JTable jtb_tablaDatos;
    public javax.swing.JTextField txf_cedula;
    public javax.swing.JTextField txf_fechaMatricula;
    public javax.swing.JTextField txf_nombre;
    // End of variables declaration//GEN-END:variables
}
