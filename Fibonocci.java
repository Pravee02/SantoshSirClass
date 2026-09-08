import java.util.*;
public class Fibonocci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter the nuber to get fiboocci number");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("the answe is  ");
        while(num>0)
        {
            c = a+b;
            
            a = b;
            b = c;
            
            System.out.println(a);
            num--;
        }
    }
}
