package EjerciciosEnClase;
/*Leer un numero entero por teclado y mostrar los numeros multiplos
de 5 comprendidos desde 1 hasta el numero ingresado.*/
import java.util.Scanner;
public class Clase_08Mar2021_NumeroPorTecladoMul5 
{
    public static void main(String[] args)
    {
        int numero;
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero = tc.nextInt();
        System.out.println("");
        for (int f = 0; f <= numero; f++)
        {
            if((f % 5) == 0 && f != 0)
            {
                System.out.println(f);
            }
        }
    }
}