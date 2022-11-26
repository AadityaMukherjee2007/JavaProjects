import java.util.Scanner;
import array.sort.SelectionSort;
public class DelDuplicate
{
    int[] array;
    public void in()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int n = sc.nextInt();

        array = new int[n];
        System.out.println("\nEnter Data:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Enter Number: ");
            array[i] = sc.nextInt();
        }
    }

    public int[] delDupl(int[] arr)
    {
        int j = 0;
        arr = new SelectionSort().ascending(arr);
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] != arr[i + 1])
            {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];
        int[] temp = new int[j];
        for (int i = 0; i < j; i++)
        {
            temp[i] = arr[i];
        }
        return temp;
    }
    
    public void print(int[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
        {
            if (i != arr.length - 1)
            {
                System.out.print(arr[i] + ", ");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    public static void main(String args[])
    {
        DelDuplicate obj = new DelDuplicate();
        obj.in();
        obj.print(obj.array);
        obj.array = obj.delDupl(obj.array);
        obj.print(obj.array);
    }
}
