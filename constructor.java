import java.util.Scanner;
public class constructor
{
    public String name = "";
    public int age = 0;
    
    public constructor(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void print()
    {
        System.out.println("\nName: " + this.name);
        System.out.println("Age: " + this.age);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Age: ");
        int age = sc.nextInt();
        
        constructor info = new constructor(name, age);
        info.print();
    }
}