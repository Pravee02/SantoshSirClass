public class Methods {

    // No arguments no return
    static void display() {
        System.out.println("Hello");
    }

    // arguments but no return
    static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    // no arguments but return
    static int getNumber() {
        return 100;
    }

    // arguments and return
    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args)

    {
        display();

        printSum(10, 20);

        int result = getNumber();
        System.out.println(result);

        int result1 = max(10, 20);
        System.out.println(result1);

    }
}