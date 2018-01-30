package org.lpf.desgin.Decorator;

public class OtherDecorator extends Decorator{

	
	public OtherDecorator(Sourceable source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("source other decorator1 before  ...");
		super.method1();
		System.out.println("source other decorator1 after   ...");
	}

	
}
