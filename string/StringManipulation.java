package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringManipulation
{
	public void extract(String str)
	{
		System.out.print("[");
		for (int i = 0; i < str.length(); i++)
		{
			if (i != str.length() - 1)
			{
				System.out.print(str.charAt(i) + ", ");
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.println("]");
	}

	public boolean find(String str, char ch)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == ch)
			{
				return true;
			}
		}
		return false;
	}

	public int freq(String str, char ch)
	{
		int c = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == ch)
			{
				c++;
			}
		}
		return c;
	}

	public static void main(String args[])
	{
		StringManipulation obj = new StringManipulation();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("Enter String: ");
			String s = sc.readLine();

			obj.extract(s);
		}
		catch (IOException e)
		{
			System.out.println("Error!");
		}

		String txt = "tintin";
		System.out.println(obj.find(txt, 't'));
		System.out.println(obj.find(txt, 's'));
		System.out.println(obj.freq(txt, 'i'));
	}
}
