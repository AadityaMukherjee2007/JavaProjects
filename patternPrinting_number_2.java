import java.util.Scanner;
public class patternPrinting_number_2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++)
		{
			for (int j = n - i; j >= 1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}