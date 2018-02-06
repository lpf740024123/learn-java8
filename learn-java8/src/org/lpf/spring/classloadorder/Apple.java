package org.lpf.spring.classloadorder;

import org.springframework.beans.factory.BeanNameAware;

public class Apple implements BeanNameAware{

	private String iocName;
	private String color;

	
	
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		this.iocName = arg0;
	}

	public String getIocName() {
		return iocName;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.println("color:" + color);
		this.color = color;
	}
	
	
	
}
