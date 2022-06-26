package EjerciciosEnClase;

import java.util.Scanner;

public class Clase_26Feb2021_NumeroMayor 
{
    public static void main(String[] args)
    {
    Scanner teclado = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.println("Ingrese un numero");
        a = teclado.nextInt();
        
        System.out.println("Ingrese un numero");
        b = teclado.nextInt();
        
        System.out.println("Ingrese un numero");
        c = teclado.nextInt();
        
        System.out.println(" ");
        
        if(b<a && b<c)
        {
            System.out.println(b);
            if (a<c)
            {
                System.out.println(a);
                System.out.println(c);
            } else
            {
                System.out.println(c);
                System.out.println(a);
            }    
        }
        
        if(c<a && c<b)
        {
            System.out.println(c);
            if (a<b)
            {
                System.out.println(a);
                System.out.println(b);
            } else
            {
                System.out.println(b);
                System.out.println(a);
            }    
        }
        
        if(a<b && a<c)
        {
            System.out.println(a);
            if (b<c)
            {
                System.out.println(b);
                System.out.println(c);
            } else
            {
                System.out.println(c);
                System.out.println(b);
            }    
        }
    }
}
