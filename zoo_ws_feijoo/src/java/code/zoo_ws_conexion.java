/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ANONYMOUS
 */
@WebService(serviceName = "zoo_ws_conexion")
public class zoo_ws_conexion {

    String url = "jdbc:postgresql://34.28.148.43:5432/db_zoo_feijoo";
    String user = "postgres";
    String password = "postgres";
    Connection conexion = null;
    String resultado = "";

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "guardar")
    public String[] guardar(@WebParam(name = "id") String id, @WebParam(name = "area") String area, @WebParam(name = "animal_nombre") String animal_nombre, @WebParam(name = "especie") String especie, @WebParam(name = "habitad") String habitad, @WebParam(name = "cuidador") String cuidador, @WebParam(name = "fecha_ingreso") String fecha_ingreso) {
        String[] respuesta = new String[2];
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "INSERT INTO zoo_db(id, area, animal_nombre, especie, habitad, cuidador, fecha_ingreso) VALUES (?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, id);
            statement.setString(2, area);
            statement.setString(3, animal_nombre);
            statement.setString(4, especie);
            statement.setString(5, habitad);
            statement.setString(6, cuidador);
            statement.setString(7, fecha_ingreso);

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                respuesta[0] = "Datos guardados exitosamente.";
                respuesta[1] = "true";
            } else {
                respuesta[0] = "Error al guardar los datos.";
                respuesta[1] = "false";
            }
        } catch (ClassNotFoundException | SQLException e) {
            respuesta[0] = "Error al guardar los datos. " + e;
            respuesta[1] = "false";
            e.printStackTrace();
        }
        return respuesta;
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "actualizar")
    public String[] actualizar(@WebParam(name = "id") String id, @WebParam(name = "area") String area, @WebParam(name = "animal_nombre") String animal_nombre, @WebParam(name = "especie") String especie, @WebParam(name = "habitad") String habitad, @WebParam(name = "cuidador") String cuidador, @WebParam(name = "fecha_ingreso") String fecha_ingreso) {
        String[] respuesta = new String[2];
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "UPDATE zoo_db SET area=?, animal_nombre=?, especie=?, habitad=?, cuidador=?, fecha_ingreso=? WHERE id=?;";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, area);
            statement.setString(2, animal_nombre);
            statement.setString(3, especie);
            statement.setString(4, habitad);
            statement.setString(5, cuidador);
            statement.setString(6, fecha_ingreso);
            statement.setString(7, id);

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                respuesta[0] = "Datos actualizados exitosamente.";
                respuesta[1] = "true";
            } else {
                respuesta[0] = "Error al actualizar los datos.";
                respuesta[1] = "false";
            }
        } catch (ClassNotFoundException | SQLException e) {
            respuesta[0] = "Error al actualizar los datos. " + e;
            respuesta[1] = "false";
            e.printStackTrace();
        }
        return respuesta;
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "eliminar")
    public String[] eliminar(@WebParam(name = "id") String id) {
        String[] respuesta = new String[2];
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "DELETE FROM zoo_db WHERE id=?;";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, id);

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                respuesta[0] = "Datos eliminados exitosamente.";
                respuesta[1] = "true";
            } else {
                respuesta[0] = "Error al eliminar los datos.";
                respuesta[1] = "false";
            }
        } catch (ClassNotFoundException | SQLException e) {
            respuesta[0] = "Error al eliminar los datos. " + e;
            respuesta[1] = "false";
            e.printStackTrace();
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consulta")
    public String[] consulta(@WebParam(name = "id") String id) {
        String[] respuesta = new String[8];

        if (id.isEmpty()) {
            respuesta[5] = "Complete la informacion, Id";
            return respuesta;
        } else {
            try {
                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection(url, user, password);
                System.out.println("Conexión exitosa");

                String sql = "SELECT * FROM zoo_db WHERE id = ?";
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1, id);
                ResultSet resultSet = statement.executeQuery();

                boolean registrosEncontrados = false; // Bandera para indicar si se encontraron registros

                while (resultSet.next()) {
                    respuesta[0] = resultSet.getString("area");
                    respuesta[1] = resultSet.getString("animal_nombre");
                    respuesta[2] = resultSet.getString("especie");
                    respuesta[3] = resultSet.getString("habitad");
                    respuesta[4] = resultSet.getString("cuidador");
                    respuesta[5] = resultSet.getString("fecha_ingreso");

                    registrosEncontrados = true; // Se encontraron registros

                    respuesta[6] = "true";
                    respuesta[7] = "Datos encontrados.";
                }

                if (!registrosEncontrados) {
                    respuesta[7] = "No se encontraron registros con el código especificado.";
                }
            } catch (ClassNotFoundException | SQLException e) {
                respuesta[7] = "Error al listar los datos.";
                e.printStackTrace();
            }
            return respuesta;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listar")
    public List<String[]> listar() {
        List<String[]> respuestas = new ArrayList<>();

        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "SELECT * FROM zoo_db;";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            boolean registrosEncontrados = false; // Bandera para indicar si se encontraron registros

            while (resultSet.next()) {
                String[] respuesta = new String[9];
                respuesta[0] = resultSet.getString("id");
                respuesta[1] = resultSet.getString("area");
                respuesta[2] = resultSet.getString("animal_nombre");
                respuesta[3] = resultSet.getString("especie");
                respuesta[4] = resultSet.getString("habitad");
                respuesta[5] = resultSet.getString("cuidador");
                respuesta[6] = resultSet.getString("fecha_ingreso");

                registrosEncontrados = true; // Se encontraron registros

                respuesta[7] = "true";
                respuesta[8] = "Datos encontrados.";

                respuestas.add(respuesta);
            }

            if (!registrosEncontrados) {
                String[] error = new String[1];
                error[0] = "No se encontraron registros con el código especificado.";
                respuestas.add(error);
            }
        } catch (ClassNotFoundException | SQLException e) {
            String[] error = new String[1];
            error[0] = "Error al listar los datos.";
            respuestas.add(error);
            e.printStackTrace();
        }
        return respuestas;
    }
}
