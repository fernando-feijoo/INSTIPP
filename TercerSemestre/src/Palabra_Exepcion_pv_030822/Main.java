package Palabra_Exepcion_pv_030822;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Palabras palabra = new Palabras();
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        palabra.datos(tc.nextLine());
    }
}
class Palabras
{
    public void datos(String palabra)
    {
        char[] aCaracteres = palabra.toCharArray();
        try
        {
            if (aCaracteres.length <= 5) 
            {
                for (int i = 0; i < aCaracteres.length; i++) 
                {
                    System.out.println("Letra: " + aCaracteres[i]);
                }
            }else
            {
                throw new Exception( "Error más de 5 letras.");
            }
        } catch (Exception e)
        {
            System.out.println("Error en el codigo: " + e);
        }
    }
}
