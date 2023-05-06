package functions;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebService(serviceName = "NewWebService")
public class NewWebService {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        String url = "jdbc:postgresql://localhost:5432/cliente_db";
        String user = "postgres";
        String password = "postgres";
        Connection conexion = null;

        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("## Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("XX Error al establecer la conexión con la base de datos");
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
