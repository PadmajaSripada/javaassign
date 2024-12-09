package FirstPackage;

public class StringFunction {
	
	public static void main(String arg[])
	{
		
		
		String s1 = "automation";
		String s3 = "automation";
		System.out.println(s1==s3);
		
		System.out.println(s1.replace('a','m'));  // replace char
		
		String test = "WElcome to java";
		String result =test.replace("java","grow tech minds");
		System.out.println(result);
		
		System.out.println(s1.replace("auto", "api")); // replace charsequence
		
		
		String s2= "Manish Kumar Tiwari";
		System.out.println();
		System.out.println(s2.replaceAll("[a-z]", ""));
		
		System.out.println(s2.replaceAll("[a-z]","").replaceAll("","\n")); 


		String str = "axe" ;
		System.out.println(str.matches("..."));
		
		System.out.println(str.endsWith("e"));
		
		
		
		String str1 = "Manish tiwari";
		System.out.println(str1.matches("M(.*)")); // starts with M
		
		System.out.println(str1.matches("(.*)i")); // ends with i
		
		System.out.println(str1.matches("(.*)U(.*)")); // have the letter U 
		
		System.out.println(str1.concat("\n").repeat(5));  // repeat the string"
		
		System.out.println(str1.lastIndexOf('i')); // last index of the char
		
		String temp = "Manish Kumar Tiwari";
		System.out.println(str.concat(str1)); // concatenation 
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("world");                       // append method string buffer class
		
		System.out.println(sb);
		
		System.out.println(str);
		
		
		
		
	}

}
