/*@author Fabricio F. Feijoo*/
import libreriaProyecto1.perimetroAndArea;
import javax.swing.JOptionPane;
public class calculoAreaPerimetro 
{
    public static void main(String[] args)
    {
        perimetroAndArea calculos = new perimetroAndArea();
        int Op_principal, Op_secundaria = 0, respuesta;
        double resultado, numero1, numero2, numero3;
        do
        {
            do
            {
                Op_principal = Integer.parseInt(JOptionPane.showInputDialog (null, "Figura que desea calcular:\n[1] Triangulo\n[2] "
                        + "Cuadrado\n[3] Rectangulo\n[4] Rombo", "Ingrese una opción", JOptionPane.INFORMATION_MESSAGE));
                if(Op_principal >= 1 && Op_principal <=4)
                {
                    do
                    {
                        Op_secundaria = Integer.parseInt(JOptionPane.showInputDialog (null,"[1] Perimetro\n[2] Area", "¿Que desea calcular?", JOptionPane.QUESTION_MESSAGE));
                        if(Op_secundaria >= 3 || Op_secundaria <= 0)
                        {
                            JOptionPane.showMessageDialog(null,"Error, colocar una opción correcta.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }while(Op_secundaria >= 3 || Op_secundaria <= 0);
                }
                switch(Op_principal)
                {
                    case 1: //--------- Triangulo
                        if(Op_secundaria == 1) //Se ejecuta perimetro del Triangulo
                        {
                            numero1 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor del lado 1: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            numero2 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor del lado 2: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            numero3 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor del lado 3: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            resultado = calculos.perimetroTriangulo(numero1, numero2, numero3);
                            int codigo = JOptionPane.showConfirmDialog(null, "¿Desea redondear el resultado?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (codigo == JOptionPane.YES_OPTION)
                            {
                                JOptionPane.showMessageDialog (null, "El valor del perimetro del triangulo es: " + Math.round(resultado));
                            }else
                            {
                                JOptionPane.showMessageDialog (null, "El valor del perimetro del triangulo es: " + resultado);
                            }
                        } else //Se ejecuta area del Triangulo
                        {
                            numero1 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor de la base: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            numero2 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor de la altura: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            resultado = calculos.areaTriangulo(numero1, numero2);
                            int codigo = JOptionPane.showConfirmDialog(null, "¿Desea redondear el resultado?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (codigo == JOptionPane.YES_OPTION)
                            {
                                JOptionPane.showMessageDialog (null, "El valor del area del triangulo es: " + Math.round(resultado));
                            }else
                            {
                                JOptionPane.showMessageDialog (null, "El valor del area del triangulo es: " + resultado);
                            }
                        }
                    break; //--------- Triangulo
                    case 2: //--------- Cuadrado
                        if(Op_secundaria == 1) //Se ejecuta perimetro del Cuadrado
                        {
                            numero1 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor del lado: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            resultado = calculos.perimetroCuadrado(numero1);
                            int codigo = JOptionPane.showConfirmDialog(null, "¿Desea redondear el resultado?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (codigo == JOptionPane.YES_OPTION)
                            {
                                JOptionPane.showMessageDialog (null, "El valor del perimetro del cuadrado es: " + Math.round(resultado));
                            }else
                            {
                                JOptionPane.showMessageDialog (null, "El valor del perimetro del cuadrado es: " + resultado);
                            }
                        } else //Se ejecuta area del Cuadrado
                        {
                            numero1 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor de la base: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            resultado = calculos.areaCuadrado(numero1);
                            int codigo = JOptionPane.showConfirmDialog(null, "¿Desea redondear el resultado?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (codigo == JOptionPane.YES_OPTION)
                            {
                                JOptionPane.showMessageDialog (null, "El valor del area del cuadrado es: " + Math.round(resultado));
                            }else
                            {
                                JOptionPane.showMessageDialog (null, "El valor del area del cuadrado es: " + resultado);
                            }
                        }
                    break; //--------- Cuadrado
                    case 3: //--------- Rectangulo
                        if(Op_secundaria == 1) //Se ejecuta perimetro del Rectangulo
                        {
                            numero1 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor de la base: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            numero2 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor de la altura: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            resultado = calculos.perimetroRectangulo(numero1, numero2);
                            int codigo = JOptionPane.showConfirmDialog(null, "¿Desea redondear el resultado?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (codigo == JOptionPane.YES_OPTION)
                            {
                                JOptionPane.showMessageDialog (null, "El valor del perimetro del rectangulo es: " + Math.round(resultado));
                            }else
                            {
                                JOptionPane.showMessageDialog (null, "El valor del perimetro del rectangulo es: " + resultado);
                            }
                        } else //Se ejecuta area del Rectangulo
                        {
                            numero1 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor de la base: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            numero2 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor de la altura: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            resultado = calculos.areaRectangulo(numero1, numero2);
                            int codigo = JOptionPane.showConfirmDialog(null, "¿Desea redondear el resultado?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (codigo == JOptionPane.YES_OPTION)
                            {
                                JOptionPane.showMessageDialog (null, "El valor del area del rectangulo es: " + Math.round(resultado));
                            }else
                            {
                                JOptionPane.showMessageDialog (null, "El valor del area del rectangulo es: " + resultado);
                            }
                        }
                    break; //--------- Rectangulo
                    case 4: //--------- Rombo
                        if(Op_secundaria == 1) //Se ejecuta perimetro del Rombo
                        {
                            numero1 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor de un lado: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            resultado = calculos.perimetroRombo(numero1);
                            int codigo = JOptionPane.showConfirmDialog(null, "¿Desea redondear el resultado?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (codigo == JOptionPane.YES_OPTION)
                            {
                                JOptionPane.showMessageDialog (null, "El valor del perimetro del rombo es: " + Math.round(resultado));
                            }else
                            {
                                JOptionPane.showMessageDialog (null, "El valor del perimetro del rombo es: " + resultado);
                            }
                        } else //Se ejecuta area del Rombo
                        {
                            numero1 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor de la altura transversal: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            numero2 = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el valor de la base transversal: ", "Ingrese dato", JOptionPane.PLAIN_MESSAGE));
                            resultado = calculos.areaRombo(numero1, numero2);
                            int codigo = JOptionPane.showConfirmDialog(null, "¿Desea redondear el resultado?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                            if (codigo == JOptionPane.YES_OPTION)
                            {
                                JOptionPane.showMessageDialog (null, "El valor del area del rombo es: " + Math.round(resultado));
                            }else
                            {
                                JOptionPane.showMessageDialog (null, "El valor del area del rombo es: " + resultado);
                            }
                        }
                    break; //--------- Rombo
                    default:
                        JOptionPane.showMessageDialog(null,"Error, colocar una opción correcta.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }while(Op_principal >= 5 || Op_principal <=0);
            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea calcular de nuevo?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        }while(respuesta == JOptionPane.YES_OPTION);
    }
}
