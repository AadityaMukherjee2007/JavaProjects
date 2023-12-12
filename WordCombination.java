//print all possible combinations of a user inputted word.
import java.util.Scanner;
public class WordCombination
{
    public void com(String s)
    {
        int n = s.length();
        for (int i = 0; i < n; i++)
        {
            String word = s.charAt(i) + s.substring(0, i) + s.substring(i + 1);
            System.out.println(word);
        }
    }
    // code note yet complete
    public void combination(String s)
    {
        int n = s.length();
        com(s);
        for (int i = 0; i < n; i++)
        {
            //for (int )
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        String str = sc.next();

        new WordCombination().combination(str);
        sc.close();
    }
}