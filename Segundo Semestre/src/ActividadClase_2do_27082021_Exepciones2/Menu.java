package ActividadClase_2do_27082021_Exepciones2;
/*Se desea un programa para ingresar por teclado el monto de compra y el día de 
la semana; si el día es lunes o viernes, se realizará un descuento del 12% por 
la compra. Visualizar el descuento y el total a pagar por la compra. */
import java.util.Scanner;
public class Menu
{
    Scanner tc = new Scanner(System.in);
    double valor = 0, Respuesta = 0;
    String dia;
    public void datos()
    {
        int c = 0, op;
        System.out.println("Cantidad de clientes que va a ingresar: ");
        int cant = tc.nextInt();
        tc.nextLine();
        do
        {
            op = 2;
            System.out.println("\nIngrese el día de la compra: ");
            String dia = tc.nextLine();
            if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") || dia.equalsIgnoreCase("miercoles")
                                     || dia.equalsIgnoreCase("jueves") || dia.equalsIgnoreCase("viernes")) 
            {
                op = 1;
            }
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
    }
}
