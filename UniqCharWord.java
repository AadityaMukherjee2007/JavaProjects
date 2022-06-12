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
        String str;
        return str;
    }
    
    public String uncommonWord()
    {
        String str;
        return str;
    }

    public static void main(String args[])
    {
        UniqCharWord obj = new UniqCharWord();
        obj.in();
        String commonWord = obj.commonWord(), uncommonWord = obj.uncommonWord();
        
    }
}