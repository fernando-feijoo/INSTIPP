package FuncionesMetodos;
import java.util.Scanner;
public class FuncionOperaciones 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.println("Ingrese un numero:");
        numero1 = tc.nextInt();
        System.out.println("Ingrese otro numero:");
        numero2 = tc.nextInt();
        
        resultado = operacionSuma(numero1, numero2);
        
        System.out.println("La suma es " + resultado);
        System.out.println("La resta es " + operacionResta(numero1, numero2));
    }
    public static int operacionSuma(int n1, int n2)
    {
        int suma;
        suma = n1 + n2;
        return suma;
    }
    
    public static int operacionResta(int x, int y)
    {
        int resta;
        resta = x - y;
        return resta;
    }
}
