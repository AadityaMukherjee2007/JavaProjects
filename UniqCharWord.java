import java.util.Scanner;
public class UniqCharWord
{
    String str1, str2;
    public boolean check(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            int c = 0;
            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    c++;
                }
            }
            if (c > 1)
            {
                return false;
            }
        }
        return true;
    }

    public void in()
    {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true)
        {
            System.out.print("Enter Word: ");
            str = sc.next();
            if (str == "q" || str == "e")
            {
                System.exit(0);
            }
            if (check(str) == false)
            {
                System.out.println("Error!\nEnter Unique Word.");
                continue;
            }
            else
            {
                str1 = str;
                break;
            }
        }

        while (true)
        {
            System.out.print("Enter Word: ");
            str = sc.next();
            if (str == "q" || str == "e")
            {
                System.exit(0);
            }
            if (check(str) == false)
            {
                System.out.println("Error!\nEnter Unique Word.");
                continue;
            }
            else
            {
                str2 = str;
                break;
            }
        }
    }

    public String commonWord()
    {
        String str = "";
        for (int i = 0; i < str1.length(); i++)
        {
            for (int j = 0; j < str2.length(); j++)
            {
                if (str1.charAt(i) == str2.charAt(j))
                {
                    str += str1.charAt(i);
                }
            }
        }
        return str;
    }

    public String uncommonWord()
    {
        String str = "";
        if (str1.length() > str2.length())
        {
            for (int i = 0; i < str1.length(); i++)
            {
                for (int j = 0; j < str2.length(); j++)
                {
                    int c = 0;
                    for (int k = 0; k < str.length(); k++)
                    {
                        if (str1.charAt(i) == str.charAt(k))
                        {
                            c++;
                        }
                    }
                    if (str1.charAt(i) != str2.charAt(j) && c == 0)
                    {
                        str += str1.charAt(i);
                    }
                }
            }
        }
        else
        {
            for (int i = 0; i < str2.length(); i++)
            {
                for (int j = 0; j < str1.length(); j++)
                {
                    int c = 0;
                    for (int k = 0; k < str.length(); k++)
                    {
                        if (str2.charAt(i) == str.charAt(k))
                        {
                            c++;
                        }
                    }
                    if (str2.charAt(i) != str1.charAt(j) && c == 0)
                    {
                        str += str2.charAt(i);
                    }
                }
            }
        }
        return str;
    }

    public static void main(String args[])
    {
        UniqCharWord obj = new UniqCharWord();
        obj.in();
        String commonWord = obj.commonWord(), uncommonWord = obj.uncommonWord();
        System.out.println("Common Word: " + commonWord); 
        System.out.println("Uncommon Word: " + uncommonWord); 
    }
}