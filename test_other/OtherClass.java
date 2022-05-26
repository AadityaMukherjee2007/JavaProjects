package test_other;
import test_main.AccessSpecifier;
public class OtherClass
{
    public static void main(String args[])
    {
        AccessSpecifier obj = new AccessSpecifier();
        //System.out.println("Class Name: " + obj.ClassName);
        /*
         * The above statement will throw a compilation error because the 
         * variable ClassName has private access.
         */
        //System.out.println("Class Type: " + obj.ClassType); 
        /*
         * The above statement will throw a compilation error because the 
         * variable ClassType has protected access and can only be accessed
         * subclasses and classes of the same package.
         */
        System.out.println("Class Info: " + obj.ClassInfo);
        /*
         * The above statement can easily print the variable ClassInfo
         * since it has public access.
         */  
    }
}