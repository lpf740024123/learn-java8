package org.lpf.desgin.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKSourceProxy implements InvocationHandler{

	private Object target;
	
	
	public JDKSourceProxy(Object target) {
		this.target = target;
	}
	/**
	 * 获取代理对象
	 * @param target
	 * @return
	 */
	public Object getInstance() throws Exception {
		Class clazz = this.target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	/**
	 * 代理执行程序
	 * @param proxy 代理类实例
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("proxy before method execute...");
		//System.out.println(proxy.getClass());
		//不能用代理类调用 方法，否则会陷入循环调用，程序错误
		//method.invoke(proxy, args);
		Object o = method.invoke(this.target, args);
		System.out.println("proxy after method execute...");
		return o;
	}

	
}
