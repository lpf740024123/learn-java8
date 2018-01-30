package org.lpf.desgin.adapter.objectAdapter;

import org.lpf.desgin.adapter.Source;
import org.lpf.desgin.adapter.Targetable;

public class ObjectAdapter implements Targetable{

	private Source source;

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("objct adapter method2...");
	}

	
	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}
	
	
}
