import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Prime
{
    public boolean prime(int n)
    {
        if (n == 2 || n == 3)
        {
            return true;
        }
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[])
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter Range: ");
            int n = Integer.valueOf(sc.readLine());
            
            System.out.println("Prime Number: ");
            for (int i = 1; i <= n; i++)
            {
                if (new Prime().prime(i) == true)
                {
                    System.out.println(i);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error!");
        }
    }
}