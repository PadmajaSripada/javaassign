package FirstPackage;

public class Interface_Class {
	
public void add()
{
	System.out.println("Addition");
	
}
public void sub()
{
	System.out.println("Subtraction");
	
}
public void mul()
{
	System.out.println("Multiplication");
	
}
public void div()
{
	System.out.println("Division");
	
}
public void modulus()
{
	System.out.println("Modulus");
	
}
public void percent()
{
	System.out.println("Percent");
	
}

 public static void main(String []arg)
	{
		Interface_Class ic = new Interface_Class();
		ic.add();
		ic.div();
		ic.modulus();
		ic.percent();
		
	}

}
