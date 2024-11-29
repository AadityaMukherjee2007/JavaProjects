import java.util.Scanner;
public class OctalMatrix
{
    int[][] arr;
    public OctalMatrix()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("M : ");
        int M = sc.nextInt();
        System.out.print("N : ");
        int N = sc.nextInt();

        if (M <= 0 || M > 9 || N < 3 || N > 5)
        {
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }

        arr = new int[M][N + 1];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("ENTER ELEMENTS FOR ROW" + (i + 1) + " : ");
            for (int j = 0; j < arr[0].length - 1; j++)
            {
                int n = sc.nextInt();
                if (n > 7 || n < 0)
                {
                    System.out.println("INVALID INPUT");
                    System.exit(0);
                }
                arr[i][j] = n;
            }
        }

        sc.close();
    }

    public void compute()
    {
        for (int i = 0 ; i < arr.length; i++)
        {
            int decimalEquivalent = 0, n = arr[0].length - 2;
            for (int j = 0; j < arr[0].length - 1; j++)
            {
                decimalEquivalent += (int) Math.pow(8, n) * arr[i][j];
                n--;
            }

            arr[i][arr[0].length - 1] = decimalEquivalent;
        }
    }

    public void print()
    {
        System.out.println("FILLED MATRIX\tDECIMAL EQUIVALENT");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\t\t" + arr[i][arr[0].length - 1]);
        }
    }

    public static void main(String[] args)
    {
        OctalMatrix obj = new OctalMatrix();
        obj.compute();
        obj.print();
    }
}
