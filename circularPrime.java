import java.util.Scanner;
public class circularPrime
{
    int l = 0;
    public boolean prime(int num)
    {
        int c = 0;
        for (int i = 1; i < num; i++)
        {
            if (num % i == 0)
            {
                c++;
            }
        }
        if (c == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int len(int num)
    {
        int len = 0;
        while (num != 0)
        {
            len++;
            num /= 10;
        }
        return len;
    }
    public boolean circularPrime(int num)
    {
        int c = 0;
        for(int i = 1; i <= l; i++)
        {
            
        }
        if (c == l)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        circularPrime obj = new circularPrime();
        
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        
        obj.l = obj.len(n);
        System.out.println(obj.l);
        
        if (!obj.prime(n))
        {
            System.out.println("Not a Prime Number!\nHence cannot be Circular Prime.");
        }
        else
        {
            if (obj.circularPrime(n))
            {
                System.out.println("It is a Circular Prime Number!");
            }
            else
            {
                System.out.println("It is not a Circular Prime Number!");
            }
        }
    }
}