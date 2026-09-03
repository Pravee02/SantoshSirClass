// Demonstrate TypeCasting 

public class TypeCasting
{
    public static void main(String[] args) {
        
        //widening = put smaller data into larger container 

        int num = 100;
        double result = num;

        System.out.println(result);

        // Narrowing = put larger data into small data type

        int a = 300;
        //bye b = a; error  
        byte b = (byte)a;

        System.out.println(b);
    }
    
}
