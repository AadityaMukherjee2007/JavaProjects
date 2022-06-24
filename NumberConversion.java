import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class NumberConversion
{
    public int toBinary (int n)
    {
        int bin = 0;
        String binary = "";
        while (n != 0)
        {
            int r = n % 2;
            if (r == 1)
            {
                bin = bin * 10 + r;
            }
            else
            {
                bin = bin * 10 + 2;
            }
            n /= 2;
        }
        
        while (bin != 0)
        {
            int r = bin % 10;
            if (r == 1)
            {
                binary += "1";
            }
            else
            {
                binary += "0";
            }
            bin /= 10;
        }
        return Integer.valueOf(binary);
    }
    
    public int toOctal (int n)
    {
        int oct = 0;
        String octal = "";
        while (n != 0)
        {
            int r = n % 8;
            if (r == 0)
            {
                oct = oct * 10 + 8;
            }
            else
            {
                oct = oct * 10 + r;
            }
            n /= 8;
        }
        
        while (oct != 0)
        {
            int r = oct % 10;
            if (r == 8)
            {
                octal += "0";
            }
            else
            {
                octal += String.valueOf(r);
            }
            oct /= 10;
        }
        return Integer.valueOf(octal);
    }
    
    public String toHex(int n)
    {
        String revHex = "", Hex = "";
        while (n != 0)
        {
            int r = n % 16;
            if (r == 0)
            {
                revHex += "0";
            }
            else if (0 <= r && r <= 9)
            {
                revHex += String.valueOf(r);
            }
            else if (r == 10)
            {
                revHex += "A";
            }
            else if (r == 11)
            {
                revHex += "B";
            }
            else if (r == 12)
            {
                revHex += "C";
            }
            else if (r == 13)
            {
                revHex += "D";
            }
            else if (r == 14)
            {
                revHex += "E";
            }
            else
            {
                revHex += "F";
            }
            n /= 16;
        }
        
        int i = revHex.length() - 1;
        while (i >= 0)
        {
            Hex += revHex.charAt(i);
            i--;
        }
        return Hex;
    }

    public static void main(String args[])
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        NumberConversion obj = new NumberConversion();
        int dec = 0;
        try
        {
            System.out.print("Decimal: ");
            dec = Integer.parseInt(sc.readLine());
        }
        catch (IOException e)
        {
            System.out.print(e);
        }
        
        System.out.println("Binary: " + obj.toBinary(dec));
        System.out.println("Octal: " + obj.toOctal(dec));
        System.out.println("Hexadecimal: " + obj.toHex(dec));
    }
}