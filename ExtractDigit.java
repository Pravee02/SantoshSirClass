import java.util.*;

public class ExtractDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int original = num;
        // int digit = 0;
        // while (num > 0) {
        // digit = num % 10;
        // num = num / 10;

        // System.out.println(digit);
        // }
        // System.out.println(num);
        // int count = 0;
        // while (num > 0) {
        // num = num / 10;
        // count = count + 1;
        // }
        // System.out.println(count);
        // using for loop
        // for (; num > 0; num /= 10) {
        // count = count + 1;

        // }
        // System.out.println(count);

        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        int result = 0;
        while (reverse > 0) {
            int digit = reverse % 10;
            result = result * 10 + digit;
            reverse = reverse / 10;
        }
        System.out.println(result);

    }

}
