import java.util.Scanner;
public class MatrixProblem
{
    int[] arr;
    int[][] a;
    public MatrixProblem()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        if (n < 3 || n > 9)
        {
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }

        arr = new int[n];
        a = new int[n][n];

        System.out.print("ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    public void sort()
    {
        for (int i = 0; i < arr.length; i++)
        {
            int smallest = arr[i], pos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (smallest > arr[j])
                {
                    smallest = arr[j];
                    pos = j;
                }
            }

            arr[pos] = arr[i];
            arr[i] = smallest;
        }
    }

    public void fillMatrix()
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i; j++)
            {
                a[i][j] = arr[j];
            }
            int x = 0;
            for (int k = arr.length - i; k < arr.length; k++)
            {
                a[i][k] = arr[x];
                x++;
            }
        }
    }

    public void print()
    {
        System.out.print("SORTED ARRAY : ");
        for (int i = 0 ; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nFILLED MATRIX");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        MatrixProblem obj = new MatrixProblem();
        obj.sort();
        obj.fillMatrix();
        obj.print();
    }
}
