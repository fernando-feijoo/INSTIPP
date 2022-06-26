package ActividadClase_2do_27082021_Exepciones;
/*Una farmacia desea un programa para ingresar  el valor de compra y calcular lo 
siguiente: si el pago se efectúa al “contado”, calcular un descuento del 5%; pero 
si el pago es con “tarjeta” se incrementa un recargo del 3% al valor de compra 
de N clientes. Calcular y visualizar el descuento o recargo según sea el caso y 
el total a pagar de la compra.

 Se desea un programa para ingresar por teclado el monto de compra y el día de 
la semana; si el día es lunes o viernes, se realizará un descuento del 12% por 
la compra. Visualizar el descuento y el total a pagar por la compra.
Aplicar excepciones.*/
public class Main 
{
    public static void main(String[] args)
    {
        Menu Op = new Menu();
        Op.datos();
    }
}
