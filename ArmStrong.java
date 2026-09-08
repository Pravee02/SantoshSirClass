import java.util.*;

public class ArmStrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find armstrong or not");
        int num = sc.nextInt();
        int original = num;
        int number = original;
        int count = 0;
        int power = 1;
        int Armstrong = 0;

        while (num > 0) {
            num = num / 10;
            count = count + 1;

        }

        while (number > 0) {
            int digit = number % 10;
            for (int i = 1; i <= count; i++) {
                power = power * digit;

            }
            Armstrong += power;
            power = 1;
            number = number / 10;
        }
        if (original == Armstrong) {
            System.out.println("it is a armstrong");
        } else {
            System.out.println("it is not armstrong");
        }
    }
}