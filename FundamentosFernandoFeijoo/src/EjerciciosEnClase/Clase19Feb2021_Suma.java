package EjerciciosEnClase;
import java.util.Scanner;
public class Clase19Feb2021_Suma{

    public static void main(String[] args) {
        int numero1, numero2, respuesta;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero:");
        numero1 = teclado.nextInt();
        
        System.out.println("Ingrese otro numero:");
        numero2 = teclado.nextInt();
        
       
        respuesta = numero1 + numero2;
        System.out.println("Respuesta " + respuesta);
        
    }
    
}