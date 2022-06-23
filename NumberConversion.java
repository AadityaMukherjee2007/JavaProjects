import java.util.Scanner;
public class NumberConversion
{
    public int reverse(int n)
    {
        int rev = 0;
        while (n != 0)
        {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        return rev;
    }

    /*public int toBinary (int n)
    {
        int copy = n, temp = 0;
        String binary = "";
        while (copy != 0)
        {
            int r = copy % 2;
            if (r == 0)
            {
                temp *= 10 + 2;
            }
            else if (r == 1)
            {
                temp *= 10 + 1;
            }
        }

        temp = reverse(temp);

        while (temp != 0)
        {
            int r = n % 10;
            if (r == 1)
            {
                binary += "1";
            }
            else
            {
                binary += "0";
            }
        }

        return Integer.valueOf(binary);
    }*/
    
    public void toBinary (int n)
    {
        int copy = n, temp = 0;
        String binary = "";
        while (copy != 0)
        {
            int r = copy % 2;
            if (r == 0)
            {
                temp *= 10 + 2;
            }
            else if (r == 1)
            {
                temp *= 10 + 1;
            }
        }
        
        while (temp != 0)
        {
            int r = temp % 10;
            if (r == 2)
            {
                System.out.print(0);
            }
            else
            {
                System.out.print(1);
            }
            temp /= 10;
        }
    }

    public int toOctal (int n)
    {
        int copy = n, temp = 0;
        String octal = "";
        while (copy != 0)
        {
            int r = copy % 2;
            if (r == 0)
            {
                temp *= 10 + 8;
            }
            else
            {
                temp *= 10 + r;
            }
        }

        temp = reverse(temp);

        while (temp != 0)
        {
            int r = n % 10;
            if (r == 8)
            {
                octal += "0";
            }
            else
            {
                octal += String.valueOf(r);
            }
        }

        return Integer.valueOf(octal);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        NumberConversion obj = new NumberConversion();
        
        System.out.print("Decimal Number : ");
        int d = sc.nextInt();
        obj.toBinary(d);
        //System.out.println("Binary : " + obj.toBinary(d));
        System.out.println("Octal : " + obj.toOctal(d));
    }
}