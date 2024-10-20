package week.day5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="google";
Set<Character> newCharacter=new LinkedHashSet<Character>();
for(int i=0;i<str.length();i++)
{
	newCharacter.add(str.charAt(i));
}
      for(Character i :newCharacter)
      {
    	System.out.println(i);
	} 

}
} 