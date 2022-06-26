package Facturas;
import java.util.Scanner;
public class Vectores 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int[] cantidad = new int[5];
        String[] ciudades = new String[5];
        cantidad[0] = 10;
        cantidad[1] = 60;
        
        /*System.out.println("Ingrese una ciudad");
        ciudades[0] = tc.next();
        
        System.out.println("Ingrese una ciudad");
        ciudades[1] = tc.next();
        
        System.out.println("Ingrese una ciudad");
        ciudades[2] = tc.next();
        
        for(int f = 0; f <= 10; f++)
        {
            if(ciudades[f] != null)
            {
                System.out.println(ciudades[f]);
            }else
            {
                f = 10;
            }
        }*/
        
        //-------------------------------------------------------
        
        String cliente[][] = new String[10][4];
        
        cliente[0][0] = "0756369884";
        cliente[0][1] = "Juan";
        cliente[0][2] = "Arevalo";
        cliente[0][3] = "Los naranjos";
        
        cliente[1][0] = "079856384";
        cliente[1][1] = "Maria";
        cliente[1][2] = "Gonzales";
        cliente[1][3] = "Las nieves";
        
        cliente[2][0] = "0769585224";
        cliente[2][1] = "Dario";
        cliente[2][2] = "Gonzales";
        cliente[2][3] = "13 de mayo";
        
        cliente[3][0] = "076985624";
        cliente[3][1] = "Pablo";
        cliente[3][2] = "Gia";
        cliente[3][3] = "13 de mayo";

        // -----------INGRESAR --------------------------
        
        System.out.print("Ingrese el N° de cedula: ");
        cliente[4][0] = tc.nextLine();
        
        System.out.print("Ingrese el nombre del cliente: ");
        cliente[4][1]= tc.nextLine();
        
        
        System.out.print("Ingrese el apellido del cliente: ");
        cliente[4][2] = tc.nextLine();
        
        System.out.print("Ingrese la dirección del cliente: ");
        cliente[4][3] = tc.nextLine();

        //--------------------LISTAR REGISTROS------------------
        
        
        for(int fil = 0; fil < cliente.length; fil++)
        {
            
            if (cliente[fil][0] != null ) 
            {
                System.out.print(fil + "    ");            
                for (int col = 0; col < cliente[0].length; col++ )
                {
                    //-------------alinear los datos                   
                    String cadenaEspacios = "";
                     int es = 20 -cliente[fil][col].length();
                     for (int x=1; x < es; x++)
                     {
                         cadenaEspacios = cadenaEspacios + " ";
                     }
                    // ---------------------------------------
                    System.out.print(cliente[fil][col] + cadenaEspacios);
                }
                System.out.println("");
            }
        }

        
    }
}
