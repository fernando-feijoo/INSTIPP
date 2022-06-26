package EjerciciosEnClase;
/*Realice un programa que permita ingresar un numero, ese será 
el numero de la tabla de multiplicar que deberá presentarme.*/
import java.util.Scanner;
public class Clase12Mar2021_TablaMultiplicarFor 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero para hacer tabla de multiplicar: ");
        numero = tc.nextInt();
        if(numero != 0)
        {
        for(int f = 1; f <= 12; f++)
        {
            System.out.println(numero + " x " + f + " = " + (f * numero));
        }
        }else
        {
            System.out.println("No se puede multiplicar, es 0 todos los resultados.");
        }
    }
}
