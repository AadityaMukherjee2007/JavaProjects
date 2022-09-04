public class PrePostIncrement
{
    public static void main(String args[])
    {
        int a = 5, b = 7;
        a += ++b - a++;
        System.out.println(a);
    }
}