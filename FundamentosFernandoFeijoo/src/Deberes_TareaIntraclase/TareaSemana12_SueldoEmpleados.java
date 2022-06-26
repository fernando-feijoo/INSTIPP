package Deberes_TareaIntraclase;
/*10.  Crear un programa que permita calcular el sueldo de una cantidad de 
trabajadores. Se tomará en cuenta el sueldo base del trabajador, las horas 
extras y porcentaje de bono que recibe. Solo se descontará el 5% por el seguro 
de vida que tiene cada empleado. Mostar el sueldo de cada empleado. Y después 
de finalizar el registro de todos los trabajadores, debe presentar un reporte 
consolidado, que son: el total a pagar por conceptos de sueldos;  la cantidad 
de empleados que han trabajados horas extras y la cantidad de empleados que reciben bono.*/
import java.util.Scanner;
public class TareaSemana12_SueldoEmpleados 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int canTrabajadores, horasExtra, bono, seguro = 5, contadorHorasEx = 0, contadorBono = 0, sueldo = 400;
        int calculo1 = 0, opcion, valorHora, calculo2 = 0, pago, pagoCont = 0;
        System.out.println("Cantidad de trabajadores que va a ingresar: ");
        canTrabajadores = tc.nextInt();
        System.out.println("");
        for(int f = 1; f <= canTrabajadores; f++)
        {
            calculo1 = 0;
            calculo2 = 0;
            do
            {
            System.out.println("¿El " + f + "° trabajador tuvo horas extra?: \n -- 1: Si --\n -- 2: No --");
            opcion = tc.nextInt();
            }while(opcion != 1 && opcion != 2);
            if(opcion == 1)
            {
                do
                {
                System.out.println("Cantidad de horas extra:");
                horasExtra = tc.nextInt();
                System.out.println("Valor de la hora extra:");
                valorHora = tc.nextInt();
                calculo1 = (horasExtra * valorHora);
                contadorHorasEx++;
                if(horasExtra < 0 || valorHora < 0)
                {
                    System.out.println("\nColocar valores correctos del " + f + "° trabajador.");
                }
                }while(horasExtra < 0 || valorHora < 0);
            }
            do
            {
            System.out.println("\n¿El " + f + "° trabajador tuvo bono?: \n -- 1: Si --\n -- 2: No --");
            opcion = tc.nextInt();
            }while(opcion != 1 && opcion != 2);
            if(opcion == 1)
            {
                do
                {
                System.out.println("Porcentaje de bono a recibir: \nColocar numeros enteros.");
                bono = tc.nextInt();
                calculo2 = (sueldo * bono)/100;
                contadorBono++;
                if(bono < 0)
                {
                    System.out.println("\nColocar valor correcto del " + f + "° trabajador.");
                }
                }while(bono < 0);
            }
            pago = (sueldo -((sueldo * seguro)/100)) + calculo1 + calculo2;
            pagoCont += pago;
            System.out.println("\nAl " + f + "° trabajador se le paga: $ " + pago + "\n");
        }
        if(canTrabajadores > 0 )
        {
            System.out.println("Total pagado a los trabajadores: $ " + pagoCont);
            System.out.println("Cantidad de trabajadores con horas extra: " + contadorHorasEx);
            System.out.println("Cantidad de trabajadores con bono: " + contadorBono);
        }else
        {
            System.out.println("No se va a ingresar datos, hasta luego.");
        }
    }
}