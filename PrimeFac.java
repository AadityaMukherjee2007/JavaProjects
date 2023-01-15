import java.util.Scanner;
public class PrimeFac
{
    public boolean prime(int n)
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
    
    public void primeFac(int n)
    {
        System.out.println("Prime Factors of " + n + ": ");
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0 && prime(i))
            {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        PrimeFac obj = new PrimeFac();
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        
        obj.primeFac(num);
    }
}