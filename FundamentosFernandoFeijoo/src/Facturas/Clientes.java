package Facturas;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Clientes {
    
    
     public static String[][] nuevoCliente( String[][] cliente ) {
        Scanner teclado = new Scanner(System.in);
        boolean res = true;
                
        String cedulaCliente, nombreCliente, apellidoCliente, direccionCliente;
        
        do{
            System.out.print("Ingrese el N° de cedula: ");
            cedulaCliente = teclado.nextLine();
            res =  Validaciones.valida(cedulaCliente);
            if (res == false) {
                JOptionPane.showMessageDialog(null, "Cedula incorrecta, por favor ingrese nuevamente");
            }
        }while( res == false);
        
        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = teclado.nextLine();
        
        
        System.out.print("Ingrese el apellido del cliente: ");
        apellidoCliente = teclado.nextLine();
        
        System.out.print("Ingrese la dirección del cliente: ");
        direccionCliente = teclado.nextLine();
        
        //---------busca el la fila vacia---------------
        int posicion = 0;
        for(int fil = 0; fil < cliente.length; fil++){
            
            if (cliente[fil][0] == null ) {
                posicion = fil;
                break;
            }
        }
        //----------------------------------------
        
        cliente[posicion][0] = cedulaCliente;
        cliente[posicion][1] = nombreCliente;
        cliente[posicion][2] = apellidoCliente;
        cliente[posicion][3] = direccionCliente;
        
        
        System.out.print("\n Datos guardados correctamente... \n ");
        
        return cliente;
     }
     
     
     
     public static String[][] cargarDatosCliente(){
         
       String cliente[][] = new String[20][4];
        
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
         
         return cliente;
     }
     
     
     
     
     public static void listarCilentes(String[][] cliente ){
         
          
        for(int fil = 0; fil < cliente.length; fil++){
            
            if (cliente[fil][0] != null ) {
                System.out.print(fil + "    ");            
                for (int col = 0; col < cliente[0].length; col++ ){
                    //-------------alinear los datos                   
                    String cadenaEspacios = "";
                     int es = 20 -cliente[fil][col].length();
                     for (int x=1; x < es; x++){
                         cadenaEspacios = cadenaEspacios + " ";
                     }
                    // ---------------------------------------
                    System.out.print(cliente[fil][col] + cadenaEspacios);
                }
                System.out.println("");
            }
        }
     
         
     }
     
     
     public static void buscarCliente( String[][] cliente ){
         
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el nombre o el apellido del cliente a buscar");
        String nombreBuscar = teclado.next();
        
        
        for(int fil = 0; fil < cliente.length; fil++){
            
            if (cliente[fil][0] != null ) {
                
                if ( cliente[fil][1].equalsIgnoreCase(nombreBuscar )  ||  cliente[fil][2].equalsIgnoreCase(nombreBuscar )     ){  //----- pregunta para buscar
                
                System.out.print(fil + "    ");            
                for (int col = 0; col < cliente[0].length; col++ ){
                    //-------------alinear los datos                   
                    String cadenaEspacios = "";
                     int es = 20 -cliente[fil][col].length();
                     for (int x=1; x < es; x++){
                         cadenaEspacios = cadenaEspacios + " ";
                     }
                    // ---------------------------------------
                    System.out.print(cliente[fil][col] + cadenaEspacios);
                }
                System.out.println("");
            }  //--------------------------------------------------filtra informacion
            }
        }
         
     }
     
     
     
     
     public static String[][] eliminarRegistro(String [][] cliente){
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el codigo del registro a eliminar");
        int codigoBorrar = teclado.nextInt();       
        
        
        cliente[codigoBorrar][0] = "------------";
        cliente[codigoBorrar][1] = "------------";
        cliente[codigoBorrar][2] = "------------";
        cliente[codigoBorrar][3] = "-------------";
        
        
         
         return cliente;
     }
      
}