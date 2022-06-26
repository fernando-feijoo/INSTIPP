package Deberes_TareaIntraclase;
/*6. Leer un número por teclado y presentar por pantalla los números
múltiplos de 5 comprendidos entre el 1 y el número ingresado.*/
import java.util.Scanner;
public class TareaSemana12_Mult5Entre1 
{
    public static void main(String[] args)
    {
    int numero;
    Scanner tc = new Scanner(System.in);
    System.out.println("Ingrese un numero:");
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
