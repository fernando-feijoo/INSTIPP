package EjerciciosEnClase;
/*Leer un número entero y determinar si es primo.*/
import java.util.Scanner;
public class Clase12Mar2021_NumerosPrimos
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int numero, residuo = 0, contadorCeros = 0;
        System.out.println("Ingrese un numero:");
        numero = tc.nextInt();
        for(int cont = 1; cont <= numero; cont++)
        {
            residuo = numero % cont;
            if(residuo == 0)
            {
                contadorCeros++;
            }
        }
        if (contadorCeros == 2)
        {
            System.out.println("El numero ingresado es primo.");
        } else
        {
            System.out.println("No es primo.");
        }
    }
}
