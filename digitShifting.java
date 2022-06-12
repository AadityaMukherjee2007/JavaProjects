import java.util.Scanner;
public class digitShifting
{
    public int len(int num)
    {
        int c = 0;
        while (num != 0)
        {
            c++;
            num /= 10;
        }
        return c;
    }
    public int shift(int num)
    {
        int n = 0, len = len(num);
        for (int i = 1; i <= len; i++)
        {
            if (i != len)
            {
                n *= 10 + (num % Math.pow(10, i + 1));
            }
            else
            {
                n *= 10 + (num % 10);
            }
        }
        return n;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        digitShifting obj = new digitShifting();
        
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        
        System.out.println(obj.shift(n));
    }
}