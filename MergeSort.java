import java.util.Scanner;
public class MergeSort
{
	int[] a, b;
	int la, lb;
	MergeSort()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length for array a: ");
		int la = sc.nextInt();
		System.out.print("Enter length for array b: ");
		int lb = sc.nextInt();

		a = new int[la];
		b = new int[lb];

		System.out.println("Enter data for array a:");
		a = in(a, sc);
		System.out.println("Enter data for array b:");
		b = in(b, sc);

		sc.close();
	}

	public int[] in(int[] arr, Scanner sc)
	{
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		return arr;
	}

	public int[] min(int[] a, int[] b)
	{
		if (a.length > b.length)
			return b;
		else
			return a;
	}

	public int[] max(int[] a, int[] b)
	{
		if (a.length > b.length)
			return a;
		else
			return b;
	}

	public int[] sort(int[] arr) //implementing bubble sort
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length - 1; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}
		return arr;
	}	

	public int[] merge(int[] a, int[] b)
	{
		int[] sorted = new int[a.length + b.length];
		int i = 0, j = 0, c = 0;

		a = sort(a);
		b = sort(b);
		
		int[] smaller = min(a, b);
		int[] larger = max(a, b);

		while (j < smaller.length)
		{
			if (larger[i] > smaller[j])
			{
				sorted[c] = smaller[j];
				j++;
				c++;
			}
			else
			{
				sorted[c] = larger[i];
				i++;
				c++;
			}
		}

		for (int k = i; k < larger.length; k++, c++)
		{
			sorted[c] = larger[k];
		}

		return sorted;
	}

	public void print(int[] arr)
	{
		System.out.print("[");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);

			if (i < arr.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

	public static void main(String args[])
	{
		MergeSort obj = new MergeSort();
		int[] c = obj.merge(obj.a, obj.b);
		
		System.out.println();
		obj.print(c);
	}
}