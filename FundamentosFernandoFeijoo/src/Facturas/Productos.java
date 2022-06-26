package Facturas;
import java.util.Scanner;
public class Productos {
    
    public static String[][] nuevoProducto(String[][] producto ) {
        Scanner teclado = new Scanner(System.in);
                
        String nombreProducto,marcaProducto;
        double valorProducto;
        int stockProducto;
        
        System.out.print("Ingrese nombre del producto: ");
        nombreProducto = teclado.nextLine();
        System.out.print("Ingrese la marca del producto: ");
        marcaProducto = teclado.nextLine();
        System.out.print("Ingrese el valor unitario del producto: ");
        valorProducto = teclado.nextDouble();
        System.out.print("Ingrese el stock mínimo del producto: ");
        stockProducto = teclado.nextInt();
        
        //---------busca el la fila vacia---------------
        int posicion = 0;
        for(int fil = 0; fil < producto.length; fil++){
            
            if (producto[fil][0] == null ) {
                posicion = fil;
                break;
            }
        }
        //----------------------------------------
        
        producto[posicion][0] = nombreProducto;
        producto[posicion][1] = marcaProducto ;
        producto[posicion][2] = String.valueOf(valorProducto);
        producto[posicion][3] = String.valueOf(stockProducto);
        
         System.out.print("\n Datos guardados correctamente... \n ");
         
         return producto;
    
    }

   
    
      public static String[][] cargarDatosProductos(){
         
       String producto[][] = new String[30][4];
        
        producto[0][0] = "Atun";
        producto[0][1] = "Real";
        producto[0][2] = "1.50";
        producto[0][3] = "20";
        
         producto[1][0] = "Salsa de Tomate";
         producto[1][1] = "Los andes";
         producto[1][2] = "2.50";
         producto[1][3] = "20";
         
         producto[2][0] = "Chocolate";
         producto[2][1] = "Nestle";
         producto[2][2] = "3.50";
         producto[2][3] = "20";
         
         producto[3][0] = "Mantequilla";
         producto[3][1] = "Bonella";
         producto[3][2] = "3.75";
         producto[3][3] = "20";
         
         producto[4][0] = "Aceite";
         producto[4][1] = "Girasol";
         producto[4][2] = "2.25";
         producto[4][3] = "20";
        
        
         
         return producto;
     }
     
    
    
    
   
     
     public static void listarProducto(String[][] producto ){
         
          
        for(int fil = 0; fil < producto.length; fil++){
            
            if (producto[fil][0] != null ) {
                System.out.print(fil + "    ");            
                for (int col = 0; col < producto[0].length; col++ ){
                    //-------------alinear los datos                   
                    String cadenaEspacios = "";
                     int es = 20 -producto[fil][col].length();
                     for (int x=1; x < es; x++){
                         cadenaEspacios = cadenaEspacios + " ";
                     }
                    // ---------------------------------------
                    System.out.print(producto[fil][col] + cadenaEspacios);
                }
                System.out.println("");
            }
        }    
     }
     
     
     
     
     
      
     public static void buscarProducto( String[][] producto ){
         
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el nombre o la marcar del producto a buscar");
        String nombreBuscar = teclado.next();
        
        
        for(int fil = 0; fil < producto.length; fil++)
        {
            
            if (producto[fil][0] != null ) 
            {
                
                if ( producto[fil][0].equalsIgnoreCase(nombreBuscar )  ||  producto[fil][1].equalsIgnoreCase(nombreBuscar )     ){  //----- pregunta para buscar
                
                System.out.print(fil + "    ");            
                for (int col = 0; col < producto[0].length; col++ )
                {
                    //-------------alinear los datos                   
                    String cadenaEspacios = "";
                     int es = 20 -producto[fil][col].length();
                     for (int x=1; x < es; x++){
                         cadenaEspacios = cadenaEspacios + " ";
                     }
                    // ---------------------------------------
                    System.out.print(producto[fil][col] + cadenaEspacios);
                }
                System.out.println("");
            }  //--------------------------------------------------filtra informacion
            }
        }
         
     }
     
     
     
       
     public static String[][] eliminarRegistro(String [][] producto){
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el codigo del registro a eliminar");
        int codigoBorrar = teclado.nextInt();       
        
        
        producto[codigoBorrar][0] = "------------";
        producto[codigoBorrar][1] = "------------";
        producto[codigoBorrar][2] = "------------";
        producto[codigoBorrar][3] = "-------------";
        
        
         
         return producto;
     }
     
     
     
     
     
}