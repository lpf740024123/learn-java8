package org.lpf.spring.classloadorder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorTest implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("自定义  init 之前");
		System.out.println(beanName);
		System.out.println("自定义  init 之前结束");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("自定义  init 之后");
		System.out.println(beanName);
		System.out.println("自定义  init 之后结束");
		return bean;
	}

	
}
