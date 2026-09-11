public class StringPassing
{
    static void welcome(String name)
    {
        System.out.println(" Welcome MR: "+name);
        name = "praveen";
        System.out.println(" Welcome MR: "+name);

    }
 
    public static void main(String[] args)
    {
        String name = "Santosh";
        welcome(name);
        System.out.println(name);
    }
    
}
