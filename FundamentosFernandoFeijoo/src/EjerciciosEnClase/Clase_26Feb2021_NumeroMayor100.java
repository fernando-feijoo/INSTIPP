package EjerciciosEnClase;
import java.util.Scanner;
public class Clase_26Feb2021_NumeroMayor100 {
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int dato;
        
        System.out.println("Ingrese un numero del 1 al 100");
        dato = teclado.nextInt();
        
        if (dato > 100)
        {
            System.out.println("Numero mayor a 100");
        } else 
        {
            System.out.println("Numero menor o igual a 100");
        }
    }    
}
