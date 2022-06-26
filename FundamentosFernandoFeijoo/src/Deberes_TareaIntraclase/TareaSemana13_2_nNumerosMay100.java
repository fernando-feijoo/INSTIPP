package Deberes_TareaIntraclase;
/*2) Desarrolla un programa que ingrese n números y finalizar cuando se halla ingresado 
un numero mayor a 100, donde se debe presentar un mensaje que diga "excedió de 100".*/
import java.util.Scanner;
public class TareaSemana13_2_nNumerosMay100 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int numero, contador = 1;
        do
        {
            System.out.print("Ingrese el " + contador + "° número:");
            numero = tc.nextInt();
            contador++;
        }while(numero <= 100);
        System.out.println("\nExcedio de 100.");
    }
}
