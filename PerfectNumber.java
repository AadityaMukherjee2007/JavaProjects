import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PerfectNumber
{
    public boolean check(int n)
    {
        int sum = 1;
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                sum += i;
            }
        }
        if (sum == n)
        {
            return true;
        }
        return false;
    }
    
    public static void main(String args[])
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Enter Number: ");
            int n = Integer.valueOf(sc.readLine());
            System.out.println(new PerfectNumber().check(n));
        }
        catch (IOException e)
        {
            System.out.println("Error!");
        }
    }
}