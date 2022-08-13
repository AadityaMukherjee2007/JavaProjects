import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Average_2dArray
{
    String[] subject = {"Physics", "Chemistry", "Maths"};
    double[][] marks;
    double[] avg, percAvg;
    int n = 0, totalMarks;
    public void in()
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Total Marks: ");
            totalMarks = Integer.parseInt(sc.readLine());
            System.out.print("Number of Students: ");
            n = Integer.parseInt(sc.readLine());

            marks = new double[n][3];
            avg = new double[n];
            percAvg = new double[n];

            System.out.println("Enter Data: ");
            for (int i = 0; i < marks.length; i++)
            {
                System.out.println("\nStudent" + (i + 1) + " :");
                for (int j = 0; j < 3; j++)
                {
                    System.out.print(subject[j] + ": ");
                    marks[i][j] = Double.parseDouble(sc.readLine());
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error!");
        }
    }
    
    public void average()
    {
        for (int i = 0; i < marks.length; i++)
        {
            double sum = 0, perc = 0;
            for (int j = 0; j < 3; j++)
            {
                sum += marks[i][j];
                perc += (marks[i][j] / totalMarks) * 100;
            }
            avg[i] = sum / 3;
            percAvg[i] = perc / 3;
        }
    }
    
    public void printAvg()
    {
        System.out.println();
        for (int i = 0; i < avg.length; i++)
        {
            System.out.println("\nStudent" + (i + 1) + ": ");
            System.out.println("Average: " + avg[i] + "\nAverage(%): " + percAvg[i]);
        }
    }

    public static void main(String args[])
    {
        Average_2dArray obj = new Average_2dArray();
        obj.in();
        obj.average();
        obj.printAvg();
    }
}