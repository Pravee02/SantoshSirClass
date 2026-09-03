public class Swap
 {
    public static void main(String[] args)
    {
       int num1 = 10;
       int num2 = 20;
        System.out.println("Before Swaping");
        System.out.println("num1 is "+num1);
        System.out.println("num2 is "+num2);
        System.out.println();
       int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swaping");
        System.out.println("num1 is "+num1);
        System.out.println("num2 is "+num2);
    }
}
