package Facturas;

import java.util.Scanner;

public class MenuPrincipal {
     public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        Clientes cliente = new Clientes();
        Productos produc = new Productos();
        
        byte Op_principal, Op_cliente = 0, Op_producto = 0 ;
        
        
        //------------------------------------
        String bdCliente[][] = new String[20][4];
        bdCliente =  Clientes.cargarDatosCliente();
        
        String bdProducto[][] = new String[30][4];
        bdProducto =  Productos.cargarDatosProductos();
        
        
        //------------------------------------------
        
        do {
            System.out.println("=========MENU PRINCIPAL===============");
            System.out.println("[1] CLIENTES");
            System.out.println("[2] PRODUCTOS");
            System.out.println("[3] FACTURA");
            System.out.println("[4] SALIR");
            System.out.print("Elija una opción: [] ");        
            Op_principal = teclado.nextByte();

            switch( Op_principal ) {

                case 1: // -------------cliente----------------------
                    do {
                        System.out.println("\n ============Menu Cliente===================");
                        System.out.println("[1] Nuevo cliente");
                        System.out.println("[2] Buscar cliente");
                        System.out.println("[3] Eliminar Cliente");
                        System.out.println("[4] Listar Cliente");  //-------------------
                        System.out.println("[5] Salir");
                        System.out.print("Elija una opción: [] ");  

                        Op_cliente = teclado.nextByte();

                        switch( Op_cliente ){
                            case 1: 
                                System.out.println("\n --------Ingresar datos del nuevo cliente------------------");
                                bdCliente =  Clientes.nuevoCliente(bdCliente);
                                break;
                            case 2: 
                                System.out.println("\n --------Buscar datos del cliente------------------");
                                Clientes.buscarCliente(bdCliente);
                                break;
                           case 3: 
                                System.out.println("\n --------Eliminar datos del cliente------------------");
                                bdCliente = Clientes.eliminarRegistro(bdCliente);
                                break;
                          case 4: 
                                System.out.println("\n --------Listar datos de productos------------------");
                                Clientes.listarCilentes(bdCliente);
                                break;
                           case 5: 
                                System.out.println("\n Regresando al menu principal... \n");
                                break;
                           default:
                               System.out.println("\n Opcion incorrecta... \n");
                               break;
                        }
                    } while( Op_cliente != 5 ) ;
                    break;  // -------------cliente----------------------

                case 2:  // -------------productos----------------------
                   
                   do {
                        System.out.println("\n ============Menu Producto===================");
                        System.out.println("[1] Nuevo Producto");
                        System.out.println("[2] Buscar Producto");
                        System.out.println("[3] Eliminar Producto");
                        System.out.println("[4] Listar Cliente");  //-------------------
                        System.out.println("[5] Salir");
                        System.out.print("Elija una opción: [] ");  

                        Op_producto = teclado.nextByte();

                        switch( Op_producto ){
                            case 1: 
                                System.out.println("\n --------Ingresar datos del nuevo Producto------------------");
                                bdProducto = Productos.nuevoProducto(bdProducto);
                                break;
                            case 2: 
                                System.out.println("\n --------Buscar datos del Producto------------------");
                                Productos.buscarProducto(bdProducto);
                                break;
                           case 3: 
                                System.out.println("\n --------Eliminar datos del Producto------------------");
                                bdProducto = Productos.eliminarRegistro(bdProducto);

                                break;
                           case 4: 
                                System.out.println("\n --------Listar datos del cliente------------------");
                                Productos.listarProducto(bdProducto);
                                break;
                           case 5: 
                                System.out.println("\n Regresando al menu principal... \n");
                                break;
                           default:
                               System.out.println("\n Opcion incorrecta... \n");
                               break;
                        }
                    } while( Op_producto != 5 ) ;
                   break; // -------------productos----------------------

                case 3:  // -------------factura----------------------
                    System.out.println("\n ============Menu Factura===================");

                    break;  // -------------factura----------------------

                case 4:
                    System.out.println("Saliendo del sistema... \n");
                    break;

                default:
                    System.out.println("Opción incorrecta...\n ");           
            }       
        } while( Op_principal != 4 ) ;
        
     }
}