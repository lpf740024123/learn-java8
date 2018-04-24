package org.lpf.other;

public class Test {

	public static int t(int a,int b) {
		if (a >> 31 == -1) 
			a = ~a + 1;
		if (b >> 31 == -1)
			b = ~b + 1;
		return a ^ b;
		
	}
	
	public static int t(int a) {
		if (a % 100 == 0)
			return a/100;
		else if (a % 10 == 0) {
			return a%100*10 + a/100;
		}
		return a%10 * 99 + a%100 + a/100;
	}
	//a 1 b 2 c 3 d 4 973 300 73 9
	public static void main(String[] args) {

		//System.out.println(Integer.toBinaryString(~-1 ^ 1));
		System.out.println(Integer.toBinaryString(1000000000));
		System.out.println(t(300));
	}
}
