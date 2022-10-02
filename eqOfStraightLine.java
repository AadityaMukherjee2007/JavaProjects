import java.util.Scanner;
public class eqOfStraightLine
{
	String m = "", yItc = "";
	char[] valid  = {'0', '1', '2', '3','4', '5', '6', '7', '8', '9', '/', ' '};
	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Slope: ");
		this.m = sc.nextLine();
		check(m);

		System.out.print("Y-Intercept: ");
		this.yItc = sc.nextLine();
		check(yItc);
	}

	public void check(String s)
	{
		int l = valid.length;
		for (int i = 0; i < s.length(); i++)
		{
			int c = 0;
			for (int j = 0; j < l; j++)
			{
				if (s.charAt(i) != valid[j])
				{
					c++;
				}
			}

			if (c == l)
			{
				System.out.println("Error!");
				System.exit(0);
			}
		}

	}
	
	public void com()
	{
		for (int i = 0; i < m.length(); i++)
		{
			if (m.charAt()
	}

}
