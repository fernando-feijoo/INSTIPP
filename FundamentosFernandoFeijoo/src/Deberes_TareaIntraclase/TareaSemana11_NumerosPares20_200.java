package Deberes_TareaIntraclase;
/*Hacer un programa que calcule la suma y el producto de los números 
pares comprendidos entre 20 y 200 ambos inclusive.*/
public class TareaSemana11_NumerosPares20_200
{
    public static void main(String[] args)
    {
        int numero = 20;
        int suma = 0;
        double producto = 1;
        while (numero <= 200)
        {
        if ((numero % 2) == 0)
        {
            producto = producto * numero;
            suma += numero;
        }
        numero++;
        }
        System.out.println("La suma de los números pares imgresados es: " + suma);
        System.out.println("El producto de los números pares imgresados es: " + producto);
    }
}

/**
package Deberes_TareaIntraclase;
NO ESTOY SEGURO AUN
Hacer un programa que calcule la suma y el producto de los números 
pares comprendidos entre 20 y 200 ambos inclusive.
import java.util.Scanner;
public class TareaSemana11_NumerosPares20_200 
{
    public static void main(String[] args)
    {
        int numero;
        int resultadoSuma = 0;
        int resultadoProducto = 0;
        String opcion = "";
        Scanner teclado = new Scanner(System.in);
        while ("si".equals(opcion) || "s".equals(opcion) || "".equals(opcion))
        {
        System.out.println("Ingrese un número: ");
        numero = teclado.nextInt();
        System.out.println("\n");
        System.out.println("Desea continuar? s/n");
        opcion = teclado.next();
        if ((numero % 2) == 0 && numero >=20 && numero <= 200)
        {
            resultadoProducto = resultadoSuma * numero;
            resultadoSuma += numero;
        }
        }
        System.out.println("\n");
        System.out.println("La sum de los números pares imgresados es: " + resultadoSuma);
        System.out.println("El producto de los números pares imgresados es: " + resultadoProducto);   
    }
} */