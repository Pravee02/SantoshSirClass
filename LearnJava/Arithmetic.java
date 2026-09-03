public class Arithmetic
{
 
    public static void main(String[] args)
    
    {
        //  arithmetic operator 
     int num1 = 11;
     int num2 = 2; 
     
     System.out.println("num1 value is "+ num1);
     System.out.println("num2 value is "+ num2);
     System.out.println();


    // addition 
    System.out.println("Addition "+ (num1+num2));
    System.out.println();
    System.out.println("Substraction "+(num1-num2));
    System.out.println();
    System.out.println("Multiplication "+(num1*num2));
    System.out.println();
    System.out.println("Division "+(num1/num2));
    System.out.println();
    System.out.println("modular "+(num1%num2));
    System.out.println();

// unary operator
System.out.println("unary operatior");
System.out.println();

int a = 10;
int b = 10;

    System.out.println("a value  is "+a);
    System.out.println("b value  is "+b);

    int result = a++; // result is 10
    int result1 = ++b;  // result is 11
    System.out.println("int result = a++ is --> "+result);
    System.out.println("int result = ++a -->"+result1);


        //precedence 
            System.out.println("Precedence of operators");
        int x = 10;
        int y = 5;
        int z = 2;
        System.out.println("x value is "+x);
        System.out.println("y value is "+y);
        System.out.println("z value is "+z);
        System.out.println();
        System.out.println("(10 + 5 * 2)--> "+(x+y*z));
        System.out.println("(10 + 5) * 2--> "+(x+y)*z);
        System.out.println("(10 - 5 + 2)--> "+(x-y+z));
        System.out.println("10 - (5 + 2)--> "+(10-(5+2)));


        System.out.println("foating point division");
         System.out.println("foating point division");




    }

}
