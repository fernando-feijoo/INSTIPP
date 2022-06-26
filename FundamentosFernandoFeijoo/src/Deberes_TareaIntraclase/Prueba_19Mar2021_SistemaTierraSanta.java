package Deberes_TareaIntraclase;
import java.util.Scanner;
public class Prueba_19Mar2021_SistemaTierraSanta 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int years, sueldo, hijos, moreYears = 0, menorSueldo = 0, mayorSueldo = 0, hijosSuma = 0, totalHijos = 0, totalSueldos = 0;
        for(int f = 0; f < 12; f++)
        {
            do
            {
            System.out.println("\nIngrese los años de servicio del " + (f+1) + "° trabajador:\n[Si es nuevo o menor a 1 año coloque 0]");
            years = tc.nextInt();
            if(years < 0)
            {
                System.out.println("Ingrese valores correctos.\n");
            }
            }while(years < 0);
            do
            {
            System.out.println("Ingrese el sueldo que gana el " + (f+1) + "° trabajador:");
            sueldo = tc.nextInt();
            if(sueldo < 0)
            {
                System.out.println("Ingrese valores correctos.\n");
            }
            }while(sueldo < 0);
            totalSueldos += sueldo;
            do
            {
            System.out.println("Ingrese la cantidad de hijos del " + (f+1) + "° trabajador: \n[Si no posee coloque 0]");
            hijos = tc.nextInt();
            if(hijos < 0)
            {
                System.out.println("Ingrese valores correctos.\n");
            }
            }while(hijos < 0);
            if(years > 5)
            {
                moreYears++;
            }
            if(sueldo <= 500)
            {
                menorSueldo++;
            } else if(sueldo > 500)
            {
                mayorSueldo++;
            }
            if(hijos > 2)
            {
                hijosSuma++;
            }
            totalHijos +=hijos;
        }
        System.out.println("\nTotal de sueldos pagados: $" + totalSueldos);
        System.out.println("Trabajadores con más de 5 años: " + moreYears);
        System.out.println("Trabajadores que ganan menos de $500: " + menorSueldo);
        System.out.println("Trabajadores que ganan más de $500: " + mayorSueldo);
        System.out.println("Trabajadores con más de 2 hijos: " + hijosSuma);
        System.out.println("Suma total de hijos de trabajadores: " + totalHijos);
    }
}
