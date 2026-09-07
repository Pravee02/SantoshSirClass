public class TriangleStars {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // number of rows for(int i = 1 ; i<=5;i++){
            for (int j = i; j <= 5; j++) { // number of stars for(j = 1 ; j <= i ; j++)}
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
