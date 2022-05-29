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
    public void shift(int num)
    {
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        digitShifting obj = new digitShifting();
        
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int l = obj.len(n);
        
    }
}