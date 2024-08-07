package arrayprograms;

import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ElementPresentUsingLoop_2_3 {
	@Test
	public void m1() {
		int ary[] = {1,2,3,4};
		// using for loop
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
		System.out.println("--------");
		//using for each loop
		for (int j : ary) {
			System.out.println(j);
		}
	}
	// using while loop
	@Test
	public void m2() {
		int ary[] = {1,2,3,4};
		int index = 0;
		while(ary.length>index) {
			System.out.println(ary[index]);
			index++;
		}
	}
	//using do while loop
		@Test
		public void m3() {
			int ary[] = {1,2,3,4};
			int index =0;
			do {
				System.out.println(ary[index]);
				index++;
			} while (ary.length-1>=index);
		}
}
