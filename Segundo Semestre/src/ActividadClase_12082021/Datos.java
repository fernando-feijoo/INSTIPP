package ActividadClase_12082021;
/* El club deportivo cebollitas desea registrar a sus N jugadores la edad la estatura 
y el nombre, si la edad es mayor 36 presentar no es apto, si es menor de 18 "es menor 
de edad", para el equipo presentar por separado y ordenado de mayor a menor los aptos 
y los no aptos. */
import java.util.Scanner;
public class Datos 
{
        public void ingreso()
        {
            Scanner tc = new Scanner(System.in);
            int cantidad, contador = 0;
            System.out.println("Cantidad de jugadores que desea ingresar: ");
            cantidad = tc.nextInt();
            String[][] datos = new String [cantidad][4];
            String[] titulos = new String[]{"la edad:", "la estatura:", "el nombre:"};
            String edad, nombre, estatura, estado;
            tc.nextLine();
            for (int x = 0; x < datos.length; x++) 
            {
                System.out.println("");
                for (int f = 0; f < datos[x].length - 1; f++) 
                {
                    System.out.println("Ingrese " + titulos[f]);
                    datos[x][f] = tc.nextLine();
                    if (Integer.parseInt(datos[x][0]) >= 18 && Integer.parseInt(datos[x][0]) <= 35) 
                    {
                        datos[x][3] = "ES APTO";
                    } else if(Integer.parseInt(datos[x][0]) > 35)
                    {
                        datos[x][3] = "NO ES APTO";
                    } else if(Integer.parseInt(datos[x][0]) < 17)
                    {
                        datos[x][3] = "ES MENOR DE EDAD";
                    }
                }
                System.out.println("");
            }
            for (int t = 0; t < datos.length; t++) 
            {
                for (int j = 0; j < datos.length - 1; j++) 
                {
                    if (Integer.parseInt(datos[j][0])  < Integer.parseInt(datos[j + 1][0])) 
                    {
                        
                        edad = datos[j][0];
                        datos[j][0] = datos[j + 1][0];
                        datos[j + 1][0] = edad;
                        
                        nombre = datos[j][1];
                        datos[j][1] = datos[j + 1][1];
                        datos[j + 1][1] = nombre;
                        
                        estatura = datos[j][2];
                        datos[j][2] = datos[j + 1][2];
                        datos[j + 1][2] = estatura;
                        
                        estado = datos[j][3];
                        datos[j][3] = datos[j + 1][3];
                        datos[j + 1][3] = estado;
                    }
                }
            }
            System.out.println("    Edad       Estatura          Nombre           Estado"
                             + "\n------------------------------------------------------------------");
            for (int h = 0; h < datos.length; h++) 
            {
                if (datos[h][3].equalsIgnoreCase("ES APTO")) 
                {
                    for (int y = 0; y < datos[h].length; y++) 
                    {
                        String cadenaEspacios = "";
                        String k = datos[h][y];
                        int es = 13 - k.length();
                        for (int p = 1; p < es; p++)
                        {
                            cadenaEspacios += " ";
                        }
                        System.out.print(datos[h][y] + cadenaEspacios+ " |   ") ;
                            
                    }
                    System.out.println("");
                }
            }
            for (int h = 0; h < datos.length; h++) 
            {
                if (datos[h][3].equalsIgnoreCase("NO ES APTO")) 
                {
                    for (int y = 0; y < datos[h].length; y++) 
                    {
                        String cadenaEspacios = "";
                        String k = datos[h][y];
                        int es = 13 - k.length();
                        for (int p = 1; p < es; p++)
                        {
                            cadenaEspacios += " ";
                        }
                        System.out.print(datos[h][y] + cadenaEspacios+ " |   ") ;
                    }
                    System.out.println("");
                }
            }
            for (int h = 0; h < datos.length; h++) 
            {
                if (datos[h][3].equalsIgnoreCase("ES MENOR DE EDAD")) 
                {
                    for (int y = 0; y < datos[h].length; y++) 
                    {
                        String cadenaEspacios = "";
                        String k = datos[h][y];
                        int es = 13 - k.length();
                        for (int p = 1; p < es; p++)
                        {
                            cadenaEspacios += " ";
                        }
                        System.out.print(datos[h][y] + cadenaEspacios+ " |   ") ;
                    }
                    System.out.println("");
                }
            }
        }
}
