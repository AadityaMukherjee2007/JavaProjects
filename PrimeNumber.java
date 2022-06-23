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
        int num = 1;
        for (int i = 1; i <= 100; i++)
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