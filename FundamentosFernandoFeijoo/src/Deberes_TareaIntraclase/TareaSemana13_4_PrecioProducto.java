package Deberes_TareaIntraclase;
/*4)Elaborar un programa que me permita ingresar la cantidad y el precio de un 
producto sin IVA, calcular el 12% del IVA de esa compra, se hará un descuento del 5% 
cuando la compra exceda los 50$ dólares caso contrario no se realiza el descuento, 
presentar por pantalla el total a pagar.*/
import java.util.Scanner;
public class TareaSemana13_4_PrecioProducto 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int cantidad;
        double precio, iva = 1.12, descuento = 0.05, subTotal, subDescuento = 0, penTotal, total;
        do
        {
        System.out.println("Ingrese la cantidad del producto: ");
        cantidad = tc.nextInt();
        if(cantidad <= 0)
        {
            System.out.println("\nIngrese un valor mayor a 0");
        }
        }while(cantidad <= 0);
        do
        {
        System.out.println("Ingrese el precio unitario del producto: ");
        precio = tc.nextDouble();
        if(precio <= 0)
        {
            System.out.println("\nIngrese un valor mayor a 0");
        }
        }while(precio <= 0);
        subTotal = (cantidad * precio);
        if(subTotal > 50)
        {
            subDescuento = subTotal * descuento;
        }
        penTotal = (subTotal - subDescuento) * iva;
        total = Math.round(penTotal*100.00)/100.00;
        System.out.println("\nEl valor total a pagar es: $" + total);
    }
}
