public class JvmARchitecture 
{
    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;
        int z = x+y;

        String str = new String("sum "+z);
        System.out.println(str + z);

        // using native methods 
        long time = System.currentTimeMillis();
        System.out.println(time);

    }
    
}
