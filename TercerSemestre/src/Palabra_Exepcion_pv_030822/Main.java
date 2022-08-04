package Palabra_Exepcion_pv_030822;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Palabras palabra = new Palabras();
        Scanner tc = new Scanner(System.in);
        palabra.datos(tc.nextLine());
    }
}
class Palabras
{
    public void datos(String palabra)
    {
        char[] aCaracteres = palabra.toCharArray();
        for (int i = 0; i < 4; i++) 
        {
            System.out.println("ingreso");
            if (palabra.length() == 4) 
            {
                System.out.println("La palabra es: " + palabra);
            }
        }
    }
}
