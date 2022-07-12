package Modelo;

import Vista.Vista_Paciente;
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
    Vista_Paciente vistaPaciente = new Vista_Paciente();//Analizar si esta de mas este objeto, no hace nada aqui al parecer.
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
                   + "pac_raza, pac_color, pac_fecha_nac FROM public.pacientes;";
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
                   + "pac_raza, pac_color, pac_fecha_nac FROM public.pacientes WHERE pac_nombre LIKE '"+ this.nombre +"%';";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
}
