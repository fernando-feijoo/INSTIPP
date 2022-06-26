package ProyectoClase;
import java.util.Scanner;
public class Libros 
{
    public static String[][] nuevoLibro(String[][] datosLibros)
    {
        Scanner tc = new Scanner(System.in);
        //---------busca el la fila vacia---------------
        int puntero = 0;
        for(int fil = 0; fil < datosLibros.length; fil++)
        {
            if (datosLibros[fil][0] == null ) 
            {
                puntero = fil;
                break;
            }
        }
        //----------------------------------------
        System.out.println("\n------| 📚 Ingresar datos del nuevo libro 📚 |------");
        System.out.print  ("   ⚫ Ingrese el nombre del libro: ");
        datosLibros[puntero][0] = tc.nextLine();
        System.out.print  ("   ⚫ Ingrese el autor del libro: ");
        datosLibros[puntero][1] = tc.nextLine();
        System.out.print  ("   ⚫ Ingrese el stock de ese libro: ");
        datosLibros[puntero][2] = tc.nextLine();
        System.out.println("\nDatos guardados correctamente... \n");
        return datosLibros;
    }
    public static String[][] cargarDatosLibros()
    {
        String[][] datosLibros = new String[50][3];
        
        datosLibros[0][0] = "Pscologia del Exito";
        datosLibros[0][1] = "Mario Luna";
        datosLibros[0][2] = "5";
        
        datosLibros[1][0] = "Piense y Hagase Rico";
        datosLibros[1][1] = "T. Harv Ecker";
        datosLibros[1][2] = "5";
        
        datosLibros[2][0] = "Padre Rico, Padre Pobre";
        datosLibros[2][1] = "Robert Kiyosaki";
        datosLibros[2][2] = "2";
        
        datosLibros[3][0] = "Maximice su Potencial";
        datosLibros[3][1] = "Myles Munroe";
        datosLibros[3][2] = "10";
        
        datosLibros[4][0] = "El Lado Positivo del Fracaso";
        datosLibros[4][1] = "John C. Maxwell";
        datosLibros[4][2] = "1";
        
        return datosLibros;
    }
    public static void buscarLibro(String[][] datosLibros)
    {
        Scanner tc = new Scanner(System.in);
        String busqueda;
        int resultado = 0;
        int Op_dialogo;
        System.out.println("\n------| 🔎 Ingresar datos para buscar libro 🔎 |------");
        System.out.println("|                                                   |");
        System.out.println("|  Buscar por nombre del libro [1]                  |");
        System.out.println("|  Buscar por autor del libro  [2]                  |");
        System.out.println("|                                                   |");
        System.out.println("|---------------------------------------------------|");
        do 
        {            
            System.out.print("Elija una opción: ");
            Op_dialogo = tc.nextInt();
            System.out.println(" ");
            if (Op_dialogo <= 0 || Op_dialogo >= 3) 
            {
                System.out.println("Ingrese un dato correcto...\n");
            }
        } while (Op_dialogo <= 0 || Op_dialogo >= 3);
        tc.nextLine();
        System.out.print  ("   ⚫ Ingrese dato de busqueda: ");
        busqueda = tc.nextLine();
        if (Op_dialogo == 1 || Op_dialogo == 2)
        {
            int validacion = 0;
            int Pt_busqueda = 0;
            if (Op_dialogo == 2) 
            {
                Pt_busqueda = 1;
            }
            System.out.println("\n|_N°_|_Nombre del libro________________|_Autor___________________________|_Stock_|");
            for(int fil = 0; fil < datosLibros.length; fil++)
            {
                if (datosLibros[fil][0] != null && busqueda.equalsIgnoreCase(datosLibros[fil][Pt_busqueda]))
                {
                    System.out.print ("[ " + fil + " ]" + "    ");

                    for (int col = 0; col < datosLibros[0].length; col++ )
                    {
                        String cadenaEspacios = "";
                        int es = 35 - datosLibros[fil][col].length();
                        for (int x = 1; x < es; x++)
                        {
                             cadenaEspacios = cadenaEspacios + " ";
                        }
                        System.out.print (datosLibros[fil][col] + cadenaEspacios);
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
    public static void listarLibros(String[][] datosLibros)
    {
        int validacion, resultado;
        System.out.println("\n|_N°_|_Nombre del libro________________|_Autor___________________________|_Stock_|");
        validacion = 0;
        resultado = 0;
        for(int fil = 0; fil < datosLibros.length; fil++)
        {
            if (datosLibros[fil][0] != null)
            {
                System.out.print ("  "+ fil + "    ");

                for (int col = 0; col < datosLibros[0].length; col++ )
                {
                    String cadenaEspacios = "";
                    int es = 35 - datosLibros[fil][col].length();
                    for (int x = 1; x < es; x++)
                    {
                         cadenaEspacios = cadenaEspacios + " ";
                    }
                    System.out.print (datosLibros[fil][col] + cadenaEspacios);
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
    public static String[][] eliminarLibros(String[][] datosLibros)
    {
        Scanner tc = new Scanner(System.in);
        int Op_eliminar;
        Libros.buscarLibro(datosLibros);
        System.out.println("¿Desea continuar para eliminar datos?");
        System.out.print("  Si, No: ");
        String eleccion = tc.nextLine();
        if(eleccion.equalsIgnoreCase("si"))
        {
            System.out.println("¿Que valor desea eliminar? Ingrese la fila: ");
            Op_eliminar = tc.nextInt();
            for(int fil = Op_eliminar; fil <= Op_eliminar; fil++)
            {
                if (datosLibros[fil][0] != null)
                {
                    for (int col = 0; col < datosLibros[0].length; col++ )
                    {
                        datosLibros[fil][col] = "-------";
                    }
                    System.out.println("\n Datos eliminados con exito...");
                }
            }
        }else
        {
            System.out.println("\n No se eliminaron datos...");
        }
        
        return datosLibros;
    }
}
