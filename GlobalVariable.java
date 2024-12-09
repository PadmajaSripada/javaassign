
package FirstPackage;

public class GlobalVariable {
	
	int age =12 ;
	String name = "Ramesh" ;
	
	void employeeDetails(int age , String name)
	{
		 this.age=age;
		 this.name= name;//updating global variables
		 
		 System.out.println("local variable Age=" + age);
		 System.out.println("local variable Name =" + name);
	}
	public static void main(String arg[])
	{
			
		GlobalVariable gb =new GlobalVariable();
		//Before updating global variables
		System.out.println("Before updation age :" + gb.age);
		System.out.println("Before updation name :" + gb.name);
		
		gb.employeeDetails(13,"Ganesh");
				
		System.out.println("Global variable age after updating:" +gb.age);
		System.out.println("Global variable name after updating:" +gb.name);
		
	}

}
