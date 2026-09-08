public class NestedDoWhile {
    public static void main(String[] args) {
        // do while inside do while
        /*
         * int i = 1;
         * do {
         * 
         * int j = 1;
         * do {
         * System.out.print("* ");
         * j++;
         * } while (j <= 4);
         * System.out.println();
         * i++;
         * }
         * 
         * while (i <= 3);
         */

        // for inside while
        System.out.println("for inside while");
        int i = 1;

        while (i <= 3) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }
}
