import array.sort.BubbleSort;
import array.sort.SelectionSort;
import array.search.LinearSearch;
import array.util.Print;
public class ArrTest
{
    public static void main(String args[])
    {
        int[] arr1 = {5, 3, 6, 1, 8};
        double[] arr2 = {5.3, 6.9, 5.8, 5.12, 4.76};
        char[] arr3 = {'h', 'e', 'l', 'l', 'o'};
        String[] arr4 = {"Hello", "World"};
        
        Print obj = new Print();
        obj.print(arr1);
        obj.print(arr2);
        /*obj.print(arr3);
        obj.print(arr4);
        /*
        BubbleSort bubl = new BubbleSort();
        double[] sorted = bubl.ascending(arr2);
        obj.print(sorted);*/
        
        SelectionSort sel = new SelectionSort();
        int[] sort1 = sel.ascending(arr1);
        int[] sort2 = sel.descending(arr1);
        obj.print(sort1);
        obj.print(sort2);
        
        /*LinearSearch linear = new LinearSearch();
        System.out.println(linear.search(arr2, 6.9));*/
    }
}