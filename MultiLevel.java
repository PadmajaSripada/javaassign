package FirstPackage;

   interface Inter_multi
	{
		void add();
		void sub();
	}
    
	abstract class Abstract_multi implements Inter_multi
	{
		abstract void mul();
		public void add()
		{
			System.out.println("Inside Addition");
		}
		void div() {
			System.out.println("Inside Division");
		}
		
	}
	
	public class MultiLevel extends Abstract_multi
	{
		
		public void sub()
		{
			System.out.println("Inside Subtraction");
		}
		void mul()
		{
			System.out.println("Inside multiplication");
		}	
		// main method 
		public static void main(String arg[])
		{
			System.out.println("Inside Main");
			MultiLevel ml = new MultiLevel();
			
			ml.add();
			ml.sub();
			ml.mul();
			ml.div();
			
		}
	}

