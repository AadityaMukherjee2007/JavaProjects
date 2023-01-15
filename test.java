import java.util.Scanner;

public class test 
{
    public int[] sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int small = arr[i], loc = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (small > arr[j])
                {
                    small = arr[j];
                    loc = j;
                }
            }
            int tmp = arr[i];
            arr[i] = small;
            arr[loc] = tmp;
        }
        return arr;
    }

    public void freq(int[] arr)
    {
        arr = this.sort(arr);
        int set = arr[0];
        System.out.println("Frequency: ");
        for (int i = 0; i < arr.length; i++)
        {
           int c = 1;
           for (int j = i + 1; j < arr.length; j++)
           {
                if (i != 0)
                {
                    if (arr[i] != set)
                    {
                        if (arr[j] == arr[i])
                        {
                            arr[j] = set;
                            c++;
                        }
                    }
                    else
                    {
                        c = 0;
                        break;
                    }
                }
                else
                {
                    if (arr[j] == arr[i])
                    {
                        arr[j] = set;
                        c++;
                    }
                }
           } 
           if (c == 0)
           {
                continue;
           }
           System.out.println(arr[i] + " : " + c);
        }
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

    public static void main(String[] args) 
    {
        int[] array = {3, 1, 4, 5, 6, 9, 2, 5, 5, 4, 3, 3, 8, 9, 9, 9, 1, 1, 2, 6, 8, 3, 3, 2, 0, 6, 7};
        test obj = new test();
        obj.print(array);
        //obj.sort(array);
        //obj.print(array);
        obj.freq(array);
    }
}
