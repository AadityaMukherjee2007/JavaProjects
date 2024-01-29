import java.util.Scanner;
public class InsertString
{
    public String insert(String str, String txt, int i)
    {
        String s = str.substring(0, i) + txt + str.substring(i);
        return s;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter string to be inserted: ");
        String txt = sc.nextLine();
        System.out.print("Enter index: ");
        int n = sc.nextInt();

        str = new InsertString().insert(str, txt, n);

        System.out.println("Inputted text: " + str);
        System.out.println(str);

        sc.close();
    }
}