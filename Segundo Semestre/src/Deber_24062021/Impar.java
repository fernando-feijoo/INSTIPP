package Deber_24062021;
import java.util.Scanner;
public class Impar 
{
    public void NumImpar()
    {
        Scanner tc = new Scanner(System.in);
        int num, conteo = 0;
        System.out.print("Ingrese la cantidad de numeros impares que desee ver: ");
        num = tc.nextInt();
        for (int i = 1; i <= (num * 2); i+=2) 
        {
            if ((conteo % 10) == 0) 
            {
                System.out.println("");
            }
            System.out.print("[" + i + "]");
            conteo++;
        }
        System.out.println("");
    }
}
