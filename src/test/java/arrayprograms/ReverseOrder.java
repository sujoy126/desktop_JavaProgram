package arrayprograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReverseOrder {
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

}