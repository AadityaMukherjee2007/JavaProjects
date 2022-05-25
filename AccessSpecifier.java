public class AccessSpecifier
{
    private String ClassName = "AccessSpecifier";
    protected String ClassType = "Parent Class";
    public String ClassInfo = ClassType + " " + ClassName;
    
    public static void main(String args[])
    {
        System.out.println(new AccessSpecifier().ClassInfo);
    }
}