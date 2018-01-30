package org.lpf.desgin.proxy.cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibSourceProxy implements MethodInterceptor{

	
	public Object getInstance(Class<?> clazz) throws Exception{
		//增强器  , 作用是动态字节码生成规则
		Enhancer en = new Enhancer();
		//设置 生成的代理类 所继承的 父类
		en.setSuperclass(clazz);
		//设置 回调
		en.setCallback(this);
		
		//第一步、生成源代码
		//第二步、编译成class文件
		//第三步、加载到JVM中，并返回被代理对象
		return en.create();
	}
	
	//同样是做了字节码重组这样一件事情
	//对于使用API的用户来说，是无感知
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("cglib method intercept before...");
		// 调用原有的 方法 会陷入 死循环调用 需要调用代理方法执行
		//arg1.invoke(arg0, arg2);
		// 代理类对象调用  委托类的方法
		Object o = arg3.invokeSuper(arg0, arg2);
		System.out.println("cglib method intercept after...");
		return o;
	}

	
	
}
