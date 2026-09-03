package ProblemSolving;
import java.util.*;
public class Calculator 
{
    public static void main(String[]  args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 value");
        int num1 = sc.nextInt();
        System.out.println("enter number 2 value");
        int num2 = sc.nextInt();
        // int num1 = 20;
        // int num2 = 2;
        System.out.println("enter the operator (+ , - , * , / , % ");
        char symbol = sc.next().charAt(0);
        int result;

        switch(symbol)
        
        {
            case '+':
            result = num1 + num2;
            System.out.println(num1 + " + "+num2 +" => " + result);
            break;

            case '-':
            result = num1 - num2;
            System.out.println(num1 + " - "+num2 +" => " + result);
            break;

            case '*':
            result = num1 * num2;
            System.out.println(num1 + " * "+num2 +" => " + result);
            break;

            case '/':
            result = num1 / num2;
            System.out.println(num1 + " / "+num2 +" => " + result);
            break;

            case '%':
            result = num1 % num2;
            System.out.println(num1 + " % "+num2 +" => " + result);
            break;

            default:
            System.out.println("invalid entry");
            

        }
        
    }
}
