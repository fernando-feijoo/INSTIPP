package ProyectoClase;
import java.util.Scanner;
public class MunuPrincipal 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        Alquileres alquiler = new Alquileres();
        byte Op_principal, Op_usuario, Op_libro, Op_alquiler;
        int numeroUsuario = 0, numeroLibro = 0;
        String estado = "";
        //---------------------------------------
        String[][] bdUsuarios = new String[50][4];
        bdUsuarios = Usuarios.cargarDatosUsuarios();
        //---------------------------------------
        String[][] bdLibros = new String [50][3];
        bdLibros = Libros.cargarDatosLibros();
        //---------------------------------------
        String[][] bdAlquiler = new String[50][8];
        bdAlquiler = Alquileres.cargarDatosAlquiler();
        //---------------------------------------
        do
        {
            System.out.println("********| MENU PRINCIPAL |********");
            System.out.println("** [1] USUARIOS                 **");
            System.out.println("** [2] LIBROS                   **");
            System.out.println("** [3] ALQUILER                 **");
            System.out.println("** [4] SALIR                    **");
            System.out.println("**********************************");
            System.out.print("Elija una opción: []  ");
            Op_principal = tc.nextByte();
            switch(Op_principal)
            {
                case 1: //------cliente-----------
                    do
                    {
                        System.out.println("\n=========| Menu usuarios |========");
                        System.out.println("-- [1] Nuevo usuario            --");
                        System.out.println("-- [2] Buscar usuario           --");
                        System.out.println("-- [3] Listar usuarios          --");
                        System.out.println("-- [4] Eliminar usuario         --");
                        System.out.println("-- [5] Salir                    --");
                        System.out.println("----------------------------------");
                        System.out.print("Elija una opción: []  ");
                        Op_usuario = tc.nextByte();
                        switch(Op_usuario)
                        {
                            case 1:
                                bdUsuarios = Usuarios.nuevoUsuario(bdUsuarios);
                                break;
                            case 2:
                                Usuarios.buscarUsuario(bdUsuarios);
                                break;
                            case 3:
                                Usuarios.listarUsuarios(bdUsuarios);
                                break;
                            case 4:
                                bdUsuarios = Usuarios.eliminarUsuarios(bdUsuarios);
                                break;
                            case 5:
                                System.out.println("\nRegresando al menu principal... \n");
                                break;
                            default:
                                System.out.println("\nOpción incorrecta... \n");
                        }
                    }while(Op_usuario != 5);
                    break; //------cliente-----------
                case 2: //------libro-----------
                    do
                    {
                        System.out.println("\n==========| Menu libros |=========");
                        System.out.println("-- [1] Nuevo libro              --");
                        System.out.println("-- [2] Buscar libro             --");
                        System.out.println("-- [3] Listar libros            --");
                        System.out.println("-- [4] Eliminar libro           --");
                        System.out.println("-- [5] Salir                    --");
                        System.out.println("----------------------------------");
                        System.out.print("Elija una opción: []  ");
                        Op_libro = tc.nextByte();
                        switch(Op_libro)
                        {
                            case 1:
                                bdLibros = Libros.nuevoLibro(bdLibros);
                                break;
                            case 2:
                                Libros.buscarLibro(bdLibros);
                                break;
                            case 3:
                                Libros.listarLibros(bdLibros);
                                break;
                            case 4:
                                bdLibros = Libros.eliminarLibros(bdLibros);
                                break;
                            case 5:
                                System.out.println("\nRegresando al menu principal... \n");
                                break;
                            default:
                                System.out.println("\nOpción incorrecta... \n");
                        }
                    }while(Op_libro != 5);
                    break;//------libro-----------
                case 3: //------factura-----------
                    do
                    {
                        System.out.println("\n=========| Menu alquiler |========");
                        System.out.println("-- [1] Nuevo alquiler           --");
                        System.out.println("-- [2] Buscar alquiler          --");
                        System.out.println("-- [3] Listar alquileres        --");
                        System.out.println("-- [4] Eliminar alquiler        --");
                        System.out.println("-- [5] Salir                    --");
                        System.out.println("----------------------------------");
                        System.out.print("Elija una opción: []  ");
                        Op_alquiler = tc.nextByte();
                        switch(Op_alquiler)
                        {
                            case 1:
                                //---------busca el la fila vacia---------------
                                int puntero = 0, contador = 0;
                                for(int fil = 0; fil < bdAlquiler.length; fil++)
                                {
                                    if (bdAlquiler[fil][0] == null )
                                    {
                                        puntero = fil;
                                        break;
                                    }
                                }
                                //----------------------------------------
                                System.out.println("\n------| 📃 Ingresar datos para alquilar libro 📃 |------");
                                Usuarios.buscarUsuario(bdUsuarios);
                                tc.nextLine();
                                System.out.println("\n¿Encontro el usuario? s/n");
                                String respuesta = tc.nextLine();
                                if(respuesta.equalsIgnoreCase("s"))
                                {
                                    System.out.print  ("   ⚫ Ingrese el N° de usuario:\n ");
                                    numeroUsuario = tc.nextInt();
                                    System.out.print  ("   ⚫ Ingrese el libro a alquilar ⚫ \n ");
                                    Libros.buscarLibro(bdLibros);
                                    tc.nextLine();
                                    System.out.println("\n¿Encontro el libro? s/n");
                                    String respuestaLibro = tc.nextLine();
                                    if(respuestaLibro.equalsIgnoreCase("s"))
                                    {
                                        System.out.print  ("   ⚫ Ingrese el N° del libro:\n ");
                                        numeroLibro = tc.nextInt();
                                        tc.nextLine();
                                        System.out.print  ("   ⚫ Ingrese el estado del libro \n     Excelente, Bueno, Malo:  ");
                                        estado = tc.nextLine();
                                    }                                      
                                } else if(respuesta.equalsIgnoreCase("n"))
                                {
                                    System.out.println("\n¿Desea registrar un nuevo usuario? s/n");
                                    String respuestaUsuario = tc.nextLine();
                                    if(respuestaUsuario.equalsIgnoreCase("s"))
                                    {
                                        bdUsuarios = Usuarios.nuevoUsuario(bdUsuarios);
                                    }
                                }
                                System.out.println("\n¿Desea registrar los datos de alquiler? s/n");
                                String respuestaAlquiler = tc.nextLine();
                                if(respuestaAlquiler.equalsIgnoreCase("s"))
                                {
                                    int validacion, resultado;
                                    validacion = 0;
                                    resultado = 0;
                                        if (bdAlquiler[puntero][0] == null)
                                        {
                                            for (int col = 0; col <= 3; col++ )
                                            {
                                                if(col <= 3)
                                                {
                                                    bdAlquiler[puntero][col] = bdUsuarios[numeroUsuario][col];
                                                    if(col <= 1)
                                                    {
                                                        bdAlquiler[puntero][(col+4)] = bdLibros[numeroLibro][col];
                                                    }else if(col == 2)
                                                    {
                                                        bdAlquiler[puntero][6] = estado;
                                                    }else if(col == 3)
                                                    {
                                                        bdAlquiler[puntero][7] = Alquileres.fechaActual();
                                                    }
                                                }                                                
                                            }
                                            validacion++;
                                        if(validacion != 0)
                                        {
                                            System.out.println("\nDatos guardados correctamente... \n");
                                            bdAlquiler = Alquileres.nuevoAlquiler(bdAlquiler);
                                            resultado++;
                                        }
                                        }
                                        if(resultado == 0)
                                        {
                                            System.out.println("\nAún no ingresa datos...\n");
                                            resultado++;
                                        }
                                } else if(respuestaAlquiler.equalsIgnoreCase("n"))
                                {
                                    System.out.println("\nDatos no guardados... \n");
                                }
                                break;
                            case 2:
                                Alquileres.buscarAlquiler(bdAlquiler);
                                break;
                            case 3:
                                Alquileres.listarAlquileres(bdAlquiler);
                                break;
                            case 4:
                                bdAlquiler = Alquileres.eliminarAlquiler(bdAlquiler);
                                break;
                            case 5:
                                System.out.println("\nRegresando al menu principal... \n");
                                break;
                            default:
                                System.out.println("\nOpción incorrecta... \n");
                        }
                     }while(Op_alquiler != 5);
                    break;//------factura-----------
                case 4: //------salir-----------
                    System.out.println("Saliendo del sistema... \n");
                    break;//------salir-----------
                default:
                    System.out.println("\nOpción incorrecta... \n");
            }
        }while(Op_principal != 4);
    }
}
