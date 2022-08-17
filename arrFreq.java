import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class arrFreq
{
    int[] arr;
    public void in()
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try
        {
            System.out.print("Array Length: ");
            n = Integer.parseInt(sc.readLine());

            arr = new int[n];
            System.out.print("\nArray: ");
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print("Enter Number: ");
                arr[i] = Integer.parseInt(sc.readLine());
            }
        }
        catch (IOException error)
        {
            System.out.println("Error!");
        }
    }

    public void freq(int[] arr)
    {
        System.out.println("Frequency: ");
        for (int i = 0; i < arr.length; i++)
        {
            int c = 1, set = arr[0]; 
            for (int j = i + 1; j < arr.length; j++)
            {
                if (i != 0)
                {
                    if (arr[i] != set)
                    {
                        if (arr[i] == arr[j])
                        {
                            c += 1;
                            arr[j] = set;
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
                    if (arr[i] == arr[j])        
                    {
                        c += 1;
                        arr[j] = set;
                    }
                }
            }
            if (c == 0)
            {
                continue;
            }
            System.out.println(arr[i] + ": " + c);
        }
    }

    public static void main(String args[])
    {
        arrFreq obj = new arrFreq();
        int[] arr = {2,3,1,5,3,4,1};
        obj.freq(arr);
    }
}