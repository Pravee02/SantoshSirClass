package ProblemSolving;

public class SumOfDigit
 
{
    
    public static void main(String[] args)
     {
        int digit = 482 ;
        int sum = 0;
         System.out.println("before adding digit is "+ digit);
        while(digit>0){
            int num = digit % 10;
            sum= sum + num;
            digit = digit/10;

        }
        System.out.println("total sum of number is "+ sum);
    }
}
