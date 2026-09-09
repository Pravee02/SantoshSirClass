class Square {
    int SquareOfNumbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            int result = n * n;
            return result;
        }
    }
}

public class HW_9_9_26 {

    static int SquareOfNumber(int num) {
        if (num <= 0) {
            return 0;
        } else {
            int result = num * num;
            return result;
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int result = SquareOfNumber(a);
        System.out.println("square of " + a + " is " + result);

        Square obj = new Square();
        int result1 = obj.SquareOfNumbers(a);
        System.out.println("square of " + a + " using object creation is " + result);
    }
}
