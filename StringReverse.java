import java.util.Scanner;
public class StringReverse 
{
    String str = "";
    public String reverse(String s, int n)
    {   
        if (n < 0)
            return "";
        else
            return s.charAt(n) + reverse(s, n - 1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println(new StringReverse().reverse(str, str.length() - 1));

        sc.close();
    }
}
