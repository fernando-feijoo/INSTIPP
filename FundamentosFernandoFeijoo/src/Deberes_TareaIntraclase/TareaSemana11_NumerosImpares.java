package Deberes_TareaIntraclase;
/*Realizar un algoritmo que obtenga la suma de los 10 primeros números impares.*/
public class TareaSemana11_NumerosImpares 
{
    public static void main(String[] args)
    {
       int numeroImpar = 1, resultado = 0;
       int contadorImpar = 0;
       while (contadorImpar != 10)
       {
           resultado += numeroImpar;
           numeroImpar += 2;
           contadorImpar++;
       }
       System.out.println("La suma de los primeros 10 números impares es: " + resultado);
    }
}