import java.util.Scanner;
public class Employee_sal
{
    String name = "", empno = "";
    public Employee_sal(String employeeName, String employeeNo, double basic)
    {
        this.name = employeeName;
        this.empno = employeeNo;
        
        double da = basic * 0.3;
        double hra = basic * 0.15;
        double pf = basic * 0.12;
        double gross = basic + da + hra;
        double netSalary = gross - pf;
        
        System.out.println("\nSalary: " + basic);
        System.out.println("Gross: " + gross);
        System.out.println("Net Salary: " + netSalary);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Employee Number: ");
        String empNo = sc.nextLine();
        System.out.print("Salary: ");
        double sal = sc.nextInt();
        
        Employee_sal info = new Employee_sal(empName, empNo, sal);
    }
}