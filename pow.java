import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pow
{
	public double pow(double n, int p)
	{
		double pow = 1;
		for (int i = 1; i <= p; i++)
		{
			pow *= n;
		}
		return pow;
	}

	public static void main(String args[])
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("Number: ");
			double num = Double.parseDouble(sc.readLine());
			System.out.print("Power: ");
			int power = Integer.parseInt(sc.readLine());
			System.out.println("Answer = " + new pow().pow(num, power));
		}
		catch (IOException error)
		{
			System.out.println("Error!");
		}
	}
}