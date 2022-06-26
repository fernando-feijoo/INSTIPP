package Deberes_TareaIntraclase;
/*Presentar la tabla de multiplicar dependiendo del número que ingrese el usuario.*/
import java.util.Scanner;
public class TareaSemana11_TablaMultiplicar 
{
    public static void main(String[] args)
    {
        int numero, hasta;
        int contador = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de la tabla que desea: ");
        numero = teclado.nextInt();
        System.out.println("Ingrese hasta que número desea multiplicar:");
        hasta = teclado.nextInt();
        System.out.println("\n");
        while (hasta != (contador-1))
        {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }
        System.out.println("\n");
    }
}
