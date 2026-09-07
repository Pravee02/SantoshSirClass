public class HW_7_9 {
    public static void main(String[] args) {

        // stop at 5
        System.out.println("printing 1 to 5 stop at 5");
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.print(i);
        }
        System.out.println();
        System.out.println();

        System.out.println("print A to Z but stop at M");

        // stop at M
        for (char j = 'A'; j <= 'Z'; j++) {

            if (j == 'M') {

                break;

            }
            System.out.print(j);
        }
        System.out.println();
        System.out.println();

        // print number until you find 7
        System.out.println("printing number until find number 7");
        for (int i = 1; i <= 10; i++) {

            if (i == 7) {

                break;

            }
            System.out.print(i);
        }
        System.out.println();
        System.out.println();

        // print odd at 1 to 20
        System.out.println("printing odd numbers");
        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {

                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        System.out.println();

        // print even numbers from 1 to 20
        System.out.println("printing even number usng continue");
        for (int i = 1; i <= 20; i++) {
            if (!(i % 2 == 0)) {
                continue;

            }
            System.out.print(i);

        }

        System.out.println();
        System.out.println();
        // printing *
        System.out.println("printing * usng continue");
        for (int i = 1; i <= 3; i++) {
            System.out.print('*');
        }
    }
}
