package org.lpf.demo;

import java.util.function.Function;

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
}
