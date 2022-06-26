package ClaseInstanciar_23062021;
import java.util.Scanner;
public class Menu 
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
                    Sumar Rsuma = new Sumar(c, d);
                    break;
                case 2:
                    Restar Rresta = new Restar(c, d);
                    break;
                case 3:
                    Multiplicar Rmultiplicar = new Multiplicar(c, d);
                    break;
                case 4:
                    Dividir Rdividir = new Dividir(c, d);
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
