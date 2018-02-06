package org.lpf.spring.classloadorder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:context/applicationContext.xml"})
public class AppleTest {
	

	/**
	 * 1：类实例化 
	 * 2：给实例属性赋值
	 * 3：BeanNameAware.setBeanName(String name);
	 * 
	 */
	@Test
	public void demo1(){
		System.out.println("end");
	}
	
}
