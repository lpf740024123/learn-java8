package org.lpf.desgin.adapter.classAdapter;

import org.lpf.desgin.adapter.Targetable;

public class ClassAdapterTest {

	public static void main(String[] args) {
		Targetable targetable = new ClassApdater();
		//适配的方法
		targetable.method1();
		targetable.method2();
	}
}
