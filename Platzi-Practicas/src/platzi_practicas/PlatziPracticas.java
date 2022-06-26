package platzi_practicas;
// @author Fernando F. Feijoo

public class PlatziPracticas 
{
    public static void main(String[] args)
    {
        
        String numeroPrueba = "5.6";
        double a = Double.parseDouble(numeroPrueba);
        numeroPrueba = String.valueOf(a);
        System.out.println(a + numeroPrueba);
        System.out.println("\"Hola de nuevo, soy Fernando Feijoo\"");
        a = pruebaDocumentacion(a);
        System.out.println(a);
    }
    
    /** 
    * @param a Prueba, porque nose de esto.
    * @return a Este seria el resultado.
    * */
    public static double pruebaDocumentacion(Double a)
    {
        a += 100;
        
        return a;
    }
}
