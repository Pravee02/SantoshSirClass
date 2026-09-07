import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");

        int num = sc.nextInt();
        int reverse = 0;
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("is it palindrome true or false ");
        boolean result = false;
        if (reverse == original) {
            result = true;
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}