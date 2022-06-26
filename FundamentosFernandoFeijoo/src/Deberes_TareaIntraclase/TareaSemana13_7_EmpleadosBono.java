package Deberes_TareaIntraclase;
/*7)Una empresa desea calcular el rol de pagos de sus trabajadores. Existen dos tipos. 
Tipo “A”: son lo que dedican a mantenimiento y limpieza; ellos ganan $10 dólares la hora. 
Tipo “B”: son lo que dedican a reparaciones e instalaciones; ellos ganan $15 dólares la 
hora. Además, la empresa regala el “bono familia”, el cual consiste en darle $ 25 por cada 
hijo que tiene el empleado sin importar que tipo de trabajador que es. Presentar por 
pantalla el valor a recibir del empleado.*/
import java.util.Scanner;
public class TareaSemana13_7_EmpleadosBono 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        String tipo;
        int horas, pagar = 0, tipoA = 10, tipoB = 15, bono = 25, hijos;
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
        do
        {
        System.out.println("Ingrese los hijos que tiene el empleado: \n-[Si no posee coloque 0]");
        hijos = tc.nextInt();
        if(hijos < 0)
        {
            System.out.println("\nDebe ingresar un valor correcto.");
        }
        }while(hijos < 0);
        if("A".equalsIgnoreCase(tipo))
        {
            pagar = horas * tipoA + (hijos * bono);
        } else if("B".equalsIgnoreCase(tipo))
        {
            pagar = horas * tipoB + (hijos * bono);
        }
        System.out.println("\nEl valor a cancelar al empleado es: $" + pagar);
    }
}
