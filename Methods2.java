
public class Methods2 {
    int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {

        Methods2 obj = new Methods2();
        int a = 10;
        int b = 20;
        int result = obj.max(a, b);
        System.out.println(result);
    }
}