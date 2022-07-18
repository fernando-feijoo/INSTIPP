package Controlador;

import Modelo.Modelo_Cliente;
import Vista.Vista_Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador_Cliente implements ActionListener
{
    Vista_Cliente vistaCliente;
    Modelo_Cliente modeloCliente = new Modelo_Cliente();
    public Controlador_Cliente(Vista_Cliente vista_cliente) 
    {
        this.vistaCliente = vista_cliente;
        this.vistaCliente.btn_salir.addActionListener(this);
        this.vistaCliente.btn_guardar.addActionListener(this);
        this.vistaCliente.btn_seleccionarFila.addActionListener(this);
        this.vistaCliente.btn_buscar.addActionListener(this);
        this.llenar_tabla_clientes();
        this.llenar_combo_tipo_cliente();
        this.llenar_combo_tipo_identificacion();
    }
    
    public void llenar_tabla_clientes()
    {
        try 
        {
            DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaCliente.jtb_tablaClientes.getModel();
            tablaModelo.setColumnCount(0);
            tablaModelo.setRowCount(0);
            
            tablaModelo.addColumn("id");
            tablaModelo.addColumn("Nombre");
            tablaModelo.addColumn("Tipo Identificacion");
            tablaModelo.addColumn("Identificación");
            tablaModelo.addColumn("Tipo Cliente");
            tablaModelo.addColumn("Sexo");
            tablaModelo.addColumn("Estado Civil");
            tablaModelo.addColumn("Estado");
        
            ResultSet rs = modeloCliente.consultar_clientes();
            String[] datos = new String[8];
            while (rs.next()) 
            {
                datos[0] = rs.getString("id_cliente");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("tipoId");
                datos[3] = rs.getString("cedula");
                datos[4] = rs.getString("tipoCliente");
                datos[5] = rs.getString("sexo");
                datos[6] = rs.getString("estado_civil");
                datos[7] = rs.getString("estado");
                tablaModelo.addRow(datos);  
            }
        } catch (SQLException ex) 
        {
            System.out.println("Error al llenar la tabla... " + ex);
        }
    }
    
    public void borrar_datos()
    {
        this.vistaCliente.txf_nombresCliente.setText(null);
        this.vistaCliente.cb_tipoIdentificacion.setSelectedIndex(0);
        this.vistaCliente.txf_numeroIdentificacion.setText(null);
        this.vistaCliente.cb_tipoCliente.setSelectedIndex(0);
        this.vistaCliente.cb_sexo.setSelectedIndex(0);
        this.vistaCliente.cb_estadoCivil.setSelectedIndex(0);
        this.vistaCliente.cb_estado.setSelectedIndex(0);
    }
    
    public void llenar_combo_tipo_cliente()
    {
        try {
            ResultSet rs = modeloCliente.consultar_tipo_cliente();
            while (rs.next()) 
            {
                this.vistaCliente.cb_tipoCliente.addItem(rs.getString("nombre"));
            }
        } catch (SQLException ex) 
        {
            System.out.println("Error al llenar combo especies: " + ex);
        }
    }
    
    public void llenar_combo_tipo_identificacion()
    {
        try {
            ResultSet rs = modeloCliente.consultar_tipo_identificacion();
            while (rs.next()) 
            {
                this.vistaCliente.cb_tipoIdentificacion.addItem(rs.getString("nombre"));
            }
        } catch (SQLException ex) 
        {
            System.out.println("Error al llenar combo especies: " + ex);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == this.vistaCliente.btn_salir) 
        {
            this.vistaCliente.setVisible(false);
            this.vistaCliente.txf_buscar.setText(null);
            this.vistaCliente.cb_opcionBusqueda.setSelectedIndex(1);
            this.vistaCliente.btn_buscar.doClick();
            borrar_datos();
            this.vistaCliente.cb_opcionBusqueda.setSelectedIndex(0);
            
        }
        if (ae.getSource() == this.vistaCliente.btn_guardar) 
        {
            
            modeloCliente.nombres = this.vistaCliente.txf_nombresCliente.getText().toUpperCase();
            modeloCliente.numeroIdentificacion = this.vistaCliente.txf_numeroIdentificacion.getText();
            modeloCliente.tipoCliente = this.vistaCliente.cb_tipoCliente.getSelectedIndex();//Aqui coloque el index ya que va el id para foreign key de 1 a n...
            modeloCliente.estadoCivil = this.vistaCliente.cb_estadoCivil.getSelectedItem().toString();
            modeloCliente.tipoIdentificacion = this.vistaCliente.cb_tipoIdentificacion.getSelectedIndex();//Aqui coloque el index ya que va el id para foreign key de 1 a n...
            modeloCliente.sexo = this.vistaCliente.cb_sexo.getSelectedItem().toString();
            modeloCliente.estado = this.vistaCliente.cb_estado.getSelectedItem().toString();
            try 
            {
                modeloCliente.guardar_datos_clientes();
            } catch (SQLException ex) 
            {
                
            }
            int opcion = JOptionPane.showConfirmDialog(vistaCliente, "¿Desea ingresas mas datos?", "Datos", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.OK_OPTION) 
            {
                borrar_datos();
            }
            llenar_tabla_clientes();
        }
        if (ae.getSource() == this.vistaCliente.btn_seleccionarFila) 
        {
            if (this.vistaCliente.jtb_tablaClientes.getSelectedRowCount() == 1) 
            {
                int filaSeleccionada = this.vistaCliente.jtb_tablaClientes.getSelectedRow();
                
                this.vistaCliente.txf_nombresCliente.setText(this.vistaCliente.jtb_tablaClientes.getValueAt(filaSeleccionada, 1).toString());
                this.vistaCliente.cb_tipoIdentificacion.setSelectedItem(this.vistaCliente.jtb_tablaClientes.getValueAt(filaSeleccionada, 2).toString());
                this.vistaCliente.txf_numeroIdentificacion.setText(this.vistaCliente.jtb_tablaClientes.getValueAt(filaSeleccionada, 3).toString());
                this.vistaCliente.cb_tipoCliente.setSelectedItem(this.vistaCliente.jtb_tablaClientes.getValueAt(filaSeleccionada, 4).toString());
                this.vistaCliente.cb_sexo.setSelectedItem(this.vistaCliente.jtb_tablaClientes.getValueAt(filaSeleccionada, 5).toString());
                this.vistaCliente.cb_estadoCivil.setSelectedItem(this.vistaCliente.jtb_tablaClientes.getValueAt(filaSeleccionada, 6).toString());
                this.vistaCliente.cb_estado.setSelectedItem(this.vistaCliente.jtb_tablaClientes.getValueAt(filaSeleccionada, 7).toString());
                
            }else if (this.vistaCliente.jtb_tablaClientes.getSelectedRowCount() == 0)
            {
                JOptionPane.showMessageDialog(vistaCliente, "Aún no seleciona 1 opción.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else
            {
                JOptionPane.showMessageDialog(vistaCliente, "Selecciono más de 1 fila, seleccione solo 1.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (ae.getSource() == this.vistaCliente.btn_buscar) 
        {
            System.out.println("Busqueda empezo...");
            if (this.vistaCliente.cb_opcionBusqueda.getSelectedIndex() == 1) 
            {
                // Hcemos la asignacion de los valores a las variables, pero reiniciamos la anterior o siguiente opcion.
                this.modeloCliente.nombres = vistaCliente.txf_buscar.getText();
                this.modeloCliente.numeroIdentificacion = null;
            } else if (this.vistaCliente.cb_opcionBusqueda.getSelectedIndex() == 2)
            {
                this.modeloCliente.numeroIdentificacion = vistaCliente.txf_buscar.getText();
                this.modeloCliente.nombres = null;
            } else if (this.vistaCliente.cb_opcionBusqueda.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(vistaCliente, "Aún no seleciona 1 filtro en busqueda.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
            if (this.vistaCliente.cb_opcionBusqueda.getSelectedIndex() != 0) 
            {
                try 
                {
                    DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaCliente.jtb_tablaClientes.getModel();
                    tablaModelo.setColumnCount(0);
                    tablaModelo.setRowCount(0);

                    tablaModelo.addColumn("id");
                    tablaModelo.addColumn("Nombre");
                    tablaModelo.addColumn("Tipo Identificacion");
                    tablaModelo.addColumn("Identificación");
                    tablaModelo.addColumn("Tipo Cliente");
                    tablaModelo.addColumn("Sexo");
                    tablaModelo.addColumn("Estado Civil");
                    tablaModelo.addColumn("Estado");

                    ResultSet rs = modeloCliente.buscar_cliente();
                    String[] datos = new String[8];
                    while (rs.next()) 
                    {
                        datos[0] = rs.getString("id_cliente");
                        datos[1] = rs.getString("nombre");
                        datos[2] = rs.getString("tipoId");
                        datos[3] = rs.getString("cedula");
                        datos[4] = rs.getString("tipoCliente");
                        datos[5] = rs.getString("sexo");
                        datos[6] = rs.getString("estado_civil");
                        datos[7] = rs.getString("estado");
                        tablaModelo.addRow(datos);  
                    }
                } catch (SQLException ex) 
                {
                    System.out.println("Error al buscar el dato... " + ex);
                }
            }
        }
    }
    
}
