package week.day2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word");
		Scanner sc =new Scanner(System.in);
		
		String word=sc.nextLine();
		   String rev="";
			char[] charArray=word.toCharArray();
			 for(int i=charArray.length-1;i>=0;i--)
		        {
		        	
		        	rev=rev+charArray[i];
		        }
			 
			System.out.println(rev);
			sc.close();
		}
	}


