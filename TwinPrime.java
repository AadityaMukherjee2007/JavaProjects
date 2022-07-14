import java.util.Scanner;
public class TwinPrime
{
    public static boolean prime(int n)
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
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter Range: ");
        int r = sc.nextInt();
        
        for (int i = 1; i <= 100; i++)
        {
            if (prime(i) && prime(i + 2))
            {
                System.out.println(i + " - " + (i + 2));
            }
        }
    }
}