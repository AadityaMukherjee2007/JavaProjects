import java.util.Scanner;
public class test
{
	public int[] arr;
	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();

		arr = new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter data: ");
			arr[i] = sc.nextInt();
		}
	}
	
	public int[] bubbleSort(int[] arr)
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

	public void print(int[] array)
	{
		System.out.print("\n[");
		for (int i = 0; i < array.length; i++)
		{
			if (i != array.length - 1)
			{
				System.out.print(array[i] + ", ");
			}
			else
			{
				System.out.print(array[i]);
			}
		}
		System.out.println("]");
	}

	public static void main(String args[])
	{
		test obj = new test();
		obj.in();
		System.out.print("\nInputted Array: ");
		obj.print(obj.arr);

		obj.arr = obj.bubbleSort(obj.arr);
		System.out.print("\nSorted Array: ");
		obj.print(obj.arr);
	}
}
