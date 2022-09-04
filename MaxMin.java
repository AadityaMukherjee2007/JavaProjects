import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaxMin
{
    public int max(int x, int y)
    {
        int max = x > y ? x : y;
        return max;
    }
    
    public int min(int x, int y)
    {
        int min = x < y ? x : y;
        return min;
    }
    
    public double max(double x, double y)
    {
        double max = x > y ? x : y;
        return max;
    }
    
    public double min(double x, double y)
    {
        double min = x < y ? x : y;
        return min;
    }
    
    public static void main(String args[])
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Enter Number: ");    
            int a = Integer.valueOf(sc.readLine());
            System.out.print("Enter Number: ");    
            int b = Integer.valueOf(sc.readLine());
            
            System.out.println("\nGreater Num: " + new MaxMin().max(a, b));
            System.out.println("Smaller Num: " + new MaxMin().min(a, b));
        }
        catch (IOException e)
        {
            System.out.println("Error!");
        }
    }
}