import java.util.*;
public class WhileLopp
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("square of a number");
          System.out.println("print the last number to get until that number power 2");
          int A = sc.nextInt();

          //squares of number
          System.out.println("squares of numbers");
        int n = 1;
        while(n<A)
        {
            
            System.out.println("the Squares of numbers are "+n);
            n=n*2;
        }

       /*  multiplication table
       
        System.out.println("enter the number to get multiplication number ");
        int num = sc.nextInt();

        int index = 0;
        while(index<=10)
        {
            System.out.println(num +" * "+ index + " = " + (index*num));
            index++;
        } */



                         // decremnt by 10

        // System.out.println("enter the number to get decrement by 10 ");
        // int num1 = sc.nextInt();
        // while(num1>=0)
        // {
        //     num1 = num1 - 10;
        //     System.out.println(num1);
            
        // }

                            //dividing number by 2 using while loop
    //     System.out.println("enter the number to get divide by 2 ");
    //     int num2 = sc.nextInt();
    //  System.out.println("divided by 2 using while loop");
    //     while(num2>=1)
    //     {
    //         num2 = num2/2;
    //         System.out.println(num2);

    //     }

    //                        // divided by 2 using for loops
    //         System.out.println("divided by 2 using for loop");
    //     for(int n =100; n>=1;n=n/2)
    //     {
    //         System.out.println(n);
    //     }

                              //multiply by 10
        //  System.out.println("divided by 10 using for loop");
        //   System.out.println("enter the destination number to get till multiply by 10");
        //   int a = sc.nextInt();
        // for(int num4 = 1; num4<a;num4=num4*10)
        // {
        //      System.out.println(num4);
        // }

    }    
}
