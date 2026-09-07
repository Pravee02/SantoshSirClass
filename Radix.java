import java.util.*;

public class Radix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check number system");
        String num = sc.next(); // 127 now this a word

        boolean binary = true;
        boolean octal = true;
        boolean decimal = true;
        boolean hexadecimal = true;
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            // binary
            if (ch > '1' || ch < '0') {
                binary = false;
            }
            // octal

            if (ch < '0' || ch > '7') {
                octal = false;
            }
            // decimal
            if (ch < '0' || ch > '9') {
                decimal = false;
            }
            // hexadecimal
            if (!(ch > 'a' && ch < 'f') || (ch > '0' && ch < '9')) {
                hexadecimal = false;
            }
        }

        if (binary) {
            System.out.println("this is binary");
        } else if (octal) {
            System.out.println("this is octal and radix base is 8");
        } else if (decimal) {
            System.out.println("this is decimal");
        } else if (hexadecimal) {
            System.out.println("this is hexadecimal");
        }

    }
}
