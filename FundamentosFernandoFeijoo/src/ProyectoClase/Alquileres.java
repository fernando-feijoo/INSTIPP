package ProyectoClase;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Alquileres 
{ 
    public static String[][] nuevoAlquiler(String[][] datosAlquiler)
    {
        return datosAlquiler;
    }
    public static String[][] cargarDatosAlquiler()
    {
        String[][] datosAlquiler = new String[50][8];
        
        datosAlquiler[0][0] = "0705784817";
        datosAlquiler[0][1] = "Fernando";
        datosAlquiler[0][2] = "Feijoo";
        datosAlquiler[0][3] = "Colon y Eloy A.";
        datosAlquiler[0][4] = "Pscologia del Exito";
        datosAlquiler[0][5] = "Mario Luna";
        datosAlquiler[0][6] = "Excelente";
        datosAlquiler[0][7] = fechaActual();
        
        datosAlquiler[1][0] = "0701917056";
        datosAlquiler[1][1] = "Angel";
        datosAlquiler[1][2] = "Fajardo";
        datosAlquiler[1][3] = "Colon y Eloy A.";
        datosAlquiler[1][4] = "Piense y Hagase Rico";
        datosAlquiler[1][5] = "T. Harv Ecker";
        datosAlquiler[1][6] = "Bueno";
        datosAlquiler[1][7] = fechaActual();
        
        datosAlquiler[2][0] = "0705786754";
        datosAlquiler[2][1] = "Angie";
        datosAlquiler[2][2] = "Pesantez";
        datosAlquiler[2][3] = "Miraflores";
        datosAlquiler[2][4] = "Maximice su Potencial";
        datosAlquiler[2][5] = "Myles Munroe";
        datosAlquiler[2][6] = "Malo";
        datosAlquiler[2][7] = fechaActual();
        
        datosAlquiler[3][0] = "0705784817";
        datosAlquiler[3][1] = "Fernando";
        datosAlquiler[3][2] = "Feijoo";
        datosAlquiler[3][3] = "Colon y Eloy A.";
        datosAlquiler[3][4] = "Padre Rico, Padre Pobre";
        datosAlquiler[3][5] = "Robert Kiyosaki";
        datosAlquiler[3][6] = "Bueno";
        datosAlquiler[3][7] = fechaActual();
        
        datosAlquiler[4][0] = "0705784817";
        datosAlquiler[4][1] = "Fernando";
        datosAlquiler[4][2] = "Feijoo";
        datosAlquiler[4][3] = "Colon y Eloy A.";
        datosAlquiler[4][4] = "Pscologia del Exito";
        datosAlquiler[4][5] = "Mario Luna";
        datosAlquiler[4][6] = "Excelente";
        datosAlquiler[4][7] = fechaActual();
        
        return datosAlquiler;
        
    }
    public static void buscarAlquiler(String[][] datosAlquiler)
    {
        Scanner tc = new Scanner(System.in);
        String busqueda;
        int resultado = 0;
        int Op_dialogo;
        System.out.println("\n------| 🔎 Ingresar datos para buscar alquiler 🔍 |-----");
        System.out.println("|                                                      |");
        System.out.println("|  Buscar por cedula de usuario   [1]                  |");
        System.out.println("|  Buscar por nombre de usuario   [2]                  |");
        System.out.println("|  Buscar por libro alquilado     [3]                  |");
        System.out.println("|  Buscar por autor de libro      [4]                  |");
        System.out.println("|                                                      |");
        System.out.println("|------------------------------------------------------|");
        do 
        {            
            System.out.print("Elija una opción: ");
            Op_dialogo = tc.nextInt();
            System.out.println(" ");
            if (Op_dialogo <= 0 || Op_dialogo >= 5) 
            {
                System.out.println("Ingrese un dato correcto...\n");
            }
        } while (Op_dialogo <= 0 || Op_dialogo >= 5);
        tc.nextLine();
        System.out.print  ("   ⚫ Ingrese dato de busqueda: ");
        busqueda = tc.nextLine();
        if (Op_dialogo == 1 || Op_dialogo == 2 || Op_dialogo == 3 || Op_dialogo == 4)
        {
            int validacion = 0;
            int Pt_busqueda = 0;
            if (Op_dialogo == 2) 
            {
                Pt_busqueda = 1;
            } else if(Op_dialogo == 3)
            {
                Pt_busqueda = 4;
            } else if(Op_dialogo == 4)
            {
                Pt_busqueda = 5;
            }
            System.out.println("\n|_N°_|_Cedula___________|_Nombre___________|_Apellido_________|_Dirección______|_Nombre del libro________________|_Autor___________|_Estado__________|__Fecha____________________|");
            for(int fil = 0; fil < datosAlquiler.length; fil++)
            {
                if (datosAlquiler[fil][0] != null && busqueda.equalsIgnoreCase(datosAlquiler[fil][Pt_busqueda]))
                {
                    System.out.print ("[ " + fil + " ]" + "    ");

                    for (int col = 0; col < datosAlquiler[0].length; col++ )
                    {
                        String cadenaEspacios = "";
                        int es = 19 - datosAlquiler[fil][col].length();
                        if(datosAlquiler[fil][col].length() >= 19)
                        {
                            es = 35 - datosAlquiler[fil][col].length();
                        }
                        for (int x = 1; x < es; x++)
                        {
                             cadenaEspacios = cadenaEspacios + " ";
                        }
                        System.out.print (datosAlquiler[fil][col] + cadenaEspacios);
                    }
                    validacion++;
                }
            if(validacion != 0)
            {
                System.out.println("");
                resultado++;
                validacion = 0;
            }
            }
            if(resultado == 0)
            {
                System.out.println("\nNo se encontraron coincidencias...\n");
            }
            if(resultado != 0)
            {
                System.out.println("\nDatos buscados correctamente... \n");
            }
        }
    }
    public static void listarAlquileres(String[][] datosAlquiler)
    {
        int validacion, resultado;
        System.out.println("\n|_N°_|_Cedula___________|_Nombre_________|_Apellido_________|_Dirección______|_Nombre del libro________________|_Autor___________|_Estado__________|__Fecha____________________|");
        validacion = 0;
        resultado = 0;
        for(int fil = 0; fil < datosAlquiler.length; fil++)
        {
            if (datosAlquiler[fil][0] != null)
            {
                System.out.print ("  "+ fil + "    ");

                for (int col = 0; col < datosAlquiler[0].length; col++ )
                {
                    String cadenaEspacios = "";
                    int es = 19 - datosAlquiler[fil][col].length();
                        if(datosAlquiler[fil][col].length() >= 19)
                        {
                            es = 35 - datosAlquiler[fil][col].length();
                        }
                    for (int x = 1; x < es; x++)
                    {
                         cadenaEspacios = cadenaEspacios + " ";
                    }
                    System.out.print (datosAlquiler[fil][col] + cadenaEspacios);
                }
                validacion++;
            if(validacion != 0)
            {
                System.out.println("");
                resultado++;
            }
            }
            if(resultado == 0)
            {
                System.out.println("\nAún no ingresa datos...\n");
                resultado++;
            }
        }
        if(resultado != 0)
        {
            System.out.println("\nDatos listados correctamente... \n");
        }
    }
    public static String[][] eliminarAlquiler(String[][] datosAlquiler)
    {
        Scanner tc = new Scanner(System.in);
        int Op_eliminar;
        Alquileres.buscarAlquiler(datosAlquiler);
        System.out.println("¿Desea continuar para eliminar datos?");
        System.out.print("  Si, No: ");
        String eleccion = tc.nextLine();
        if(eleccion.equalsIgnoreCase("si"))
        {
            System.out.println("¿Que valor desea eliminar? Ingrese la fila: ");
            Op_eliminar = tc.nextInt();
            for(int fil = Op_eliminar; fil <= Op_eliminar; fil++)
            {
                if (datosAlquiler[fil][0] != null)
                {
                    for (int col = 0; col < datosAlquiler[0].length; col++ )
                    {
                        datosAlquiler[fil][col] = "--";
                    }
                    System.out.println("\n Datos eliminados con exito...");
                }
            }
        }else
        {
            System.out.println("\n No se eliminaron datos...");
        }
        
        return datosAlquiler;
    }
    public static String fechaActual()
    {
        Date fechaCorrecta = new Date();       
        String strDateFormat = "hh:mm:ss a | dd-MMM-yyyy";
        SimpleDateFormat objSDF  = new SimpleDateFormat(strDateFormat);
        return (objSDF.format(fechaCorrecta));
    }
}
