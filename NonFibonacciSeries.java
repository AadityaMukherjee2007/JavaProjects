import java.util.Scanner;
public class NonFibonacciSeries
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range :");
        int n = sc.nextInt();
        
        int fibonacci[] = new int[n];
        int a = 1, b = 2, c;
        for (int i = 0; i < n; i++)
        {
            fibonacci[i] = a;
            c = a + b;
            a = b;
            b = c;
        }
        
        int x = 4;
        for (int i = 1; i <= n; i++)
        {
            int count = 0;
            for (int j = 0; j < n; j++)
            {
                if (x == fibonacci[j])
                {
                    count++;
                }
            }
            if (!(count > 0))
            {
                System.out.println(x);
            }
            x++;
        }
    }
}