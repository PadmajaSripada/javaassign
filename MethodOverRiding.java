package FirstPackage;

class parent 
{
	void login()
	{   
		System.out.println(" Inside parent class login");
	}
}
public class MethodOverRiding  extends parent
{  
	void login()
	{   
		super.login(); // calling parent class method using super keyword.
		System.out.println("Inside child class login");
	}
	public static void main(String arg[])
	{
		MethodOverRiding m = new MethodOverRiding();
		m.login();
	
	}

}
