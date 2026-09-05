import java.util.*;
public class Radix 
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to check number system");
    String num = sc.next(); // 127 now this a word 
    boolean octal = true;// assumne that the number is octal
    for(int i = 0 ; i<num.length();i++)
    {
        char ch = num.charAt(i);
        if(ch<'0' || ch>'7'){
        octal = false;
        break;
        }
    }
    if(octal)
    {
        System.out.println("this is octal and radix base is 8");
    }
    else
    {
         System.out.println("this is not a octal");
    }

}    
}
