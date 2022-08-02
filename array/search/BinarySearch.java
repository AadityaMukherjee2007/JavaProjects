package array.search;
import array.sort.SelectionSort;
public class BinarySearch
{
    public boolean search(int[] arr, int n)
    {
        arr = new SelectionSort().ascending(arr);
        return false;
    }
    
    public boolean search(double[] arr, double n)
    {
        arr = new SelectionSort().ascending(arr);
        return false;
    }
    
    public static void main(String args[])
    {
        System.out.print("Class Name: BinarySearch");
    }
}