package ProblemSolving;

public class Reverse 
{
    
        public static void main(String[] args){
    

    int digit = 527;
    int rev = 0;
    System.out.println("before reverse the number is "+digit);

        while(digit>0){
            int num = digit%10;
             rev = (rev*10)+num;
             digit = digit / 10;

        }
    System.out.println("After reverse number "+rev);

    }
}
