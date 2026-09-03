public class Bitwise 
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 6;
        System.out.println("And "+ (a & b));
        System.out.println("OR "+ (a | b));
        System.out.println("XOR "+ (a ^ b));
        System.out.println("NOT "+ (~a));

        System.out.println("Left Shift");
        System.out.println("left shift by 1 place  "+ (a << 1));
        System.out.println("left shift by 2 place "+ (a << 2));

        System.out.println("right shift ");
        System.out.println("right shift by 1 place "+ ( a >> 1 ));
        System.out.println("right shift by 2 place "+ ( a >> 2 ));


         System.out.println("unsigned right shift " );
         byte A = -10;
          System.out.println("right shift by 1 place "+ (byte)(A >>> 1 ));
 System.out.println();
  System.out.println();
        //Relational
        //logic
        //assignment
        //operator 

        int x = 10 ;
        int y = 20 ;
        int z = 10 ;

        System.out.println("value of x , y, z  is "+x +" "+ y +" "+ z);

        System.out.println("Relational operator");
        System.out.println(" x < y "+ (x < y));
        System.out.println(" x > y "+ (x > y));
        System.out.println(" x >= y "+ (x >= y));
        System.out.println(" x <= y "+ (x <= y));
        System.out.println(" x != y "+ (x != y));
        System.out.println(" x == y "+ (x == y));

        System.out.println();
        System.out.println();
        boolean m = true;
        boolean l = false;
        System.out.println("logical operators ");
        System.out.println("value of m is "+m);
        System.out.println("value of l "+l);

        System.out.println(" m && l "+ (m && l));
        System.out.println(" m > l "+ (m || l));
        System.out.println(" !m "+ !m);
         System.out.println();
        System.out.println();

         System.out.println("Assignment operator"); 
         int e;
        System.out.println("e = 10 = " +(e = 10));
        System.out.println("e += 1 = " +(e += 1));
        System.out.println("e -= 1 = " +(e -= 1));
        System.out.println("e *= 10 = " +(e *= 2));
        System.out.println("e /= 10 = " +(e /= 2));






    }    
}
