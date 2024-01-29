import java.util.Scanner;
import java.util.StringTokenizer;
public class SnowballString
{
    public static boolean isSnowBall(String s)
    {
        StringTokenizer a = new StringTokenizer(s);

        int x = s.substring(0, s.indexOf(' ')).length();
        while (a.hasMoreTokens())
        {
            String txt = a.nextToken();
            if (txt.length() == x)
            {
                x++;
                continue;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String terminated by '.', ',' or '!' : ");
        String str = sc.nextLine();
        sc.close();

        if (str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '?' || str.charAt(str.length() - 1) == '!')
        {
            str = str.substring(0, str.length() - 1);
        if (isSnowBall(str))
            System.out.println("Snowball String.");
        else
            System.out.println("Not a Snowball String.");
        }
        else
        {
            System.out.println("Inavlid Input!");
            System.exit(0);
        }
    }
}