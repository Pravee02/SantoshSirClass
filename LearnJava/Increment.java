public class Increment
 {
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;

        int result = a++;
        int result1 =  ++b;

        System.out.println(result);
        System.out.println(result1);
        

        int count = 10;
        System.out.println("the count value is  "+count);
        System.out.println("Post Increment");
        System.out.println(count++);    // 10
        System.out.println(count);      // 11
        System.out.println(count++);    //11
        System.out.println(count);      //12
        System.out.println(count++);    //12

        System.out.println("Pree Increment");

        System.out.println(++count);    // 14
        System.out.println(++count);    // 15
        System.out.println(count);      // 15
        System.out.println(++count);    // 16
        System.out.println(++count);    // 17
        System.out.println(count++);    // 17


        System.out.println();

        int num = 10;
        System.out.println( "the num value is  "+num);

        System.out.println(num++ + ++num); // 10 + 12 = 22
        System.out.println(++num + ++num); // 13 + 14 = 27
        System.out.println(num++ + --num); // 14 + 14 = 28

        int x = 5;
        int y = 10;

        System.out.println(x++ + ++y);  // 5 + 11 = 16
        System.out.println(x);  // 6
        System.out.println(y);  // 11

        int X = 4 ;
        System.out.println(++X + X++);  // 5 + 5 = 10
        System.out.println(X);  // 6

        System.out.println(X + ++X + "but"+ X + X); //  6 + 7 = 13 but 7 + 7 = 14

        int ax = 10;
        System.out.println("helo" + (ax + ax));

    }
}
