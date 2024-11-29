import java.util.Scanner;
public class PrimeAdam
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

    public int reverse(int n)
    {
        int rev = 0;
        while (n != 0)
        {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }

        return rev;
    }
    public boolean primeAdam(int n)
    {
        if (!prime(n))
            return false;

        int rev = reverse(n);
        return n * n == reverse(rev * rev);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("m : ");
        int m = sc.nextInt();
        System.out.print("n : ");
        int n = sc.nextInt();

        sc.close();

        if (m >= n)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }

        PrimeAdam obj = new PrimeAdam();
        int count = 0;
        for (int i = m; i <= n; i++)
        {
            if (obj.primeAdam(i))
            {
                count++;
                System.out.println(i);
            }
        }

        if (count == 0)
            System.out.println("NIL");

        System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
    }
}
