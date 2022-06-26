package Deberes_TareaIntraclase;
import java.util.Scanner;
import javax.swing.JOptionPane;
/* 1) Elabora una aplicación que ingrese 5 valores numéricos entre el 1 y el 20 
(validar), calcular la suma, el promedio y la media aritmética de las cantidades ingresadas*/
public class TareaSemana13_1_5Num1al20 
{
    public static void main(String[] args)
    {
        Scanner tc = new Scanner(System.in);
        int numero, suma = 0;
        double promedio;
        JOptionPane.showMessageDialog(null, "Ingrese los datos de forma correcta.", "Información del Programa.", JOptionPane.INFORMATION_MESSAGE);
        for(int f = 0; f < 5; f++)
        {
            System.out.println("");
            do{
                System.out.println((f+1) + "°.-");
                System.out.print("Ingrese un número entre 1 y 20: ");
                numero = tc.nextInt();
            if(numero < 1 || numero > 20)
            {
                System.out.println("Los datos ingresados son incorrectos.\n");
            }
            }while(numero < 1 || numero > 20);
            suma += numero;
        }
        promedio = suma / 5;
        System.out.println("\nLa suma de los números ingresados es: " + suma);
        System.out.println("El promedio o media aritmetica es: " + promedio);
    }
}
