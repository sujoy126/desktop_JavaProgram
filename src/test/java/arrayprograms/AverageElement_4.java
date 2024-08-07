package arrayprograms;
//4.	WAP to find the average of the elements in a given Array

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class AverageElement_4 {
	@Test
	public void m1() {
		int ary[] = {1,2,3,4};
		double sum=0;
		double avg;
		for(int i=0; i<ary.length; i++) {
			sum= sum+ary[i];
		}
		avg = sum/ary.length;
		System.out.println(avg);
	}
//using collection
	@Test
	public void m2() {
		int ary[] = {1,2,3,4};
		double sum=0;
		double avg;
		List<Integer> li = new ArrayList<>();
		for(int i : ary) {
			li.add(i);
			sum+= i;
		}
		avg = sum/li.size();
		System.out.println(avg);	
	}
// using map
	@Test
	public void m3() {
		int ary[] = {1,2,3,4,5,6};
		double sum=0;
		double avg;
		Map<Integer, Double> mp = new HashMap<Integer, Double>();
		for(int i : ary) {
			mp.put(i, mp.get(i));
			sum+= i;
		}
		avg = sum/mp.size();
		System.out.println(avg);
	}

}
