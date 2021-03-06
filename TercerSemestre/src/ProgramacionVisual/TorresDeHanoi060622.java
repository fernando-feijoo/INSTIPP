package ProgramacionVisual;
import java.util.Scanner;
public class TorresDeHanoi060622 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino                                                         
    }

    //Método Torres de Hanoi Recursivo
    public static void Hanoi(int n, int origen,  int auxiliar, int destino)
    {
        if(n==1)
        {
           System.out.println("Mover disco de " + origen + " a " + destino);
        }else
        {
           Hanoi(n-1, origen, destino, auxiliar);
           System.out.println("Mover disco de "+ origen + " a " + destino);
           Hanoi(n-1, auxiliar, origen, destino);
        }
    }
}