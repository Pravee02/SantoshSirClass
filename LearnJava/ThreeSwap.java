public class ThreeSwap {
    
    public static void main(String[] args){


        // 4 number swaping 
        // int a = 20;
        // int b = 30;
        // int c = 50;
        // int d = 80;

       // Three numbers Swaping  
        int num1 = 30 ;
        int num2 = 50;
        int num3 =  70;


        System.out.println("Before swapping:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        // System.out.println("c = " + c);
        // System.out.println("d = " + d);

        System.out.println("a = " + num1);
        System.out.println("b = " + num2);
        System.out.println("c = " + num3);
       

        // 4 number swaping with memory 
        // int temp = d;  //80
        // d = c;          //d = 50
        // c = b;           // c = 30
        // b = a;            // b = 20
        // a = temp;          // a = 80


        //4 number swaping without memory
        // a = a+b+c+d; //180
        // b=a-b-c-d; //30
        // c=a-b-c-d;   //50
        // d=a-b-c-d;    //80
        // a=a-b-c-d;      //20


        // 3 number swaping with memory 

        // int temp = num1;
        // num1 = num2;
        // num2 = num3;
        // num3 = temp; 

        // 3 number swaping wihout memory 

        num1 = num1 + num2 + num3 ;
        num2 = num1 - num2 - num3 ;
        num3 = num1 - num2 - num3 ;
        num1 = num1 - num2 - num3 ;



        System.out.println("After swapping:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        // System.out.println("c = " + c);
        // System.out.println("d = " + d);


        System.out.println("a = " + num1);
        System.out.println("b = " + num2);
        System.out.println("c = " + num3);
      


    }
}
