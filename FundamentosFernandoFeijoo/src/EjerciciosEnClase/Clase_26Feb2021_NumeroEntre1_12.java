package EjerciciosEnClase;
import java.util.Scanner;
public class Clase_26Feb2021_NumeroEntre1_12 
{
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int mes;
        
        System.out.println("Ingrese un numero");
        mes = teclado.nextInt();
        
        if (mes == 1)
        {
            System.out.println("Enero");
        }
        if (mes == 2)
        {
            System.out.println("Febrero");
        }
        if (mes == 3)
        {
            System.out.println("Marzo");
        }
        if (mes == 4)
        {
            System.out.println("Abril");
        }
        else
        {
            if (mes == 5)
        {
            System.out.println("Mayo");
        }
        else
        {
            if (mes == 6)
        {
            System.out.println("Junio");
        }
        }
        }
    }
}
