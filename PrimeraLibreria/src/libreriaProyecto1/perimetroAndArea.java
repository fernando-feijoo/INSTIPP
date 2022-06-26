package libreriaProyecto1;
/*@author Fabricio F. Feijoo*/
public class perimetroAndArea 
{
    public static double perimetroTriangulo(double base, double lado1, double lado2)
    {
        return (base + lado1 + lado2);
    }
    public static double perimetroCuadrado(double base)
    {
        return (base * 4);
    }
    public static double perimetroRectangulo (double base, double altura)
    {
        return (2 * (base + altura));
    }
    public static double perimetroRombo (double lado)
    {
        return (4 * lado);
    }
    public static double areaTriangulo (double base, double altura)
    {
        return ((base * altura)/2);
    }
    public static double areaCuadrado (double base)
    {
        return Math.pow(base, 2);
    }
    public static double areaRectangulo (double base, double altura)
    {
        return (base * altura);
    }
    public static double areaRombo (double baseAltura, double baseMedia)
    {
        return ((baseAltura * baseMedia)/2);
    }
}
