public class StartsTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("patterns");

        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                count += 1;
                System.out.format("%02d ", count);
                // System.out.print(count + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                // System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int counter = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                counter += 1;
                System.out.print(counter + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
