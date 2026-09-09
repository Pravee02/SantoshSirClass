
class Methodss {

    int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public class Methods2 {

        public static void main(String[] args) {

            Methodss obj = new Methodss();
            int a = 10;
            int b = 20;
            int result = obj.max(a, b);
            System.out.println(result);
        }
    }
}