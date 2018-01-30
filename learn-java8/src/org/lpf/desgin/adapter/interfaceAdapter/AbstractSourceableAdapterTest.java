package org.lpf.desgin.adapter.interfaceAdapter;

public class AbstractSourceableAdapterTest {

	public static void main(String[] args) {
		AbstractSourceableAdapter adapter = new SourceSub1();
		AbstractSourceableAdapter adapter2 = new SourceSub2();
		adapter.method1();
		adapter.method2();
		adapter2.method1();
		adapter2.method2();
	}
}
