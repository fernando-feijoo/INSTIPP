package FuncionesMetodos;
import java.util.Scanner;
public class Principal 
{
    public static void main(String[] args)
    {
        procesoSuma();
    }
    
    public static void procesoSuma()
    {
        Scanner tc = new Scanner(System.in);
        int numero1, numero2, suma;
        System.out.println("Ingrese un numero:");
        numero1 = tc.nextInt();
        System.out.println("Ingrese otro numero:");
        numero2 = tc.nextInt();
        suma = numero1 + numero2;
        System.out.println("La suma es " + suma);
    }
}
