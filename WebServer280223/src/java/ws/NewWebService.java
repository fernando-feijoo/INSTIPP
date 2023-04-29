/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ANONYMOUS
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "suma")
    public String suma(@WebParam(name = "n1") String n1, @WebParam(name = "n2") String n2) {
        int total = Integer.parseInt(n1)+Integer.parseInt(n2);
        return "Hello " + total + " !";
    }
    public String resta(@WebParam(name = "n1") String n1, @WebParam(name = "n2") String n2) {
        int total = Integer.parseInt(n1)-Integer.parseInt(n2);
        return "Hello " + total + " !";
    }
    public String multiplicacion (@WebParam(name = "n1") String n1, @WebParam(name = "n2") String n2) {
        int total = Integer.parseInt(n1)*Integer.parseInt(n2);
        return "Hello " + total + " !";
    }
    public String division (@WebParam(name = "n1") String n1, @WebParam(name = "n2") String n2) {
        double total = Double.parseDouble(n1)/Double.parseDouble(n2);
        return "Hello " + total + " !";
    }
}
