package Deberes_TareaIntraclase;
/*Realizar un programa que lea 10 números y se le deberá 
presentar cual es el mayor de esos números.*/
import java.util.Scanner;
public class TareaSemana11_10Numeros_ElMayor 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double contador, numero, numeroMayor, puntoPartida, ceros;
        contador = 1;
        puntoPartida = 0;
        numeroMayor = 0;
        ceros = 0;
        do
        {
            System.out.println("Ingrese el " + contador + "° número:");
            numero = teclado.nextDouble();
            contador++;
            if(numero > puntoPartida && numero > numeroMayor)
            {
                numeroMayor = numero;
            } else if(numeroMayor <= numero || ceros == numeroMayor)
            {
                numeroMayor = numero;
                ceros = 0.0000001;
            }
        }while(contador <=10);
        System.out.println("El número mayor es: " + numeroMayor);
    }
}
