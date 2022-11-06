import java.util.Scanner;
public class CharFreq
{
	public void freq(String s)
	{	
		System.out.println("Frequency: ");
		for (int i = 0; i < s.length(); i++)
		{
			int c = 1, occurrence = 0;
			if (s.charAt(i) == ' ')
			{
				continue;
			}

			for (int k = i - 1; k >= 0; k--)
			{
				if (s.charAt(i) == s.charAt(k))
				{
					occurrence = 1;
				}
			}

			if (occurrence == 0)
			{
				for (int j = i + 1; j < s.length(); j++)
				{
					if (s.charAt(i) == s.charAt(j))
					{
						c++;
					}
				}
				System.out.println(s.charAt(i) + " : " + c);
			}
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String txt = sc.nextLine();

		new CharFreq().freq(txt);
	}
}
