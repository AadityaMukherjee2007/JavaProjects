import java.util.Scanner;
public class patternPrinting_number_5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= (n - i); j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            if (i == 1)
            {
                System.out.println();
                continue;
            }
            for (int l = (i - 1); l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}