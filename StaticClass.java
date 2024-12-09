package FirstPackage;

public class StaticClass {
	
	
	static void mod()
	{
		int i =223;
		int j=15;
		int k= i%j ;
		System.out.println("Inside mod: " + k );
		
	}
	static void div()
	{
	float  i =223;
		float j=15;
		float k= i/j ;
		System.out.println("Inside div: " + k );
	}
	private static void multiply()
	{
	 float i =23.4f;
	 float j = 21;
	 float k= i*j;
	 System.out.println("inside private method multiply  "+ k);
	}

	static void sub()
	{
		int a=10;
		int b=20;
		int s =b-a ;
		System.out.println("print sub   "+ s);
		//multiply();
	}
	 void add()
	{
		System.out.println("calling add");
	}
	public static void main(String arg[]) {

		System.out.println("calling main");
		StaticClass sc =new StaticClass();
		
		sc.add();
		
		sub();
		
		multiply();
		
		div();
		
		mod();
	}
}
