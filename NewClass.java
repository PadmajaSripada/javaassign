package FirstPackage;

public class NewClass {
	
	static  void  add()
	{
		System.out.println("inside static method  add");
	}
	static void mul(int a, int b)
	{
		System.out.println("inside static metthod  mul " + a*b);
	}
	void sub()
	{
	    System.out.println("inside nonstaic method sub");
	 }
	void div(int a , int b)
	{
		System.out.println("Iside nonstatic parametrized div " +  a + b);
	}
	
	NewClass()
	{
		System.out.println("inside constructor non parametrized");
	}
	
	NewClass(int a, int b)
	{
		System.out.println("inside parametrized constructor   " +  a  + b);
	}
	
	public static void main(String arg[])
	{
	  System.out.println("inside main");
	  
	  add();
	  
	  mul(20,30);
	  
	  NewClass nw = new NewClass();
	  
	  new NewClass(20, 30);
	  
	  nw.sub();
	  
	  nw.div(24, 25);
	  
	  
	  
	}

}
