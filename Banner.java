import java.util.Scanner;
import java.util.StringTokenizer;
public class Banner
{
    public void banner(String s)
    {
        StringTokenizer str = new StringTokenizer(s);
        String[] arr = new String[str.countTokens()];

        int x = 0;
        while (str.hasMoreTokens())
        {
            arr[x] = str.nextToken();
            x++;
        }

        int n = arr[0].length();
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].length() > n)
            {
                n = arr[i].length();
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                try
                {
                    System.out.print(arr[j].charAt(i) + " ");
                }
                catch (Exception e)
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        new Banner().banner(str);

        sc.close();
    }
}