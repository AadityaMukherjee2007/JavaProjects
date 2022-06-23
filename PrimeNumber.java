import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class PrimeNumber
{
    public static boolean check(int n)
    {
        if (n == 2 || n == 3)
        {
            return true;
        }
        else if (n == 1)
        {
            return false;
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
        int num = 1, range = 0;
        try
        {
            System.out.print("Enter Range: ");
            range = Integer.parseInt(sc.readLine());
        }
        catch (Exception IOException)
        {
            System.out.println("Error!");
        }
        
        for (int i = 1; i <= range; i++)
        {
            while (true)
            {
                if (check(num))
                {
                    System.out.println(i + ".\t" + num);
                    num++;
                    break;
                }
                else
                {
                    num++;
                    continue;
                }
            }
        }
    }
}