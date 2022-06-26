package Personal;
/*Hacer un programa que calcule el factorial de un número ingresado por teclado.*/
import java.util.Scanner;
public class TareaSemana11_NumeroFactorial
{
    public static void main(String[] args)
    {
        int numero;
        int contador = 0;
        int calculo = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número a factorear: ");
        numero = teclado.nextInt();
        do
        {
            contador++;
            calculo *= contador;
        } while (contador < numero);
        System.out.println("El resultado es: " + calculo);
    }
}
