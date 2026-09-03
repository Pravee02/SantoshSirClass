public class CelciusFahrenheit{
    public static void main(String[] args) {
        
        //celcius to fahrenheit
        double celcius = 20;
        double fahrenheit = (celcius * 9/5) +32 ;
        System.out.println(celcius+"  Celcius converted into fahrenheit" +fahrenheit);

        //fahrenheit to celcius 
        double fahrenheit1 = 68;
        double celcius1 = (fahrenheit1 - 32) * 5/9 ;
        System.out.println(fahrenheit1+"  fahrenheit1 converted into celcius" +celcius1);
    }
}
