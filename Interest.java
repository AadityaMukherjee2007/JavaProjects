import java.util.Scanner;
public class Interest
{
    public void compound(double p, double r, double n)
    {
        double amt = 0, i = 0;
        amt = p * Math.pow((1 + (r / 100)), n);
        i = amt - p;
        System.out.println("\nInterest = " + i);
        System.out.println("Amount = " + amt + "\n");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Calculate Interest[Y/n] : ");
            char ch = sc.next().charAt(0);
            
            if (ch == 'n' || ch == 'N')
            {
                System.exit(0);
            }
            
            System.out.print("Principal: ");
            double principal = sc.nextDouble();
            System.out.print("Rate: ");
            double rate = sc.nextDouble();
            System.out.print("Time: ");
            double time = sc.nextDouble();
            
            Interest obj = new Interest();
            obj.compound(principal, rate, time);
        }
    }
}