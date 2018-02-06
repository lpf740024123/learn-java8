package org.lpf.spring.classloadorder;

import org.springframework.beans.factory.BeanNameAware;

/**
 * 让 类知道 自己在容器中的标识
 * @author pc
 *
 */
public class AppleNameAware implements BeanNameAware{

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("bean name :" + arg0);
	}

	
}
