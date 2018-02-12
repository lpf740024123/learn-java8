package org.lpf.spring.context;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring  IOC和DI
 * @author pc
 *
 */
public class ContextTest {

	@Test
	public void demo1(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("context/applicationContext.xml");
	}
}
