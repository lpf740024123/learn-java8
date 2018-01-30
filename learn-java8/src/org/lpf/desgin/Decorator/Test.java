package org.lpf.desgin.Decorator;

public class Test {

	public static void main(String[] args) {
		Sourceable sourceable = new OtherDecorator(new Source());
		sourceable.method1();
		sourceable.method2();
	}
}
