package Deberes_TareaIntraclase;
/*4. Leer un número por teclado y presentar los diez números posteriores consecutivos.*/
import java.util.Scanner;
public class TareaSemana12_10PostConsecutivos 
{
    public static void main(String[] args)
    {
        int numero;
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero = tc.nextInt();
        System.out.println("");
        for(int f = (numero + 1); f <= (numero + 10) ; f++)
        {
            System.out.println(f);
        }
    }
}
