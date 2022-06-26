package Deber_SistemaFacturar;
public class Frutas extends Vegetales
{
    public void Op_Frutas()
    {
        System.out.println("\n1.- Ingrese el nombre de la fruta: ");
        NombreProducto = tc.nextLine();
        System.out.println("2.- Ingrese la cantidad del producto: ");
        cantidad = tc.nextInt();
        System.out.println("3.- Ingrese el precio unitario del producto: ");
        precio = tc.nextDouble();
        Resultado(NombreProducto, cantidad, precio);
    }
}