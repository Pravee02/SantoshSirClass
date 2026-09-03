import java.util.*;
public class Q1_9_2026 
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    // college admission 
//int marks = 85;
    // System.out.println("Note : if marks is more than 80 then your pass otherwise fail");
    // System.out.println("enter your marks");
    // int marks = sc.nextInt();
    // System.out.println("enter you are passed or fail in the exam ");
    // boolean result = sc.nextBoolean();

    // if(marks>=80 && result )
    // {
    //     System.out.println("you are selected ");
    // }
    // else
    // {
    //     System.out.println("you are rejected ");
    // }


    //String day = "sunday";
    // System.out.println("enter the day");
    // String day = sc.nextLine();

    // if(day.equals("sunday") || day.equals("satuarday"))
    // {
    //     System.out.println("today is holiday");
    // }
    // else
    // {
    //     System.out.println("today is 24 hourse work enjoy ");
    // }

    //logic check 

    System.out.println("enter your name");
    String name = sc.nextLine();
    System.out.println("enter your password");
    String pass = sc.nextLine();

    if(name.equals("praveen") && pass.equals("praveen@2003"))
    {
        System.out.println("login successfull");
    }
    else
    {
        System.out.println("login failed");
    }


}
}
