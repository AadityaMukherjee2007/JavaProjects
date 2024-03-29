package array.search;
import array.sort.SelectionSort;
public class BinarySearch
{
    public boolean search(int[] arr, int n)
    {
        arr = new SelectionSort().ascending(arr);
        int beg = 0, end = arr.length - 1, pos = 0;
        while (beg <= end)
        {
            int mid = (int) ((beg + end) / 2);
            if (n > arr[mid])
            {
                beg = mid + 1;
            }
            else if (n < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                pos = mid;
                return true;
            }
        }
        return false;
    }
    /*
    public boolean search(double[] arr, double n)
    {
        arr = new SelectionSort().ascending(arr);
        return false;
    }*/
    
    public static void main(String args[])
    {
        System.out.print("Class Name: BinarySearch");
    }
}
