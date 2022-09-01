package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo_Datos 
{
    
    Modelo_Conexion modeloConexion = new Modelo_Conexion();
    
    public ResultSet consultar_usuarios() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT usu.cedula, usu.apellidos, usu.nombres, usu.direccion, usu.email, usu.telefono, tipusu.descripcion, usu.estado" +
                     "	FROM usuarios usu" +
                     "	INNER JOIN tipo_usuario tipusu ON usu.id_tipo_usuario = tipusu.id;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
}
