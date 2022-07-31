package array.search;
public class LinearSearch
{
    public boolean search(int[] arr, int n)
    {
         for (int i = 0; i < arr.length; i++)
         {
             if (arr[i] == n)
             {
                 return true;
             }
         }
         return false;
    }
    
    public boolean search(double[] arr, double n)
    {
         for (int i = 0; i < arr.length; i++)
         {
             if (arr[i] == n)
             {
                 return true;
             }
         }
         return false;
    }
    
    public static void main(String args[])
    {
        System.out.println("Class Name: LinearSearch");
    }
}