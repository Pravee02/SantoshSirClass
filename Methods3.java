
class Methodss {

    int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    void printSum(int a, int b) {
        System.out.println(a + b);
    }

    int getNumber() {
        return 100;
    }

    void display() {
        System.out.println("Hello");
    }

}

public class Methods3 {

    public static void main(String[] args) {

        int l = 10;
        int m = 20;

        Methodss obj = new Methodss();

        int result = obj.max(l, m);
        System.out.println(result);

        obj.printSum(l, m);

        int result1 = obj.getNumber();
        System.out.println(result1);

        obj.display();

    }
}
