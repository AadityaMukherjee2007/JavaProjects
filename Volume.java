import java.util.Scanner;
public class Volume
{
	double volume(double R)
	{
		double v = (4 / 3) * (22 / 7) * Math.pow(R, 3);
		return v;
	}

	double volume(double H, double R)
	{
		double v = (22 / 7) * Math.pow(R, 2) * H;
		return v;
	}

	double volume(double L, double B, double H)
	{
		double v = L * B * H;
		return v;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Volume obj = new Volume();

		System.out.println("Volume: \n0 --> Exit\n1 --> Sphere\n2 --> Cylinder\n3 --> Cuboid\n");
		System.out.print("Enter choice: ");
		int ch = sc.nextInt();
		switch (ch)
		{
			case 0 : System.exit(0);
			case 1 : 
			{
				System.out.print("\nEnter radius: ");
				System.out.println("Volume: " +  obj.volume(sc.nextDouble()));
			}
			break;
			case 2 :
			{
				System.out.print("\nEnter height: ");
				double h = sc.nextDouble();
				System.out.print("Enter radius: ");
				double r = sc.nextDouble();
				System.out.println("Volume: " + obj.volume(h, r));
			}
			break;
			case 3 : 
			{
				System.out.print("\nEnter length: ");
				double l = sc.nextDouble();
				System.out.print("Enter breadth: ");
				double b = sc.nextDouble();
				System.out.print("Enter height: ");
				double h = sc.nextDouble();
				System.out.println("Volume: " + obj.volume(l, b, h));
			}
			break;
			default : System.out.println("Error!\nEnter proper input.");
		}
	}
}

