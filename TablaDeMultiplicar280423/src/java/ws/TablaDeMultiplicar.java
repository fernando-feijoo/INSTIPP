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
@WebService(serviceName = "TablaDeMultiplicar")
public class TablaDeMultiplicar {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Tabla")
    public String tabla (@WebParam(name = "num") String num) {
        int numero = Integer.parseInt(num);
        String cadena = "";
        for (int i = 1; i <= 12; i++) {
            cadena += i + " x " + numero + " = " + (i*numero) + "\n ";
        }
        System.out.println(cadena);
        return cadena;
    }
}
