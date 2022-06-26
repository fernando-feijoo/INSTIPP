package Deberes_TareaIntraclase;
/*5. Realice un programa que para ingresar las notas finales de varios estudiantes 
de diferentes ciclos. Por cada estudiante se debe pedir los siguientes datos; 
nombre, edad, ciclo, nota final, ciudad (solo puede ser Pasaje o Santa Rosa). 
El programa que finaliza cuando en el nombre se ingrese FIN. Se debe presentar 
por pantalla: La cantidad de estudiantes mayores o iguales a 20 años, y la cantidad 
de estudiantes menores a 20 años. El promedio de todas las notas. Debe mostrar 
cuantos estudiantes son de Pasaje y cuantos son de Santa Rosa.*/
import javax.swing.JOptionPane;
public class TareaSemana11_IngresoNotasNuevo 
{
    public static void main(String[] args)
    {
       int edad, ciclo;
       String nombre, ciudad;
       double notaFinal, acumNotas = 0, resNota;
       int conMayor = 0, conMenor = 0, contPasaje = 0, contSanRosa = 0, opcion = 0, opcionFinal;
       do
       {
           nombre = JOptionPane.showInputDialog ("Ingrese el nombre: ");
       if("FIN".equals(nombre) || "fin".equals(nombre))
       {
           opcionFinal = 1;
       } else
       {
           opcionFinal = 0;
       }
       if(opcionFinal == 0)
       {
       edad = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese la edad: "));
       do
       {
           ciclo = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese el ciclo: \nej. 1, 2..."));
       }while(ciclo < 0);
       notaFinal = Double.parseDouble(JOptionPane.showInputDialog ("Ingrese la nota final del estudiante " + nombre + ": "));
       do
       {
           ciudad = JOptionPane.showInputDialog ("Ingrese la ciudad: ");
           if("Pasaje".equals(ciudad) || "pasaje".equals(ciudad))
           {
               opcion = 1;
           } else if ("Santa Rosa".equals(ciudad) || "santa rosa".equals(ciudad))
           {
               opcion = 1;
           } else
           {
               opcion = 0;
           }
       }while(opcion == 0);
       if (edad >= 20)
       {
           conMayor++;
       } else
       {
           conMenor++;
       }
       if("Pasaje".equals(ciudad))
       {
           contPasaje++;
       } else
       {
           contSanRosa++;
       }
       acumNotas += notaFinal;
       }
       }while(opcionFinal == 0);
       if(opcion == 1)
       {
       resNota = acumNotas / (conMayor + conMenor);
       JOptionPane.showMessageDialog(null, "Los estudiantes mayores o iguales a 20 años son: " + conMayor);
       JOptionPane.showMessageDialog(null, "Los estudiantes menores a 20 años son: " + conMenor);
       JOptionPane.showMessageDialog(null, "El promedio de las notas es: " + resNota);
       JOptionPane.showMessageDialog(null, "El número de estudiantes de Pasaje son: " + contPasaje);
       JOptionPane.showMessageDialog(null, "El número de estudiantes de Santa Rosa son: " + contSanRosa);
       } else
       {
           JOptionPane.showMessageDialog(null, "No ingreso datos.");
       }
    }
}
