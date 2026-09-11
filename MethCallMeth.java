public class MethCallMeth 
{
    static void calculatetax()
    {
        calculateDA();
        System.out.println("Tax calculate");
    }
    static void calculateDA()
    {
        calculateHRA();
        System.out.println("DA calculated");
    }
    static void calculateHRA()
    {
        calculateBasic();
        System.out.println("HRA Calculated");
    }
    static void calculateBasic()
    {
        System.out.println("Final Salary");
    }

    static void calculateSalary()
    {
        calculatetax();
        System.out.println("Salary calculated");
    }


    public static void main(String[] args) {
        calculateSalary();
        System.out.println("Final salry");
        
    }
    
}