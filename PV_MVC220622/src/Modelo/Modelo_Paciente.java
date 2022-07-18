package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo_Paciente 
{
    public String nombre;
    public String edad;
    public String especie;
    public String color;
    public String sexo;
    public String raza;
    public String fechaNacimiento;
    public int id;
    
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
        String sql = "SELECT id_paciente, pac_nombre, pac_edad, pac_sexo, pac_especie, "
                   + "pac_raza, pac_color, pac_fecha_nac FROM pacientes "
                   + "ORDER BY id_paciente;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public ResultSet consultar_especie() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT especie FROM especies;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public ResultSet buscar_pacientes() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT id_paciente, pac_nombre, pac_edad, pac_sexo, pac_especie, "
                   + "pac_raza, pac_color, pac_fecha_nac FROM public.pacientes WHERE pac_nombre LIKE '%"+ this.nombre +"%';";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public boolean actualizar_pacientes() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "UPDATE pacientes SET pac_nombre = '"+this.nombre+"', pac_edad = '"+this.edad+"', pac_sexo = '"+this.sexo+"', pac_especie = '"+this.especie+"', "
                   + "pac_raza = '"+this.raza+"', pac_color = '"+this.color+"', pac_fecha_nac = '"+this.fechaNacimiento+"' "
                   + "WHERE id_paciente = "+this.id+";";
        st.executeQuery(sql);
        return true;
    }
}
