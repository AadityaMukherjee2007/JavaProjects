import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SentenceReverse
{
	public String reverse(String s)
	{
		for (int i = s.length() - 1; i >= 0 i--)
		{
			if 
		}
	}

	public static void main(String args[])
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try
		{
			System.out.print("Enter Sentence: ");
			str = sc.readLine();
			
			SentenceReverse obj = new SentenceReverse();
			System.out.println(obj.reverse(str));
		}
		catch(IOException e)
		{
			System.out.println("Error!");
		}
	}
}