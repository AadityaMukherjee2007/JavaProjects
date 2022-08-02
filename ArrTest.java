import array.sort.BubbleSort;
import array.sort.SelectionSort;
import array.search.LinearSearch;
import array.util.Print;
public class ArrTest
{
    public static void main(String args[])
    {
        int[] arr1 = {5, 3, 8, 4, 9, 2, 1, 12, 90, 15};
        double[] arr2 = {5.3, 6.9, 5.8, 5.12, 4.76};
        char[] arr3 = {'h', 'e', 'l', 'l', 'o'};
        String[] arr4 = {"Hello", "World"};
        
        Print obj = new Print();
        /*BubbleSort bubl = new BubbleSort();
        double[] sorted = bubl.ascending(arr2);
        obj.print(sorted);*/
        
        SelectionSort sel = new SelectionSort();
        double[] sort = sel.ascending(arr2);
        obj.print(sort);
        
        /*LinearSearch linear = new LinearSearch();
        System.out.println(linear.search(arr2, 6.9));*/
    }
}