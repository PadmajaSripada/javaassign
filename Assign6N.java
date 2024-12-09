package FirstPackage;

import java.util.*;

public class Assign6N {
	static int counter=0;
	static int counter1=0;
	static int counter2=0;
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Text");
		
		String text = sc.next();
		System.out.println(text);
		
		System.out.println("Length of String :" + text.length()); // length
		
		System.out.println("Upper case String :" + text.toUpperCase()); // uppercase
		
		System.out.println("lower case String :" + text.toLowerCase()); // lowercase
		
		//substring 
		System.out.println("Substring :" + text.substring(2));
		System.out.println("Substring :" + text.substring(2,3));
		
		System.out.println("Enter index no:");
		int i = sc.nextInt();
		
		System.out.println("Character at index " + i + ":" + text.charAt(i));
		
		String str = "kv no 2";
		
	    char temp[]=  str.toCharArray();
        System.out.println("temp="+Arrays.toString(temp));
        
       for(int j=0; j< str.length(); j++)
       {
    	  
    	   boolean v1=Character.isAlphabetic(temp[j]) ;
    	   if(v1==true) 
    	   {
    		   counter++;
    	   }    
           boolean v2= Character.isDigit(temp[j]);
           if(v2==true)
           {
        	  counter1++; 
           }   
           boolean v3 = Character.isWhitespace(temp[j]);
           if(v3==true)
           {
        	   counter2++;
           }   
         }
       System.out.println("Count of Alphabet "+ counter);
       System.out.println("count of numeric "+ counter1);
       System.out.println("count of spaces " + counter2);
     } 
	
}


