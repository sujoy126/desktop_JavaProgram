package basicPrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

import org.testng.annotations.Test;
// Convert List to array

public class ConvertLIstToArray {
	@Test
	public void m2() {
		Stack<Integer> li = new Stack();
		li.add(100);
		li.add(20);
		li.add(50);
		li.add(40);
		System.out.println(li.peek());
		System.out.println(li.pop());
//		Convert List to array		
	Object[] ar = li.toArray();
		System.out.println(Arrays.toString(ar));
// collection sort		
		Collections.sort(li);
		System.out.println(li);
		
    Integer minimum = Collections.min(li);
    System.out.println(minimum);
    
    
	}

}
