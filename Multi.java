public class Multi {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        while(i<=10){
        for (j=1; j <= 10; j++) {
            int a = i * j;
            if(a>=10)
                {
                    System.out.print((a)+ "  ");
                }
                else{
                System.out.print((a)+ "   ");
                }
            
        }
        System.out.println();
       i++;
    }
    }
}