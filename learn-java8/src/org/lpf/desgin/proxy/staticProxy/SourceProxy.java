package org.lpf.desgin.proxy.staticProxy;

import org.lpf.desgin.proxy.Source;
import org.lpf.desgin.proxy.Sourceable;

public class SourceProxy implements Sourceable{

	private Source source;
	
	
	@Override
	public String toString() {
		return "SourceProxy [source=" + source + "]";
	}

	public SourceProxy() {
		this.source = new Source();
	}


	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("proxy method1 before...");
		source.method1();
		System.out.println("proxy method1 after...");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("proxy method2 before...");
		source.method2();
		System.out.println("proxy method2 after...");
	}

	
}
