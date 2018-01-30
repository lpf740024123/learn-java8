package org.lpf.desgin.proxy.staticProxy;

import org.lpf.desgin.proxy.Sourceable;

public class Test {

	public static void main(String[] args) {
		Sourceable sourceable = new SourceProxy();
		sourceable.method1();
		sourceable.method2();
	}
}
