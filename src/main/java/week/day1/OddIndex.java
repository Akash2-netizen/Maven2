package week.day1;

public class OddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="transformation";
	       
	       char charArray[]=sentence.toCharArray();
	       for(int i=0;i<charArray.length;i++) {
	    	   if(i%2!=0)
	    	   {
	    	   charArray[i]=Character.toUpperCase(charArray[i]);
	    	   }
	}
          System.out.println(charArray);
}
}
