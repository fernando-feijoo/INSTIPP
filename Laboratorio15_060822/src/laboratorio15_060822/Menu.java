package laboratorio15_060822;

import java.util.Scanner;

public class Menu 
{
    Scanner tc = new Scanner(System.in);
    String deposito, retiro, opcion, tmp;
    double saldo;
    CajeroAutomatico cajero = new CajeroAutomatico();
    public void menu()
    {
        do
        {
            try
            {
                System.out.println("\n===========================");
                System.out.println("|   1.- DEPOSITO          |");
                System.out.println("|   2.- RETIRO            |");
                System.out.println("|   3.- CONSULTAR SALDO   |");
                System.out.println("|   4.- SALIR             |");
                System.out.println("===========================");
                System.out.println("Ingrese una opción: ");
                opcion = tc.nextLine();
                if (isNumericInt(opcion)) 
                {
                    if (Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 4) 
                    {
                        System.out.println("\nIngrese una opción del 1 al 4.");
                    }else if (Integer.parseInt(opcion) == 4)
                    {
                        System.out.println("\nGracias por usar nuestro sistema. :)\n❤\n");
                        break;
                    } else
                    {
                        switch (opcion) 
                        {
                            case "1":
                                System.out.println("======| Opción 1 - DEPOSITO |======\n");
                                deposito();
                                break;
                            case "2":
                                System.out.println("======| Opción 2 - RETIRO |======\n");
                                retiro();
                                break;
                            case "3":
                                System.out.println("======| Opción 3 - CONSULTAR SALDO |======\n");
                                consultarSaldo();
                                break;
                        }
                    }
                }else
                {
                    System.out.println("");
                    throw new Exception("Ingreso un dato no numerico...\n");
                }
            } catch (Exception e)
            {
                System.out.println(e.toString());
                opcion = "5";
            }
        }while(Integer.parseInt(opcion) != 4);
    }
    public static boolean isNumericInt(String cadena)
    {
	try 
        {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe)
        {
		return false;
	}
    }
    public static boolean isNumericDouble(String cadena)
    {
	try 
        {
		Double.parseDouble(cadena);
		return true;
	} catch (NumberFormatException nfe)
        {
		return false;
	}
    }
    public void deposito()
    {
        try
        {
            do
                {
                    System.out.print("\nValor a depositar: ");
                    deposito = tc.nextLine();
                    if (isNumericDouble(deposito))
                    {
                        saldo = cajero.depositar(Double.parseDouble(deposito));
                        System.out.println("\nValor deposito: " + deposito);
                        System.out.println("Saldo de cuenta: " + saldo + "\n");
                    }else
                    {
                        System.out.println("\nIngrese un valor correcto...");
                    }
                    do
                    {
                        System.out.println("¿Desea depositar nuevamente? \n S/N");
                        tmp = tc.nextLine();
                        if (!tmp.equalsIgnoreCase("N") && !tmp.equalsIgnoreCase("S")) 
                        {
                            System.out.println("\nIngrese una opción correcta S = SI o N = NO.\n");
                        }
                    }while(!tmp.equalsIgnoreCase("N") && !tmp.equalsIgnoreCase("S"));
            }while(!tmp.equalsIgnoreCase("N"));
        }catch(ValorException ve)
        {
            System.out.println(ve.toString());
        }
    }
    public void retiro()
    {
        try
        {
            do
                {
                    System.out.print("\nValor a retirar: ");
                    retiro = tc.nextLine();
                    if (isNumericDouble(retiro))
                    {
                        saldo = cajero.retirar(Double.parseDouble(retiro));
                        System.out.println("\nValor retirado: " + retiro);
                        System.out.println("Saldo de cuenta: " + saldo + "\n");
                    }else
                    {
                        System.out.println("\nIngrese un valor correcto...");
                    }
                    do
                    {
                        System.out.println("¿Desea retirar nuevamente? \n S/N");
                        tmp = tc.nextLine();
                        if (!tmp.equalsIgnoreCase("N") && !tmp.equalsIgnoreCase("S")) 
                        {
                            System.out.println("\nIngrese una opción correcta S = SI o N = NO.\n");
                        }
                    }while(!tmp.equalsIgnoreCase("N") && !tmp.equalsIgnoreCase("S"));
            }while(!tmp.equalsIgnoreCase("N"));
        } catch (FondosException fe) 
        {
            System.out.println(fe.toString());
        } catch (ValorException ve)
        {
            System.out.println(ve.toString());
        }
    }
    public void consultarSaldo()
    {
        System.out.println("Saldo de cuenta: " + saldo);
    }
}