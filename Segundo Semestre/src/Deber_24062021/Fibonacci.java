package Deber_24062021;
import java.util.Scanner;
public class Fibonacci 
{
    public void NumFibonacci()
    {
        Scanner tc = new Scanner(System.in);
        int numero, antecesor = 0, sucesor = 1, variable;
        System.out.print("Ingrese la cantidad de numeros fibonacci que desee ver: ");
        numero = tc.nextInt();
        for (int i = 1; i <= numero; i++) 
        {
            variable = antecesor;
            antecesor = sucesor + antecesor;
            sucesor = variable;
            if(((i - 1) % 10) == 0)
            {
                System.out.println("");
            }
            System.out.print("[" + sucesor + "]");
        }
        System.out.println("");
    }
}
