package week.day2;

public class DuplicatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int numbers[]= {1,3,5,7,8,2,3,5,1,7 };
    	System.out.println("The duplicate numbers are");	 
     for(int i=0;i<numbers.length;i++)
     {
    	 for(int j=i+1;j<numbers.length;j++) 
    	 {
    		 if(numbers[i]==numbers[j])
    			 System.out.println(numbers[j]);
    	 }
     }
     }
     

}
