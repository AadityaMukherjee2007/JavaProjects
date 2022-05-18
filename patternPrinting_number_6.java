import java.util.Scanner;
public class patternPrinting_number_6
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
                System.out.print(k);
            }
            for (int l = (n - i - 1); l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}