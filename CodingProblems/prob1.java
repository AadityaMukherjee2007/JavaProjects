/*
There are x number of water bottles that are initially full of water. You can exchange y number of empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers x and y, return the maximum number of water bottles you can drink.
Note y cannot be 1 

Eg :
X = 9
Y = 3
Output:13

Explanation:

9 water bottles were drunk so there are 9 empty bottles left

Now you can exchange 3 empty bottles for 1 full bottle 

So 9 empty bottles will get you 3 full bottles

Again those 3 bottles were drunk and now there are 3 empty bottles left 

We again exchange those 3 bottles to get 1 full bottle 

Finally we drink the last bottle and are left with 1 empty bottle

We can no longer exchange since we are short of empty bottles 

Therefore total drinks= 9+3+1=13
 */

 import java.util.Scanner;
public class prob1
{
    public static int compute(int x, int y)
    {
        int z = x, c = 0;
        while (x > 0)
        {
            z++;
            c++;
            x =- y;

            if (c == 3)
            {
                x++;
            }
        }
        return z;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("X = ");
        int x = sc.nextInt();

        System.out.print("Y = ");
        int y = sc.nextInt();

        if (y <= 1)
        {
            System.out.println("Error!");
            System.exit(0);
        }

        System.out.println("OUTPUT: " + compute(x, y));
        
        sc.close();
    }
}