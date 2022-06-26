package Deberes_TareaIntraclase;
/*Realizar un programa que lea 10 números y se le deberá 
presentar cual es el menor de esos números.*/
import java.util.Scanner;
public class TareaSemana11_10Numeros_ElMenor 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double contador, numero, numeroMenor;
        contador = 1;
        numeroMenor = 0;
        do
        {
            System.out.println("Ingrese el " + contador + "° número:");
            numero = teclado.nextDouble();
            contador++;
            if(numero <= numeroMenor)
            {
                numeroMenor = numero;
            }else if(numeroMenor == 0)
            {
                numeroMenor = numero;
            }
        
        }while(contador <=10);
        System.out.println("El número menor es: " + numeroMenor);
    }
}
