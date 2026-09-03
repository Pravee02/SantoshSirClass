import java.util.*;
public class AreaOfTriangle 
{
public static void main(String[] args)
{

    Scanner sc = new Scanner(System.in);
    int height;
    int breadth;
    float AreaOfTriangle;

    System.out.println("enter the height of the triangle ");
    height = sc.nextInt();
    System.out.println("enter the breadth of the triangle ");
    breadth = sc.nextInt();
    AreaOfTriangle =  breadth * height;

    System.out.println("the area of triangle is "+AreaOfTriangle);


}    
}
