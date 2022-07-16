package Modelo;

import java.sql.SQLException;
import java.sql.Statement;

public class Modelo_Cliente 
{
    public String nombres;
    public String numeroIdentificacion;
    public String tipoCliente;
    public String estadoCivil;
    public String tipoIdentificacion;
    public String sexo;
    public String estado;
    Modelo_Conexion modeloConexion = new Modelo_Conexion();
    public boolean guardar_datos_paciente() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT id_cliente, nombre, num_identificacion, estado_civil, estado FROM clientes";
        st.executeQuery(sql);
        return true;
    }
}
