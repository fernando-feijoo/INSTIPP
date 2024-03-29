package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo_Cliente 
{
    public int id;
    public String nombres;
    public int tipoIdentificacion;
    public String numeroIdentificacion;
    public int tipoCliente;
    public String sexo;
    public String estadoCivil;
    public String estado;
    
    Modelo_Conexion modeloConexion = new Modelo_Conexion();
    public boolean guardar_datos_clientes() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "INSERT INTO public.clientes(nombre, tipo_identificacion, num_identificacion, tipo_cliente, sexo, estado_civil, estado)\n" +
                     "	VALUES ('"+ this.nombres +"', "+ this.tipoIdentificacion +", '"+ this.numeroIdentificacion +"', "+ this.tipoCliente +","
                   + " '"+ this.sexo +"', '"+ this.estadoCivil +"', '"+ this.estado +"');";
        st.executeQuery(sql);
        return true;
    }
    
    public ResultSet consultar_cliente() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "  SELECT" +
                     "	cli.id_cliente, cli.nombre, tipId.nombre AS \"tipoId\", cli.num_identificacion AS cedula, tipCli.nombre AS \"tipoCliente\", cli.sexo, cli.estado_civil, cli.estado" +
                     "  FROM" +
                     "	clientes cli" +
                     "	INNER JOIN tipos_identificacion tipId ON cli.tipo_identificacion = tipId.id_identificacion" +
                     "	INNER JOIN tipos_cliente tipCli ON cli.tipo_cliente = tipCli.id_tipo_cliente"
                   + "  ORDER BY cli.id_cliente;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public ResultSet consultar_tipo_cliente() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT nombre FROM tipos_cliente;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public ResultSet consultar_tipo_identificacion() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT nombre FROM tipos_identificacion;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public ResultSet buscar_cliente() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "  SELECT" +
                    "	cli.id_cliente, cli.nombre, tipId.nombre AS \"tipoId\", cli.num_identificacion AS cedula, tipCli.nombre AS \"tipoCliente\", cli.sexo, cli.estado_civil, cli.estado" +
                    "   FROM" +
                    "	clientes cli" +
                    "	INNER JOIN tipos_identificacion tipId ON cli.tipo_identificacion = tipId.id_identificacion" +
                    "	INNER JOIN tipos_cliente tipCli ON cli.tipo_cliente = tipCli.id_tipo_cliente" +
                    "   WHERE cli.nombre LIKE '"+ this.nombres +"%' OR cli.num_identificacion LIKE '"+ this.numeroIdentificacion +"%'" +
                    "   ORDER BY " +
                    "	cli.id_cliente;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public boolean eliminar_cliente() throws SQLException
    {
        System.out.println("Eliminado completo de la...BD");
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "DELETE FROM clientes WHERE id_cliente = "+this.id+";";
        st.executeQuery(sql);
        return true;
    }
    
    public boolean actualizar_cliente() throws SQLException
    {
        System.out.println("Actualizado...BD");
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "UPDATE clientes	SET " +
                     "	nombre='"+this.nombres+"', tipo_identificacion="+this.tipoIdentificacion+", num_identificacion='"+this.numeroIdentificacion+"', " +
                     "	tipo_cliente="+this.tipoCliente+", sexo='"+this.sexo+"', estado_civil='"+this.estadoCivil+"', estado='"+this.estado+"' " +
                     "	WHERE id_cliente="+this.id+";";
        st.executeQuery(sql);
        return true;
    }
}
