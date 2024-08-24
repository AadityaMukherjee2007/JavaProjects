import java.util.Scanner;
public class InsertionSort
{
	int[] arr;
	int size;
	InsertionSort(int len)
	{
		arr = new int[len];
		size = len;
	}

	public void sort()
	{
		for (int i = 0; i < size - 1; i++)
		{
			int j = i + 1, temp = arr[j];
			while (j > 0 && arr[j - 1] > temp)
			{
				arr[j] = arr[j - 1];
				j--;
			}

			arr[j] = temp;
		}
	}

	public void in()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Data: ");
		for (int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}

		sc.close();
	}

	public void print()
	{
		System.out.print("[");
		for (int i = 0; i < size; i++)
		{
			System.out.print(arr[i]);

			if (i < size - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Array: ");
		int n = sc.nextInt();

		InsertionSort obj = new InsertionSort(n);

		obj.in();
		obj.sort();
		obj.print();

		sc.close();
	}

}