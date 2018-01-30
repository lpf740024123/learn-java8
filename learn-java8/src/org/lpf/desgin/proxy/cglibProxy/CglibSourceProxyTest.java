package org.lpf.desgin.proxy.cglibProxy;

import org.lpf.desgin.proxy.Source;

public class CglibSourceProxyTest {

	public static void main(String[] args) {
		try {
			Source s = (Source) new CglibSourceProxy().getInstance(Source.class);
			s.method1();
			s.method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
