package ProyectoClase;
import java.util.Scanner;
public class Usuarios 
{
    public static String[][] nuevoUsuario(String[][] datosUsuarios)
    {
        Scanner tc = new Scanner(System.in);
        //---------busca el la fila vacia---------------
        int puntero = 0;
        for(int fil = 0; fil < datosUsuarios.length; fil++)
        {
            if (datosUsuarios[fil][0] == null ) 
            {
                puntero = fil;
                break;
            }
        }
        //----------------------------------------
        System.out.println("\n------| 👤 Ingresar datos del nuevo usuario 👤 |------");
        System.out.print  ("   ⚫ Ingrese el N° de cedula: ");
        datosUsuarios[puntero][0] = tc.nextLine();
        System.out.print  ("   ⚫ Ingrese el nombre del usuario: ");
        datosUsuarios[puntero][1] = tc.nextLine();
        System.out.print  ("   ⚫ Ingrese el apellido del usuario: ");
        datosUsuarios[puntero][2] = tc.nextLine();
        System.out.print  ("   ⚫ Ingrese la direccion del usuario: ");
        datosUsuarios[puntero][3] = tc.nextLine();
        System.out.println("\nDatos guardados correctamente... \n");
        
        return datosUsuarios;
    }
    public static String[][] cargarDatosUsuarios()
    {
        String[][] datosUsuarios = new String[50][4];
        
        datosUsuarios[0][0] = "0705784817";
        datosUsuarios[0][1] = "Fernando";
        datosUsuarios[0][2] = "Feijoo";
        datosUsuarios[0][3] = "Colon y Eloy A.";
        
        datosUsuarios[1][0] = "0701917056";
        datosUsuarios[1][1] = "Angel";
        datosUsuarios[1][2] = "Fajardo";
        datosUsuarios[1][3] = "Colon y Eloy A.";
        
        datosUsuarios[2][0] = "0705946358";
        datosUsuarios[2][1] = "Dicxon";
        datosUsuarios[2][2] = "Feijoo";
        datosUsuarios[2][3] = "Colon y Eloy A.";
        
        datosUsuarios[3][0] = "0703754176";
        datosUsuarios[3][1] = "Rosa";
        datosUsuarios[3][2] = "Aguilar";
        datosUsuarios[3][3] = "Santa Rosa";
        
        datosUsuarios[4][0] = "0705786754";
        datosUsuarios[4][1] = "Angie";
        datosUsuarios[4][2] = "Pesantez";
        datosUsuarios[4][3] = "Miraflores";
        
        return datosUsuarios;
    }
    public static void buscarUsuario(String[][] datosUsuarios)
    {
        Scanner tc = new Scanner(System.in);
        String busqueda;
        int resultado = 0;
        int Op_dialogo;
        System.out.println("\n------| 🔎 Ingresar datos para buscar usuario 🔍 |------");
        System.out.println("|                                                      |");
        System.out.println("|  Buscar por cedula de usuario   [1]                  |");
        System.out.println("|  Buscar por nombre de usuario   [2]                  |");
        System.out.println("|  Buscar por apellido de usuario [3]                  |");
        System.out.println("|                                                      |");
        System.out.println("|------------------------------------------------------|");
        do 
        {            
            System.out.print("Elija una opción: ");
            Op_dialogo = tc.nextInt();
            System.out.println(" ");
            if (Op_dialogo <= 0 || Op_dialogo >= 4) 
            {
                System.out.println("Ingrese un dato correcto...\n");
            }
        } while (Op_dialogo <= 0 || Op_dialogo >= 4);
        tc.nextLine();
        System.out.print  ("   ⚫ Ingrese dato de busqueda: ");
        busqueda = tc.nextLine();
        if (Op_dialogo == 1 || Op_dialogo == 2 || Op_dialogo == 3)
        {
            int validacion = 0;
            int Pt_busqueda = 0;
            if (Op_dialogo == 2) 
            {
                Pt_busqueda = 1;
            } else if(Op_dialogo == 3)
            {
                Pt_busqueda = 2;
            }
            System.out.println("\n|_N°_|_Cedula___________|_Nombre___________|_Apellido_________|_Dirección________|");
            for(int fil = 0; fil < datosUsuarios.length; fil++)
            {
                if (datosUsuarios[fil][0] != null && busqueda.equalsIgnoreCase(datosUsuarios[fil][Pt_busqueda]))
                {
                    System.out.print ("[ " + fil + " ]" + "    ");

                    for (int col = 0; col < datosUsuarios[0].length; col++ )
                    {
                        String cadenaEspacios = "";
                        int es = 20 - datosUsuarios[fil][col].length();
                        for (int x = 1; x < es; x++)
                        {
                             cadenaEspacios = cadenaEspacios + " ";
                        }
                        System.out.print (datosUsuarios[fil][col] + cadenaEspacios);
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
    public static void listarUsuarios(String[][] datosUsuarios)
    {
        int validacion, resultado;
        System.out.println("\n|_N°_|_Cedula___________|_Nombre___________|_Apellido_________|_Dirección________|");
        validacion = 0;
        resultado = 0;
        for(int fil = 0; fil < datosUsuarios.length; fil++)
        {
            if (datosUsuarios[fil][0] != null)
            {
                System.out.print ("  "+ fil + "    ");

                for (int col = 0; col < datosUsuarios[0].length; col++ )
                {
                    String cadenaEspacios = "";
                    int es = 20 - datosUsuarios[fil][col].length();
                    for (int x = 1; x < es; x++)
                    {
                         cadenaEspacios = cadenaEspacios + " ";
                    }
                    System.out.print (datosUsuarios[fil][col] + cadenaEspacios);
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
    public static String[][] eliminarUsuarios(String[][] datosUsuarios)
    {
        Scanner tc = new Scanner(System.in);
        int Op_eliminar;
        Usuarios.buscarUsuario(datosUsuarios);
        System.out.println("¿Desea continuar para eliminar datos?");
        System.out.print("  Si, No: ");
        String eleccion = tc.nextLine();
        if(eleccion.equalsIgnoreCase("si"))
        {
            System.out.println("¿Que valor desea eliminar? Ingrese la fila: ");
            Op_eliminar = tc.nextInt();
            for(int fil = Op_eliminar; fil <= Op_eliminar; fil++)
            {
                if (datosUsuarios[fil][0] != null)
                {
                    for (int col = 0; col < datosUsuarios[0].length; col++ )
                    {
                        datosUsuarios[fil][col] = "-------";
                    }
                    System.out.println("\n Datos eliminados con exito...");
                }
            }
        }else
        {
            System.out.println("\n No se eliminaron datos...");
        }
        return datosUsuarios;
    }    
}
