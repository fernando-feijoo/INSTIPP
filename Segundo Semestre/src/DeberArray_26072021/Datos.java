package DeberArray_26072021;
import java.util.Scanner;
public class Datos 
{
    public void Ingreso()
    {
        Scanner tc = new Scanner(System.in);
        int contador = 0, auxiliarNumero, validador = 0;
        System.out.println("=====================================================================");
        System.out.println("Cantidad de personas que desea ingresar: Minimo 2, para completar 10.");
        int opcion = tc.nextInt();
        System.out.println("=====================================================================");
        String [] AuxNombres = new String [3];
        Integer [] edades = DatosEdades(opcion);
        String [] nombres = DatosNombres(opcion);
        while (validador != opcion)
        {
            for(int fil = 0; fil < edades.length; fil++)
            {
                if (edades[fil] == null )
                {
                    contador = fil;
                    break;
                }
            }
            System.out.println("\nIngrese el nombre del usuario N°" + (contador + 1) + " :");
            nombres[contador * 3] = tc.next();
            System.out.println("Ingrese el apellido del usuario N°" + (contador + 1) + " :");
            nombres[(contador * 3) + 1] = tc.next();
            System.out.println("Ingrese la ciudad de " + nombres[contador * 3] + " " + nombres[(contador * 3) + 1] + " :");
            nombres[(contador * 3) + 2] = tc.next();
            System.out.println("Ingrese la edad de " + nombres[contador * 3] + " " + nombres[(contador * 3) + 1] + " :");
            edades[contador] = tc.nextInt();
            tc.nextLine();
            contador++; validador++;
        }
        for (int x = 0; x < edades.length; x++)
        { 
            for (int j = 0; j < edades.length - 1; j++) 
            { 
                if (edades[j] < edades[j + 1]) 
                { 
                    auxiliarNumero = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = auxiliarNumero;
                    for (int z = 0; z < 3; z++)
                    {
                        AuxNombres[z] = nombres[(j * 3) + z];
                        nombres[(j * 3) + z] = nombres[((j * 3)+3) + z];
                        nombres[((j * 3)+3) + z] = AuxNombres[z];
                    }
                }
            } 
        }
        contador = 0;
        System.out.println("N°    Nombre      Apellido    Ciudad      Edad");
        System.out.println("________________________________________________");
        for (int i = 0; i < (nombres.length/3); i++)
        {
            System.out.print((i+1) + ".-   ");
            
            for (int g = contador; g < (contador+3); g++) 
            {
                String cadenaEspacios = "";
                int es = 13 - nombres[g].length();
                for (int p = 1; p < es; p++) 
                {
                    cadenaEspacios += " ";
                }
                System.out.print(nombres[g] + cadenaEspacios);
            }
            System.out.print(edades[i] + "\n");
            contador+=3;
        }
    }
    public static String[] DatosNombres(int opcion)
    {
        String [] DatosPrecargados = new String[(8*3)+(opcion*3)];
        DatosPrecargados[0] = "Juan";
        DatosPrecargados[1] = "Fernandez";
        DatosPrecargados[2] = "Machala";
        //12
        DatosPrecargados[3] = "Fernando";
        DatosPrecargados[4] = "Feijoo";
        DatosPrecargados[5] = "Pasaje";
        //18
        DatosPrecargados[6] = "Dicxon";
        DatosPrecargados[7] = "Matamoros";
        DatosPrecargados[8] = "Piñas";
        //25
        DatosPrecargados[9] = "Angie";
        DatosPrecargados[10] = "Pesantez";
        DatosPrecargados[11] = "Pasaje";
        //15
        DatosPrecargados[12] = "Elena";
        DatosPrecargados[13] = "Morales";
        DatosPrecargados[14] = "Quito";
        //10
        DatosPrecargados[15] = "Lautaro";
        DatosPrecargados[16] = "Reyes";
        DatosPrecargados[17] = "Cuenca";
        //32
        DatosPrecargados[18] = "Jasmin";
        DatosPrecargados[19] = "Suarez";
        DatosPrecargados[20] = "Guayaquil";
        //30
        DatosPrecargados[21] = "Fabian";
        DatosPrecargados[22] = "Gallardo";
        DatosPrecargados[23] = "Esmeraldas";
        //45
        return DatosPrecargados;
    }
    public static Integer[] DatosEdades (int opcion)
    {
        Integer [] EdadesPrecargadas = new Integer[8+opcion];
        EdadesPrecargadas[0] = 12;
        EdadesPrecargadas[1] = 18;
        EdadesPrecargadas[2] = 25;
        EdadesPrecargadas[3] = 15;
        EdadesPrecargadas[4] = 10;
        EdadesPrecargadas[5] = 32;
        EdadesPrecargadas[6] = 30;
        EdadesPrecargadas[7] = 45;
        
        return EdadesPrecargadas;
    }
}