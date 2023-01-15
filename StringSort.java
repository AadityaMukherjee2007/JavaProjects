import array.util.Print;
//code not working... under progress...
public class StringSort
{
    public String[] bubbleSort(String[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length - 1; j++)
            {
                int comp = 0;
                if (a[j].length() < a[j+1].length())
                {
                    comp = a[j].length();
                }
                else
                {
                    comp = a[j+1].length();
                }
                
                for (int k = 0; k < comp; k++)
                {
                    if ((int) a[j].charAt(k) > (int) a[j+1].charAt(k))
                    {
                        String temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                        break;
                    }
                }
            }
        }
        return a;
    }
    
    public static void main(String args[])
    {
        String[] arr = {"hello","trouble","welcome","world","online","computer","technology","internet"};
        arr = new StringSort().bubbleSort(arr);
        new Print().print(arr);
    }
}