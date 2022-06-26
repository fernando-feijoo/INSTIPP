package ActividadClase_2do_20082021;
/*Ingresar por teclado 3 usuarios con sus respectivas contraseñas, a continuación  
solicitar usuario y contraseña ingresar cualquiera de los tres  en caso de estar 
mal el usuario o la contraseña , presentar el mensaje de error y volver a solicitar 
el ingreso.
Si el ingreso es correcto presentar un menú con las siguientes opciones para el 
ingreso de un número:  raíz cuadrada, raíz cúbica, logaritmo de un número,  elevar 
al cuadrado un número  y tener la opcion salir.*/
public class Main 
{
    public static void main(String[] args)
    {
        Menu OpMenu = new Menu();
        OpMenu.menu();
    }
}