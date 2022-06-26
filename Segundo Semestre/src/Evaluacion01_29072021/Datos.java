package Evaluacion01_29072021;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;
public class Datos 
{
    DecimalFormat formato = new DecimalFormat("#0.00");
    public void Ingresos()
    {
        Scanner tc = new Scanner(System.in);
        Impresion Op_Im = new Impresion();
        String[] codigo = new String[5];
        Integer[] enteros = new Integer[5];
        Double[][] numeros = new Double[5][2];
        String[] prueba = new String[5];
        double r;
        String nombre, apellido;
        int a = 0, b = 0, c = 0;
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = tc.nextLine();
        System.out.println("Ingrese el apellido del cliente: ");
        apellido = tc.nextLine();
        do
        {
        System.out.println("\nIngrese el codigo del " + (a+1) +"° articulo : ");
        codigo[a] = tc.nextLine(); a++;
        System.out.println("Ingrese la cantidad de articulos: ");
        enteros[b] = tc.nextInt(); b++;
        tc.nextLine();
        System.out.println("Ingrese el precio unitario del articulo: ");
        numeros[c][0] = tc.nextDouble(); c++;
        numeros[c-1][1] = (enteros[b-1] * numeros[c-1][0]);
        prueba[c-1] = formato.format(numeros[c-1][1]);
        tc.nextLine();
        }while (a != 5);
        r = calculo(numeros, enteros);
        Op_Im.Ip(nombre, apellido, codigo, enteros, numeros, prueba, r);
    }
    Double calculo(Double[][] a, Integer[] b)
    {
        double respuesta = 0;
        for (int i = 0; i < a.length; i++) 
        {
            respuesta += (b[i] * a[i][0]);
        }
        return respuesta;
    }
    public static String fechaActual()
    {
        Date fechaCorrecta = new Date();       
        String strDateFormat = "dd-MMM-yyyy"; 
        SimpleDateFormat objSDF  = new SimpleDateFormat(strDateFormat);
        return (objSDF.format(fechaCorrecta));
    }
}
