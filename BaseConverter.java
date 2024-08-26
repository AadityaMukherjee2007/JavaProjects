public class BaseConverter
{
    private final int MAX_BASE = 36;
    private final char[] DIGIT_TABLE = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
    public void printInBase(int n, int base)
    {
        if ((base <= 1) || (base > MAX_BASE))
            System.out.println("Invalid base: " + base);
        else
        {
            if(n < 0)
            {
                System.out.print(" - ");
                n = -n;
            }
            printRecursively(n, base);
        }
    }
    
    private void printRecursively(int n, int base)
    {
        if (n >= base)
        {
            printRecursively(n / base, base);
        }
        System.out.print(DIGIT_TABLE[n % base]);
    }

    public static void main(String args[])
    {
        BaseConverter b1 = new BaseConverter();
        System.out.println("\n\nConverting 27 to octal(base 8)");
        b1.printInBase(27, 8);
        
        System.out.println("\n\nConverting 27 to binary(base 2)");
        b1.printInBase(27, 2);
        
        System.out.println("\n\nConverting 27 to hexadecimal(base 16)");
        b1.printInBase(27, 16);
    }
}