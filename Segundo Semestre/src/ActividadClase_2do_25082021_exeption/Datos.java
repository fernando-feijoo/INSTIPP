package ActividadClase_2do_25082021_exeption;
import java.util.Scanner;
public class Datos 
{
    public void Ingreso()
    {
        try
        {
        Scanner tc = new Scanner(System.in);
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();
        int Op = 0, c = 0;
        double Calculo = 0;
        do
        {
            do
            {
            System.out.println("\n======================="
                             + "\n| Ingrese una opcion  |"
                             + "\n|                     |"
                             + "\n|  Suma           [1] |"
                             + "\n|  Resta          [2] |"
                             + "\n|  Multiplicacion [3] |"
                             + "\n|  Division       [4] |"
                             + "\n|  Salir          [5] |"
                             + "\n=======================");
            Op = tc.nextInt();
            }while(Op < 0 || Op > 5);
            switch (Op) 
            {
                case 1:
                    try
                    {
                    do 
                    {
                        System.out.println("Ingrese el " + (c+1) + "° número:");
                        if (c == 0) 
                        {
                            suma.setNumero1(tc.nextDouble());
                        }
                        if (c == 1) 
                        {
                            suma.setNumero2(tc.nextDouble());
                        }
                        if (c == 2) 
                        {
                            suma.setNumero3(tc.nextDouble());
                        }
                        if (c == 3) 
                        {
                            suma.setNumero4(tc.nextDouble());
                        }
                        Calculo = suma.getRespuesta();
                        c++;
                    } while (c != 4);
                    }catch(Exception e)
                    {
                        System.out.println("\n\nEl error encontrado es: " + e + "\n\n");
                    }
                    break;
                case 2:
                    try
                    {
                    do 
                    {
                        System.out.println("Ingrese el " + (c+1) + "° número:");
                        if (c == 0) 
                        {
                            resta.setNumero1(tc.nextDouble());
                        }
                        if (c == 1) 
                        {
                            resta.setNumero2(tc.nextDouble());
                        }
                        if (c == 2) 
                        {
                            resta.setNumero3(tc.nextDouble());
                        }
                        if (c == 3) 
                        {
                            resta.setNumero4(tc.nextDouble());
                        }
                        Calculo = resta.getRespuesta();
                        c++;
                    } while (c != 4);
                    }catch(Exception e)
                    {
                        System.out.println("\n\nEl error encontrado es: " + e + "\n\n");
                    }
                    break;
                case 3:
                    try
                    {
                    do 
                    {
                        System.out.println("Ingrese el " + (c+1) + "° número:");
                        if (c == 0) 
                        {
                            multiplicacion.setNumero1(tc.nextDouble());
                        }
                        if (c == 1) 
                        {
                            multiplicacion.setNumero2(tc.nextDouble());
                        }
                        if (c == 2) 
                        {
                            multiplicacion.setNumero3(tc.nextDouble());
                        }
                        if (c == 3) 
                        {
                            multiplicacion.setNumero4(tc.nextDouble());
                        }
                        Calculo = multiplicacion.getRespuesta();
                        c++;
                    } while (c != 4);
                    }catch(Exception e)
                    {
                        System.out.println("\n\nEl error encontrado es: " + e + "\n\n");
                    }
                    break;
                case 4:
                    try
                    {
                    do 
                    {
                        System.out.println("Ingrese el " + (c+1) + "° número:");
                        if(c == 0)
                        {
                            division.setNumero1(tc.nextDouble());
                        }
                        if(c == 1)
                        {
                            division.setNumero2(tc.nextDouble());
                        }
                        Calculo = division.getRespuesta();
                        c++;
                    } while (c != 2);
                    }catch(Exception e)
                    {
                        System.out.println("\n\nEl error encontrado es: " + e + "\n\n");
                    }
                    break;
                case 5:
                        System.out.println("\nGracias por usar nuestro sistema.");
                    break;
            }
        System.out.println("\nEl resultado es: " + Calculo);
        }while(Op != 5);
        }catch(Exception e)
        {
            System.out.println("El error encontrado es: " + e);
        }
    }
}