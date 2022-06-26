
package Practicas_Personales;
import java.util.Scanner;
public class NumeroTresCifras_Mayor500 
{
    public static void main(String[] args)
    {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número:");
        numero = teclado.nextInt();
        if (numero >= 100 && numero <=500)
        {
            System.out.println("Su número de tres cifras es: " + numero);
        }else if (numero < 100)
        {
            System.out.println("Su número es menor que 100: " + numero);
        }else
        {
            System.out.println("Su número es mayor que 500: " + numero);
        }
    }
}
