import java.util.Scanner;
public class ArrayComparison
{
	public boolean compare(char[] a, char[] b)
	{
		if (a.length != b.length)
		{
			return false;
		}

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != b[i])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayComparison obj = new ArrayComparison();

		System.out.print("Enter array1 length: " );
		int n1 = sc.nextInt();

		System.out.print("Enter array2 length: ");
		int n2 = sc.nextInt();

		char[] a = new char[n1];
		char[] b = new char[n2];
		
		System.out.println("\nCharacter array1: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print("Input: ");
			a[i] = sc.next().charAt(0);
		}

		System.out.println("\nCharacter array2: ");
		for (int i = 0; i < b.length; i++)
		{
			System.out.print("Input: ");
			b[i] = sc.next().charAt(0);
		}
		
		System.out.println("\nIndentical: " + obj.compare(a, b));
	}
}
