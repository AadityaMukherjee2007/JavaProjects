import java.util.Scanner;
public class FunctionOverloading
{
    public void num_cal (int num, char ch)
    {
        if (ch == 's' || ch == 'S')
        {
            System.out.println(num + " ^ "  + "2" + " = " + (Math.pow(num, 2)));
        }
        else
        {
            System.out.println(num + " ^ "  + "3" + " = " + (Math.pow(num, 3)));
        }
    }

    public void num_cal(int a, int b, char ch)
    {
        if (ch == 'p' || ch == 'P')
        {
            System.out.println(a + " * " + b + " = " + (a * b));
        }
        else
        {
            System.out.println(a + " + " + b + " = " + (a + b));
        }
    }

    public void num_cal(String str1, String str2)
    {
        if (str1.equals(str2))
        {
            System.out.println("Equal!");
        }
        else
        {
            System.out.println("Not Equal!");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        FunctionOverloading obj = new FunctionOverloading();
        
        while (true)
        {
            System.out.println("Choice: \n0 --> Exit\n1 --> Square or Cube\n2 --> Product or Add\n3 --> String Equality\n");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
    
            switch (choice)
            {
                case 0 : System.exit(0);
                case 1 : 
                    {
                        System.out.print("Enter Number: ");
                        int n = sc.nextInt();
                        System.out.print("Enter 's' to find square or 'c' to find cube: ");
                        char ch = sc.next().charAt(0);
                        obj.num_cal(n, ch);
                    }
                    break;
                case 2 : 
                    {
                        System.out.print("Enter Number: ");
                        int n1 = sc.nextInt();
                        System.out.print("Enter Number: ");
                        int n2 = sc.nextInt();
                        System.out.print("Enter 'p' to find product or 'a' to add: ");
                        char ch = sc.next().charAt(0);
                        obj.num_cal(n1, n2, ch);
                    }
                    break;
                case 3 : 
                    {
                        System.out.print("Enter String: ");
                        String s1 = sc.nextLine();
                        System.out.print("Enter String: ");
                        String s2 = sc.nextLine();
                        obj.num_cal(s1, s2);
                    }
                    break;
                default : System.out.println("Error!\nEnter proper input.");
            }
        }
    }
}