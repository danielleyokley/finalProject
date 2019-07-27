package FinalExam;

import java.util.HashSet;
import java.util.Set;

public class MethodStringBuilder {

	public static void main(String args[]){  
		
		 Set<Integer> numbers = new HashSet<Integer>();
		 numbers.add(0);
		 numbers.add(1);
		 numbers.add(2);
		 numbers.add(3);
		 numbers.add(4);
	
		StringBuilder createStringCount = new StringBuilder(4); {
		for (Integer nums : numbers) {
			createStringCount.append(nums);
		}
		System.out.println(createStringCount.toString());	
}
}
}