package org.lpf.desgin.Decorator;

/**
 * 装饰者
 *
 */
public class Decorator implements Sourceable{

	private Sourceable source;

	public Decorator(Sourceable source){
		this.source = source;
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("source decorator method1 before ...");
		source.method1();
		System.out.println("source decorator method1 after ...");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("source decorator method2 before ...");
		source.method2();
		System.out.println("source decorator method2 after ...");
	}
}
