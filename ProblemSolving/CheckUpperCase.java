package ProblemSolving;
import java.util.*;
public class CheckUpperCase
{
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the alphabets");
        char value = sc.next().charAt(0);

        if (value >= 'A' && value <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Not Uppercase");
        }
}
}
