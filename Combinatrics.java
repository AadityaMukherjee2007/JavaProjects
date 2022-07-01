import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Combinatrics
{
	public int fact (int n)
	{
		int fac = 1;
		for (int i = 1; i <= n; i++)
		{
			fac *= i;
		}
		return fac;
	}

	public static void main(String args[])
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		Combinatrics obj = new Combinatrics();
		
		int n = 0, r = 0;

		try
		{
			System.out.print("n: ");
			n = Integer.parseInt(sc.readLine());
			System.out.print("r: ");
			r = Integer.parseInt(sc.readLine());
		}
		catch (IOException error)
		{
			System.out.print("Error!");
		}

		double ncr = obj.fact(n) / obj.fact(n - r);
		System.out.println(n + "c" + r + " = " + ncr);
	}
}