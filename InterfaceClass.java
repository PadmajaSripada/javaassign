package FirstPackage;
	
	 interface Inter
	{
		void add();  // method by default public in interface
		void sub();
	}
    
   class InterfaceClass implements Inter
	{
		
		public void add()
		{
			System.out.println("Inside add");
		}
		public void sub()
		{
			System.out.println("Inside sub");
		}
		
		public static void main(String arg[])
		{
			InterfaceClass in = new InterfaceClass();
			in.add();
			in.sub();
		}
	}
	

