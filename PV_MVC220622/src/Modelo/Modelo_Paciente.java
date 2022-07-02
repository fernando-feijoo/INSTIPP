package Modelo;

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
            
    Modelo_Conexion modeloConexion = new Modelo_Conexion();
    public boolean guardarDatosPaciente() throws SQLException
    {
        Statement st = modeloConexion.conexionBD().createStatement();
        String sql = "(INSERT INTO pacientes(pac_nombre, pac_edad, pac_sexo, pac_especie_ pac_raza, pac_color, pac_fecha_nac)"
                + "VALUES('"+ this.nombre +"', '"+ this.edad +"', '"+ this.sexo +"', '"+ this.especie +"', '"+ this.raza +"'"
                + "'"+ this.color +"', '"+ this.fechaNacimiento +"'))";
        st.executeQuery(sql);
        return true;
    }
}
