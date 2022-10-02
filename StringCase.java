import java.util.Scanner;
public class StringCase
{
	public String changeCase(String str)
	{
		String changed = "";
		for (int i = 0; i < str.length(); i++)
		{
			if (Character.isLowerCase(str.charAt(i)))
			{
				changed += Character.toUpperCase(str.charAt(i));
			}
			else
			{
				changed += Character.toLowerCase(str.charAt(i));
			}
		}
		return changed;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();

		System.out.println("Case changed string: " + new StringCase().changeCase(s));
	}
}
