package EjerciciosEnClase;

import java.util.Scanner;


public class Clase19Feb2021_NumeroAlCuadrado {
    
    public static void main (String[] args){
        
        Scanner ingreso = new Scanner (System.in);
        
        int numero1, numero2, cuadrado1, cuadrado2;
        
        System.out.println("Ingrese el primer numero");
        numero1 = ingreso.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        numero2 = ingreso.nextInt();
        
        cuadrado1 = numero1 * numero1;
        
        cuadrado2 = numero2 * numero2;
        
        System.out.println("El cuadrado del primer numero es: " + cuadrado1);
        
        System.out.println("El cuadrado del segundo numero es: " + cuadrado2);
   
    }  
    
}
