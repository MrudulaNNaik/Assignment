package FirstAssignment;



public class StringPalindrome {
	 public static void main(String args[])  
	   {  
	     String s1 = "naik";
	     String s2 = "";	    		 
	      int length = s1.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         s2 = s2 + s1.charAt(i);  
	      if (s1.equals(s2))  
	         System.out.println(" is a palindrome");  
	      else  
	         System.out.println(" is not a palindrome");   
	   }  
}
