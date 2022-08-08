package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo_Estudiantes 
{
    int id, id_carrera;
    String cedula, nombre, curso, fecha_matricula;
    
    
    Modelo_Conexion modeloConexion = new Modelo_Conexion();
    
    public boolean guardar_datos_estudiantes() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "INSERT INTO public.matriculas(id_matricula, cedula, nombres, curso, id_carrera, fecha_matriculacion)\n" +
"	VALUES ("+this.id+", '"+this.cedula+"', '"+this.nombre+"', '"+this.curso+"', "+this.id_carrera+", '"+this.fecha_matricula+"');";
        st.executeQuery(sql);
        return true;
    }
    
    public ResultSet consultar_estudiantes() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT cedula, nombres, curso, nombre_carrera, fecha_matriculacion\n" +
"	FROM matriculas ma INNER JOIN carreras ca ON ma.id_carrera = ca.id_carrera;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public ResultSet consultar_carreras() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT nombre_carrera FROM carreras;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    
    
}
