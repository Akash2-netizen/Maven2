package week.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=8;
      int count=0;
     for(int i=1;i<=num;i++)
     { 
     if(num%i==0)
      count++;
     }
    	  if(count==2)
    	  {
    		  System.out.println("The given number is prime number");
    	  }
    	  else {
    		  System.out.println("The given number is not a prime number");
    	  }
      }
	}


