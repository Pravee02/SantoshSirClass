public class Strings 
{
   
    public static void main(Strings[] args)
    {
        System.out.println(" senario 1 : Both String literals");
       String s1 = " saturday";
       String s2 = " saturday";
       System.out.println( s1 == s2);
       System.out.println(s1.equals(s2));


       System.out.println(" Senario 2: both using new");
       String s3 = new String("java");
       String s4 = new String("java");

        System.out.println(s3 == s2);
        System.out.println(s1.equals(s2));

    System.out.println(" Senario 3: literals vs new");
    String s5 = "java";
    String s6 = new String("java");

    System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));



    }
}


