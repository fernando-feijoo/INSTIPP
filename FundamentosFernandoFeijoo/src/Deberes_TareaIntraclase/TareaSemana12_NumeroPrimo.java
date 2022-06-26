package Deberes_TareaIntraclase;
/*9. Leer un número por teclado y presentar por pantalla los números 
primos existentes entre el 1 y el número ingresado.*/
import java.util.Scanner;
public class TareaSemana12_NumeroPrimo 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int numero, contadorCeros, cuenta = 0;
        System.out.println("Ingrese un numero:");
        numero = tc.nextInt();
        System.out.println("");
        for(int f = 0; f <= numero; f++)
        {
        contadorCeros = 0;
        for(int cont = 1; cont <= f; cont++)
        {
            if((f % cont) == 0)
            {
                contadorCeros++;
            }
        }
        if(contadorCeros == 2)
        {
            System.out.print(f + ", ");
            cuenta++;
            if((cuenta % 20) == 0)
            {
                System.out.println("");
            }
        }
        }
        System.out.println("");
    }
}