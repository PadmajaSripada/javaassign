package FirstPackage;

 class Google
{
	 Google()
	 {
		 System.out.println("inside Google non parametrized constructor");
	 }
	 Google(int i)
	 {
		System.out.println("inside Google parametrized constructor: "+ i);
	 }
	
}
 class Amazon extends Google
 {
	Amazon()
	{
		System.out.println("inside amazon non parametrized constructor");
	}
	 Amazon(int i)
	{   
		super(i);
		System.out.println("inside amazon parametrized constructor: "+ i);
	}
}
public class SuperCalling extends Amazon
{   
	SuperCalling(int i)
	{  
	 super(i);	
	 System.out.println("Inside super calling Parametrized constructor: " + i );
	}

	SuperCalling()
	{ 
	  System.out.println("inside supercalling non parametrized constructor");
	}
	public static void main(String arg[])
	{  
		
		System.out.println("Inside main");
		
		SuperCalling sc = new SuperCalling(20);
		
	}

}
