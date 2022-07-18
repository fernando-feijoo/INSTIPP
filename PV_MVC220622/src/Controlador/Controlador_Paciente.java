package Controlador;

import Modelo.Modelo_Paciente;
import Vista.Vista_Paciente;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador_Paciente implements ActionListener, KeyListener, MouseListener
{
    Vista_Paciente vistaPaciente;
    Modelo_Paciente modeloPaciente = new Modelo_Paciente();
    Color colorCover = new Color(235, 245, 251);
    Color colorCoverOtro = new Color(250, 219, 216);
    Color colorBase = new Color(204,204,204);
    public Controlador_Paciente (Vista_Paciente vistaPaciente) 
    {
        this.vistaPaciente = vistaPaciente;
        //MouseListener para clicks.
        this.vistaPaciente.jp_botonSalir.addMouseListener(this);
        this.vistaPaciente.jp_botonGuardar.addMouseListener(this);
        this.vistaPaciente.jp_botonActualizar.addMouseListener(this);
        this.vistaPaciente.jp_botonEliminar.addMouseListener(this);
         //ActionListener para clicks.
        this.vistaPaciente.btn_buscar.addActionListener(this);
        this.vistaPaciente.btn_seleccionarFila.addActionListener(this);
        //KeyListener para eventos de teclas.
        this.vistaPaciente.txf_buscar.addKeyListener(this);
        //Rellenar campos en combo box.
        this.llenar_combo_especies();
        this.llenar_tabla_pacientes();
    }
    
    public void borrar_datos ()
    {
        this.vistaPaciente.txf_nombre.setText(null);
        this.vistaPaciente.txf_edad.setText(null);
        this.vistaPaciente.cb_especie.setSelectedIndex(0);//Selecciona la opcion por defecto inicial.
        this.vistaPaciente.txf_color.setText(null);
        this.vistaPaciente.cb_sexo.setSelectedIndex(0);//Selecciona la opcion por defecto inicial.
        this.vistaPaciente.txf_raza.setText(null);
        this.vistaPaciente.txf_fechaNacimiento.setText(null);
    }
    
    public void llenar_tabla_pacientes()
    {
        try 
        {
            DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaPaciente.jtb_tablaPacientes.getModel();
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
    
    public void llenar_combo_especies()
    {
        try {
            ResultSet rs = modeloPaciente.consultar_especie();
            while (rs.next()) 
            {
                this.vistaPaciente.cb_especie.addItem(rs.getString("especie"));
            }
        } catch (SQLException ex) 
        {
            System.out.println("Error al llenar combo especies: " + ex);
        }
    }
    
    public void cargar_datos()
    {
        modeloPaciente.nombre = this.vistaPaciente.txf_nombre.getText().toUpperCase();
        modeloPaciente.edad = this.vistaPaciente.txf_edad.getText().toUpperCase();
        modeloPaciente.especie = this.vistaPaciente.cb_especie.getSelectedItem().toString();
        modeloPaciente.color = this.vistaPaciente.txf_color.getText().toUpperCase();
        modeloPaciente.sexo = this.vistaPaciente.cb_sexo.getSelectedItem().toString();
        modeloPaciente.raza = this.vistaPaciente.txf_raza.getText().toUpperCase();
        modeloPaciente.fechaNacimiento = this.vistaPaciente.txf_fechaNacimiento.getText();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == this.vistaPaciente.btn_buscar) 
        {
            modeloPaciente.nombre = this.vistaPaciente.txf_buscar.getText();
            try 
            {
                DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaPaciente.jtb_tablaPacientes.getModel();
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
        if (ae.getSource() == this.vistaPaciente.btn_seleccionarFila) 
        {
            if (this.vistaPaciente.jtb_tablaPacientes.getSelectedRowCount() == 1) 
            {
                int filaSeleccionada = this.vistaPaciente.jtb_tablaPacientes.getSelectedRow();
                //Seleccion del id de dato a modificar. Mas adelante claro.
                this.modeloPaciente.id = Integer.parseInt(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 0).toString());
                
                this.vistaPaciente.txf_nombre.setText(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 1).toString());
                this.vistaPaciente.txf_edad.setText(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 2).toString());
                this.vistaPaciente.cb_sexo.setSelectedItem(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 3).toString());
                this.vistaPaciente.cb_especie.setSelectedItem(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 4).toString());
                this.vistaPaciente.txf_raza.setText(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 5).toString());
                this.vistaPaciente.txf_color.setText(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 6).toString());
                this.vistaPaciente.txf_fechaNacimiento.setText(this.vistaPaciente.jtb_tablaPacientes.getValueAt(filaSeleccionada, 7).toString());
            }else if (this.vistaPaciente.jtb_tablaPacientes.getSelectedRowCount() == 0)
            {
                JOptionPane.showMessageDialog(vistaPaciente, "Aún no seleciona 1 opción.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else
            {
                JOptionPane.showMessageDialog(vistaPaciente, "Selecciono más de 1 fila, seleccione solo 1.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {    }

    @Override
    public void keyPressed(KeyEvent e) {    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        this.vistaPaciente.btn_buscar.doClick();
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        //Salimos de la ventana y se oculta sando paso a la palabra bienvenida en Vista_Principal.
        if (e.getSource() == this.vistaPaciente.jp_botonSalir) 
        {
            this.vistaPaciente.txf_buscar.setText(null);
            this.vistaPaciente.setVisible(false);
            this.llenar_tabla_pacientes();
            borrar_datos();
        }
        //Guardamos la informacion dentro de los textField de Vista_Paciente y se borra una vez guardado.
        if (e.getSource() == this.vistaPaciente.jp_botonGuardar) 
        {
            this.cargar_datos();
            try 
            {
                this.modeloPaciente.guardar_datos_paciente();
            } catch (SQLException ex) 
            {
                System.out.println("Error al guardar los datos: " + ex);
            }
            int opcion = JOptionPane.showConfirmDialog(vistaPaciente, "¿Desea ingresas mas datos?", "Datos", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.OK_OPTION) 
            {
                borrar_datos();
            }
            this.llenar_tabla_pacientes();
        }
        //Actualizamos la informacion de la BD
        if (e.getSource() == this.vistaPaciente.jp_botonActualizar) 
        {
            this.cargar_datos();
            try {
               this.modeloPaciente.actualizar_pacientes();
            } catch (SQLException ex) 
            {
                System.out.println("Error al actualizar los datos: " + ex);//Aun nose porque sale error es como que ingresa 2 veces.
            }
            this.llenar_tabla_pacientes();
            this.borrar_datos();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        //        Asigno color al jPanel donde se encuentre el mouse.
        if (e.getSource() == this.vistaPaciente.jp_botonActualizar) 
        {
            this.vistaPaciente.jp_botonActualizar.setBackground(colorCover);
        }
        else if (e.getSource() == this.vistaPaciente.jp_botonGuardar) 
        {
            this.vistaPaciente.jp_botonGuardar.setBackground(colorCover);
        }
        else if (e.getSource() == this.vistaPaciente.jp_botonEliminar) 
        {
            this.vistaPaciente.jp_botonEliminar.setBackground(colorCoverOtro);
        }
        else if (e.getSource() == this.vistaPaciente.jp_botonSalir) 
        {
            this.vistaPaciente.jp_botonSalir.setBackground(colorCover);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        //        Asigno color al jPanel donde se encuentre el mouse.
        if (e.getSource() == this.vistaPaciente.jp_botonActualizar) 
        {
            this.vistaPaciente.jp_botonActualizar.setBackground(colorBase);
        }
        else if (e.getSource() == this.vistaPaciente.jp_botonGuardar) 
        {
            this.vistaPaciente.jp_botonGuardar.setBackground(colorBase);
        }
        else if (e.getSource() == this.vistaPaciente.jp_botonEliminar) 
        {
            this.vistaPaciente.jp_botonEliminar.setBackground(colorBase);
        }
        else if (e.getSource() == this.vistaPaciente.jp_botonSalir) 
        {
            this.vistaPaciente.jp_botonSalir.setBackground(colorBase);
        }
    }
}
