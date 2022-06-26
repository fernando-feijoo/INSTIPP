package EjerciciosEnClase;
/*Leer dos numeros ymostrar todos los enteros comprendidos entre ellos*/
import java.util.Scanner;
public class Clase_08Mar2021_NumEnterosMostrar 
{
    public static void main(String[] args)
    {
        int valorInicial, valorFinal;
        Scanner tc = new Scanner(System.in);
        
        System.out.println("ingrese el valor inicial:");
        valorInicial = tc.nextInt();
        System.out.println("ingrese el valor final:");
        valorFinal = tc.nextInt();
        
        for (int f = valorInicial; f <= valorFinal; f++)
        {
            System.out.println(f);
        }
    }
}
