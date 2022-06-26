package ExamenUnidad1_11082021;
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
        int can, c2 = 0;
        System.out.println("Cantidad de clientes que va a ingresar: ");
        can = tc.nextInt();
        do
        {
        System.out.println("Cantidad de articulos que va a ingresar: ");
        int op = tc.nextInt();
        tc.nextLine();
        String[][] codigo = new String[op][2];
        Integer[] enteros = new Integer[op];
        Double[][] numeros = new Double[op][2];
        String[] prueba = new String[op];
        double r;
        String nombre, apellido, cedula;
        int a = 0, b = 0, c = 0, d = 0;
        System.out.println("\nIngrese el nombre del cliente: ");
        nombre = tc.nextLine();
        System.out.println("Ingrese el apellido del cliente: ");
        apellido = tc.nextLine();
        System.out.println("Ingrese el numero de cedula del cliente: ");
        cedula = tc.nextLine();
        do
        {
            System.out.println("\nIngrese el codigo del " + (a+1) +"° articulo : ");
            codigo[a][d] = tc.nextLine(); d++;
            System.out.println("Ingrese el detalle del articulo: ");
            codigo[a][d] = tc.nextLine(); a++; d = 0;
            System.out.println("Ingrese la cantidad de articulos: ");
            enteros[b] = tc.nextInt(); b++;
            tc.nextLine();
            System.out.println("Ingrese el precio unitario del articulo: ");
            numeros[c][0] = tc.nextDouble(); c++;
            numeros[c-1][1] = (enteros[b-1] * numeros[c-1][0]);
            prueba[c-1] = formato.format(numeros[c-1][1]);
            tc.nextLine();
        }while (a != op);
        r = calculo(numeros, enteros);
        Op_Im.Ip(nombre, apellido, codigo, enteros, numeros, prueba, r, cedula);
        c2++;
        }while(c2 != can);
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
