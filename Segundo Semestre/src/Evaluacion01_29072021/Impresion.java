package Evaluacion01_29072021;
public class Impresion extends Datos
{
    public void Ip (String nombre, String apellido, String[] codigo, Integer[] enteros, Double[][] numeros, String[] prueba, double r)
    {
        System.out.println("\n\n========================================================================="
                         + "\n                       || MINIMARKET LA LINEA ||"
                         + "\n                       -------------------------"
                         + "\n       Nombre: " + nombre
                         + "\n       Apellido: " + apellido + "                  Fecha: " + fechaActual()
                         + "\n-------------------------------------------------------------------------");
        System.out.println("        Codigo     " + "      Cantidad  " + "     Precio Unitario " + "   Sub Total    ");
        for (int i = 0; i < enteros.length; i++)
        {
            System.out.print((i+1) + ".-  ");
                String cadenaEspacios = "";
                int es = 13 - codigo[i].length();
                for (int p = 1; p < es; p++)
                {
                    cadenaEspacios += " ";
                }
                System.out.print("|  " + codigo[i] + cadenaEspacios+ " |   ") ;
                
                cadenaEspacios = "";
                String f = Integer.toString(enteros[i]);
                es = 13 - f.length();
                for (int p = 1; p < es; p++)
                {
                    cadenaEspacios += " ";
                }
                System.out.print(enteros[i] + cadenaEspacios+ " |   ") ;
                
                cadenaEspacios = "";
                f = Double.toString(numeros[i][0]);
                es = 13 - f.length();
                for (int p = 1; p < es; p++)
                {
                    cadenaEspacios += " ";
                }
                System.out.print(numeros[i][0] + cadenaEspacios+ " |   ") ;
                
                cadenaEspacios = "";
                es = 13 - prueba[i].length();
                for (int p = 1; p < es; p++)
                {
                    cadenaEspacios += " ";
                }
                System.out.print(prueba[i] + cadenaEspacios+ " |   \n") ;
        }
        System.out.println("-------------------------------------------------------------------------"
                        +  "\n                                             |        SubTotal: " + formato.format(r)
                        +  "\n                                             |        IVA 12%:  " + formato.format(r*0.12)
                        +  "\n                                             |              _____________"
                        +  "\n                                             |        Total:  $ " + formato.format(r*1.12)
                        +  "\n=========================================================================");
        System.out.println("\n                         ¡GRACIAS POR SU COMPRA! \n\n");
    }
}
