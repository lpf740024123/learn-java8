package org.lpf.demo;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class Demo1 {

	@Test
	public void demo1() {
		Function<Integer, Integer> function = (i) -> i + 1;
		Function<Integer, Integer> function1 = (i) -> i << 1;
		Function<Integer, Integer> function2 = function.andThen(function1);
		Function<Integer, Integer> function3 = function.compose(function1);
		System.out.println(function2.apply(5));
		System.out.println(function3.apply(5));
	}
	@Test
	public void demo2(){
		String s = "abc" + "d";
		String s1 = new String(s);
		System.out.println(s.equals(s1));
		System.out.println(s == s1);
	}
	public static void main(String[] args) {
		int a = 0,c = 0;
		do{
			c -- ;
			a = a-1;
		}while(a>0);
		System.out.println(c);
	}
	@Test	
	public void demo3(){
		int[] nums = {10,9,6,20,6,10,8,9,15,80,22,33,11,22,55,44,45,68,68,98,45,47,48,49,1,2,3,4,5};
		TreeSet tree = new TreeSet();
		for(int i = 0;i < nums.length ; i++) {
			tree.add(nums[i]);
		}
		System.out.println(tree);
	}
	
	@Test
	public void demo4(){
		int[] nums = {10,9,6,20,6,10,8,9,15,80};
		IntStream stream = Arrays.stream(nums);
		nums = stream.distinct().sorted().toArray();
		System.out.println(Arrays.toString(nums));
	}
}
