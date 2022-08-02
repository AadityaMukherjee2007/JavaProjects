package array.sort;
public class SelectionSort
{
    public int[] ascending(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int small = arr[i], pos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (small > arr[j])
                {
                    small = arr[j];
                    pos = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
        }
        return arr;
    }
    
    public double[] ascending(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            double small = arr[i];
            int pos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (small > arr[j])
                {
                    small = arr[j];
                    pos = j;
                }
            }
            double tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
        }
        return arr;
    }
    
    public int[] descending(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int large = arr[i], pos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (large < arr[j])
                {
                    large = arr[j];
                    pos = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
        }
        return arr;
    }

    public double[] descending(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            double large = arr[i];
            int pos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (large < arr[j])
                {
                    large = arr[j];
                    pos = j;
                }
            }
            double tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
        }
        return arr;
    }
    
    public static void main(String args[])
    {
        System.out.println("Class Name: SelectionSort");
    }
}