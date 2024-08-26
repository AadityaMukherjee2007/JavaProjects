import java.util.Scanner;
public class DecToBin
{
    public long convert(long n)
    {
        if (n == 0)
            return 0;
        
        return convert(n / 2) * 10 + (n % 2);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal: ");
        long n = sc.nextLong();
        
        System.out.println("Binary: " + new DecToBin().convert(n));
        sc.close();
    }
}