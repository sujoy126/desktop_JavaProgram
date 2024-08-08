package arrayprograms;

//5.	WAP to copy one Array elements to another Array in the reverse order

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class ReverseOrder_5 {
	@Test
	public void m1() {
		int ary[]= {1,2,5,3,4,9,6,10};
		int arr[]= new int[ary.length];
		for(int i=0; i<ary.length; i++) {
			arr[i] = ary[ary.length-i-1];
		}
		System.out.println(Arrays.toString(arr));
	}
	@Test
	public void m2() {
		int ary[]= {1,2,5};
		int arr[]= new int[ary.length];
		int index=ary.length-1;
		for(int i: ary) {
			arr[index] = i;
			index--;
			System.out.println(index);
		}
		System.out.println(Arrays.toString(arr));
	}
	
// using Collection
	@Test
	public void m3() {
		String ary[]= {"sunday", "monday", "tuesday", "Wednesday"};
		List<String> li = new ArrayList<String>();
		for(String s: ary) {
			li.add(s);
		}
		Collections.reverse(li);
		System.out.println(li);
	}
	
//Using map
	@Test
	public void m4() {
		String ary[]= {"sunday", "monday", "tuesday", "Wednesday"};
		String arr[]= new String[ary.length];
		HashMap<Integer, String> mp = new HashMap<>();
		for(int i=0; i<ary.length; i++) {
			mp.put(i, ary[i]);
		}
		System.out.println(mp);
		
		 int index =0;
		for(int j=mp.size()-1; j>=0; j--) {
			arr[index]= mp.get(j);
			index++;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	

}