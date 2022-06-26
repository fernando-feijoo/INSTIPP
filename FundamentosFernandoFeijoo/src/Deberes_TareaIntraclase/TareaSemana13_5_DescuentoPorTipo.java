package Deberes_TareaIntraclase;
/*5)La empresa ABC requiere determinar que descuento aplicar a un cliente, para lo 
cual se debe tomar en cuenta lo siguiente: Un cliente de tipo A, se le hace un 
descuento del 30%; a un cliente de tipo B, se le hace un descuento de 20%; mientras 
que aun cliente de tipo C, se le hace un descuento del 10%. En caso de no pertenecer 
a ninguno de estos grupos, no se le aplica descuento. Presentar por pantalla el 
descuento realizado y el valor a pagar.*/
import java.util.Scanner;
public class TareaSemana13_5_DescuentoPorTipo 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int tipo;
        double valor, subTotal, total, iva = 1.12, descuentoA = 0.3, descuentoB = 0.2, descuentoC = 0.1;
        double calculo1, calculo = 0;
        System.out.println("Ingrese el valor a cobrar: ");
        valor = tc.nextDouble();
        if(valor !=0 && valor > 0)
        {
        tc.nextLine();
        do{
        System.out.println("Ingrese el tipo de cliente que es: \n[A = 1] : [B = 2] : [C = 3] : [Otro = 4]");
        tipo = tc.nextInt();
        if(tipo < 1 || tipo > 4)
        {
            System.out.println("Ingrese un valor correcto.\n");
        }
        }while(tipo < 1 || tipo > 4);
        if(tipo == 1)
        {
            calculo1 = valor * descuentoA;
            calculo = Math.round(calculo1 * 100.0)/100.0;
        } else if(tipo == 2)
        {
            calculo1 = valor * descuentoB;
            calculo = Math.round(calculo1 * 100.0)/100.0;
        } else if(tipo == 3)
        {
            calculo1 = valor * descuentoC;
            calculo = Math.round(calculo1 * 100.0)/100.0;
        }
        subTotal = (valor - calculo) * iva;
        total = Math.round(subTotal*100.00)/100.00;
        System.out.println("\nEl descuento realizado fue de: $" + calculo);
        System.out.println("El valor a pagar es de: $" + total);
        }else
        {
            System.out.println("No hay valor a cobrar o es negativo. \nRevisar.");
        }
    }
}
