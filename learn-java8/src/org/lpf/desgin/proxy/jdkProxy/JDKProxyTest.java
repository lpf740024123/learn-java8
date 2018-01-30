package org.lpf.desgin.proxy.jdkProxy;

import java.io.FileOutputStream;

import org.lpf.desgin.proxy.Source;
import org.lpf.desgin.proxy.Sourceable;

import sun.misc.ProxyGenerator;

public class JDKProxyTest {

	public static void main(String[] args) {
		try {
			Sourceable sourceable = (Sourceable) new JDKSourceProxy(new Source()).getInstance();
			sourceable.method1();
			sourceable.method2();
			
			System.out.println(Source.class.getPackage().getName());
			//原理：
			//1.拿到被代理对象的引用，然后获取它的接口
			//2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
			//3.把被代理对象的引用也拿到了
			//4.重新动态生成一个class字节码
			//5.然后编译
			
			/*String proxyClassName = sourceable.getClass().getName();
			proxyClassName = proxyClassName.substring(proxyClassName.lastIndexOf(".")+1, proxyClassName.length());
			System.out.println(proxyClassName);
			String path = Source.class.getResource("").getPath();
			System.out.println(path);
			//根据类生成 字节码
			
			byte[] data = ProxyGenerator.generateProxyClass(proxyClassName, sourceable.getClass().getInterfaces());
			FileOutputStream os = new FileOutputStream(path+proxyClassName+".class");
			os.write(data);
			os.close();*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
