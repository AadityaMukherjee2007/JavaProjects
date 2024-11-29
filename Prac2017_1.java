/*
Question 1
A company manufactures packing cartons in four sizes, 
i.e. cartons to accommodate 6 boxes, 12 boxes, 24 boxes and 48 boxes. 
Design a program to accept the number of boxes to be packed (N) by 
the user (maximum up to 1000 boxes) and display the break-up of the 
cartons used in descending order of capacity 
(i.e. preference should be given to the highest capacity available, 
and if boxes left are less than 6, an extra carton of capacity 6 should be used.)

Test your program with the following data and some random data:

Example 1

INPUT:
N = 726

OUTPUT:
48 * 15 = 720
6 * 1 = 6
Remaining boxes = 0
Total number of boxes = 726
Total number of cartons = 16

Example 2

INPUT:
N = 140

OUTPUT:
48 * 2 = 96
24 * 1 = 24
12 * 1 = 12
6 * 1 = 6
Remaining boxes = 2 * 1 = 2
Total number of boxes = 140
Total number of cartons = 6

Example 3

INPUT:
N = 4296

OUTPUT:
INVALID INPUT
*/
import java.util.Scanner;
public class Prac2017_1 
{
    public static void compute(int n)
    {
        int[] cartonSizes = {48, 24, 12, 6};
        int total = 0, t = n;
        for (int i = 0; i < 4; i++)
        {
            int cartonCount = t / cartonSizes[i];
            t = t % cartonSizes[i];
            total += cartonCount;
            if (cartonCount != 0)
            {
                System.out.println(cartonSizes[i] + " * " + cartonCount + " = " + (cartonCount * cartonSizes[i]));
            }
        }

        if (t != 0)
        {
            System.out.println("Remaining boxes = " + t + " * 1" + " = " + t);
            total++;
        }
        else
        {
            System.out.println("Remaining boxes = " + 0);
        }

        System.out.println("Total number of boxes = " + n);
        System.out.println("Total number of cartons = " + total);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("No. of Boxes (1 - 1000): ");
        int n = sc.nextInt();

        if (n < 1 || n > 1000)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }

        compute(n);
        sc.close();
    }
}
