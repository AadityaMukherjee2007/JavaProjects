class Access
{
	public  String className = "Access";
	private void PrivateAccess()
	{
		System.out.println("Private");
	}
	
	protected void ProtectedAccess()
	{
		System.out.println("Protected");
	}

	public void print(String str)
	{
		System.out.print(str + " : ");
	}
}

public class SubClass extends Access
{
	private String className = "SubClass";
	private void classInfo()
	{
		System.out.println("Sub Class Name: " + this.className);
	}

	public static void main(String args[])
	{
		SubClass sub = new SubClass();
		Access main = new Access();
		
		System.out.println("Main Class Name: " + main.className);
		sub.classInfo();
		main.print("Access");
		main.ProtectedAccess();	
		//main.PrivateAccess();	
	}
}
