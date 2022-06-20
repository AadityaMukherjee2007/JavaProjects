import java.util.Scanner;
public class FunctionOverloading_2
{
    public void sumseries(int n, double x)
    {
        int s = 0;
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                s += x / i;
            }
            else
            {
                s -= x / i;
            }
        }
        System.out.println("Sum of the series = " + s);
    }

    public void sumseries()
    {
        int s = 0;
        for (int i = 1; i <= 20; i++)
        {
            int fac = 1;
            for (int j = 1; j <= i; j++)
            {
                fac *= j;
            }
            System.out.println(fac);
            s += fac;
        }
        System.out.println("Sum of the series = " + s);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Choice:\n0 --> Exit\n1 --> Series 1\n2 --> Series 2\n\nEnter Choice: ");
            int ch = sc.nextInt();
    
            switch(ch)
            {
                case 0 : System.exit(0);
                case 1 : 
                    {
                        System.out.print("Enter Number: ");
                        double num = sc.nextInt();
                        System.out.print("Enter Range: ");
                        int range = sc.nextInt();
                        new FunctionOverloading_2().sumseries(range, num);
                    }
                    break;
                case 2 : new FunctionOverloading_2().sumseries();
                    break;
                default : System.out.println("Error!\nEnter proper input!");
            }
        }
    }
}