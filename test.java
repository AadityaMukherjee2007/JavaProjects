import array.util.Print;
public class test
{
    public static void main(String args[])
    {
        Print obj = new Print();
        int[] arr = {5, 3, 8, 4, 9, 2, 1, 12, 90, 15};
        for (int i = 0; i < arr.length; i++)
        {
            int small = arr[i], pos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < small)
                {
                    small = arr[j];
                    pos = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
        }
        
        obj.print(arr);
    }
}