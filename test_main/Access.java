package test_main;
public class Access
{
    public static void main(String args[])
    {
        AccessSpecifier obj = new AccessSpecifier();
        //System.out.println("Class Name: " + obj.ClassName);
        /*
         * The above statement will throw a compilation error because the 
         * variable ClassName ghas private access.
         */
        System.out.println("Class Type: " + obj.ClassType); 
        /*
         * The above statement can easily print the variable ClassType
         * since it has protected access which can be accessed by a 
         * subclass or a class of the same package but not any other class.
         */
        System.out.println("Class Info: " + obj.ClassInfo);
        /*
         * The above statement can easily print the variable ClassInfo
         * since it has public access.
         */  
    }
}