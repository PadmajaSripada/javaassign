package FirstPackage;

class Parent1
{
	void add()
	{
		System.out.println("Inside add Parent 1 :");
	}
}
class Child1 extends Parent1
{
	void sub()
	{
		System.out.println("Inside subtract child 1 :");
	}
}
public class Multi_level extends Parent1{

	public void div()
	{
		System.out.println("Inside division Multi_level:");
	}
	
	
	public static void main(String arg[])
	{
		Multi_level ml = new Multi_level();
		
		ml.add();// calling parent class method
		ml.div(); // calling own method
		
		Child1 ch = new Child1();
		ch.add(); // calling parent class method
		ch.sub(); //calling own method
		
	}
}


