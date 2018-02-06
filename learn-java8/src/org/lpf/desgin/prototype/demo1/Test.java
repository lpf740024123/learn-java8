package org.lpf.desgin.prototype.demo1;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypeDemo1 p1 = new PrototypeDemo1();
		p1.setId("test");
		System.out.println("p1.id:" + p1.getId());
		p1.list.add("测试112");
		System.out.println("p1.list:" + p1.list);
		PrototypeDemo1 copyP1 = (PrototypeDemo1) p1.clone();
		System.out.println("copyP1.id" + copyP1.getId());
		System.out.println("copyP1.list" + copyP1.list);
		//浅拷贝,引用类型 无法拷贝,原型和拷贝出的对象 所使用的引用类型的实际对象  是同一个  
		System.out.println("is an list:" + (p1.list == copyP1.list));
		PrototypeDemo2 p2 = new PrototypeDemo2();
		p2.setId("test p2");
		p2.list.add("测试p2 list");
		p2.setAge("18");
		p2.setName("p2");
		System.out.println("p2.id:" + p2.getId());
		System.out.println("p2.list:" + p2.list);
		System.out.println("p2.age:" + p2.getAge());
		System.out.println("p2.name:" + p2.getName());
		PrototypeDemo2 copyP2 = (PrototypeDemo2) p2.clone();
		System.out.println("copy p2 .id:" + copyP2.getId());
		System.out.println("copy p2.list:" + copyP2.list);
		System.out.println("copy p2.age:" + copyP2.getAge());
		System.out.println("copy p2.name:" + copyP2.getName());
		//深拷贝, 字节码复制,java中的序列化和反序列化,  属性即使为 引用类型 拷贝前后也为不同的对象
		System.out.println("is an list:" + (p2.list == copyP2.list));
	}
}
