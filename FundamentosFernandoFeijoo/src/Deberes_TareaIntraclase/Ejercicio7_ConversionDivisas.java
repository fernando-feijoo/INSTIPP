package Deberes_TareaIntraclase;
import java.util.Scanner;
public class Ejercicio7_ConversionDivisas {
/*Realizar un programa que convierta de dólares a soles y soles a dólares mostrándole un
menú en la cual el usuario elijará cuál de estas dos desea. presentar la conversión por
pantalla.*/
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1.- Convertir de Dolares a Soles Peruanos.");
        System.out.println("2.- Convertir de Soles Peruanos a Dolares.");
        int opcion = teclado.nextInt();
        double moneda, resultado;
        switch(opcion)
        {
            case 1:
                System.out.println("Ingrese cantidad a convertir de Dolares a Soles Peruanos:");
                moneda = teclado.nextDouble();
                resultado = moneda * 3.65;
                System.out.println("El resultado es: "+ resultado);
            break;
            case 2:
                System.out.println("Ingrese cantidad a convertir de Soles Peruanos a Dolares:");
                moneda = teclado.nextDouble();
                resultado = moneda * 0.2739;
                System.out.println("El resultado es: "+ resultado);
            break;
            default:
                System.out.println("Error de opcion elegida.");
        }
    }
}
