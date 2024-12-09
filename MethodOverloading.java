package FirstPackage;

public class MethodOverloading {
	
    static int a = 10;
    static int b =20;
	
	static void add()
	{
		System.out.println(a+b);
	}
	static void sub()
	{
		System.out.println(b-a);
	}
	static void mul()
	{
		System.out.println(a*b);
	}
	static void div()
	{
		System.out.println(b/a);
	}
	static void mod()
	{
		System.out.println(a%b);
	}
	 void add(int a)
	{
		System.out.println(a+b);
	}
	void sub(int a , int b)
	{
		System.out.println(b-a);
	}
	 void mul(int a , int b)
	{
		System.out.println(a*b);
	}
	 void div(int a , int b)
	{
		System.out.println(a/b);
	}
	void mod(int a , int b)
	{
		System.out.println(a%b);
	}
	public static void main(String arg[])
	{
		System.out.println("Inside main: "+a);
		// calling static method 
		add();
		sub();
		mul();
		div();
		mod();
		// calling nonstatic method
		MethodOverloading mo = new MethodOverloading();
		mo.add();
		mo.sub(b,a);
		mo.mul(a,b);
		mo.div(b, a);
		mo.mod(a, b);
		
	}
}
