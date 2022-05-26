public class CityTrial
{
    public void CityTrialTest()
    {
        City metro1, metro2;
        
        metro1 = new City();
        metro2 = new City();
        
        metro1.name = "Delhi";
        metro1.population = 10000000;
        System.out.println("City metro1\'s details: ");
        metro1.display();
        
        metro2.name = "Bangalore";
        metro2.population = 5000000;
        System.out.println("City metro2\'s details: ");
        metro2.display();
    }
    public static void main(String args[])
    {
        new CityTrial().CityTrialTest();
    }
}
