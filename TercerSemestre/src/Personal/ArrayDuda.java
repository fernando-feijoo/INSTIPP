package Personal;
public class ArrayDuda 
{
    public static void main(String[] args)
    {
        Integer[] a = new Integer[]{1,2,1};
        Double[] b = new Double[]{2.0,3.0,4.0};
        double respuesta = 0;
        for (int i = 0; i < a.length; i++) 
        {
            respuesta += (a[i] * b[i]);
        }
        System.out.println(respuesta);
    }
}
