public class ReturnType {

    static int maxNum(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int result = maxNum(10, 20);
        System.out.println(result);

    }
}
