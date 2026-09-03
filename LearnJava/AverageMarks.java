public class AverageMarks 
{
    public static void main(String[] args)
     {
        int maths = 90;
        int science = 95;
        int ComputerScience = 99;
        int total = 300;
        double obtain = maths+science+ComputerScience;
        double AverageMarks =  obtain / 3;
        int percentage = (int)((obtain /total ) * 100);

        System.out.println(" The average marks is "+ AverageMarks);
        System.out.println(" The percentage  is "+ percentage+"%");


    }
}
