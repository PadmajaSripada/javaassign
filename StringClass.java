package FirstPackage;

import java.util.Arrays;

public class StringClass {
	
	public static void main(String arg[])
	{
		// Assignment 128
		
		StringBuffer sb = new StringBuffer("welcome ");
		
		System.out.println(sb);
		
		sb.append("World");
		
		System.out.println("String after append()  : " + sb);
		
		// Assignment 130
		
		sb.insert(8,"to our ");
		
		System.out.println("String after insert() : " + sb);
		
		// Assignment 131
		
		sb.replace(0,7,"Hello");
		
		System.out.println("String after replace() : " + sb);
		
		// Assignment 132
		
		sb.delete(9, 12);
		
		System.out.println("String after delete() : " + sb);
		
		
		// Assignment 133
		
		sb.reverse();
		
		System.out.println("String after reverse() : " + sb);
		
		// Assignment 134
		 
		 System.out.println(sb.capacity());
		 
		 System.out.println(sb.length());
		 
		 // Assignment 135 Reversing string using charAt() method
		 
		 StringBuffer sb1 = new StringBuffer("Welcome");
		 String str = "";
		  for(int i= sb1.length()-1;i>=0;i--)
		  {
			   System.out.println(sb1.charAt(i));
			   str=str + sb1.charAt(i);
		  }
		 
		 System.out.println("After reversing using charAt() :"+ str);
		 
		 //Assignment 136 
		 
		  str =sb1.substring(3,7);
		
		  System.out.println("Susbstring : " + str);
		 
		// Assignment 129
		
		StringBuilder b1 = new StringBuilder ("Hello ");
		
		b1.append("world");
				
		System.out.println("After append : " + b1);
		
		System.out.println(sb.capacity());
		
		// REmove special characters 
		String tempstr = "ashsjhdj@#@#@#";
		char tempchar[] = tempstr.toCharArray();
		System.out.println(Arrays.toString(tempchar));
		for(int i=0; i <= tempchar.length-1; i++)
		{
			//if(tempchar.tempchar[i]==)
		}
	}

}
