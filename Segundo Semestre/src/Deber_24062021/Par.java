package Deber_24062021;
import java.util.Scanner;
public class Par 
{
    public void NumPar()
    {
        Scanner tc = new Scanner(System.in);
        int num, conteo=0;
        System.out.print("Ingrese la cantidad de numeros pares que desee ver: ");
        num = tc.nextInt();
        for (int i = 2; i <= (num * 2); i+=2) 
        {
            if ((i % 2) == 0) 
            {
                if ((conteo % 10) == 0) 
                {
                    System.out.println("");
                }
                System.out.print("[" + i + "]");
                conteo++;
            }
        }
        System.out.println("");
    }
}
