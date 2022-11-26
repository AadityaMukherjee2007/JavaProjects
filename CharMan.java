import java.util.Scanner;
public class CharMan
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal Number: ");
        double num = sc.nextDouble();
        
        String n = String.valueOf(num);
        int dec = n.indexOf('.');
        int characteristic = Integer.valueOf(n.substring(0, dec));
        int mantissa = Integer.valueOf(n.substring(dec + 1));
        
        System.out.println("Characteristic: " + characteristic);
        System.out.println("Mantissa: " + mantissa);
    }
}
