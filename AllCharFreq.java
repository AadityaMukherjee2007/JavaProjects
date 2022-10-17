import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AllCharFreq
{	
	public void freq(String s)
	{
		char[] str = s.toCharArray();
		char ch = str[0];
		System.out.println("Frequency: ");
		for (int i = 0; i < str.length; i++)
		{
			int c = 1;
			char ele = str[i];
			if (i != 0 && str[i] == ch)
			{
				continue;
			}

			for (int j = i + 1; j < str.length; j++)
			{
				if (str[i] == str[j])
				{
					c++;
					str[j] = ch;
				}
			}
			str[i] = ch;
			System.out.println(ele + " : " + c);
		}
	}

	public static void main(String args[])
	{
		AllCharFreq obj = new AllCharFreq();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		try
		{
			System.out.print("Enter String: ");
			str = sc.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error!");
		}
		obj.freq(str);
	}
}
