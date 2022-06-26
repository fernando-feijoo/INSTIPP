package ActividadClase_23072021;
import java.util.Scanner;
import java.text.DecimalFormat;
public class articulos
{
    public void datos()
    {
        Scanner tc = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.00");
        System.out.println("¿Cuantos articulos va a ingresar? :");
        int opcion = tc.nextInt();
        int acumulador = 0, puntero;
        double total = 0;
        String [] nombres = new String[2];
        String [] articulo = new String[opcion];
        double [] valores = new double[opcion*3];
        System.out.println("Ingrese el nombre del cliente: ");
        nombres[0] = tc.next();
        System.out.println("Ingrese el apellido del cliente: ");
        nombres[1] = tc.next();
        System.out.println("\n########| ARTICULOS |########");
        for (int i = 0; i < articulo.length; i++) 
        {
            puntero = 0;
            System.out.println("Ingrese el nombre del articulo: ");
            articulo[i] = tc.next();
            System.out.println("Ingrese la cantidad de "+ articulo[i] + ": ");
            valores[puntero+acumulador] = tc.nextDouble(); puntero++;
            System.out.println("Ingrese el precio unitario: ");
            valores[puntero+acumulador] = tc.nextDouble(); puntero++;
            valores[puntero+acumulador] = valores[(puntero+acumulador)-1] * valores[(puntero + acumulador)-2];
            acumulador += 3;
            System.out.println("");
        }
        acumulador = 0;
        System.out.println("\n\nEl cliente " + nombres[0] + " " + nombres[1] + " compro:");
        for (int x = 0; x < articulo.length; x++) 
        {
            System.out.println("El articulo vendido: " + articulo[x]
                             + " El costo: $ " + valores[acumulador+1]
                             + " El Sub total: $ " + (valores[acumulador+2]));
            acumulador += 3;
        }
        for (int y = 2; y < opcion*3; y+=3) 
        {
            total += valores[y];
        }
        System.out.println("\n------------------------------");
        System.out.println("El total a pagar es : $ " + formato.format(total * 1.12));
        System.out.println("\nGracias por usar nuestro sistema.");
    }
}