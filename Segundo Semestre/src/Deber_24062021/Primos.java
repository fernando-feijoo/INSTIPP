package Deber_24062021;
import java.util.Scanner;
public class Primos 
{
    public void NumPrimos()
    {
        Scanner tc = new Scanner(System.in);
        int numero, contadorCeros, cuenta = 0, f = 0;
        System.out.print("Ingrese la cantidad de numeros primos que desee ver: ");
        numero = tc.nextInt();
        System.out.println("");
        do 
        {            
        f++;
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
            System.out.print("[" + f + "]");
            cuenta++;
            if((cuenta % 10) == 0)
            {
                System.out.println("");
            }
        }
        } while (cuenta != numero);
        System.out.println("");
    }
}
