package org.lpf.map.demo1;

import java.util.HashMap;
import java.util.Map;


public class Test {

	public static void main(String[] args) {
		Map<Integer,Object> map = new HashMap<Integer, Object>();
		map.put(1, "test");
		map.put(17, "t");
		
		try {
			throw new RuntimeException("test");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
