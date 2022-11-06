import java.util.Scanner;
public class PigLatin
{
	public String pigLatin(String str)
	{
		String piglatin = "", s = str.toUpperCase();
		int index = firstVowelPos(s);

		if (index > 0)
		{
			piglatin = s.charAt(index) + s.substring(index + 1, s.length()) + s.substring(0, index) + "AY";
		}
		else
		{
			piglatin = s + "AY";
		}
		return piglatin;
	}

	public int firstVowelPos(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == 'A' ||
			    s.charAt(i) == 'E' ||
			    s.charAt(i) == 'I' ||
			    s.charAt(i) == 'O' ||
			    s.charAt(i) == 'U')
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[])
	{
		PigLatin obj = new PigLatin();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Word: ");
		String word = sc.next();
		System.out.println("Pig Latin: " + obj.pigLatin(word));
	}
}
