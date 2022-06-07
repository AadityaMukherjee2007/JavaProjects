import java.util.Scanner;
public class Palindrome
{
    public static boolean check(String str)
    {
        String reverse = "";
        for (int i = (str.length() - 1); i >= 0; i--)
        {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String string = sc.nextLine();
        
        if (check(string))
        {
            System.out.println("Palindrome!");
        }
        else
        {
            System.out.println("Not Palindrome!");
        }
    }
}