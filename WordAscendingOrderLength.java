import java.util.Scanner;
import java.util.StringTokenizer;
public class WordAscendingOrderLength 
{
    public void ascending(String s)
    {
        StringTokenizer str = new StringTokenizer(s);
        String[] arr = new String[str.countTokens()];
        int x = 0;
        while (str.hasMoreTokens())
        {
            arr[x] = str.nextToken();
            x++;
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j].length() > arr[j + 1].length())
                {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Words (in ascending order): ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        new WordAscendingOrderLength().ascending(str);

        sc.close();
    }
}
