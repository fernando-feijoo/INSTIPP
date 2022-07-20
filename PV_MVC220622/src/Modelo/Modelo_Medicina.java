package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo_Medicina 
{
    public int id;
    public int idBodega;
    public int idTipoMedicina;
    public String nombreMedicina;
    public String fechaIngreso;
    public String fechaVencimiento;
    public double precioUnitario;
    public double existencia;
    
    Modelo_Conexion modeloConexion = new Modelo_Conexion();
    
    public boolean guardar_datos_medicina() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "INSERT INTO medicamentos(id_bodega, id_tipo_med, nombre, fecha_ingreso, fecha_vencimiento, precio_unit, existencia) "
                   + "VALUES ("+this.idBodega+", "+this.idTipoMedicina+", '"+this.nombreMedicina+"', '"+this.fechaIngreso+"', '"+this.fechaVencimiento+"', "
                   + "'"+this.precioUnitario+"', '"+this.existencia+"');";
        st.executeQuery(sql);
        return true;
    }
    
    public ResultSet consultar_tipo_medicinas() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT nombre FROM tipo_medicamento;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public ResultSet consultar_tipo_bodegas() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT nombre FROM bodegas;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
    public ResultSet consultar_medicamentos() throws SQLException
    {
        Statement st = modeloConexion.conexion_bd().createStatement();
        String sql = "SELECT med.id_medicamento, bod.nombre AS \"nombreBodega\", tipMed.nombre AS \"tipoMedicamento\", med.nombre, med.fecha_ingreso, med.fecha_vencimiento, med.precio_unit, med.existencia " +
                     "FROM medicamentos med " +
                     "INNER JOIN bodegas bod ON med.id_bodega = bod.id_bodega " +
                     "INNER JOIN tipo_medicamento tipMed ON med.id_tipo_med = tipMed.id_tipo_med "
                   + "ORDER BY med.id_medicamento;";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
}
