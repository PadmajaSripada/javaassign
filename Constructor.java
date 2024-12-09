package FirstPackage;

public class Constructor {
	
	Constructor()
	{
		System.out.println("Inside Constructor");
	}
	 static void add()
	 {
		 System.out.println("Inside Addition");
	 }
	 void sub()
	 {
		 System.out.println("Inside Subtraction");
	 }
	public static void main(String arg[])
	{ 
		// constructor calling
		Constructor c1 = new Constructor();
		
		//calling static method
		add();
		
		//calling nonstatic method
		c1.sub();
		
	}

}
