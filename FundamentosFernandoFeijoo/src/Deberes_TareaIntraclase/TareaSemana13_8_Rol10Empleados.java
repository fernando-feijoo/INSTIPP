package Deberes_TareaIntraclase;
/*8)Una empresa desea calcular el rol de pagos de sus 10 trabajadores. Existen dos 
tipos. Tipo “A”: son lo que dedican a mantenimiento y limpieza; ellos ganan $21 dólares 
la hora. Tipo “B”: son lo que dedican a reparaciones e instalaciones; ellos ganan $24 
dólares la hora. Además, la empresa regala el “bono familia”, el cual consiste en darle 
$ 25 por cada hijo que tiene el empleado sin importar que tipo de trabajador que es. 
También, la empresa reconoce $10 por cada año de servicio que tiene el trabajador laborando 
en la empresa. Presentar por pantalla el valor a recibir del empleado.*/
import java.util.Scanner;
public class TareaSemana13_8_Rol10Empleados 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        String tipo;
        int horas, pagar = 0, tipoA = 21, tipoB = 24, bono = 25, hijos, valueYear = 10, yearsTrabajando;
        for(int f = 0; f < 10; f++)
        {
        System.out.println("");
        do
        {
        System.out.println("Ingrese el número de horas del trabajador " + (f+1) + "°: ");
        horas = tc.nextInt();
        if(horas <= 0)
        {
            System.out.println("Debe ingresar un valor correcto, mayor a 0.\n");
        }
        }while(horas <= 0);
        do
        {
        System.out.println("Ingrese el número de años del trabajador " + (f+1) + "° en la empresa: \n-[Si es nuevo coloque 0]");
        yearsTrabajando = tc.nextInt();
        if(yearsTrabajando < 0)
        {
            System.out.println("Ingrese un valor correcto.\n");
        }
        }while(yearsTrabajando < 0);
        tc.nextLine();
        do
        {
        System.out.println("Ingrese el tipo empleado al trabajador  " + (f+1) + "°: \n[A] : [B]");
        tipo = tc.nextLine();
        if(!"A".equalsIgnoreCase(tipo) && !"B".equalsIgnoreCase(tipo))
        {
            System.out.println("Debe ingresar una opción correcta. A o B\n");
        }
        }while(!"A".equalsIgnoreCase(tipo) && !"B".equalsIgnoreCase(tipo));
        do
        {
        System.out.println("Ingrese los hijos que tiene el trabajador " + (f+1) + "°: \n-[Si no posee coloque 0]");
        hijos = tc.nextInt();
        if(hijos < 0)
        {
            System.out.println("\nDebe ingresar un valor correcto.");
        }
        }while(hijos < 0);
        if("A".equalsIgnoreCase(tipo))
        {
            pagar = horas * tipoA + (hijos * bono) + (yearsTrabajando * valueYear);
        } else if("B".equalsIgnoreCase(tipo))
        {
            pagar = horas * tipoB + (hijos * bono) + (yearsTrabajando * valueYear);
        }
        System.out.println("\nEl valor a cancelar al trabajador " + (f+1) + "° es: $ " + pagar);
        }
    }
}
