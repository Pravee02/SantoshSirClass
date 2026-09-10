import java.util.*;

public class NonVoid {
    // static void
    static boolean isEvenOrAdd(int n) {
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

    }
}
