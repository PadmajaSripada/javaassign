package FirstPackage;

  abstract class Abstract {
	
	  abstract void add();
	  abstract void sub();
	  void mul()
	  {
	     	System.out.println("Inside nonstatic method ");
	  }
	   
	  static void div()
	  {
		System.out.println("Inside nonstatic method div");
	  }
	  
	}

public class AbstractClass extends Abstract
{
	
	void add()
	{
		System.out.println("Inside Add");
	}
	void sub()
	{
		System.out.println("Inside sub");
	}
	void mul()
	{
		super.mul();
		System.out.println("Overriding nonstatic mul method");
		
	}
	
	public static void main(String arg[])
	{
		AbstractClass ac = new AbstractClass();
		ac.add();
		
		ac.mul();
		ac.sub();
		div();
		
	}
}




