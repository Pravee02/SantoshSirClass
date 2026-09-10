import java.util.*;

public class NonVoidEvenOrOdd {
    // static void
    static boolean isEvenOrAdd(int n) {
        return n % 2 == 0;
    }

    boolean isEvenOrAddd(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        // take input and call
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        boolean result = isEvenOrAdd(n);
        System.out.println(result);
        if (result) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
        NonVoidEvenOrOdd obj = new NonVoidEvenOrOdd();
        boolean result1 = obj.isEvenOrAddd( n);
        System.out.println(result1);
        if (result1) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }

    }
}
