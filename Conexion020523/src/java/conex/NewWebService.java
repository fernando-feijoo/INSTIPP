/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conex;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ANONYMOUS
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * Web service operation
     */
    String baseDatos = "jdbc:postgresql://localhost:5432/cliente_db";
    String user = "postgres";
    String password = "postgres";

    @WebMethod(operationName = "ingreso")
    public String datos(@WebParam(name = "cedula") String cedula, @WebParam(name = "apellido") String apellido, @WebParam(name = "nombre") String nombre, @WebParam(name = "fecha_nacimiento") String fecha_nacimiento) {
        try {
            //TODO write your implementation code here:

            Class.forName("org.postgresql.Driver");

            try {
                Connection conexion = DriverManager.getConnection(baseDatos, user, password);
                Statement st = conexion.createStatement();

                int res = st.executeUpdate("INSERT INTO cliente_tb (cedula, apellido, nombre, fecha_nacimiento) VALUES ('" + cedula + "','" + apellido + "','" + nombre + "','" + fecha_nacimiento + "');");
            } catch (SQLException ex) {
                Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
            }

            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actulizado")
    public String actulizado(@WebParam(name = "cedula") String cedula, @WebParam(name = "apellido") String apellido, @WebParam(name = "nombre") String nombre, @WebParam(name = "fecha_nacimiento") String fecha_nacimiento) {
        //TODO write your implementation code here:
        try {
            //TODO write your implementation code here:

            Class.forName("org.postgresql.Driver");

            try {
                Connection conexion = DriverManager.getConnection(baseDatos, user, password);
                Statement st = conexion.createStatement();

                int res = st.executeUpdate("UPDATE cliente_tb SET (apellido='" + apellido + "', nombre='" + nombre + "', fecha_nacimiento=" + fecha_nacimiento + ") WHERE cedula = " + cedula + ";");
            } catch (SQLException ex) {
                Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
            }

            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminado")
    public String eliminado(@WebParam(name = "cedula") String cedula) {
        //TODO write your implementation code here:
        try {
            //TODO write your implementation code here:

            Class.forName("org.postgresql.Driver");

            try {
                Connection conexion = DriverManager.getConnection(baseDatos, user, password);
                Statement st = conexion.createStatement();

                int res = st.executeUpdate("DELETE FROM cliente_tb WHERE cedula='" + cedula + "';");
            } catch (SQLException ex) {
                Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
            }

            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
