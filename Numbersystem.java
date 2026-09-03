import java.util.*;

public class Numbersystem {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        int type = 2;

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (ch >= 'A' && ch <= 'F' || ch >= 'a' && ch <= 'f') {
                type = 16;
                break;
            } else if (ch >= '8' && ch <= '9') {
                if (type < 10)
                    type = 10;
            } else if (ch >= '2' && ch <= '7') {
                if (type < 8)
                    type = 8;
            } else if (ch != '0' && ch != '1') {
                type = -1; 
                break;
            }
        }

        if (type == 2)
            System.out.println("Binary Number");
        else if (type == 8)
            System.out.println("Octal Number");
        else if (type == 10)
            System.out.println("Decimal Number");
        else if (type == 16)
            System.out.println("Hexadecimal Number");
        else
            System.out.println("Invalid Number");
    }
}