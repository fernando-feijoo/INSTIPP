package Controlador;

import Modelo.Modelo_Estudiantes;
import Vista.Vista_Estudiante;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Controlador_Estudiantes 
{
    Vista_Estudiante vistaEstudiante;
    //Controlador_Estudiantes controladorEstudiante = new Controlador_Estudiantes(vistaEstudiante);
    Modelo_Estudiantes modeloEstudiantes = new Modelo_Estudiantes();
    public Controlador_Estudiantes(Vista_Estudiante vistaEstudiante) 
    {
        this.vistaEstudiante = vistaEstudiante;
        this.cargar_datos();
        this.llenar_combo_carreras();
    }
    
    public void cargar_datos()
    {
        try 
        {
            DefaultTableModel tablaModelo = (DefaultTableModel) this.vistaEstudiante.jtb_tablaDatos.getModel();
            tablaModelo.setColumnCount(0);
            tablaModelo.setRowCount(0);
            
            tablaModelo.addColumn("Cedula");
            tablaModelo.addColumn("Nombre");
            tablaModelo.addColumn("Curso");
            tablaModelo.addColumn("Carrera");
            tablaModelo.addColumn("Fecha Matricula");
        
            ResultSet rs = modeloEstudiantes.consultar_estudiantes();
            String[] datos = new String[8];
            while (rs.next()) 
            {
                datos[0] = rs.getString("cedula");
                datos[1] = rs.getString("nombres");
                datos[2] = rs.getString("curso");
                datos[3] = rs.getString("nombre_carrera");
                datos[4] = rs.getString("fecha_matriculacion");
                tablaModelo.addRow(datos);  
            }
        } catch (SQLException ex) 
        {
            System.out.println("Error al llenar la tabla... " + ex);
        }
    }
    
    public void llenar_combo_carreras()
    {
        try {
            ResultSet rs = modeloEstudiantes.consultar_carreras();
            while (rs.next()) 
            {
                this.vistaEstudiante.cb_carrera.addItem(rs.getString("nombre_carrera"));
            }
        } catch (SQLException ex) 
        {
            System.out.println("Error al llenar combo especies: " + ex);
        }
    }
}
