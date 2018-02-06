package org.lpf.desgin.prototype.demo3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


public class Test {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.setHeight(50);
		apple.setPrice(100d);
		JSONObject json = (JSONObject) JSON.toJSON(apple);
		System.out.println(json);
		Banana a = JSON.toJavaObject(json, Banana.class);
		System.out.println(a);
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(apple);
			
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			// 不同类对象 的拷贝  ,需要用反射 ,同类的对象 拷贝 则用 序列化和反序列化
			Banana ban = (Banana) ois.readObject();
			System.out.println(ban);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
}
