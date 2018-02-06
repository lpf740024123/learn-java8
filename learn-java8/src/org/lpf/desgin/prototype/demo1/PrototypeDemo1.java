package org.lpf.desgin.prototype.demo1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo1 implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	public List<String> list = new ArrayList<String>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 浅复制
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
}
