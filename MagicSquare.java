import java.util.Scanner;
public class MagicSquare
{
    int[][] arr;
    MagicSquare()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre Sqaure Matrix Size: ");
        int n = sc.nextInt();

        arr = new int[n][n];

        sc.close();
    }

    public void even()
    {
        int x = 1;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                arr[i][j] = x;
                x++;
            }
        }

        for (int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i][i];
            arr[i][i] = arr[arr.length - (i + 1)][arr.length - (i + 1)];
            arr[arr.length - (i + 1)][arr.length - (i + 1)] = temp;

            temp = arr[i][arr.length - (i + 1)];
            arr[i][arr.length - (i + 1)] = arr[arr.length - (i + 1)][i];
            arr[arr.length - (i + 1)][i] = temp;
        }
    }

    public void odd()
    {
        int x = 1;
        int r = arr.length / 2, c = arr.length - 1;

        arr[r][c] = x;
        x++;

        while (x <= arr.length * arr.length)
        {
            int a, b;
            if (arr[a = r - 1 < 0 ? arr.length - 1 : r - 1][b = c + 1 >= arr.length ? 0 : c + 1] == 0)
            {
                r = a;
                c = b;
                arr[r][c] = x;
            }
            else
            {
                arr[r = r + 1 >= arr.length ? 0 : r + 1][c] = x;
            }
            x++;
        }
    }

    public void print()
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        MagicSquare obj = new MagicSquare();
        if (obj.arr.length % 2 == 0)
            obj.even();
        else
            obj.odd();
        
        obj.print();
    }
}