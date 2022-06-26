package Deberes_TareaIntraclase;
/*7. Leer un número por teclado y presentar por pantalla la suma de 
los números múltiplos de 3 comprendidos entre el 1 y el número ingresado.*/
import java.util.Scanner;
public class TareaSemana12_SumaMul3 
{
    public static void main(String[] args)
    {
        int numero, acumulador = 0;
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        numero = tc.nextInt();
        for(int f = 0; f <= numero; f++)
        {
            if((f % 3) == 0 && f != 0)
            {
                acumulador += f;
            }
        }
        System.out.println("");
        System.out.println("La suma de los multiplos de 3 es: " + acumulador);
    }
}
