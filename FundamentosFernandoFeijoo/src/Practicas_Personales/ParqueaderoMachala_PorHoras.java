package Practicas_Personales;
import java.util.Scanner;
public class ParqueaderoMachala_PorHoras 
{
    public static void main(String[] args) 
    {
        String respuesta;
        do
        {
        double horaIngreso, horaSalida, resultadoHoras, resultadoFinalHoras, tarifaMenor, calculoHoras, calculoParcial;
        double calculoMinutos, calculoFinal, calculoNumericoHoras, calculoRedondeado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la hora de ingreso (24H): ");
        horaIngreso = teclado.nextDouble();
        System.out.println("Ingrese la hora de salida (24H): ");
        horaSalida = teclado.nextDouble();
        resultadoHoras = horaSalida - horaIngreso;
        double resultadoSolucion = (horaSalida%1)-(horaIngreso%1);
        resultadoFinalHoras = Math.round(resultadoHoras * 100.00)/100.00;
        tarifaMenor = resultadoFinalHoras % 1;
        calculoHoras =  resultadoFinalHoras - tarifaMenor;
        /*Cuando el segundo valor es menor al primero, porque es hasta el 99 los decimales, entonces resto 0.40.*/
        /*Es para calcular valor a pagar por minutos*/
        if (resultadoSolucion < 0)
        {
            calculoMinutos = ((1*0.25)/0.15)*(tarifaMenor-0.40);
        }else
        {
            calculoMinutos = ((1*0.25)/0.15)*tarifaMenor;
        }
        calculoParcial = (1*calculoHoras)+calculoMinutos;
        calculoFinal = Math.round(calculoParcial*100.00)/100.00;
        if(tarifaMenor >= 0.60 && resultadoSolucion > 0)
        {
            calculoNumericoHoras = (resultadoFinalHoras + 1) - 0.60;
            calculoRedondeado = Math.round(calculoNumericoHoras * 100.00)/100.00 ;
        }else 
        {
            /*Es para calcular valor de minutos de forma correcta*/
            if(resultadoSolucion < 0)
            {
                calculoNumericoHoras = (resultadoFinalHoras) - 0.40;
                calculoRedondeado = Math.round(calculoNumericoHoras * 100.00)/100.00 ;
            }
            else
            {
                calculoRedondeado = resultadoFinalHoras;
            }
        }
        System.out.println("Total de Horas: " + calculoRedondeado);
        System.out.println("Valor a cancelar: $ " + calculoFinal);
        System.out.println("\n");
        System.out.println("¿Desea calcular nuevo pago?: s/n");
        respuesta = teclado.next();
        }
        while("s".equals(respuesta));
    }
}

