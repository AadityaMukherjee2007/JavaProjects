import java.util.Scanner;
public class LinearSearch
{
	int[] arr = {4, 5, 3, 8, 1, 9, 0, 2};
	public void search(int[] a, int n)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == n)
			{
				System.out.println("Found at position " + (i + 1) + ".");
				System.exit(0);
			}
		}
		System.out.println("Not found!");
	}

	public static void main(String args[])
	{
		LinearSearch obj = new LinearSearch();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int n = sc.nextInt();

		obj.search(obj.arr, n);
	}
}
