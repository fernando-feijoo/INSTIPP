package EjerciciosEnClase;
import java.util.Scanner;
public class Clase19Feb2021_PromedioTresNotas 
{
    public static void main (String[] args)
    {
        double nota1, nota2, nota3, suma, promedio;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la primera nota:");
        nota1 = teclado.nextDouble();
        
        System.out.println("Ingrese la segunda nota:");
        nota2 = teclado.nextDouble();
        
        System.out.println("Ingrese la tercera nota:");
        nota3 = teclado.nextDouble();
        
        suma = nota1 + nota2 + nota3;
        
        promedio = suma / 3;
        
        System.out.println("La nota final es: " + promedio);
        
    }  
    
}
