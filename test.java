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

	public void print(int[] array)
	{
		System.out.print("\n[");
		for (int i = array.length - 1; i >= 0; i--)
		{
			if (i != 0)
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
		obj.print(obj.arr);
	}
}
