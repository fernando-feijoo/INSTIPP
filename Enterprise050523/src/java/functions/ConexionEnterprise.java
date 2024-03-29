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
import java.sql.SQLXML;
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

    /**
     * Valida el numero de cedula de una persona Ecuatoriana, solo se ingresa el
     * numero como String.
     *
     * @param cedula
     * @return boolean
     */
    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10) {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    char primerDigito = cedula.charAt(0);
                    boolean unique = false;

                    for (int i = 1; i < cedula.length(); i++) {
                        if (cedula.charAt(i) != primerDigito) {
                            unique = true;
                            break;
                        }
                        unique = false;
                        break;
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                        if (!unique) {
                            cedulaCorrecta = false;
                            return false;
                        } else {
                            cedulaCorrecta = true;
                            return true;
                        }
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }

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
        } else if (!validadorDeCedula(cedula) && !cedula.isEmpty()) {
            respuesta[0] = "Error en numero de cedula, es invalido.";
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
        } else if (!isNumber(sueldo)) {
            respuesta[0] = "Error en el sueldo ingresado, debe ser entero o decimal con \"punto\" decimal.";
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
                respuesta[0] = "Error al guardar los datos. " + e;
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
        } else if (!validadorDeCedula(cedula) && !cedula.isEmpty()) {
            respuesta[0] = "Error en numero de cedula, es invalido.";
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
                respuesta[0] = "Error al actualizador los datos. " + e;
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
                respuesta[0] = "Error al eliminar los datos. " + e;
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

                    resultado.append("Cédula: ").append(cedula).append(" \n");
                    resultado.append("Apellido: ").append(apellido).append(" \n");
                    resultado.append("Nombre: ").append(nombre).append(" \n");
                    resultado.append("Dirección: ").append(direccion).append(" \n");
                    resultado.append("Sueldo: ").append(sueldo).append(" \n");
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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consulta")
    public String[] consulta(@WebParam(name = "codigo") String codigo) {
        String[] respuesta = new String[8];

        if (codigo.isEmpty()) {
            respuesta[5] = "Complete la informacion, Codigo";
            return respuesta;
        } else {
            try {
                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection(url, user, password);
                System.out.println("Conexión exitosa");

                String sql = "SELECT * FROM enterprise_tb WHERE codigo = ?";
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1, codigo);
                ResultSet resultSet = statement.executeQuery();

                boolean registrosEncontrados = false; // Bandera para indicar si se encontraron registros

                while (resultSet.next()) {
                    respuesta[0] = resultSet.getString("cedula");
                    respuesta[1] = resultSet.getString("apellido");
                    respuesta[2] = resultSet.getString("nombre");
                    respuesta[3] = resultSet.getString("direccion");
                    respuesta[4] = resultSet.getString("sueldo");
                    respuesta[5] = resultSet.getString("codigo");

                    registrosEncontrados = true; // Se encontraron registros

                    respuesta[6] = "true";
                    respuesta[7] = "Datos encontrados.";
                }

                if (!registrosEncontrados) {
                    respuesta[6] = "No se encontraron registros con el código especificado.";
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
    @WebMethod(operationName = "xmlGuardar")
    public String[] xmlGuardar(@WebParam(name = "codigo") String codigo, @WebParam(name = "xml") String xml) {
        //TODO write your implementation code here:
        String[] respuesta = new String[2];

        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            // String sql = "INSERT INTO xml_db (codigo, xml_data) VALUES (?, xmlparse(content ?));";
            String sql = "INSERT INTO xml_db (codigo, xml_data) VALUES (?,?);";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, codigo);
            statement.setString(2, xml);

            /*
            PGobject xmlObject = new PGobject();
            xmlObject.setType("xml");
            xmlObject.setValue(xml);
            statement.setObject(2, xmlObject);
             */
            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                respuesta[0] = "Datos XML guardados exitosamente.";
                respuesta[1] = "true";
            } else {
                respuesta[0] = "Error al guardar los datos XML.";
                respuesta[1] = "false";
            }
        } catch (ClassNotFoundException | SQLException e) {
            respuesta[0] = "Error al guardar los datos XML. " + e;
            respuesta[1] = "false";
            e.printStackTrace();
        }
        return respuesta;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "xmlBusqueda")
    public String[] xmlBusqueda(@WebParam(name = "codigo") String codigo) {
        // TODO write your implementation code here:
        String[] respuesta = new String[3];

        if (codigo.isEmpty()) {
            respuesta[1] = "Complete la información, Código";
            return respuesta;
        } else {
            try {
                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection(url, user, password);
                System.out.println("Conexión exitosa");

                String sql = "SELECT xml_data FROM xml_db WHERE codigo = ?";
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1, codigo);
                ResultSet resultSet = statement.executeQuery();

                boolean registroEncontrado = resultSet.next();

                if (registroEncontrado) {
                    SQLXML xmlObject = resultSet.getSQLXML("xml_data");
                    String xml = xmlObject.getString();

                    respuesta[0] = xml;  // Aquí se guarda el valor del XML

                    respuesta[2] = "true";
                    respuesta[1] = "Datos encontrados.";
                } else {
                    respuesta[2] = "false";
                    respuesta[1] = "No se encontró ningún registro con el código especificado.";
                }
            } catch (ClassNotFoundException | SQLException e) {
                respuesta[1] = "Error al listar los datos.";
                e.printStackTrace();
            }
            return respuesta;
        }
    }

}
