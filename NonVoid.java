import java.util.*;

 class Instance{

    // add two numbers 

    //square of numbers
  // static void
    

    
    //check max of three
    //cout the digit
    //palindrome or not 


public class NonVoid{
    

    // add two numbers 
    
    //square of numbers

    // static void
    static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("it is  even");
        } else {
            System.out.println("it is Odd");
        }
    }


    //check max of three
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