import java.util.Scanner;
class Bank{
    protected String name;
    protected int accno;
    protected double p;
    public Bank(String n, int a, double p){
        name = n;
        accno = a;
        this.p = p;
    }
    public void display(){
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Principal Amount: " + p);
    }
}
class Account extends Bank{
    double amt;
    public Account(String n, int acc, double p){
        super(n, acc, p);
        amt = 0.0;
    }
    public void deposit(){
        Scanner in = new Scanner(System.in);
        System.out.print("Amount to be deposited: ");
        amt = Double.parseDouble(in.nextLine());
        p += amt;
    }
    public void withdraw(){
        Scanner in = new Scanner(System.in);
        System.out.print("Amount to be withdrawn: ");
        amt = Double.parseDouble(in.nextLine());
        if(amt > p)
            System.out.println("INSUFFICIENT BALANCE");
        else{
            p -= amt;
            if(p < 500)
                p = p - (500 - p) / 10;
        }
    }
    public void display(){
        super.display();
        System.out.println("Transaction Amount: " + amt);
    }
}
public class MyInheritance{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String n = in.nextLine();
        System.out.print("Account Number: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.print("Principal Amount: ");
        double p = Double.parseDouble(in.nextLine());
        Account obj = new Account(n, a, p);
        while(true){
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Details");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(in.nextLine());
            switch(choice){
            case 1:
                obj.deposit();
                break;
            case 2:
                obj.withdraw();
                break;
            case 3:
                obj.display();
                break;
            default:
                System.out.println("Bye!");
                return;
            }
        }
    }
}
