package Deberes_TareaIntraclase;
/*6) Una empresa desea calcular el rol de pagos de sus trabajadores. Existen dos 
tipos. Tipo “A”: son lo que dedican a mantenimiento y limpieza; ellos ganan $12 
dólares la hora. Tipo “B”: son lo que dedican a reparaciones e instalaciones; ellos 
ganan $17 dólares la hora. Presentar por pantalla el valor a recibir del empleado.*/
import java.util.Scanner;
public class TareaSemana13_6_NominaEmpleado 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        String tipo;
        int horas, pagar = 0, tipoA = 12, tipoB = 17;
        do
        {
        System.out.println("Ingrese el número de horas trabajadas: ");
        horas = tc.nextInt();
        if(horas <= 0)
        {
            System.out.println("Debe ingresar un valor correcto, mayor a 0.\n");
        }
        }while(horas <= 0);
        tc.nextLine();
        do
        {
        System.out.println("Ingrese el tipo de trabajador: \n[A] : [B]");
        tipo = tc.nextLine();
        if(!"A".equalsIgnoreCase(tipo) && !"B".equalsIgnoreCase(tipo))
        {
            System.out.println("Debe ingresar una opción correcta. A o B\n");
        }
        }while(!"A".equalsIgnoreCase(tipo) && !"B".equalsIgnoreCase(tipo));
        if("A".equalsIgnoreCase(tipo))
        {
            pagar = horas * tipoA;
        } else if("B".equalsIgnoreCase(tipo))
        {
            pagar = horas * tipoB;
        }
        System.out.println("\nEl valor a cancelar al empleado es: " + pagar);
    }
}
