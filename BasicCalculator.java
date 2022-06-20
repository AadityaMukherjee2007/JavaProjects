import java.util.Scanner;
public class BasicCalculator
{
    public void calc()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            double a, b, c = 0;
            
            System.out.print("\nEnter Number: ");
            a = sc.nextDouble();
            System.out.print("Enter Number: ");
            b = sc.nextDouble();
            
            if (a == 0 && b == 0)
            {
                System.exit(0);
            }
            
            System.out.print("Operator: ");
            char op = sc.next().charAt(0);
            
            switch (op)
            {
                case 'e' : System.exit(0);
                case '+' : c = a + b;
                break;
                case '-' : c = a - b;
                break;
                case '*' : c = a * b;
                break;
                case '/' : c = a / b;
                break;
                case '^' : c = Math.pow(a, b);
                break;
                default : System.out.println("Error!\nEnter proper operator.");
            }
            System.out.println("Answer = " + c);
        }
    }
    public static void main(String args[])
    {
        BasicCalculator obj = new BasicCalculator();
        System.out.println("Calculator: ");
        obj.calc();
    }
}