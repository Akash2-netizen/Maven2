package week.day4;

import java.util.ArrayList;
import java.util.List;
public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] num= {'a','b','c','d','e'};
		List<Character> number=new ArrayList<Character>();
		for(int i=0;i<num.length;i++)
		{
		number.add(num[i]);
	}

number.remove(1);
System.out.println(number);


}
}
