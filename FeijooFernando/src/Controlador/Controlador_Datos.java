package Controlador;

import Modelo.Modelo_Datos;
import Vista.Vista_Datos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Controlador_Datos implements ActionListener, KeyListener, MouseListener
{
    Vista_Datos vistaDatos;
    Modelo_Datos modeloDatos = new Modelo_Datos();
    Color colorCover = new Color(235, 245, 251);
    Color colorCoverOtro = new Color(250, 219, 216);
    Color colorBase = new Color(204,204,204);
    public Controlador_Datos (Vista_Datos vistaDatos) 
    {
        this.vistaDatos = vistaDatos;
        //MouseListener para clicks.
        this.vistaDatos.jp_botonSalir.addMouseListener(this);
        this.llenar_tabla_datos();
    }
    
    public void llenar_tabla_datos()
    {
        try 
        {
            DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaDatos.jtb_tablaDatos.getModel();
            tablaModelo.setColumnCount(0);
            tablaModelo.setRowCount(0);

            tablaModelo.addColumn("Cedula");
            tablaModelo.addColumn("Apellidos");
            tablaModelo.addColumn("Nombres");
            tablaModelo.addColumn("Dirección");
            tablaModelo.addColumn("e-mail");
            tablaModelo.addColumn("Teléfono");
            tablaModelo.addColumn("Tipo Usuario");
            tablaModelo.addColumn("Estado");
        
            ResultSet rs = modeloDatos.consultar_usuarios();
            String[] datos = new String[8];
            while (rs.next()) 
            {
                
                // usu.cedula, usu.apellidos, usu.nombres, usu.direccion, usu.email,
                //usu.telefono, tipusu.descripcion, usu.estado
                datos[0] = rs.getString("cedula");
                datos[1] = rs.getString("apellidos");
                datos[2] = rs.getString("nombres");
                datos[3] = rs.getString("direccion");
                datos[4] = rs.getString("email");
                datos[5] = rs.getString("telefono");
                datos[6] = rs.getString("descripcion");
                datos[7] = rs.getString("estado");
                tablaModelo.addRow(datos);  
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al llenar la tabla... " + ex);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)    {    }

    @Override
    public void keyTyped(KeyEvent e) {    }

    @Override
    public void keyPressed(KeyEvent e) {    }

    @Override
    public void keyReleased(KeyEvent e) {    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        //Salimos de la ventana y se oculta sando paso a la palabra bienvenida en Vista_Principal.
        if (e.getSource() == this.vistaDatos.jp_botonSalir) 
        {
            this.vistaDatos.setVisible(false);
            this.llenar_tabla_datos();
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
        if (e.getSource() == this.vistaDatos.jp_botonSalir) 
        {
            this.vistaDatos.jp_botonSalir.setBackground(colorCover);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        //        Asigno color al jPanel donde se encuentre el mouse.
        if (e.getSource() == this.vistaDatos.jp_botonSalir) 
        {
            this.vistaDatos.jp_botonSalir.setBackground(colorBase);
        }
    }
}
