import java.util.Scanner;
public class DynamicArray
{
    public int arr[];
    public int len;
    
    public void init()
    {
        Scanner in = new Scanner(System.in);
        arr = new int[len];
        
        System.out.println("\nEnter Data: ");
        for (int i = 0; i < len; i++)
        {
            System.out.print("Enter Number: ");
            arr[i] = in.nextInt();
        }
    }
    public void printArray()
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
        {
            if (i != (arr.length - 1))
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
    public void add(int n)
    {
        int newArr[] = new int[len + 1];
        for (int i = 0; i < len; i++)
        {
            newArr[i] = arr[i];
        }
        newArr[len] = n;
        arr = newArr;
        len++;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        DynamicArray obj = new DynamicArray();
        
        System.out.print("Array Length: ");
        obj.len = sc.nextInt();
        obj.init();
        
        char ch, op;
        do
        {
            System.out.print("\nEnter new element?[y/n] : ");
            ch = sc.next().charAt(0);
            
            if (ch == 'y' || ch == 'Y')
            {
                try
                {
                    System.out.print("Enter Element: ");
                    int n = sc.nextInt();
                    obj.add(n);
                    System.out.println("Successfully added element.");
                }
                catch (Exception e)
                {
                    System.out.println("Error!\nPls input integer type only.");
                }
            }
            
            System.out.print("\nPrint Array?[y/n] : ");
            op = sc.next().charAt(0);
            
            if (op == 'y' || op == 'Y')
            {
                obj.printArray();
            }
        }
        while (ch != 'n' && ch != 'N');
    }
}