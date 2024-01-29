import java.util.Scanner;
public class Anagram
{
    public String sort(String s)
    {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    char tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return new String(arr);
    }

    public boolean anagram(String a, String b)
    {
        if (sort(a).equals(sort(b)))
            return true;
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1: ");
        String s1 = sc.nextLine().toLowerCase().trim();

        System.out.print("Enter String2: ");
        String s2 = sc.nextLine().toLowerCase().trim();

        System.out.println("Anagram: " + new Anagram().anagram(s1, s2));

        sc.close();
    }
}
