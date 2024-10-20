package week.day1;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String sentence="welcome to testleaf";
       int count=0;
       char charArray[]=sentence.toCharArray();
       for(int i=0;i<charArray.length;i++) {
    	   if(charArray[i]=='e')
    	   {
    	   count++;
    	   }
    	   
       }
       System.out.println("the character occurance of e is " +count);
	}
}
