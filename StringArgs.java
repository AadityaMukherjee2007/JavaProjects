public class StringArgs
{
    static int sum = 0;
    public static void main(String args[])
    {
        int len = args.length;
        for (int i = 0; i < len; i++)
        {
            sum += Integer.valueOf(args[i]);
        }
        System.out.print("Sum: " + sum);
    }
}