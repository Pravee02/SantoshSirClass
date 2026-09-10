class Square {

    // adding two numbers
    void printSum(int a, int b) {
        int res = a + b;
        System.out.println(a + " + " + b + " = " + res);
    }

    // square of numbers
    int SquareOfNumbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            int result = n * n;
            return result;
        }
    }

    // check even or add
    void EvenOrAdd(int n) {
        if (n <= 0) {
            System.out.println("0");
        } else {
            if (n % 2 == 0)
                System.out.println(n + " is an even number ");
            else
                System.out.println(n + " is an odd number ");
        }
    }

    // max of three numbers
    void CheckMaxOfThree(int a, int b, int c) {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("0");
        } else {

            if (a > b && a > c) {
                System.out.println(a + " is greater");
            } else if (b > c) {
                System.out.println(b + " is greater");
            } else {
                System.out.println(c + " is greater");
            }
        }
    }

    // cout the digit of n number
    void CountTheDigit(int n) {
        int count = 0;
        int original = n;
        if (n == 0) {
            System.out.println("the total counts  is 0");
        }

        else {
            while (n > 0) {
                int digit = n % 10;
                count += 1;
                n = n / 10;
            }

        }
        System.out.println("the count of " + original + " is " + count);
    }

    // check palindrome or not
    void palindromeOrNot(int n) {

        int original = n;
        int rev = 0;
        if (n == 0) {
            System.out.println("the number is 0");
        }

        else {
            while (n > 0) {
                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }

        }
        if (rev == original) {
            System.out.println(original + " is palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }

}

public class HW_9_9_26 {

    // add two numbers
    static void printSum(int a, int b) {
        int res = a + b;
        System.out.println(a + " + " + b + " = " + res);
    }

    // square of numbers
    static int SquareOfNumber(int num) {
        if (num <= 0) {
            return 0;
        } else {
            int result = num * num;
            return result;
        }
    }

    // check even or add
    static void EvenOrAdd(int n) {
        if (n <= 0) {
            System.out.println("0");
        } else {
            if (n % 2 == 0)
                System.out.println(n + " is an even number ");
            else
                System.out.println(n + " is an odd number ");
        }
    }

    // max of three numbers
    static void CheckMaxOfThree(int a, int b, int c) {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("0");
        } else {

            if (a > b && a > c) {
                System.out.println(a + " is greater");
            } else if (b > c) {
                System.out.println(b + " is greater");
            } else {
                System.out.println(c + " is greater");
            }
        }
    }

    // cout the digit of n number
    static void CountTheDigit(int n) {
        int count = 0;
        int original = n;
        if (n == 0) {
            System.out.println("the total counts  is 0");
        }

        else {
            while (n > 0) {
                int digit = n % 10;
                count += 1;
                n = n / 10;
            }

        }
        System.out.println("the count of " + original + " is " + count);

    }

    // check palindrome or not
    static void palindromeOrNot(int n) {

        int original = n;
        int rev = 0;
        if (n == 0) {
            System.out.println("the number is 0");
        }

        else {
            while (n > 0) {
                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }

        }
        if (rev == original) {
            System.out.println(original + " is palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }

public static void main(String[] args) {
        // without object square of numbers
        int a = 5;
        int b = 10;
        int c = 30;
        int num = 5364;
        int result = SquareOfNumber(a);
        System.out.println("square of " + a + " is " + result);

        // with object square of numbers
        Square obj = new Square();
        int result1 = obj.SquareOfNumbers(a);
        System.out.println("square of " + a + " using object creation is " + result1);
        System.out.println();

        // with object check even or add
        obj.EvenOrAdd(a);

        // without object check even or add
        EvenOrAdd(a);
        System.out.println();

        // with object check max of three numbers
        obj.CheckMaxOfThree(a, b, c);

        // without object check max of three numbers
        CheckMaxOfThree(a, b, c);
        System.out.println();

        // with object to count the numbers
        obj.CountTheDigit(num);

        // without object to count the numbers
        CountTheDigit(num);
        System.out.println();

        // with object to check palindrome or not
        int num1 = 151;
        obj.palindromeOrNot(num1);

        // without object to check palindrome or not
        palindromeOrNot(num1);
        System.out.println();

        // with object to add two numbers
        obj.printSum(a, b);

        // without object to add two numbers
        printSum(a, b);
        System.out.println();
}
}