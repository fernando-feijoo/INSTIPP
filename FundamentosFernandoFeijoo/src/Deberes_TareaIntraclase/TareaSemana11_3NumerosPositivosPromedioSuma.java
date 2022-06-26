package Deberes_TareaIntraclase;
/* Realizar un algoritmo que pida 3 números, verifique que sean positivos, 
luego calcule el promedio y busque el mayor de todos.*/
import java.util.Scanner;
public class TareaSemana11_3NumerosPositivosPromedioSuma 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int numero, promedio; 
        int a = 0, b = 0, c = 0;
        int contador = 1;
        int acumulador = 0;
        do{
        System.out.println("Ingrese el " + contador + "° número:");
        numero = teclado.nextInt();
        if(numero > 0)
        {
            acumulador += numero;
            contador++;
            if (contador == 1)
            {
                a = numero;
            } else if( contador == 2)
            {
                b = numero;
            } else
            {
                c = numero;
            }
        }
        }while(contador <= 3);
        contador = contador - 1;
        promedio = acumulador / contador;
        System.out.println("El promedio es: " + promedio);
        if(a > b && a > c)
        {
            System.out.println("El número mayor es: " + a);
        } else if (b > a && b > c)
        {
            System.out.println("El número mayor es: " + b);
        } else if (c > a && c > b)
        {
            System.out.println("El número mayor es: " + c);
        }
    }
}
