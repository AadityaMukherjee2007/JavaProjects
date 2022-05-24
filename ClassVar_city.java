public class ClassVar_city
{
    public String cityName;     //Instance Variable not class variable
    public long population;     //Instance Variable not class variable
    public static short surveyYear = 2022;      //Class Variable 
    
    public void display()   //Instance Method
    {
        System.out.println("\nCity: " + cityName);
        System.out.println("Population: " + population);
    }
    public static void main(String args[])  //Class Variable
    {
        ClassVar_city kolkata = new ClassVar_city();
        ClassVar_city pune = new ClassVar_city();
        
        System.out.println("Survey Year: " + surveyYear);
        
        pune.cityName = "Pune";
        pune.population = 3115000;
        
        kolkata.cityName = "Kolkata";
        kolkata.population = 4497000;
        
        kolkata.display();
        pune.display();
    }
}