import java.util.Scanner;
public class BinarySearch
{
	int[] arr = {4, 5, 3, 8, 1, 9, 0, 2};
	public int[] sort(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					a[j] = a[j] + a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
				}
			}
		}
		return a;
	}

	public void search(int[] a, int n)
	{
		int s = 0, e = a.length - 1;
		while (s <= e)
		{
			int m = (s + e) / 2;
			if (n > a[m])
			{
				s = m + 1;
			}
			else if (n < a[m])
			{
				e = m - 1;
			}
			else
			{
				System.out.println("Found at position " + (m + 1) + ".");
				System.exit(0);
			}

		}
		System.out.println("Not found!");
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BinarySearch obj = new BinarySearch();
		
		obj.arr = obj.sort(obj.arr);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		obj.search(obj.arr, n);
	}
}
