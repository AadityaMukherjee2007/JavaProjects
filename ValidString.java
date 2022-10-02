import java.util.Scanner;
public class ValidString
{
	public boolean check(String str)
	{
		if (Character.isLetter(str.charAt(0)) != true)
		{
			return false;
		}

		for (int i = 1; i < str.length(); i++)
		{
			if (Character.isLetterOrDigit(str.charAt(i)) == false)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		if (new ValidString().check(s))
		{
			System.out.println("String is valid!");
		}
		else
		{
			System.out.println("String is invalid.");
		}
	}
}
		
