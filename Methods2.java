
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

public class Methods2 {

    public static void main(String[] args) {

        // obj 1
        Methodss obj = new Methodss();

        int l = 10;
        int m = 20;
        int result = obj.max(l, m);
        System.out.println(result);

        // obj 2
        Methodss obj1 = new Methodss();
        obj1.printSum(l, m);

        // obj 3
        Methodss obj2 = new Methodss();
        int result1 = obj2.getNumber();
        System.out.println(result1);

        // obj 4
        Methodss obj3 = new Methodss();
        obj3.display();

    }
}
