package FirstPackage;
class Super
{
	void add()
	{
		System.out.println("Inside add");
	}
	static void mul()
	{
		System.out.println("Inside mul");
	}
}
public class Assign671 extends Super
{
	void sub()
	{
		System.out.println("Inside sub");
	}
	static void div()
	{
		System.out.println("Inside div");
	}
  	public static void main(String arg[])
	{
		Super s = new Super();
		s.add();
		mul();
				
		Assign671 a = new Assign671();
		a.sub();
		div();
	}
}

