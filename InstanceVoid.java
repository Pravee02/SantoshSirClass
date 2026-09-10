import java.util.Scanner;

public class InstanceVoid {

    // instance void
    void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
    }

    // instance non void
    boolean checkEvenOdd1(int n) {

        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check even or add");
        int n = sc.nextInt();
        InstanceVoid obj = new InstanceVoid();
        obj.checkEvenOdd(n);

        // non void
        boolean result = obj.checkEvenOdd1(n);
        System.out.println(result);
    }
}
