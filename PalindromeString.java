import java.util.Scanner;
public class PalindromeString
{
	public boolean isPalindrome(String s)
	{
		StringBuffer str = new StringBuffer(s);
		str.reverse();
		return s.equals(str.toString());
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		PalindromeString obj = new PalindromeString();

		System.out.print("Enter String: ");
		String str = sc.nextLine();
		
		if (obj.isPalindrome(str))
		{
			System.out.println("Palindrome!");
		}
		else
		{
			System.out.println("Not Palindrome!");
		}
	}
}
