import java.util.Scanner;
public class LongestWord
{
	public int longest(String s)
	{	
		int wl = 0, c = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == ' ')
			{
				if (wl < c)
				{
					wl = c;	
				}
				c = 0;
			}

			if (s.charAt(s.length() - 1) != ' ')
			{
				if (wl < c)
				{
					wl = c;				
				}
				c++;
			}
		}
		return wl;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LongestWord obj = new LongestWord();

		System.out.print("Enter String: ");
		String txt = sc.nextLine();

		System.out.println("Number of characters in the longest word: " + obj.longest(txt));
	}
}
