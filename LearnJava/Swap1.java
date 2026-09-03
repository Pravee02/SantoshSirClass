public class Swap1 
{
    public static void main(String[] args) {
        
    
int num1 = 7;
int num2 = 3;
System.out.println("Before Swaping");
        System.out.println("num1 is "+num1);
        System.out.println("num2 is "+num2);
        System.out.println();

num1 = num1*num2;
num2 = num1/num2;
num1 = num1/num2;

 System.out.println("After Swaping");
        System.out.println("num1 is "+num1);
        System.out.println("num2 is "+num2);


        int num3 = 50;
        int num4 = 10;
        System.out.println("Before Swaping");
        System.out.println("num1 is "+num3);
        System.out.println("num2 is "+num4);
        System.out.println();

        num3 = num3 ^ num4;
        num4 = num3 ^ num4;
        num3 = num3 ^ num4;
         System.out.println("After Swaping");
        System.out.println("num1 is "+num3);
        System.out.println("num2 is "+num4);

    }
}
