//Realizar un programa que permita calcular el interés de un préstamo.
package EjerciciosEnClase;
import java.util.Scanner;
public class ActividadEnClase_Semana9 {
   public static void main(String[] args){
   Scanner ingreso = new Scanner(System.in);
   double credito, interes, resultado;
   System.out.println("Ingrese el valor del credito:");
   credito = ingreso.nextDouble();
   System.out.println("Ingrese el interes del credito:");
   interes = ingreso.nextDouble();
   resultado = ((credito * interes)/100);
   System.out.println("El valor del interes es: $"+ resultado);
   }    
}
 