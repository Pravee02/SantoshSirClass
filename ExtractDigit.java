import java.util.*;

public class ExtractDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        // int digit = 0;
        // while (num > 0) {
        // digit = num % 10;
        // num = num / 10;

        // System.out.println(digit);
        // }
        // System.out.println(num);
        int count = 0;
        // while (num > 0) {
        // num = num / 10;
        // count = count + 1;
        // }
        // System.out.println(count);
        // using for loop
        for (; num > 0; num /= 10) {
            count = count + 1;

        }
        System.out.println(count);

    }

}
