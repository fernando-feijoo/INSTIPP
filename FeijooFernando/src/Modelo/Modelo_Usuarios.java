package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo_Usuarios 
{
    public int id;
    public String nombre;
    public String edad;
    public String especie;
    public String color;
    public String sexo;
    public String raza;
    public String fechaNacimiento;
    
    Modelo_Conexion modeloConexion = new Modelo_Conexion();
    
    public boolean guardar_datos_paciente() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "INSERT INTO pacientes(pac_nombre, pac_edad, pac_sexo, pac_especie, pac_raza, pac_color, pac_fecha_nac)"
                + "VALUES('"+ this.nombre +"', '"+ this.edad +"', '"+ this.sexo +"', '"+ this.especie +"', '"+ this.raza +"',"
                + "'"+ this.color +"', '"+ this.fechaNacimiento +"')";
        st.executeQuery(sql);
        return true;
    }
    
    public ResultSet consultar_pacientes() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT \n" +
                     "	cedula, nombres, apellidos, telefono\n" +
                     "FROM \n" +
                     "	usuarios\n" +
                     "WHERE\n" +
                     "	 estado = 'A';";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
}
