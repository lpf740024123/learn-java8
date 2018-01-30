package org.lpf.desgin.adapter.objectAdapter;

import org.lpf.desgin.adapter.Source;

public class ObjectAdapterTest {
	
	public static void main(String[] args) {
		Source source = new Source();
		ObjectAdapter objectAdapter = new ObjectAdapter();
		//适配的对象
		objectAdapter.setSource(source);
		objectAdapter.method1();
		objectAdapter.method2();
	}

}
