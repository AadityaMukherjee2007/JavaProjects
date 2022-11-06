import java.util.Scanner;
public class ReverseString 
{
	public String reverse(String s)
	{
		String revString = "";
		for (int i = s.length() - 1; i >= 0; i--)
		{
			revString += s.charAt(i);
		}
		return revString;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ReverseString obj = new ReverseString();

		System.out.print("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Reversed String: " + obj.reverse(str));
	}
}
