import java.util.*;

public class EvenOrAdd {
    // static void
    static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("it is  even");
        } else {
            System.out.println("it is Odd");
        }
    }

    public static void main(String[] args) {

        // take input and call
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        checkEvenOdd(n);

    }
}
