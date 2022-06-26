package Deberes_TareaIntraclase;
/*Hacer un programa que de vueltas y en cada vuelta realice las potencias de 5, 
en cada vuelta se pide al usuario si desea continuar (1 para continuar) (0 para finalizar). */
import java.util.Scanner;
public class TareaSemana11_PotenciaDe5 
{
    public static void main(String[] args)
    {
        int opcion;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        do
        {
            System.out.println("\n");
            System.out.println("El resultado de la potencia es: " + Math.pow(5, contador));
            System.out.println("\n");
            System.out.println("Desea continuar? \n1 = Si o 2 = No.");
            opcion = teclado.nextInt();
            contador++;
        }while(opcion == 1);
    }
}
