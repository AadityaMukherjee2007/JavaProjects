import java.util.Scanner;
public class test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String reverse = "";
        for (int i = (str.length() - 1); i >= 0; i--)
        {
            reverse += str.charAt(i);
        }
        if (str == reverse)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        System.out.println(reverse);
    }
}