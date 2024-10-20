package week.day2;

import java.util.Scanner;

public class PalindromeScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc =new Scanner(System.in);
		
		String word=sc.nextLine();
		   String rev="";
			char[] charArray=word.toCharArray();
			 for(int i=charArray.length-1;i>=0;i--)
		        {
		        	
		        	rev=rev+charArray[i];
		        }
			 
			sc.close();
			if(word.equals(rev))
			{
	     System.out.println("The given string is palindrome");
			} 
			else {
          System.out.println("The given string is not a palindrome");
}
}
}