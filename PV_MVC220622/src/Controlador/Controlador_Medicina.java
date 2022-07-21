package Controlador;

import Modelo.Modelo_Medicina;
import Vista.Vista_Medicina;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador_Medicina implements ActionListener, MouseListener
{
    Vista_Medicina vistaMedicina;
    Modelo_Medicina modeloMedicina = new Modelo_Medicina();
    Color colorCover = new Color(235, 245, 251);
    Color colorCoverOtro = new Color(250, 219, 216);
    Color colorBase = new Color(204,204,204);
    public Controlador_Medicina(Vista_Medicina vista_medicina) 
    {
        this.vistaMedicina = vista_medicina;
        this.vistaMedicina.jp_botonSalir.addMouseListener(this);
        this.vistaMedicina.jp_botonGuardar.addMouseListener(this);
        this.vistaMedicina.jp_botonActualizar.addMouseListener(this);
        this.vistaMedicina.jp_botonEliminar.addMouseListener(this);
        
        this.vistaMedicina.btn_seleccionarFila.addActionListener(this);
        
        //Rellenar campos
        this.llenar_tabla_medicamentos();
        this.llenar_combo_tipo_medicinas();
        this.llenar_combo_tipo_bodegas();
    }
    
    public void llenar_combo_tipo_medicinas()
    {
        try {
            ResultSet rs = modeloMedicina.consultar_tipo_medicinas();
            while (rs.next()) 
            {
                this.vistaMedicina.cb_tipoMedicamento.addItem(rs.getString("nombre"));
            }
        } catch (SQLException ex) 
        {
            System.out.println("Error al llenar combo tipo medicinas: " + ex);
        }
    }
    
    public void llenar_combo_tipo_bodegas()
    {
        try {
            ResultSet rs = modeloMedicina.consultar_tipo_bodegas();
            while (rs.next()) 
            {
                this.vistaMedicina.cb_bodega.addItem(rs.getString("nombre"));
            }
        } catch (SQLException ex) 
        {
            System.out.println("Error al llenar combo tipo bodegas: " + ex);
        }
    }
    
    public void cargar_datos()
    {
        this.modeloMedicina.idBodega = this.vistaMedicina.cb_bodega.getSelectedIndex();
        this.modeloMedicina.idTipoMedicina = this.vistaMedicina.cb_tipoMedicamento.getSelectedIndex();
        this.modeloMedicina.nombreMedicina = this.vistaMedicina.txf_nombreMedicamento.getText().toUpperCase();
        this.modeloMedicina.fechaIngreso = this.vistaMedicina.txf_fechaIngreso.getText();
        this.modeloMedicina.fechaVencimiento = this.vistaMedicina.txf_fechaVencimiento.getText();
        this.modeloMedicina.precioUnitario = Double.parseDouble(this.vistaMedicina.txf_precio.getText());
        this.modeloMedicina.existencia = Double.parseDouble(this.vistaMedicina.txf_existenciaMedicamento.getText());
    }
    
    public void borrar_datos()
    {
        this.vistaMedicina.cb_bodega.setSelectedIndex(0);
        this.vistaMedicina.cb_tipoMedicamento.setSelectedIndex(0);
        this.vistaMedicina.txf_nombreMedicamento.setText(null);
        this.vistaMedicina.txf_fechaIngreso.setText(null);
        this.vistaMedicina.txf_fechaVencimiento.setText(null);
        this.vistaMedicina.txf_precio.setText(null);
        this.vistaMedicina.txf_existenciaMedicamento.setText(null);
    }
    
    public void llenar_tabla_medicamentos()
    {
        try 
        {
            DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaMedicina.jtb_tablaMedicamentos.getModel();
            tablaModelo.setColumnCount(0);
            tablaModelo.setRowCount(0);

            tablaModelo.addColumn("id");
            tablaModelo.addColumn("Nombre Bodega");
            tablaModelo.addColumn("Tipo Medicamento");
            tablaModelo.addColumn("Nombre");
            tablaModelo.addColumn("Fecha Ingreso");
            tablaModelo.addColumn("Fecha Vencimiento");
            tablaModelo.addColumn("Precio Unitario");
            tablaModelo.addColumn("Stock");
        
            ResultSet rs = modeloMedicina.consultar_medicamentos();
            String[] datos = new String[8];
            while (rs.next()) 
            {
                datos[0] = rs.getString("id_medicamento");
                datos[1] = rs.getString("nombreBodega");
                datos[2] = rs.getString("tipoMedicamento");
                datos[3] = rs.getString("nombre");
                datos[4] = rs.getString("fecha_ingreso");
                datos[5] = rs.getString("fecha_vencimiento");
                datos[6] = rs.getString("precio_unit");
                datos[7] = rs.getString("existencia");
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
        if (ae.getSource() == this.vistaMedicina.btn_seleccionarFila) 
        {
            if (this.vistaMedicina.jtb_tablaMedicamentos.getSelectedRowCount() == 1) 
            {
                int filaSeleccionada = this.vistaMedicina.jtb_tablaMedicamentos.getSelectedRow();
                //Seleccion del id de dato a modificar. Mas adelante claro.
                
                this.modeloMedicina.id = Integer.parseInt(this.vistaMedicina.jtb_tablaMedicamentos.getValueAt(filaSeleccionada, 0).toString());
                
                this.vistaMedicina.cb_bodega.setSelectedItem(this.vistaMedicina.jtb_tablaMedicamentos.getValueAt(filaSeleccionada, 1).toString());
                this.vistaMedicina.cb_tipoMedicamento.setSelectedItem(this.vistaMedicina.jtb_tablaMedicamentos.getValueAt(filaSeleccionada, 2).toString());
                this.vistaMedicina.txf_nombreMedicamento.setText(this.vistaMedicina.jtb_tablaMedicamentos.getValueAt(filaSeleccionada, 3).toString());
                this.vistaMedicina.txf_fechaIngreso.setText(this.vistaMedicina.jtb_tablaMedicamentos.getValueAt(filaSeleccionada, 4).toString());
                this.vistaMedicina.txf_fechaVencimiento.setText(this.vistaMedicina.jtb_tablaMedicamentos.getValueAt(filaSeleccionada, 5).toString());
                this.vistaMedicina.txf_precio.setText(this.vistaMedicina.jtb_tablaMedicamentos.getValueAt(filaSeleccionada, 6).toString());
                this.vistaMedicina.txf_existenciaMedicamento.setText(this.vistaMedicina.jtb_tablaMedicamentos.getValueAt(filaSeleccionada, 7).toString());
            }else if (this.vistaMedicina.jtb_tablaMedicamentos.getSelectedRowCount() == 0)
            {
                JOptionPane.showMessageDialog(vistaMedicina, "Aún no seleciona 1 opción.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else
            {
                JOptionPane.showMessageDialog(vistaMedicina, "Selecciono más de 1 fila, seleccione solo 1.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if (e.getSource() == this.vistaMedicina.jp_botonSalir) 
        {
            this.vistaMedicina.setVisible(false);
            this.borrar_datos();
        }
        
        if (e.getSource() == this.vistaMedicina.jp_botonGuardar) 
        {
            this.cargar_datos();
            try 
            {
                this.modeloMedicina.guardar_datos_medicina();
            } catch (SQLException ex) 
            {
                System.out.println("Error al guardar los datos: " + ex);
            }
            int opcion = JOptionPane.showConfirmDialog(vistaMedicina, "¿Desea ingresas mas datos?", "Datos", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.OK_OPTION) 
            {
                this.borrar_datos();
            }
            this.llenar_tabla_medicamentos();
        }
        
        if (e.getSource() == this.vistaMedicina.jp_botonEliminar) 
        {
            int opcion = 1; // valor de respuesta negativo, positivo es 0.
            try 
            {
                opcion = JOptionPane.showConfirmDialog(vistaMedicina, "¿Desea eliminar el registro?", "Eliminado", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) 
                {
                    this.modeloMedicina.eliminar_medicamentos();
                }
            } 
            catch (SQLException ex) 
            {
                System.out.println("Error al eliminar los datos: " + ex);
            }
            if (opcion == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(vistaMedicina, "Registro eliminado correctamente.", "Mensaje confirmación", JOptionPane.INFORMATION_MESSAGE);
                this.llenar_tabla_medicamentos();
                this.borrar_datos();
            }
            else if (opcion == JOptionPane.NO_OPTION) 
            {
                this.modeloMedicina.id = 0;
                this.borrar_datos();
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
        if (e.getSource() == this.vistaMedicina.jp_botonActualizar) 
        {
            this.vistaMedicina.jp_botonActualizar.setBackground(colorCover);
        }
        else if (e.getSource() == this.vistaMedicina.jp_botonGuardar) 
        {
            this.vistaMedicina.jp_botonGuardar.setBackground(colorCover);
        }
        else if (e.getSource() == this.vistaMedicina.jp_botonEliminar) 
        {
            this.vistaMedicina.jp_botonEliminar.setBackground(colorCoverOtro);
        }
        else if (e.getSource() == this.vistaMedicina.jp_botonSalir) 
        {
            this.vistaMedicina.jp_botonSalir.setBackground(colorCover);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        //        Asigno color al jPanel donde se encuentre el mouse.
        if (e.getSource() == this.vistaMedicina.jp_botonActualizar) 
        {
            this.vistaMedicina.jp_botonActualizar.setBackground(colorBase);
        }
        else if (e.getSource() == this.vistaMedicina.jp_botonGuardar) 
        {
            this.vistaMedicina.jp_botonGuardar.setBackground(colorBase);
        }
        else if (e.getSource() == this.vistaMedicina.jp_botonEliminar) 
        {
            this.vistaMedicina.jp_botonEliminar.setBackground(colorBase);
        }
        else if (e.getSource() == this.vistaMedicina.jp_botonSalir) 
        {
            this.vistaMedicina.jp_botonSalir.setBackground(colorBase);
        }
    }
}
