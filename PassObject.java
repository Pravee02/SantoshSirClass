public class PassObject
{

    static void update(int b[],int n) //10,20,30,40
    {
        n = 10;
        b[0] = 100;
        System.out.println("inside update"+b[0]);
    }
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40};
        int n = 5;
        System.out.println("before method call "+a[0]);
         System.out.println("before method call "+n);

        update(a,n);

        System.out.println("After call"+ a[0]);
         System.out.println("After call"+ n);
    }    
}
