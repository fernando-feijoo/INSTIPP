package Modelo;
import java.sql.SQLException;
import java.sql.Statement;
public class Modelo_Login 
{
    public String usuario;
    public String password;
    Modelo_Conexion conexion = new Modelo_Conexion();
    public boolean consultaLogin () throws SQLException
    {
        System.out.println("Ingreso a consulta SQL , " + usuario + " , " + password );
        Statement st = conexion.conexionBD().createStatement();
        String sql = "(SELECT usuario, password FROM login WHERE usuario = '" + this.usuario + "' AND password = '" + this.password + "')";
        st.executeQuery(sql);
        return true;
    }
}