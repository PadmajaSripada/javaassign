package FirstPackage;

	
	interface Inter1  // parent 1
	{
	  void add();
	}
	 
   interface Inter2 //parent 2
   {
	  void sub(); 
   }
   
   public class Multiple implements Inter1,Inter2 
   {
	   public void add()
	   {
		   System.out.println("Inside add");
	   }
	   public void sub()
	   {
		   System.out.println("Inside subtract");
	   }
	   
	   public static void main(String arg[])
	   {
		   Multiple m = new Multiple();
		   
		   m.add();
		   m.sub();
	   }
   }

