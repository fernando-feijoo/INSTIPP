/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ANONYMOUS
 */
@WebService(serviceName = "PruebaUnoWS")
public class PruebaUnoWS {

    String url = "jdbc:postgresql://localhost:5432/pruebauno290523";
    String user = "postgres";
    String password = "postgres";
    Connection conexion = null;
    String resultado = "";

    /**
     * Para validar si es un numero lo que se ingreso en el campo, se envia como
     * String y devuelve un boolean.
     *
     * @param input
     * @return boolean
     */
    public static boolean isNumber(String input) {
        if (input.matches("[0-9]+(\\.[0-9]+)?")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "guardar")
    public String[] guardar(@WebParam(name = "codigo") String codigo, @WebParam(name = "lote") String lote, @WebParam(name = "detalle") String detalle, @WebParam(name = "fecha_caducidad") String fecha_caducidad, @WebParam(name = "costo") String costo, @WebParam(name = "pvp") String pvp, @WebParam(name = "stock") String stock, @WebParam(name = "sucursal") String sucursal) {
        //TODO write your implementation code here:

        String[] respuesta = new String[2];
        if (codigo.isEmpty()) {
            respuesta[0] = "Complete la informacion, Codigo";
            respuesta[1] = "false";
            return respuesta;
        } else if (lote.isEmpty()) {
            respuesta[0] = "Complete la informacion, Lote";
            respuesta[1] = "false";
            return respuesta;
        } else if (detalle.isEmpty()) {
            respuesta[0] = "Complete la informacion, Detalle";
            respuesta[1] = "false";
            return respuesta;
        } else if (fecha_caducidad.isEmpty()) {
            respuesta[0] = "Complete la informacion, Fecha de Caducidad";
            respuesta[1] = "false";
            return respuesta;
        } else if (!isNumber(costo)) {
            respuesta[0] = "Complete la informacion, Costo";
            respuesta[1] = "false";
            return respuesta;
        } else if (!isNumber(pvp)) {
            respuesta[0] = "Complete la informacion, P.V.P";
            respuesta[1] = "false";
            return respuesta;
        } else if (!isNumber(stock)) {
            respuesta[0] = "Complete la informacion, Stock";
            respuesta[1] = "false";
            return respuesta;
        } else if (sucursal.isEmpty()) {
            respuesta[0] = "Complete la informacion, Sucursal";
            respuesta[1] = "false";
            return respuesta;
        } else {
            try {
                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection(url, user, password);
                System.out.println("Conexión exitosa");

                String sql = "INSERT INTO prueba_tb(codigo, lote, detalle, fecha_caducidad, costo, pvp, stock, sucursal) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1, codigo);
                statement.setString(2, lote);
                statement.setString(3, detalle);
                statement.setString(4, fecha_caducidad);
                statement.setString(5, costo);
                statement.setString(6, pvp);
                statement.setString(7, stock);
                statement.setString(8, sucursal);

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
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizar")
    public String[] actualizar(@WebParam(name = "codigo") String codigo, @WebParam(name = "lote") String lote, @WebParam(name = "detalle") String detalle, @WebParam(name = "fecha_caducidad") String fecha_caducidad, @WebParam(name = "costo") String costo, @WebParam(name = "pvp") String pvp, @WebParam(name = "stock") String stock, @WebParam(name = "sucursal") String sucursal) {
        //TODO write your implementation code here:

        String[] respuesta = new String[2];
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "UPDATE prueba_tb SET lote=?, detalle=?, fecha_caducidad=?, costo=?, pvp=?, stock=?, sucursal=? WHERE codigo=?;";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, lote);
            statement.setString(2, detalle);
            statement.setString(3, fecha_caducidad);
            statement.setString(4, costo);
            statement.setString(5, pvp);
            statement.setString(6, stock);
            statement.setString(7, sucursal);
            statement.setString(8, codigo);

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                respuesta[0] = "Datos actualizados exitosamente.";
                respuesta[1] = "true";
            } else {
                respuesta[0] = "Error al actulizar los datos.";
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
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public String[] eliminar(@WebParam(name = "codigo") String codigo) {
        //TODO write your implementation code here:

        String[] respuesta = new String[2];
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "DELETE FROM prueba_tb WHERE codigo=?;";
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
            respuesta[0] = "Error al eliminar los datos. " + e;
            respuesta[1] = "false";
            e.printStackTrace();
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listar")
    public String[] listar(@WebParam(name = "codigo") String codigo) {
        //TODO write your implementation code here:

        String[] respuesta = new String[10];
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            String sql = "SELECT * FROM prueba_tb WHERE codigo=?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, codigo);
            ResultSet resultSet = statement.executeQuery();

            boolean registrosEncontrados = false; // Bandera para indicar si se encontraron registros

            while (resultSet.next()) {
                respuesta[0] = resultSet.getString("codigo");
                respuesta[1] = resultSet.getString("lote");
                respuesta[2] = resultSet.getString("detalle");
                respuesta[3] = resultSet.getString("fecha_caducidad");
                respuesta[4] = resultSet.getString("costo");
                respuesta[5] = resultSet.getString("pvp");
                respuesta[6] = resultSet.getString("stock");
                respuesta[7] = resultSet.getString("sucursal");

                registrosEncontrados = true; // Se encontraron registros

                respuesta[8] = "true";
                respuesta[9] = "Datos encontrados.";
            }

            if (!registrosEncontrados) {
                respuesta[9] = "No se encontraron registros con el código especificado.";
            }
        } catch (ClassNotFoundException | SQLException e) {
            respuesta[9] = "Error al listar los datos.";
            e.printStackTrace();
        }
        return respuesta;
    }

}
