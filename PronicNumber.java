import java.util.Scanner;
public class PronicNumber
{
    public static boolean check(int n)
    {
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0 && n % (i + 1) == 0)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        
        if (check(n))
        {
            System.out.println("Pronic Number!");
        }
        else
        {
            System.out.println("Not a Pronic Number!");
        }
    }
}