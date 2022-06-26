package PracticaClase_30072021;
import java.util.Scanner;
public class Datos 
{
    public void aspirantes()
    {
        Scanner tc = new Scanner(System.in);
        System.out.println("¿Cuantos aspirantes van a ingresar?");
        int opcion = tc.nextInt();
        tc.nextLine();
        String[][] texto = new String[opcion][6];
        String[] datos = new String[]{"el nombre:", "el apellido:", "la edad:", "la estatura:", "la ciudad:"};
        int c3 = 0;
        for (int i = 0; i < texto.length; i++) 
        {
            System.out.println("");
            for (int j = 0; j < texto[i].length-1; j++) 
            {
                System.out.println("Ingrese " + datos[j]);
                texto[i][j] = tc.nextLine();
                c3++;
                if(c3 == 5)
                {
                    if(Integer.parseInt(texto[i][2]) >= 18 && Integer.parseInt(texto[i][2]) <= 35 && Double.parseDouble(texto[i][3]) >= 1.70)
                    {
                        texto[i][5] = "Aprobado";
                        c3 = 0;
                    } else
                    {
                        texto[i][5] = "No Aprobado";
                        c3 = 0;
                    }
                }
            }
        }
        System.out.println("\n\nNombre      Apellido    Resultado"
                         + "\n--------------------------------");
        for (int z = 0; z < texto.length; z++) 
        {
            if(texto[z][5].equals("Aprobado"))
            {
                imprimir(z, texto);
            }
        }
        for (int t = 0; t < texto.length; t++) 
        {
            if(texto[t][5].equals("No Aprobado"))
            {
                imprimir(t, texto);
            }
        }
    }
    public void imprimir(int z, String [][] texto)
    {
        int c = 0;
        for (int r = 0; r < 3; r++)
        {
            String cadenaEspacios = "";
            int es = 13 - texto[z][r+c].length();
            for (int p = 1; p < es; p++)
            {
                cadenaEspacios += " ";
            }
            System.out.print(texto[z][r+c] + cadenaEspacios) ;
            if (r == 1) 
            {
                c = 3;
            }
        }
        System.out.println("");
    }
}