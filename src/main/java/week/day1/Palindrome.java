package week.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="madam";
	   String rev="";
		char[] charArray=word.toCharArray();
		 for(int i=charArray.length-1;i>=0;i--)
	        {
	        	
	        	rev=rev+charArray[i];
	        }
		 
		if(rev.equals(word))
				{
            System.out.println("the given word is palindrome");
				}
		else {
			System.out.println("the given word is not a palindrome");
		}
	}

}
