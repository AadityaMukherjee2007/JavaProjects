import java.util.Scanner;
public class GreaterNum_ternary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int a = sc.nextInt();
        System.out.print("Number 2: ");
        int b = sc.nextInt();
        
        int greaterNum = a > b ? a : b;
        System.out.println("Greater Num: " + greaterNum);
    }
}