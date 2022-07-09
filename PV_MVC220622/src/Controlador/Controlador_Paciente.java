package Controlador;

import Modelo.Modelo_Paciente;
import Vista.Vista_Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador_Paciente implements ActionListener
{
    Vista_Paciente vistaPaciente;
    Modelo_Paciente modeloPaciente = new Modelo_Paciente();
    public Controlador_Paciente (Vista_Paciente vistaPaciente) throws SQLException 
    {
        this.vistaPaciente = vistaPaciente;
        this.vistaPaciente.btn_salir.addActionListener(this);
        this.vistaPaciente.btn_guardar.addActionListener(this);
        this.vistaPaciente.btn_buscar.addActionListener(this);
        this.llenarComboEspecies();
        this.llenar_tabla();
        
    }
    public void borrarDatos ()
    {
        this.vistaPaciente.txf_nombre.setText(null);
        this.vistaPaciente.txf_edad.setText(null);
        this.vistaPaciente.cb_especie.setAction(null);
        this.vistaPaciente.txf_color.setText(null);
        this.vistaPaciente.cb_sexo.setAction(null);
        this.vistaPaciente.txf_raza.setText(null);
        this.vistaPaciente.txf_fechaNacimiento.setText(null);
    }
    public void llenar_tabla()
    {
        try 
        {
            DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaPaciente.jtb_listaPacientes.getModel();
            tablaModelo.setColumnCount(0);
            tablaModelo.setRowCount(0);

            tablaModelo.addColumn("id");
            tablaModelo.addColumn("Nombre");
            tablaModelo.addColumn("Edad");
            tablaModelo.addColumn("Sexo");
            tablaModelo.addColumn("Especie");
            tablaModelo.addColumn("Raza");
            tablaModelo.addColumn("Color");
            tablaModelo.addColumn("Fecha de Nacimiento");
        
            ResultSet rs = modeloPaciente.consultar_pacientes();
            String[] datos = new String[8];
            while (rs.next()) 
            {
                datos[0] = rs.getString("id_paciente");
                datos[1] = rs.getString("pac_nombre");
                datos[2] = rs.getString("pac_edad");
                datos[3] = rs.getString("pac_sexo");
                datos[4] = rs.getString("pac_especie");
                datos[5] = rs.getString("pac_raza");
                datos[6] = rs.getString("pac_color");
                datos[7] = rs.getString("pac_fecha_nac");
                tablaModelo.addRow(datos);  
            }
        } catch (SQLException ex) 
        {
            System.out.println("Error al llenar la tabla... " + ex);
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
//        Salimos de la ventana y se oculta sando paso a la palabra bienvenida en Vista_Principal.
        if (ae.getSource() == this.vistaPaciente.btn_salir) 
        {
            this.vistaPaciente.setVisible(false);
            borrarDatos();
        }
//        Guardamos la informacion dentro de los textField de Vista_Paciente y se borra una vez guardado.
        if (ae.getSource() == this.vistaPaciente.btn_guardar) 
        {
            modeloPaciente.nombre = this.vistaPaciente.txf_nombre.getText();
            modeloPaciente.edad = this.vistaPaciente.txf_edad.getText();
            modeloPaciente.especie = this.vistaPaciente.cb_especie.getName();//
            modeloPaciente.color = this.vistaPaciente.txf_color.getText();
            modeloPaciente.sexo = this.vistaPaciente.cb_sexo.getName();//
            modeloPaciente.raza = this.vistaPaciente.txf_raza.getText();
            modeloPaciente.fechaNacimiento = this.vistaPaciente.txf_fechaNacimiento.getText();
            try 
            {
                modeloPaciente.guardarDatosPaciente();
            } catch (SQLException ex) 
            {
                
            }
            int opcion = JOptionPane.showConfirmDialog(vistaPaciente, "¿Desea ingresas mas datos?", "Datos", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.OK_OPTION) 
            {
                borrarDatos();
            }
            llenar_tabla();
        }
        if (ae.getSource() == this.vistaPaciente.btn_buscar) 
        {
            modeloPaciente.nombre = this.vistaPaciente.txf_buscar.getText();
            try 
            {
                DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaPaciente.jtb_listaPacientes.getModel();
                tablaModelo.setColumnCount(0);
                tablaModelo.setRowCount(0);

                tablaModelo.addColumn("id");
                tablaModelo.addColumn("Nombre");
                tablaModelo.addColumn("Edad");
                tablaModelo.addColumn("Sexo");
                tablaModelo.addColumn("Especie");
                tablaModelo.addColumn("Raza");
                tablaModelo.addColumn("Color");
                tablaModelo.addColumn("Fecha de Nacimiento");

                ResultSet rs = modeloPaciente.buscar_pacientes();
                String[] datos = new String[8];
                while (rs.next()) 
                {
                    datos[0] = rs.getString("id_paciente");
                    datos[1] = rs.getString("pac_nombre");
                    datos[2] = rs.getString("pac_edad");
                    datos[3] = rs.getString("pac_sexo");
                    datos[4] = rs.getString("pac_especie");
                    datos[5] = rs.getString("pac_raza");
                    datos[6] = rs.getString("pac_color");
                    datos[7] = rs.getString("pac_fecha_nac");
                    tablaModelo.addRow(datos);  
                }
            } catch (SQLException ex) 
            {
                System.out.println("Error al buscar el dato... " + ex);
            }
        }
    }
    public void llenarComboEspecies() throws SQLException
    {
        ResultSet rs = modeloPaciente.consultar_especie();
        while (rs.next()) 
        {
            this.vistaPaciente.cb_especie.addItem(rs.getString("especie"));
        }
    }
}
