package Practicas_Personales;
import java.util.Scanner;
public class PromedioDeNotas {
    public static void main(String[] args)
    {
        double calculo = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la calificación #1:");
        double notaUno = teclado.nextDouble();
        System.out.println("Ingrese la calificación #2:");
        double notaDos = teclado.nextDouble();
        System.out.println("Ingrese la calificación #3:");
        double notaTres = teclado.nextDouble();
        if (notaUno < notaDos && notaUno < notaTres)
        {
            System.out.println("La nota #1 es la menor con: " + notaUno);
            calculo = (notaDos + notaTres)/2;
        }else if(notaDos < notaUno && notaDos < notaTres)
        {
            System.out.println("La nota #2 es la menor con: " + notaDos);
            calculo = (notaUno + notaTres)/2;
        }else if(notaTres < notaUno && notaTres < notaUno)
        {
            System.out.println("La nota #3 es la menor con: " + notaTres);
            calculo = (notaUno + notaDos)/2;
        }
        System.out.println("El promedio de las dos mejores notas es: " + calculo);
    }
}