import java.util.*;

 class Instance{

    // add two numbers using return instance
    int addTwoNumbers(int a, int b)
    {
        int c = a + b;
        return c;
    }
    

    //square of numbers using void instance

    void SquareOfNumber(int a)
    {
        int s = a *a;
        System.out.println("square of "+ a +" is " +s);
    }

    

    
    //check max of three using int instance
    
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

    //cout the digit using int instance

    int countDigit(int num)
    {
        int count = 0;
        while(num>0)
        {
            int a = num/10;
            count += 1;
            num = num/10;

        }
        return count;
    }


    //palindrome or not using int instance

    int palindrome(int num)
    {
        int reverse = 0;
        
    }


public class NonVoid{
    

    // add two numbers 

    static int addTwoNumbers(int a,int b)
    {
        int c = a + b;
        return c;
    }
    
    //square of numbers static void 
    static void SquareOfNumber(int b)
    {
        int a = b * b;
        System.out.println("square of "+ b +" is " +a);
    }

    
   


    //check max of three static int

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
    //cout the digit static int

   static int countDigit(int num)
    {
        int count = 0;
        while(num>0)
        {
            int a = num/10;
            count += 1;
            num = num/10;

        }
        return count;
    }


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