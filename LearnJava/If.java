import java.util.*;
public class If 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        

        System.out.println("enter your age");
        int age = sc.nextInt();
      
        if(age >= 18 && age <30)
        System.out.println("elligible to exam");
        
        else if(age>30)
        System.out.println("not elligible to exam");

        else
        System.out.println("exit");

        // nested if

        if(age>=18)
        {
              System.out.println("enter you are indian  citizenship true / false ");
        boolean citizenship = sc.nextBoolean();
            if (citizenship)
            {

                System.out.println("you are elligible");
            }
            else
            {
            System.out.println("you are not elligible");
            }
        }
        else
        System.out.println("exit");
        
        //switch

        // System.out.println("enter the days number");
        // int num = sc.nextInt();
        // switch(num)
        // {
        //     case 1:
        //     System.out.println("sunday");
        //     break;

        //     case 2:
        //     System.out.println("monday");
        //     break;

        //     case 3:
        //     System.out.println("tuesday");
        //     break;

        //     case 4:
        //     System.out.println("wednesday");
        //     break;

        //     case 5:
        //     System.out.println("thursday");
        //     break;

        //     case 6:
        //     System.out.println("friday");
        //     break;

        //     case 7:
        //     System.out.println("sautarday");
        //     break;

        //     default:
        //     System.out.println("invalid day ");
        // }


        // System.out.println("voting code using switch");
        // System.out.println("enter your age");
        // int age =sc.nextInt();
        // String result = age>=18 ? "yes" : "no";
        // switch(result){

        //     case "yes":
        //     System.out.println("eligible");
        //     break;

        //     case "no":
        //     System.out.println("not eligible");
        //     break;

        //     default:
        //     System.out.println("invalid");
        // }

        // combing condition ==>&&  ||

        // int age = 25;
        // boolean citizen = true;

        // if(age>=18 && citizen)
        // {
        //     System.out.println("eligible");
        // }
        // else
        // {
        //     System.out.println(" not eligible");
        // }
    }
}
