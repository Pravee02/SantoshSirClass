package ProblemSolving;
import java.util.*;
public class Catogory 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the your age");
        int age = sc.nextInt();

        if(age<=12 && age>=0)
        {
            System.out.println("you are child");
        }
        else if(age>12 && age<=19)
        {
            System.out.println("you are teenager");
        }

        else if(age>19 && age<=39)
        {
            System.out.println("you are young adult");
        }
        else if(age>39 && age<=59)
        {
            System.out.println("you are middel age adult");
        }
        else if(age>59 && age<110)
        {
            System.out.println("you are seniar citizen");
        }
    }
}
