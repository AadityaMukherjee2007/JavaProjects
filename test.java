import java.util.Scanner;
public class test 
{
    private int[] arr;
    private int max = 0, min = 0;
    public void in()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length: ");
        int l = sc.nextInt();
        
        this.arr = new int[l];
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter data: ");
            arr[i] = sc.nextInt();
        }
    }
    
    public int max(int[] arr)
    {
        max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    
    public int min(int[] arr)
    {
        min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
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
    
    public double mean(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        double mean = (double) sum / arr.length;
        return mean;
    }
    
    public double median(int[] arr)
    {
        int n = arr.length;
        double median = 0;
        if (n % 2 == 0)
        {
            median = (arr[n/2] + arr[(n+1)/2])/2;
        }
        else
        {
            median = arr[(n+1)/2];
        }
        return median;
    }
    
    public int mode(int[] arr)
    {
        int mode = 0, c = 0; 
        for (int i = 0; i < arr.length; i++)
        {
            int occ = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    occ++;
                }
            }
            if (occ > c)
            {
                c = occ;
                mode = arr[i];
            }
        }
        return mode;
    }
    
    public static void main(String[] args) 
    {
        test obj = new test();
        obj.in();
        obj.print(obj.arr);
        System.out.println("Max: " + obj.max(obj.arr));
        System.out.println("Min: " + obj.min(obj.arr));
        System.out.println("Mean: " + obj.mean(obj.arr));
        System.out.println("Median: " + obj.median(obj.arr));
        System.out.println("Mode: " + obj.mode(obj.arr));
    }
}
