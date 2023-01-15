import java.util.Scanner;
public class ElectricBill
{
    String n;
    int units;
    double bill;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.n = sc.nextLine();
        System.out.print("Enter Units Consumed: ");
        this.units = sc.nextInt();
    }
    
    void calculate()
    {
        if (units <= 100)
        {
            bill = units * 2;
        }
        else if (units > 100 && units <= 300)
        {
            bill = 100 * 2 + (units - 100) * 3;
        }
        else
        {
            bill = 100 * 2 + 200 * 3 + (units - 300) * 5;
            if (units > 300)
            {
                bill += bill * 2.5 / 100;
            }
        }
    }
    
    void print()
    {
        System.out.println("Name of the customer: " + this.n);
        System.out.println("Number of units consumed: " + this.units);
        System.out.println("Bill amount: " + this.bill);
    }
    
    public static void main(String args[])
    {
        ElectricBill obj = new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}