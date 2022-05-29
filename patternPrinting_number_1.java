import java.util.Scanner;
public class patternPrinting_number_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
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
            for (int l = i - 1 ; l >= 1; l--)
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