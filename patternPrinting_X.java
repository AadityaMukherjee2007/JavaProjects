import java.util.Scanner;
public class patternPrinting_X
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (n - i); k++)
            {
                if (k == 1)
                {
                    System.out.print(k);   
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int l = (n - i - 1); l >= 1; l--)
            {
                if (l == 1)
                {
                    System.out.print(l);   
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for (int i = 2; i <= n; i++)
        {
            for (int j = 1; j <= (n - i); j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                if (k == 1)
                {
                    System.out.print(k);   
                }
                else
                {
                    System.out.print(" ");
                }
            }
            if (i == 1)
            {
                System.out.println();
                continue;
            }
            for (int l = (i - 1); l >= 1; l--)
            {
                if (l == 1)
                {
                    System.out.print(l);   
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}