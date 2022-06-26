package ProgramacionVisual;
import java.util.ArrayList;
public class ArrayList100622
{
    public static void main(String[] args) 
    {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");
        for (int i = 0; i < carros.size(); i++) 
        {
            System.out.println(carros.get(i));
        }
    }
}
