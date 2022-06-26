package ActividadClase_2do_27082021_Exepciones;
import java.util.Scanner;
public class Menu
{
    Scanner tc = new Scanner(System.in);
    double valor = 0, Respuesta = 0;
    public void datos()
    {
        int c = 0, op;
        System.out.println("Cantidad de clientes que va a ingresar: ");
        int cant = tc.nextInt();
        do
        {
            System.out.println("\n*******************");
            System.out.println("| Forma de pago   |");
            System.out.println("| ----------------|");
            System.out.println("|  Contado [1]    |");
            System.out.println("|  Tarjeta [2]    |");
            System.out.println("|  Salir   [3]    |");
            System.out.println("*******************");
            op = tc.nextInt();
            switch (op) 
            {
                case 1:
                    Contado ct = new Contado();
                    ct.contado();
                    break;
                case 2:
                    Credito cr = new Credito();
                    cr.credito();
                    break;
                case 3:
                    System.out.println("\n\nGracias por usar nuestro sistema. :)\n");
                    break;
            }
            c++;
        }while(c != cant);
        c = 0;
        System.out.println("\n\nCantidad de clientes que va a ingresar: ");
        cant = tc.nextInt();
        tc.nextLine();
        do
        {
            op = 2;
            System.out.println("\nIngrese el día de la compra: ");
            String dia = tc.nextLine();
            if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("viernes")) 
            {
                op = 1;
            }
            switch (op)
            {
                case 1:
                    Contado ct = new Contado();
                    ct.contado2();
                    break;
                case 2:
                    Credito cr = new Credito();
                    cr.credito2();
                    break;
                case 3:
                    System.out.println("\n\nGracias por usar nuestro sistema. :)\n");
                    break;
            }
            c++;
        }while(c != cant);
    }
}