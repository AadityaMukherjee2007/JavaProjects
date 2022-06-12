import java.util.Scanner;
public class UniqCharWord
{
    String str1 = "", str2 = "";
    public boolean check(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = (i + 1); i < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public void in()
    {
        input:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        String str = sc.next();
        
        if (str == "q" || str == "e")
        {
            System.exit(0);
        }
        
        if ()
        {
            
        }
    }
    public static void main(String args[])
    {
        UniqCharWord obj = new UniqCharWord();
        obj.in();
        if 
    }
}