package Personal;
import java.text.DecimalFormat;
public class Main 
{
    public static void main(String[] args)
    {
        DecimalFormat formato = new DecimalFormat("#.00");
        double A = Math.random() * (1.49 - 1.10) + 1.10;
        System.out.println(formato.format(A) + " %");
    }
}
