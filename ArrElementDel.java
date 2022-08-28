import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ArrElementDel
{
    int[] arr;
    public void in()
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Array Length: ");
            int n = Integer.valueOf(sc.readLine());
            arr = new int[n];
            
            System.out.println("Enter Data:");
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print("Enter Number: ");
                arr[i] = Integer.valueOf(sc.readLine());
            }
        }
        catch (IOException e)
        {
            System.out.println("Error!");
        }
    }
    
    public void del(int n)
    {
        int[] copy = new int[arr.length - 1];
        int pos = 0, j = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            if (n == arr[i])
            {
                pos = i;
                break;
            }
            else if (i == arr.length - 1 && n != 0)
            {
                System.out.println("Element not found!");
                System.exit(0);
            }
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != arr[pos])
            {
                copy[j] = arr[i];
                j++;
            }
            else
            {
                continue;
            }
        }
        
        arr = copy;
    }
    
    public static void main(String args[])
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrElementDel obj = new ArrElementDel();
        obj.in();
        try
        {
            System.out.print("\nEnter element to be deleted: ");
            int element = Integer.parseInt(sc.readLine());
            obj.del(element);
        }
        catch (IOException e)
        {
            System.out.println("Error!");
        }
        
        System.out.print("\nArr[] = {");
        for (int i = 0; i < obj.arr.length; i++)
        {
            if (i != obj.arr.length - 1)
            {
                System.out.print(obj.arr[i] + ", ");
            }
            else
            {
                System.out.print(obj.arr[i]);
            }
        }
        System.out.println("}");
    }
}