package array.sort;
public class BubbleSort
{
    public int[] ascending(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {    
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        return arr;
    }
    
    public double[] ascending(double arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {    
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    double swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        return arr;
    }
    
    public int[] descending(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] < arr[j+1])
                {
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        return arr;
    }
    
    public double[] descending(double arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] < arr[j+1])
                {
                    double swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        return arr;
    }
    
    public void printArray(int[] arr)
    {
        System.out.print("[");
        for (int i= 0; i < arr.length; i++)
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
    
    public void printArray(double[] arr)
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
        System.out.println("Class Name: BubbleSort");
    }
}