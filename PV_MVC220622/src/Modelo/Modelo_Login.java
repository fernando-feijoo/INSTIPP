package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Modelo_Login 
{
    public String usuario;
    public String password;
    Modelo_Conexion modeloConexion = new Modelo_Conexion();
    public ResultSet consulta_login () throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "(SELECT usu_nombre, usu_password FROM usuarios WHERE usu_nombre = '" + this.usuario + "' AND usu_password = '" + this.password + "')";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
}