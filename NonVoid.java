import java.util.*;

 class Instance{

    // add two numbers ueing return
    int addTwoNumbers(int a, int b)
    {
        int c = a + b;
        return c;
    }
    

    //square of numbers using void

    void SquareOfNumber(int a)
    {
        int s = a *a;
        System.out.println("square of "+ a +" is " +s);
    }

    

    
    //check max of three using int
    
    int maxOfThree(int a, int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }

    //cout the digit
    //palindrome or not 


public class NonVoid{
    

    // add two numbers 

    static int addTwoNumbers(int a,int b)
    {
        int c = a + b;
        return c;
    }
    
    //square of numbers
    static void SquareOfNumber(int b)
    {
        int a = b * b;
        System.out.println("square of "+ b +" is " +a);
    }

    // static void
    static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("it is  even");
        } else {
            System.out.println("it is Odd");
        }
    }


    //check max of three

    static int maxOfThree(int a, int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
    //cout the digit
    //palindrome or not 


    public static void main(String[] args) {

        // take input and call
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        checkEvenOdd(n);

    }
}
}