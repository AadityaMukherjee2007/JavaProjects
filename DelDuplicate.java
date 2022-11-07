import java.util.Scanner;
public class DelDuplicate
{
	int[] array;
	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length: ");
		int n = sc.nextInt();

		array = new int[n];
		System.out.println("\nEnter Data:");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Enter Number: ");
			array[i] = sc.nextInt();
		}
	}

	public int[] delDupl(int[] arr)
	{
		int set = arr[0], len = arr.length;
		for (int i = 0; i < arr.length; i++)
		{
			int ocr = 0;
			for (int j = i - 1; j >= 0; j--)
			{
				if (arr[i] == arr[j])
				{
					ocr = 1;
					break;
				}
			}

			if (ocr == 0)
			{
				for (int k = i; k < arr.length; k++)
				{
					if (arr[i] == arr[k])
					{
						arr[k] = set;
						len--;
					}
				}
			}
		}

		int[] temp = new int[len];
		int index = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (i == 0)
			{
				temp[index] = arr[0];
				index++;
			}
			else
			{
				if (arr[i] == set)
				{
					continue;
				}
				else
				{
					temp[index] = arr[i];
					index++;
				}
			}

		}
		arr = temp;
		return arr;
	}

	public void print(int[] arr)
	{
		System.out.print("[");
		for (int i = 0; i < arr.length; i++)
		{
			if (i != arr.length - 1)
			{
				System.out.print(arr[i] + ", ");
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
	}

	public static void main(String args[])
	{
		DelDuplicate obj = new DelDuplicate();
		obj.in();
		obj.print(obj.array);
		obj.array = obj.delDupl(obj.array);
		obj.print(obj.array);
	}
}
