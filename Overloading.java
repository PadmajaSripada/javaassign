package FirstPackage;
	public class Overloading {
		
		Overloading()
		{
			System.out.println("inside constructor without parameter ");
		}
		Overloading(int a)
		{
			this();
			System.out.println("inside constructor with 1 parameter :"+a);
		}
		Overloading(int a , float f){
			this(a);
			System.out.println("Inside constructor with 2 parameter : " + a*f);
		}
	 
		public static void main(String arg[])
		{
			System.out.println("Inside main Overloading");
			
			//Overloading o1 =new Overloading();
			
			Overloading o2 = new Overloading(23, 3);
		}	


	}
