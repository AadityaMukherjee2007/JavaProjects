import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class calc
{
    double a, b, c;
    char op;
    public void in()
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Enter Number: ");
            this.a = Double.parseDouble(sc.readLine());
            System.out.print("Enter Number: ");
            this.b = Double.parseDouble(sc.readLine());
            
            if (this.a == 0 && this.b == 0)
            {
                System.exit(0);
            }
            
            System.out.print("Enter Operator: ");
            this.op = sc.readLine().charAt(0);
        }
        catch (IOException error)
        {
            System.out.println("Error!");
        }
    }
    
    public void com()
    {
        switch (this.op)
        {
            case '+' : c = a + b;
            break;
            case '-' : c = a - b;
            break;
            case '*' : c = a * b;
            break;
            case '/' : c = a / b;
            break;
            case '^' : c = Math.pow(a, b);
            case 'e' : System.exit(0);
            case 'q' : System.exit(0);
            break;
            default : 
                {
                    System.out.println("Error!\nEnter proper operator.");
                    in();
                }
        }
    }
    
    public void out()
    {
        System.out.println("Answer: " + this.c + "\n");
    }
    
    public static void main(String args[])
    {
        calc obj = new calc();
        while (true)
        {
            obj.in();
            obj.com();
            obj.out();
        }
    }
}