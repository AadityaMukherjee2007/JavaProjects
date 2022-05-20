import java.util.Scanner;
public class patternPrinting_alphabets_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            char alph = 'a';
            for (int j = 1; j <= i; j++)
            {
                System.out.print(alph);
                alph++;
            }
            System.out.println();
        }
    }
}