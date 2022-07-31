import array.sort.BubbleSort;
import array.search.LinearSearch;
public class ArrTest
{
    public static void main(String args[])
    {
        int[] arr1 = {5, 3, 6, 1, 8};
        double[] arr2 = {5.3, 6.9, 5.8, 5.12, 4.76};
        
        BubbleSort sort = new BubbleSort();
        double[] sorted = sort.ascending(arr2);
        sort.printArray(sorted);
        
        LinearSearch linear = new LinearSearch();
        System.out.println(linear.search(arr2, 6.9));
        
        
    }
}