import java.util.Scanner;
public class GoldBachNumber
{
    public static boolean isPrime(int n)
    {
        if (n == 2 || n == 3)
            return true;
    
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Positive Even Integer: ");
        int n = sc.nextInt();

        if (n < 0 || n % 2 != 0)
        {
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        
        for (int i = 3; i < n; i += 2)
        {
            for (int j = i; j < n; j += 2)
            {
                if (isPrime(j) && isPrime(i))
                {
                    if ((i + j) == n)
                        System.out.println(n + " = " + i + " + " + j);
                }
            }
        }
        
        sc.close();
    }
}