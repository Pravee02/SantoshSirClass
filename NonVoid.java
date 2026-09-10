import java.util.*;

 class Instance{

    

    // add two numbers using return instance
    int addTwoNumbers(int a, int b)
    {
        System.out.println();
      System.out.println("instance class");
      System.out.println();
        int c = a + b;
        System.out.print("the addition was  ");
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

    boolean palindrome(int num)
    {
        int reverse = 0;
        int original = num;
        while(num>0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit ;
            num = num / 10;
        }
                
            return reverse == original; 
        

    }
}


public class NonVoid{
    

    // add two numbers 

    static int addTwoNumbers(int a,int b)
    {
        System.out.println();
        System.out.println("main class means static ");
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


    //palindrome or not  using static

    
    static boolean palindrome(int num)
    {
        int reverse = 0;
        int original = num;
        while(num>0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit ;
            num = num / 10;
        }
                
            return reverse == original; 
        

    }


    public static void main(String[] args) {

        // take input and call
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        int b = 5;
        int c = 10;
        int num = 5364;

        

       int reuslt1 = addTwoNumbers( a , b);
       System.out.println(reuslt1);

        SquareOfNumber( a);
        

        int result3 = maxOfThree( a,  b, c);
        System.out.println(result3);

       int result4 =  countDigit( num);
       System.out.println(result4);

        boolean result5 = palindrome(num);
        System.out.println(result5);




        // object creation 

       Instance obj = new Instance();

        int res = obj.addTwoNumbers( a , b);
       System.out.println(res);

       obj.SquareOfNumber( a);
        

        int res1 = obj.maxOfThree( a,  b, c);
        System.out.println(res1);

       int res2 =  countDigit( num);
       System.out.println(res2);

        boolean res3 = obj.palindrome(num);
        System.out.println(res3);

        

    }
}

