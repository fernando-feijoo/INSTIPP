package Deber_SistemaFacturar;
public class Electrodomesticos extends Frutas
{
    public void Op_Electrodomesticos()
    {
        System.out.println("\n1.- Ingrese el nombre del electrodomestico: ");
        NombreProducto = tc.nextLine();
        System.out.println("2.- Ingrese la cantidad del producto: ");
        cantidad = tc.nextInt();
        System.out.println("3.- Ingrese el precio unitario del electrodomestico: ");
        precio = tc.nextDouble();
        Resultado(NombreProducto, cantidad, precio);
    }
}