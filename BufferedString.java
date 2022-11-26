import java.util.Scanner;
public class BufferedString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(10);
        System.out.println(str.capacity());
        str.append("hello").append(", world!");
        str.insert(4, 'f');
        str.setCharAt(4, 'l');
        str.delete(0, 9);
        System.out.println(str.length());
        System.out.println(str.capacity());
        System.out.println(str.toString());
    }
}
