class Condition {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 10;
        String day = "saturday";
        // if (num1 == num2) {
        //     System.out.println("True");

        // } 
        // else
        // {
        //     System.out.println("False");
        // }
        try{
        int result = num1 / 0 ;
        System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("divider cann't be a zero");
        }
        if(day.equals("satarday")) 
        {
             System.out.println("holiday");
        }
        else
        {
             System.out.println("no holiday"); 
        }

    }
}