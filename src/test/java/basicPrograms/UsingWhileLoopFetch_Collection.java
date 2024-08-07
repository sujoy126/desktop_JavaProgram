package basicPrograms;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class UsingWhileLoopFetch_Collection {
	@Test
	public void m1() {
		List<Integer> li  = new ArrayList<Integer>();
		li.add(10);
		li.add(90);
		li.add(70);
		li.add(5);
		System.out.println(li);
		int index =0;
		while (li.size()>index) {
			System.out.println(li.get(index));
			index++;
		}
	}

}
