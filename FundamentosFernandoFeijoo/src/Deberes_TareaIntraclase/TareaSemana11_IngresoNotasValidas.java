package Deberes_TareaIntraclase;
/*Diseñar un algoritmo que permita ingresar n cantidad de notas validas,
sabiendo que el rango de nota valida es de 1 a 5 pts.*/
import java.util.Scanner;
public class TareaSemana11_IngresoNotasValidas 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        int nota;
        int contador = 1;
        while("s".equals(opcion) || "".equals(opcion))
        {
            System.out.println("");
            do
            {
            System.out.println("Ingrese la "+ contador + "° nota: ");
            nota = teclado.nextInt();
            if(nota <= 0 || nota >= 6)
            {
              System.out.println("Nota invalida, ingrese nota del 1 al 5.");  
            }
            }while(nota <= 0 || nota >= 6);
            System.out.println("");
            System.out.println("Desea continuar ingresando notas? s/n");
            opcion = teclado.next();
            contador++;
        }
    }
}
