import java.util.Scanner;
public class HammingNumber
{
    public boolean prime(int n)
    {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // error in program
    public boolean hamming(int n)
    {
        if (n % 2 != 0 || n % 3 != 0 || n % 5 != 0 || prime(n))
            return false;

        int d = 2;
        while (d < n)
        {
            if (prime(d))
            {
                if (n % d == 0)
                {
                    System.out.print(d + " x ");
                    n /= d;
                }
                else
                {
                    d++;
                }
            }
            else
                d++;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        HammingNumber obj = new HammingNumber();
        if (obj.hamming(n))
            System.out.println(n + " is a Hamming number.");
        else
            System.out.println(n + "is not a Hamming number.");

        sc.close();
    }
}
