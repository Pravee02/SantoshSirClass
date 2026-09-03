// TypeConversion -> procces which smaller data type converted into larger data type

// 1.   byte , short , char are always promoted into a int before arthmentic operation 

// 2.   if operands are of diffrent types , java promots the smaller type to the widest type in the expresion 

// 3.   the result of the expression is of that promted type 


public class TypeConversion {
    
    public static void main(String[]  args){

                           //demo for byt and byt
        byte num1 = 10;
        byte num2 = 20;

        //byte result = (num1 + num2) ; --> wrong because loosy conversion
         int result = (num1 + num2) ;
         System.out.println("byte + byte in --> int "+result);



                      //demo for byte and short
        byte num3 = 50;
        short num4 = 60;

       // short result1 = num3 + num4; --> error beaucse loosy conversion 
       int result1 = num3 + num4;   // type promotiomn 
       System.out.println("byte + short in --> int "+result1);


                  // demo for short and short 
       short num5 = 30;
       short num6 = 50;
       //short result2 = num5 + num6; --> loosy conversion because byte and short always converted into int 

       int result2 = num5 + num6;
       System.out.println("short + short in --> int "+result2);

                    // demo for char and short 
       char num7 = 'a';
       short num8 = 60;

    //int result3 = num7 + num8; --> error 
       int result3 = num7 + num8;
       System.out.println("char + short in --> int "+result3);

                    // demo for char and float 
        char P = 'g';
        float f = 6.8f;
        float answer = P + f;
        System.out.println(answer);


                    //demo for int and short
        int I = 50;
        short S = 60;
        //short res = I-S; error
        int res = I - S;
        System.out.println(res);


                     // demo of char and char 
       char c = 'A';
       char c1 = 'b';

       //char result4 = c + c1; --> error 
       int result4 = c + c1 ;
       System.out.println(result4);

                      //demo of int and float
       int num9 = 1;
       float num10 = 6.5f;

       // int result5 = num9 + num10; --> error
       float result5 = num9 + num10;
       System.out.println(result5);


                    // demo of int and long 
        int num11 = 60;
        long num12 = 100;

        //int result6 = num11 + num12;
        long result6 = num11 + num12;
        System.out.println(result6);

                    // demo of float and double
        float num13 = 5.6f;
        double num14 = 62518.554549826;
        //float result7 = num13 + num14; --> error
        double result7 = num13 + num14;
        System.out.println(result7);

                    // demo of long and double
        long num15 = 5252518521226526565l;
        double num16 = 1.526452553562436243565625;
       // long result8 = num15 + num16;
       double result8 = num15 + num16;
       System.out.println(result8);

                    // demo of long and float 
        long num17 = 1525582147596251456l;
        float num18 = 2.68584154f;
        //long result9 = num17+ num18;
        float result9 = num17 + num18;

        System.out.println(result9);


    }
    
}
