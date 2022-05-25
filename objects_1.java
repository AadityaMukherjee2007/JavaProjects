public class objects_1
{
    public double height = 30.55;
    public double width = 12.62;
    
    public static void main(String args[])
    {
        /*
         * In statement 1, new objects_1 object in being created and 
         * immediately accesses the instance variable height and prints it.
         * After this statement is executed, the program no lomnger has any 
         * reference to created objects_1 object because it was never stored
         * in a variable.
         */
        System.out.println("Height: " + new objects_1().height); // Statement 1
        System.out.println("Width: " + new objects_1().width); //Statement 2
    }
}