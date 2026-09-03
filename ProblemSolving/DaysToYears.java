package ProblemSolving;

public class DaysToYears 
{
    public static void main(String[] args) {
        
        int days = 9000;
        System.out.println("total days --> "+days);

        int year = days / 365 ;

        int months = days / 30;

        System.out.println("the total year was " +year);
        System.out.println("the total months was "+months);
    }
}
