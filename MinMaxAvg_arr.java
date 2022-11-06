import java.util.Scanner;
public class MinMaxAvg_arr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Length: ");
		int n = sc.nextInt();
		
		double[] arr = new double[n];
		System.out.println("\nEnter Data: ");
		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter Number: ");
			arr[i] = sc.nextDouble();
		}

		double min = arr[0], max = arr[0], sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
			else if (min > arr[i])
			{
				min = arr[i];
			}

			sum += arr[i];
		}

		double avg = sum / n;
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Average: " + avg);
	}
}
