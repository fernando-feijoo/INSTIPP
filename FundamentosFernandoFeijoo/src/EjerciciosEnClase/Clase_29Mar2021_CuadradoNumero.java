package EjerciciosEnClase;
import java.util.Scanner;
import java.util.Random;
public class Clase_29Mar2021_CuadradoNumero 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        Random aleatorio = new Random();
        double base, exponente, respuesta;
        System.out.println("Ingrese la base");
        base = 10;//tc.nextDouble();
        exponente = 2;
        respuesta = Math.pow(base, exponente);
        System.out.println("El resultado es " + respuesta);
        
        //-----------------------------------------------------
        double numero;
        System.out.println("Ingrese un numero para calcular la raiz");
        numero = 9; //tc.nextDouble();
        System.out.println("La raiz cuadrada es " + Math.sqrt(numero));
        
        //------------------------------
        double nota = 6.99;
        System.out.println("La nota final es " + Math.round(nota));
        
        //---------------------------
        System.out.println("numero random " + Math.random());
        
        //-----------------------
        int r;
        r = aleatorio.nextInt(20);
        System.out.println("Aleatorio " + r);
    }
}
