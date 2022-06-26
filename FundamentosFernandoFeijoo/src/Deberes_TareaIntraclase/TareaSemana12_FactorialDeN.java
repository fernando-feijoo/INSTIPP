package Deberes_TareaIntraclase;
/*8. Leer por teclado un número entero N no negativo y mostrar 
el factorial de todos los números desde 1 hasta N.*/
import java.util.Scanner;
public class TareaSemana12_FactorialDeN 
{
    public static void main(String[] args)
    {
        int numero;
        double calculo = 1, contador = 0;
        Scanner tc = new Scanner(System.in);
        do
        {
        System.out.println("Ingrese un numero positivo:");
        numero = tc.nextInt();
        }while(numero <= 0);
        for(int f = 0; f <= numero; f++)
        {
            System.out.println("");
            calculo = 1;
            if(f != 0)
            {
            do
            {
            contador++;
            calculo *= contador;
            }while(contador < f);
            System.out.println(f +"!" + " = " + calculo);
            contador = 0;
            }
        }
    }
}
