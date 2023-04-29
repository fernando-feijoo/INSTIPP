package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Modelo_Conexion 
{
    public Connection conexion_bd()
    {
        String baseDatos = "jdbc:postgresql://localhost:5432/bd_tierra_fertil";
        String user = "postgres";
        String password = "postgres";
        try 
        {
//            Conexion a la base de datos.
            Connection conexion = DriverManager.getConnection(baseDatos, user, password);
            System.out.println("Conexion exitosa.");
            return conexion;
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + ex);
            return null;
        }
    }
}