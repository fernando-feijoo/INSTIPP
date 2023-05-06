/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ConexionEnterprise")
public class ConexionEnterprise {

    String url = "jdbc:postgresql://localhost:5432/enterprise050523";
    String user = "postgres";
    String password = "postgres";
    Connection conexion = null;
    String resultado = "";

    @WebMethod(operationName = "guardar")
    public String guardar(@WebParam(name = "codigo") String codigo, @WebParam(name = "cedula") String cedula, @WebParam(name = "apellido") String apellido, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "sueldo") double sueldo) {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "INSERT INTO enterprise_tb (codigo, cedula, apellido, nombre, direccion, sueldo) VALUES (?,?,?,?,?,?);";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, codigo);
            statement.setString(2, cedula);
            statement.setString(3, apellido);
            statement.setString(4, nombre);
            statement.setString(5, direccion);
            statement.setDouble(6, sueldo);

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                resultado = "Datos guardados exitosamente.";
                System.out.println(resultado);
            } else {
                resultado = "Error al guardar los datos.";
                System.out.println(resultado);
            }
        } catch (ClassNotFoundException | SQLException e) {
            resultado = "Error al guardar los datos.";
            System.out.println(resultado);
            e.printStackTrace();
        }
        return resultado;
    }

    @WebMethod(operationName = "actualizar")
    public String actualizar(@WebParam(name = "codigo") String codigo, @WebParam(name = "cedula") String cedula, @WebParam(name = "apellido") String apellido, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "sueldo") double sueldo) {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "UPDATE enterprise_tb SET cedula=?, apellido=?, nombre=?, direccion=?, sueldo=? WHERE codigo = ?;";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, cedula);
            statement.setString(2, apellido);
            statement.setString(3, nombre);
            statement.setString(4, direccion);
            statement.setDouble(5, sueldo);
            statement.setString(6, codigo);

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                resultado = "Datos actualizados exitosamente.";
                System.out.println(resultado);
            } else {
                resultado = "Error al actualizador los datos.";
                System.out.println(resultado);
            }
        } catch (ClassNotFoundException | SQLException e) {
            resultado = "Error al actualizar los datos.";
            System.out.println(resultado);
            e.printStackTrace();
        }
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public String eliminar(@WebParam(name = "codigo") String codigo) {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "DELETE FROM enterprise_tb WHERE codigo = ?;";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, codigo);

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                resultado = "Datos eliminados exitosamente.";
                System.out.println(resultado);
            } else {
                resultado = "Error al eliminar los datos.";
                System.out.println(resultado);
            }
        } catch (ClassNotFoundException | SQLException e) {
            resultado = "Error al eliminar los datos.";
            System.out.println(resultado);
            e.printStackTrace();
        }
        return resultado;
    }

    @WebMethod(operationName = "listarPorCodigo")
    public String listarPorCodigo(@WebParam(name = "codigo") String codigo) {
        StringBuilder resultado = new StringBuilder();
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "SELECT * FROM enterprise_tb WHERE codigo = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, codigo);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String cedula = resultSet.getString("cedula");
                String apellido = resultSet.getString("apellido");
                String nombre = resultSet.getString("nombre");
                String direccion = resultSet.getString("direccion");
                double sueldo = resultSet.getDouble("sueldo");

                resultado.append("Cédula: ").append(cedula).append("\n");
                resultado.append("Apellido: ").append(apellido).append("\n");
                resultado.append("Nombre: ").append(nombre).append("\n");
                resultado.append("Dirección: ").append(direccion).append("\n");
                resultado.append("Sueldo: ").append(sueldo).append("\n");
            }

            if (resultado.length() == 0) {
                resultado.append("No se encontraron registros con el código especificado.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            resultado.append("Error al listar los datos.");
            System.out.println(resultado.toString());
            e.printStackTrace();
        }
        return resultado.toString();
    }

}
