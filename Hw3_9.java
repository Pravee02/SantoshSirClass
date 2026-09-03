import java.util.*;

public class Hw3_9 {
    public static void main(String[] args) {
        // 1. increment by 3
        System.out.println("1. increment by 3");
        for (int index = 0; index < 30; index += 3) {
            System.out.print(index + " ");
        }

        // 2. dicrement by 5
        System.out.println();
        System.out.println();
        System.out.println("2. dicriment by 5");
        for (int index = 30; index > 0; index -= 5) {
            System.out.print(index);
        }

        // 3. reverse Alphabets
        System.out.println();
        System.out.println();
        System.out.println("3. reverse alphabets");
        for (char index = 'Z'; index >= 'A'; index--) {
            System.out.print(index + " ");
        }

        // 4. print 1 to 100
        System.out.println();
        System.out.println();
        System.out.println("4. print 1 to 100 numbers");
        for (int index = 1; index <= 100; index++) {
            System.out.print(index + " ");
        }

        // 5. Print multiple of 5
        System.out.println();
        System.out.println();
        System.out.println("5. multiple of 5");
        for (int index = 1; index <= 10; index++) {
            System.out.println("5 * " + index + "= " + (index * 5));
        }

        // 6.print square of numbers
        System.out.println();
        System.out.println();
        System.out.println("6. square of numbers");
        for (int index = 1; index <= 10; index++) {
            System.out.println("square of " + index + " is = " + (index * index));
        }

        // 7. print cube of numbers
        System.out.println();
        System.out.println();
        System.out.println("7. cube of numbers");
        for (int index = 1; index <= 10; index++) {
            System.out.println("square of " + index + " is = " + (index * index * index));
        }

        // 8. sum of first n mumbers
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("8. enter a  number to get sum of numbers ");
        int num = sc.nextInt();
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;

        }
        System.out.println("sum of " + num + " number is " + sum);
        System.out.println();
    }
}