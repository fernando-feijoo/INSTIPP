package Modelo;

import Vista.Vista_Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modelo_Paciente 
{
    public String nombre;
    public String edad;
    public String especie;
    public String color;
    public String sexo;
    public String raza;
    public String fechaNacimiento;
    Vista_Paciente vistaPaciente = new Vista_Paciente();
            
    Modelo_Conexion modeloConexion = new Modelo_Conexion();
    public boolean guardarDatosPaciente() throws SQLException
    {
        Statement st = modeloConexion.conexionBD().createStatement();
        String sql = "INSERT INTO pacientes(pac_nombre, pac_edad, pac_sexo, pac_especie, pac_raza, pac_color, pac_fecha_nac)"
                + "VALUES('"+ this.nombre +"', '"+ this.edad +"', '"+ this.sexo +"', '"+ this.especie +"', '"+ this.raza +"',"
                + "'"+ this.color +"', '"+ this.fechaNacimiento +"')";
        st.executeQuery(sql);
        return true;
    }
    public void cargar() 
    {
        String url="jdbc:postgresql://localhost:5432/veterinaria_pv_270622"; 
        //Credenciales de la base de datos
        String usuario="postgres";
        String contrasena="FerDatos95";
    
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("id");
        tabla.addColumn("Nombre");
        tabla.addColumn("Edad");
        tabla.addColumn("Sexo");
        tabla.addColumn("Especie");
        tabla.addColumn("Raza");
        tabla.addColumn("Color");
        tabla.addColumn("Fecha de Nacimiento");
        this.vistaPaciente.jtb_listaPacientes.setModel(tabla);
        try 
        {
            Connection BaseDatos = null;
            Statement st = null;
            BaseDatos = DriverManager.getConnection(url, usuario, contrasena);
       
            st = BaseDatos.createStatement();
            ResultSet rs = st.executeQuery("SELECT id_paciente, pac_nombre, pac_edad, pac_sexo, pac_especie, pac_raza, pac_color, pac_fecha_nac" +
"	FROM public.pacientes;");                   
            String[] datos = new String[8];  
            while (rs.next()) 
            {
                datos[0] = rs.getString("id_paciente");
                datos[1] = rs.getString("pac_nombre");
                datos[2] = rs.getString("pac_edad");
                datos[3] = rs.getString("pac_sexo");
                datos[4] = rs.getString("pac_especie");
                datos[5] = rs.getString("pac_raza");
                datos[6] = rs.getString("pac_color");
                datos[7] = rs.getString("pac_fecha_nac");
                tabla.addRow(datos);  
            } 
                 rs.close();
                 st.close();
                 BaseDatos.close();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al cargar datos"+ e);
        } 
    }
    public void consultar_pacientes() throws SQLException
    {
        Statement st = modeloConexion.conexionBD().createStatement();
        
    }
}
