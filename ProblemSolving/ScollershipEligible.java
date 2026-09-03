package ProblemSolving;
import java.util.*;
public class ScollershipEligible 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = sc.nextInt();
        System.out.println("enter your income");
        int income = sc.nextInt();

        if(marks>=80)
        {
            if(income>0 && income<=400000)
            {
                System.out.println("you are elligible to scollership");
            }
             else
                {
                    System.out.println("you are not elligible to scollership");
                }
        }
        else
        {
            System.out.println("you are not elligible to scollership");
        }
       

    }
}
