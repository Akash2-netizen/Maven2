package week.day2;

import java.util.Arrays;

public class LearnArrarys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] values= {100,600,300,200,400,500};
      int arraySize=values.length;
      Arrays.sort(values);
      System.out.println("The ascending order is");
      for(int i=0;i<arraySize;i++)
      {
      System.out.println(values[i]);
      }
      System.out.println("The descending order is");
      for(int i=arraySize-1;i>=0;i--)
      {
      System.out.println(values[i]);
      }
	}

}
