package week.day2;

import java.util.Arrays;

public class MaxArray {
public static void main(String[] args) {
	 int[] values= {1,2000,500,900,1000};
     int arraySize=values.length;
     Arrays.sort(values);
     System.out.println("The Maximum Number is");
     
     System.out.println(values[arraySize-1]);

	
     }
}
