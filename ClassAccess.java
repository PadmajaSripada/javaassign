package FirstPackage;

 public class ClassAccess 
{ 
	 public void add()
	 {
		System.out.println("Add"); 
	 }
	 private void sub()
	 {
		 System.out.println("Sub"); 
	 }
	 protected void div()
	 {
		 System.out.println("div"); 
	 }
	 void mul()
	 {
		 System.out.println("mul"); 
	 }
    public static void main(String arg[])
    {
     
    	ClassAccess ca = new ClassAccess();
    	ca.add();
    	ca.sub();// all access specifiers are accessible in same class.
    	ca.div();
    	ca.mul();
    
    }

}

