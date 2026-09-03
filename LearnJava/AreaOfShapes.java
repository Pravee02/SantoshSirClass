public class AreaOfShapes
{
    public static void main(String[] args) {
        // Area of Rectangle
        int length = 10;
        int breadth = 30;
        int result = length * breadth;
        System.out.println("Area of rectangle is "+ result);
       // circumference of circle 
        int radius = 5;
        double circumference = 2 * Math.PI * radius; 
        double area = Math.PI * radius * radius; 

        System.out.println("circumferenceof circle is "+circumference);
        System.out.println("Area of Circle is "+area);

    }
}
