package ProblemSolving;

public class ExtractDigit
{
    
    public static void main(String[] args) 
    {
        int digit = 786;
        System.out.println("digit before extracting "+digit);
        while(digit>0)
        {
            int num = digit%10;
            System.out.println("extract digit from last "+num);
            digit = digit / 10;
        }

    }
}
