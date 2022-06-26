package Deberes_TareaIntraclase;
import java.util.Scanner;
public class Ejercicio6_SueldoEmpleados {
/*6.- Una empresa requiere contratar 2 tipos de obreros para las dos áreas de trabajo la primera
área es carpintería cada trabajador ganará $5 la hora de trabajo la otra área es electricidad
cada empleado ganará una base de $150 más la cantidad de horas. Cada hora de trabajo $
2 dólares. Presentar el valor a recibir por cada uno de los empleados.*/
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int tipoTrabajador, horas;
        int sueldoBase = 150;
        int calculo = 0;
        System.out.println("Ingrese el tipo de obrero que es: 1 o 2");
        tipoTrabajador = teclado.nextInt();
        if(tipoTrabajador == 1)
        {
            System.out.println("Ingrese el número de horas: ");
            horas = teclado.nextInt();
            calculo = (horas * 5);
        }else if (tipoTrabajador == 2)
        {
            System.out.println("Ingrese el número de horas: ");
            horas = teclado.nextInt();
            calculo = (horas * 2) + sueldoBase;
        }else
        {
            System.out.println("Error de dato.");
        }
        if(tipoTrabajador > 0 && tipoTrabajador <= 2)
        {
            System.out.println("El valor a cancelar al empleado tipo "+tipoTrabajador+" es: $"+calculo);
        }
    }   
}

