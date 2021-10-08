import java.util.Scanner;

public class javaCalculator 
{

    public static void main(String[] args) 
    {
//variables
        int num1;
        int num2;
        String operacion;

        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer número");
        num1 = input.nextInt();

        System.out.println("ingrese el segundo número");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Por favor ingrese la operación");
        operacion = op.next();

        if (operacion == "+");
        {
         System.out.println("La suma es :" + (num1 + num2));
        }
        if  (operacion == "-");
        {
         System.out.println("La resta es : " + (num1 - num2));
        }
        if (operacion == "/");
        {
        System.out.println("La divison es : " + (num1 / num2));
        }
        if (operacion == "*")
        {
         System.out.println("La Multiplicacion es :" + (num1 * num2));
        }


    }
}