import java.util.*;
public class UserInput 
{
public static void main(String[] args) {
    {
        Scanner sc = new Scanner(System.in);
        int a; 
        int b;
        int c;
        int d;

        System.out.println("enter the first number");
        a = sc.nextInt();
        System.out.println("enter the seconf number");
        b = sc.nextInt();
        System.out.println("enter third number");
        c = sc.nextInt();

        d = a+b+c;
        System.out.println("the addition value is "+d);



    }
}    
}
