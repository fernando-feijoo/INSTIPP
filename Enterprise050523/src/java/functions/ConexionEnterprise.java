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
    public String[] guardar(@WebParam(name = "codigo") String codigo, @WebParam(name = "cedula") String cedula, @WebParam(name = "apellido") String apellido, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "sueldo") String sueldo) {
        String[] respuesta = new String[2];
        if (codigo.isEmpty()) {
            respuesta[0] = "Complete la informacion, Codigo";
            respuesta[1] = "false";
            return respuesta;
        } else if (cedula.isEmpty()) {
            respuesta[0] = "Complete la informacion, Cedula";
            respuesta[1] = "false";
            return respuesta;
        } else if (apellido.isEmpty()) {
            respuesta[0] = "Complete la informacion, Apellido";
            respuesta[1] = "false";
            return respuesta;
        } else if (nombre.isEmpty()) {
            respuesta[0] = "Complete la informacion, Nombre";
            respuesta[1] = "false";
            return respuesta;
        } else if (direccion.isEmpty()) {
            respuesta[0] = "Complete la informacion, Direccion";
            respuesta[1] = "false";
            return respuesta;
        } else if (sueldo.isEmpty()) {
            respuesta[0] = "Complete la informacion, Sueldo";
            respuesta[1] = "false";
            return respuesta;
        } else {
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
                statement.setString(6, sueldo);

                int filasActualizadas = statement.executeUpdate();
                if (filasActualizadas > 0) {
                    respuesta[0] = "Datos guardados exitosamente.";
                    respuesta[1] = "true";
                } else {
                    respuesta[0] = "Error al guardar los datos.";
                    respuesta[1] = "false";
                }
            } catch (ClassNotFoundException | SQLException e) {
                respuesta[0] = "Error al guardar los datos.";
                respuesta[1] = "false";
                e.printStackTrace();
            }
            return respuesta;
        }
    }

    @WebMethod(operationName = "actualizar")
    public String[] actualizar(@WebParam(name = "codigo") String codigo, @WebParam(name = "cedula") String cedula, @WebParam(name = "apellido") String apellido, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "sueldo") String sueldo) {
        String[] respuesta = new String[2];
        if (codigo.isEmpty()) {
            respuesta[0] = "Complete la informacion, Codigo";
            respuesta[1] = "false";
            return respuesta;
        } else if (cedula.isEmpty()) {
            respuesta[0] = "Complete la informacion, Cedula";
            respuesta[1] = "false";
            return respuesta;
        } else if (apellido.isEmpty()) {
            respuesta[0] = "Complete la informacion, Apellido";
            respuesta[1] = "false";
            return respuesta;
        } else if (nombre.isEmpty()) {
            respuesta[0] = "Complete la informacion, Nombre";
            respuesta[1] = "false";
            return respuesta;
        } else if (direccion.isEmpty()) {
            respuesta[0] = "Complete la informacion, Direccion";
            respuesta[1] = "false";
            return respuesta;
        } else if (sueldo.isEmpty()) {
            respuesta[0] = "Complete la informacion, Sueldo";
            respuesta[1] = "false";
            return respuesta;
        } else {
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
                statement.setString(5, sueldo);
                statement.setString(6, codigo);

                int filasActualizadas = statement.executeUpdate();
                if (filasActualizadas > 0) {
                    respuesta[0] = "Datos actualizados exitosamente.";
                    respuesta[1] = "true";
                } else {
                    respuesta[0] = "Error al actualizador los datos.";
                    respuesta[1] = "false";
                }
            } catch (ClassNotFoundException | SQLException e) {
                respuesta[0] = "Error al actualizador los datos.";
                respuesta[1] = "false";
                e.printStackTrace();
            }
            return respuesta;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public String[] eliminar(@WebParam(name = "codigo") String codigo) {
        String[] respuesta = new String[2];
        if (codigo.isEmpty()) {
            respuesta[0] = "Complete la informacion, Codigo";
            respuesta[1] = "false";
            return respuesta;
        } else {
            try {
                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection(url, user, password);
                System.out.println("Conexión exitosa");

                String sql = "DELETE FROM enterprise_tb WHERE codigo = ?;";
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1, codigo);

                int filasActualizadas = statement.executeUpdate();
                if (filasActualizadas > 0) {
                    respuesta[0] = "Datos eliminados exitosamente.";
                    respuesta[1] = "true";
                } else {
                    respuesta[0] = "Error al eliminar los datos.";
                    respuesta[1] = "false";
                }
            } catch (ClassNotFoundException | SQLException e) {
                respuesta[0] = "Error al eliminar los datos.";
                respuesta[1] = "false";
                e.printStackTrace();
            }
            return respuesta;
        }
    }

    @WebMethod(operationName = "listarPorCodigo")
    public String listarPorCodigo(@WebParam(name = "codigo") String codigo) {
        StringBuilder resultado = new StringBuilder();
        if (codigo.isEmpty()) {
            resultado.append("Complete la informacion, Codigo");
            return resultado.toString();
        } else {
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
                    String sueldo = resultSet.getString("sueldo");

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
}
