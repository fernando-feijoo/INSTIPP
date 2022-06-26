package Trabajo1_ProgramaMenu_Algoritmos;
import java.util.Scanner;
public class Menu 
{
    public void menu()
    {
        Scanner tc = new Scanner(System.in);
        String Usuario = "12345", Clave = "admin";
        String U, C, nombre, cargo, nombreRespuesta = "", cargoRespuesta = "";
        double monto, montoRespuesta = 0, bonificacion = 0, bonificacionRespuesta = 0;
        int contador = 0, op;
        do 
        {
            System.out.println("Ingrese el usuario: ");
            U = tc.nextLine();
            System.out.println("Ingrese la contraseña: ");
            C = tc.nextLine();
            if (U.equals(Usuario) && C.equals(Clave)) 
            {
                System.out.println("\n\nIngresando al sistema...\n");
            }else
            {
                System.out.println("\nUsuario o contraseñas incorrectos, ingrese nuevamente: \n");
            }
        } while (!U.equals(Usuario) && !C.equals(Clave));
        do
        {
            System.out.println("Ejercicio 1  [1]");
            System.out.println("Ejercicio 2  [2]");
            System.out.println("Ejercicio 3  [3]");
            System.out.println("Salir        [4]");
            op = tc.nextInt();
            tc.nextLine();
            if (op <= 0 || op >= 5) 
            {
                System.out.println("\n\nIngrese un opcion correcta...\n");
            }
        }while(op <= 0 || op >= 5);
        switch (op) 
        {
            case 1:
                do 
                {
                    System.out.println("\n\nEmpleado #" + (contador+1));
                    System.out.println("\nIngrese el nombre: ");
                    nombre = tc.nextLine();
                    System.out.println("Ingrese el cargo: ");
                    cargo = tc.nextLine();
                    System.out.println("Ingrese el monto de venta: ");
                    monto = tc.nextDouble();
                    tc.nextLine();
                    //calculos
                    if (monto >= 0 && monto <= 1000) 
                    {
                        bonificacion = monto * 0;
                        if (monto > montoRespuesta) 
                        {
                            bonificacionRespuesta = bonificacion;
                            montoRespuesta = monto + bonificacion;
                            nombreRespuesta = nombre;
                            cargoRespuesta = cargo;
                        }
                    }else if(monto >= 1001 && monto <= 5000)
                    {
                        bonificacion = monto * 0.03;
                        if (monto > montoRespuesta) 
                        {
                            bonificacionRespuesta = bonificacion;
                            montoRespuesta = monto + bonificacion;
                            nombreRespuesta = nombre;
                            cargoRespuesta = cargo;
                        }
                    }else if(monto >= 5001 && monto <= 20000)
                    {
                        bonificacion = monto * 0.05;
                        if (monto > montoRespuesta) 
                        {
                            bonificacionRespuesta = bonificacion;
                            montoRespuesta = monto + bonificacion;
                            nombreRespuesta = nombre;
                            cargoRespuesta = cargo;
                        }
                    }else if(monto >= 20001)
                    {
                        bonificacion = monto * 0.08;
                        if (monto > montoRespuesta) 
                        {
                            bonificacionRespuesta = bonificacion;
                            montoRespuesta = monto + bonificacion;
                            nombreRespuesta = nombre;
                            cargoRespuesta = cargo;
                        }
                    }
                    //
                    contador++;
                } while (contador != 5);
                System.out.println("El monto: $" + montoRespuesta);
                System.out.println("El nombre: " + nombreRespuesta);
                System.out.println("La bonificación: " + bonificacionRespuesta);
                System.out.println("Sueldo total del vendedor: " + montoRespuesta);
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
        }
    }
}
