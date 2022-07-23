package Controlador;

import Modelo.Modelo_Usuarios;
import Vista.Vista_Usuarios;
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

public class Controlador_Usuarios implements ActionListener, KeyListener, MouseListener
{
    Vista_Usuarios vistaUsuario;
    Modelo_Usuarios modeloPaciente = new Modelo_Usuarios();
    Color colorCover = new Color(235, 245, 251);
    Color colorCoverOtro = new Color(250, 219, 216);
    Color colorBase = new Color(204,204,204);
    int opcion;
    public Controlador_Usuarios (Vista_Usuarios vistaUsuario) 
    {
        this.vistaUsuario = vistaUsuario;
        //MouseListener para clicks.
        this.vistaUsuario.jp_botonSalir.addMouseListener(this);
        this.vistaUsuario.jp_botonGuardar.addMouseListener(this);
        this.vistaUsuario.btn_seleccionarFila.addActionListener(this);
        //Rellenar campos en combo box.
        //this.llenar_tipo_usuario
        //this.llenar_tabla_pacientes();
    }
    
    public void borrar_datos ()
    {
        this.vistaUsuario.txf_nombre.setText(null);
        this.vistaUsuario.txf_cedula.setText(null);
        this.vistaUsuario.txf_direccion.setText(null);
        this.vistaUsuario.cb_sexo.setSelectedIndex(0);//Selecciona la opcion por defecto inicial.
        this.vistaUsuario.txf_email.setText(null);
        this.vistaUsuario.txf_telefono.setText(null);
    }
    
    public void llenar_tabla_pacientes()
    {
        try 
        {
            DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaUsuario.jtb_tablaPacientes.getModel();
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
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al llenar la tabla... " + ex);
        }
    }
    
    public void llenar_combo_tipou_suario()
    {
        try {
            ResultSet rs = modeloPaciente.consultar_especie();
            while (rs.next()) 
            {
                this.vistaUsuario.cb_especie.addItem(rs.getString("especie"));
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al llenar combo especies: " + ex);
        }
    }
    
    public void cargar_datos()
    {
        modeloPaciente.nombre = this.vistaUsuario.txf_nombre.getText().toUpperCase();
        modeloPaciente.edad = this.vistaUsuario.txf_cedula.getText().toUpperCase();
        modeloPaciente.especie = this.vistaUsuario.txf_apellido.toString();
        modeloPaciente.color = this.vistaUsuario.txf_direccion.getText().toUpperCase();
        modeloPaciente.sexo = this.vistaUsuario.cb_sexo.getSelectedItem().toString();
        modeloPaciente.raza = this.vistaUsuario.txf_email.getText().toUpperCase();
        modeloPaciente.fechaNacimiento = this.vistaUsuario.txf_telefono.getText();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == this.vistaUsuario.btn_buscar) 
        {
            modeloPaciente.nombre = this.vistaUsuario.txf_buscar.getText();
            try 
            {
                DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaUsuario.jtb_tablaPacientes.getModel();
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
            } 
            catch (SQLException ex) 
            {
                System.out.println("Error al buscar el dato... " + ex);
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
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        //Salimos de la ventana y se oculta sando paso a la palabra bienvenida en Vista_Principal.
        if (e.getSource() == this.vistaUsuario.jp_botonSalir) 
        {
            this.vistaUsuario.setVisible(false);
            this.llenar_tabla_pacientes();
            borrar_datos();
        }
        //Guardamos la informacion dentro de los textField de Vista_Paciente y se borra una vez guardado.
        if (e.getSource() == this.vistaUsuario.jp_botonGuardar) 
        {
            this.cargar_datos();
            try 
            {
                this.modeloPaciente.guardar_datos_paciente();
            } 
            catch (SQLException ex) 
            {
                System.out.println("Error al guardar los datos: " + ex);
            }
            opcion = JOptionPane.showConfirmDialog(vistaUsuario, "¿Desea ingresas mas datos?", "Datos", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.OK_OPTION) 
            {
                borrar_datos();
            }
            this.llenar_tabla_pacientes();
        }
        //Actualizamos la informacion de la BD
        if (e.getSource() == this.vistaUsuario.jp_botonActualizar) 
        {
            opcion = 1;
            this.cargar_datos();
            try 
            {
                opcion = JOptionPane.showConfirmDialog(vistaUsuario, "¿Desea actualizar el registro?", "Actualizado", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) 
                {
                    this.modeloPaciente.actualizar_pacientes();
                    System.out.println("Datos actualizados...");
                }
            } 
            catch (SQLException ex) 
            {
                System.out.println("Error al actualizar los datos: " + ex);//Aun nose porque sale error es como que ingresa 2 veces.
            }
            if (opcion == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(vistaUsuario, "Registro actualizado correctamente.", "Mensaje confirmación", JOptionPane.INFORMATION_MESSAGE);
                this.llenar_tabla_pacientes();
                this.borrar_datos();
            }
        }
        
        if (e.getSource() == this.vistaUsuario.jp_botonEliminar) 
        {
            opcion = 1; // valor de respuesta negativo, positivo es 0.
            try 
            {
                opcion = JOptionPane.showConfirmDialog(vistaUsuario, "¿Desea eliminar el registro?", "Eliminado", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) 
                {
                    this.modeloPaciente.eliminar_pacientes();
                }
            } 
            catch (SQLException ex) 
            {
                System.out.println("Error al eliminar los datos: " + ex);
            }
            if (opcion == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(vistaUsuario, "Registro eliminado correctamente.", "Mensaje confirmación", JOptionPane.INFORMATION_MESSAGE);
                this.llenar_tabla_pacientes();
                this.borrar_datos();
            }
            else if (opcion == JOptionPane.NO_OPTION) 
            {
                this.modeloPaciente.id = 0;
            }
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
        if (e.getSource() == this.vistaUsuario.jp_botonActualizar) 
        {
            this.vistaUsuario.jp_botonActualizar.setBackground(colorCover);
        }
        else if (e.getSource() == this.vistaUsuario.jp_botonGuardar) 
        {
            this.vistaUsuario.jp_botonGuardar.setBackground(colorCover);
        }
        else if (e.getSource() == this.vistaUsuario.jp_botonEliminar) 
        {
            this.vistaUsuario.jp_botonEliminar.setBackground(colorCoverOtro);
        }
        else if (e.getSource() == this.vistaUsuario.jp_botonSalir) 
        {
            this.vistaUsuario.jp_botonSalir.setBackground(colorCover);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        //        Asigno color al jPanel donde se encuentre el mouse.
        if (e.getSource() == this.vistaUsuario.jp_botonActualizar) 
        {
            this.vistaUsuario.jp_botonActualizar.setBackground(colorBase);
        }
        else if (e.getSource() == this.vistaUsuario.jp_botonGuardar) 
        {
            this.vistaUsuario.jp_botonGuardar.setBackground(colorBase);
        }
        else if (e.getSource() == this.vistaUsuario.jp_botonEliminar) 
        {
            this.vistaUsuario.jp_botonEliminar.setBackground(colorBase);
        }
        else if (e.getSource() == this.vistaUsuario.jp_botonSalir) 
        {
            this.vistaUsuario.jp_botonSalir.setBackground(colorBase);
        }
    }
}
