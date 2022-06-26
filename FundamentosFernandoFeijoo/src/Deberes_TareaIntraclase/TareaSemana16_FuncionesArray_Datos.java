package Deberes_TareaIntraclase;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TareaSemana16_FuncionesArray_Datos 
{
    public static String[][] nuevoIngreso(String[][] datos)
    {
        Scanner tc = new Scanner(System.in);
        //---------busca el la fila vacia---------------
        int puntero = 0;
        for(int fil = 0; fil < datos.length; fil++)
        {
            if (datos[fil][0] == null ) 
            {
                puntero = fil;
                break;
            }
        }
        //----------------------------------------
        if(puntero < datos.length)
        {
            System.out.println("\n%%%%%%%%| Ingrese el " + puntero + " dato |%%%%%%%%");
            System.out.println("   ⚫ Ingrese un número de cedula: ");
            datos[puntero][0] = tc.nextLine();
            System.out.println("   ⚫ Ingrese el Nombre: ");
            datos[puntero][1] = tc.nextLine();
            System.out.println("   ⚫ Ingrese el Apellido: ");
            datos[puntero][2] = tc.nextLine();
            System.out.println("   ⚫ Ingrese el nombre del libro: ");
            datos[puntero][3] = tc.nextLine();
            System.out.println("   ⚫ Ingrese el Autor del libro: ");
            datos[puntero][4] = tc.nextLine();
            System.out.println("   ⚫ Ingrese el estado del libro entregado: ");
            datos[puntero][5] = tc.nextLine();
            datos[puntero][6] = fechaActual();
            System.out.println("   ⚫ Ingrese el telefono del usuario: ");
            datos[puntero][7] = tc.nextLine();
            System.out.println("\n\n");
            System.out.println("Datos guardados correctamente...\n");
        }
        return datos;
    }
    public static String[][] cargarDatosDatos()
    {
        String[][] datos = new String [50][8];
        datos[0][0] = "0705784817";
        datos[0][1] = "Fernando";
        datos[0][2] = "Feijoo";
        datos[0][3] = "Programacion";
        datos[0][4] = "Mario";
        datos[0][5] = "Excelente";
        datos[0][6] = fechaActual();
        datos[0][7] = "073635123";

        datos[1][0] = "0705946358";
        datos[1][1] = "Dicxon";
        datos[1][2] = "Feijoo";
        datos[1][3] = "Emprender";
        datos[1][4] = "Rosa";
        datos[1][5] = "Bueno";
        datos[1][6] = fechaActual();
        datos[1][7] = "073635123";

        datos[2][0] = "0701917056";
        datos[2][1] = "Angel";
        datos[2][2] = "Ruiz";
        datos[2][3] = "Negocios";
        datos[2][4] = "Robert";
        datos[2][5] = "Muy bueno";
        datos[2][6] = fechaActual();
        datos[2][7] = "073635123";

        datos[3][0] = "0705784817";
        datos[3][1] = "Fernando";
        datos[3][2] = "Feijoo";
        datos[3][3] = "Programacion";
        datos[3][4] = "Mario";
        datos[3][5] = "Excelente";
        datos[3][6] = fechaActual();
        datos[3][7] = "073635123";
        return datos;
    }
    public static void buscarDatos(String[][] datos)
    {
        Scanner tc = new Scanner(System.in);
        String busqueda;
        int resultado, validacion, Pt_busqueda;
        String [] Object = {"Cedula", "Nombre", "Apellido"};
        int Op_dialogo = JOptionPane.showOptionDialog(null, "¿Cómo desea buscar la información?", "Pregunta", 0, JOptionPane.QUESTION_MESSAGE, null, Object, "Cedula");
        System.out.println("Ingrese " + Object[Op_dialogo] + " para buscar: ");
        busqueda = tc.nextLine();
        System.out.println("");
        resultado = 0;
        if (Op_dialogo == 0) //              **| Cedula |**
        {
            validacion = 0;
            Pt_busqueda = 0;
            System.out.println("|_N°_|__Cedula__________|__Nombre__________|__Apellido_________|__Nombre de libro|__Autor___________|__Estado libro____|__Fecha_________________________|__Telefono________|");
            for(int fil = 0; fil < datos.length; fil++)
            {
                if (datos[fil][0] != null && busqueda.equals(datos[fil][Pt_busqueda]))
                {
                    System.out.print (fil + "    ");

                    for (int col = 0; col < datos[0].length; col++ )
                    {
                        String cadenaEspacios = "";
                        int es = 20 - datos[fil][col].length();
                        if(datos[fil][col].length() > 20)
                        {
                            es = 33 - datos[fil][col].length();
                        }
                        for (int x = 1; x < es; x++)
                        {
                             cadenaEspacios = cadenaEspacios + " ";
                        }
                        System.out.print (datos[fil][col] + cadenaEspacios);
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
        } else if (Op_dialogo == 1) //              **| Nombre |**
        {
            validacion = 0;
            Pt_busqueda = 1;
            System.out.println("|_N°_|__Cedula__________|__Nombre__________|__Apellido_________|__Nombre de libro|__Autor___________|__Estado libro____|__Fecha_________________________|__Telefono________|");
            for(int fil = 0; fil < datos.length; fil++)
            {
                if (datos[fil][0] != null && busqueda.equals(datos[fil][Pt_busqueda]))
                {
                    System.out.print (fil + "    ");

                    for (int col = 0; col < datos[0].length; col++ )
                    {
                        String cadenaEspacios = "";
                        int es = 20 - datos[fil][col].length();
                        if(datos[fil][col].length() > 20)
                        {
                            es = 33 - datos[fil][col].length();
                        }
                        for (int x = 1; x < es; x++)
                        {
                             cadenaEspacios = cadenaEspacios + " ";
                        }
                        System.out.print (datos[fil][col] + cadenaEspacios);
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
        } else if (Op_dialogo == 2) //              **| Apellido |**
        {
            validacion = 0;
            Pt_busqueda = 2;
            System.out.println("|_N°_|__Cedula__________|__Nombre__________|__Apellido_________|__Nombre de libro|__Autor___________|__Estado libro____|__Fecha_________________________|__Telefono________|");
            for(int fil = 0; fil < datos.length; fil++)
            {
                if (datos[fil][0] != null && busqueda.equals(datos[fil][Pt_busqueda]))
                {
                    System.out.print (fil + "    ");

                    for (int col = 0; col < datos[0].length; col++ )
                    {
                        String cadenaEspacios = "";
                        int es = 20 - datos[fil][col].length();
                        if(datos[fil][col].length() > 20)
                        {
                            es = 33 - datos[fil][col].length();
                        }
                        for (int x = 1; x < es; x++)
                        {
                             cadenaEspacios = cadenaEspacios + " ";
                        }
                        System.out.print (datos[fil][col] + cadenaEspacios);
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
        }
    }
    public static void listarDatos(String[][] datos)
    {
        int validacion, resultado;
        System.out.println("|_N°_|__Cedula__________|__Nombre__________|__Apellido_________|__Nombre de libro|__Autor___________|__Estado libro____|__Fecha_________________________|__Telefono________|");
        validacion = 0;
        resultado = 0;
        for(int fil = 0; fil < datos.length; fil++)
        {
            if (datos[fil][0] != null && !"0".equals(datos[fil][0]))
            {
                System.out.print ("  "+ fil + "    ");

                for (int col = 0; col < datos[0].length; col++ )
                {
                    String cadenaEspacios = "";
                    int es = 20 - datos[fil][col].length();
                    if(datos[fil][col].length() > 20)
                    {
                        es = 33 - datos[fil][col].length();
                    }
                    for (int x = 1; x < es; x++)
                    {
                         cadenaEspacios = cadenaEspacios + " ";
                    }
                    System.out.print (datos[fil][col] + cadenaEspacios);
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
    }
    public static String[][] eliminarDatos(String[][] datos)
    {
        Scanner tc = new Scanner(System.in);
        String busqueda;
        int resultado, validacion, Pt_busqueda, Op_eliminar;
        String [] Object2 = {"Cedula", "Nombre", "Apellido"};
        int Op_dialogo2 = JOptionPane.showOptionDialog(null, "¿Cómo desea buscar la información, para eliminar?", "Pregunta", 0, JOptionPane.QUESTION_MESSAGE, null, Object2, "Cedula");
        System.out.println("Ingrese " + Object2[Op_dialogo2] + " para buscar: ");
        busqueda = tc.nextLine();
        System.out.println("");
        resultado = 0;
        if (Op_dialogo2 == 0) //              **| Cedula |**
        {
            validacion = 0;
            Pt_busqueda = 0;
            System.out.println("|_N°_|__Cedula__________|__Nombre__________|__Apellido_________|__Nombre de libro|__Autor___________|__Estado libro____|__Fecha_________________________|__Telefono________|");
            for(int fil = 0; fil < datos.length; fil++)
            {
                if (datos[fil][0] != null && busqueda.equals(datos[fil][Pt_busqueda]))
                {
                    System.out.print (fil + "    ");

                    for (int col = 0; col < datos[0].length; col++ )
                    {
                        String cadenaEspacios = "";
                        int es = 20 - datos[fil][col].length();
                        if(datos[fil][col].length() > 20)
                        {
                            es = 33 - datos[fil][col].length();
                        }
                        for (int x = 1; x < es; x++)
                        {
                             cadenaEspacios = cadenaEspacios + " ";
                        }
                        System.out.print (datos[fil][col] + cadenaEspacios);
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
        } else if (Op_dialogo2 == 1) //              **| Nombre |**
        {
            validacion = 0;
            Pt_busqueda = 1;
            System.out.println("|_N°_|__Cedula__________|__Nombre__________|__Apellido_________|__Nombre de libro|__Autor___________|__Estado libro____|__Fecha_________________________|__Telefono________|");
            for(int fil = 0; fil < datos.length; fil++)
            {
                if (datos[fil][0] != null && busqueda.equalsIgnoreCase(datos[fil][Pt_busqueda]))
                {
                    System.out.print (fil + "    ");

                    for (int col = 0; col < datos[0].length; col++ )
                    {
                        String cadenaEspacios = "";
                        int es = 20 - datos[fil][col].length();
                        if(datos[fil][col].length() > 20)
                        {
                            es = 33 - datos[fil][col].length();
                        }
                        for (int x = 1; x < es; x++)
                        {
                             cadenaEspacios = cadenaEspacios + " ";
                        }
                        System.out.print (datos[fil][col] + cadenaEspacios);
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
        } else if (Op_dialogo2 == 2) //              **| Apellido |**
        {
            validacion = 0;
            Pt_busqueda = 2;
            System.out.println("|_N°_|__Cedula__________|__Nombre__________|__Apellido_________|__Nombre de libro|__Autor___________|__Estado libro____|__Fecha_________________________|__Telefono________|");
            for(int fil = 0; fil < datos.length; fil++)
            {
                if (datos[fil][0] != null && busqueda.equalsIgnoreCase(datos[fil][Pt_busqueda]))
                {
                    System.out.print (fil + "    ");

                    for (int col = 0; col < datos[0].length; col++ )
                    {
                        String cadenaEspacios = "";
                        int es = 20 - datos[fil][col].length();
                        if(datos[fil][col].length() > 20)
                        {
                            es = 33 - datos[fil][col].length();
                        }
                        for (int x = 1; x < es; x++)
                        {
                             cadenaEspacios = cadenaEspacios + " ";
                        }
                        System.out.print (datos[fil][col] + cadenaEspacios);
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
        }
        System.out.println("¿Que valor desea eliminar? Ingrese la fila: ");
        Op_eliminar = tc.nextInt();

        for(int fil = Op_eliminar; fil <= Op_eliminar; fil++)
        {
            if (datos[fil][0] != null && !"0".equals(datos[fil][0]))
            {
                for (int col = 0; col < datos[0].length; col++ )
                {
                    datos[fil][col] = "----------------";
                }
                System.out.println("\n Datos eliminados con exito...");
            }
        }
        return datos;
    }
    public static String fechaActual()
    {
        Date fechaCorrecta = new Date();       
        String strDateFormat = "hh:mm:ss a | dd-MMM-yyyy";
        SimpleDateFormat objSDF  = new SimpleDateFormat(strDateFormat);
        return (objSDF.format(fechaCorrecta));
    }
}
