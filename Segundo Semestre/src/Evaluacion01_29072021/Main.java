package Evaluacion01_29072021;
/*Puede usar una o varias de estas técnicas: herencia, métodos, funciones, variables generales, constructor, varias clases.
Realice un sistema que me permita  registrar las ventas con iva de un cliente,  
que compra 5 artículos  con los siguientes datos: 
Nombre y apellido del cliente código del artículo, cantidad, precio unitario,  
valor a cancelar Presentar el nombre del cliente y a continuación los artículos 
con su sumatoria (subtotal), iva y total a pagar Tipo factura de ventas*/
public class Main 
{
    public static void main (String[] args)
    {
        Datos Op = new Datos();
        Op.Ingresos();
    }
}
