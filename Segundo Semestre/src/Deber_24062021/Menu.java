package Deber_24062021;
import java.util.Scanner;
public class Menu 
{
    public void Op_Menu()
    {
        Scanner tc = new Scanner(System.in);
        Par Op_par = new Par();
        Impar Op_impar = new Impar();
        Primos Op_primos = new Primos();
        Fibonacci Op_fibonacci = new Fibonacci();
        int Op;
        do
        {
        System.out.println("\n%%%%%%%%%%| INGRESE UNA OPCION |%%%%%%%%%%\n"
                         + "    Numeros pares       [1]\n"
                         + "    Numeros impares     [2]\n"
                         + "    Numeros primos      [3]\n"
                         + "    Numeros fibonacci   [4]\n"
                         + "    Salir               [5]");
        Op = tc.nextInt();
        switch (Op) {
            case 1:
                Op_par.NumPar();
                break;
            case 2:
                Op_impar.NumImpar();
                break;
            case 3:
                Op_primos.NumPrimos();
                break;
            case 4:
                Op_fibonacci.NumFibonacci();
                break;
            case 5:
                System.out.println("\nGracias por usar nuestro sistema.\n");
                break;
            default:
                System.out.println("\nIngrese una opcion correcta.\n");
        }
        }while(Op != 5);
    }
}
