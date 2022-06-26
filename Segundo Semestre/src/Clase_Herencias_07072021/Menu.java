package Clase_Herencias_07072021;
import java.util.Scanner;
public class Menu extends Dividir 
{
    public  Menu()
    {
        EMenu();
    }
    public void EMenu()
    {
        Scanner tc = new Scanner(System.in);
        int opcion;
        double c = 0, d = 0;
        do
        {
            System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$| Ingrese una opcion |$$$$$$$");
            System.out.println("$$$$$$$|                    |$$$$$$$");
            System.out.println("$$$$$$$|   Sumar       [1]  |$$$$$$$");
            System.out.println("$$$$$$$|   Restar      [2]  |$$$$$$$");
            System.out.println("$$$$$$$|   Multiplicar [3]  |$$$$$$$");
            System.out.println("$$$$$$$|   Dividir     [4]  |$$$$$$$");
            System.out.println("$$$$$$$|   Salir       [5]  |$$$$$$$");
            System.out.println("$$$$$$$|                    |$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
            opcion = tc.nextInt();
            if(opcion < 5 && opcion > 0)
            {
                System.out.println("Ingrese el primer numero: ");
                c = tc.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                d = tc.nextDouble();
            }
            switch (opcion) 
            {
                case 1:
                    Op_Sumar(c, d);
                    break;
                case 2:
                    Op_Restar(c, d);
                    break;
                case 3:
                    Op_Multiplicar(c, d);
                    break;
                case 4:
                    Op_Dividir(c, d);
                    break;
                case 5:
                    System.out.println("\nGracias por usar nuestro sistema.\n");
                    break;
                default:
                    System.out.println("\nOpción incorrecta... \n");
            }
        }while(opcion != 5);
        }
}
