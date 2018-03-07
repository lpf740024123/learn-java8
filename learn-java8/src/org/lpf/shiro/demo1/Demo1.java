package org.lpf.shiro.demo1;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

public class Demo1 {

	public Subject get(String path){
		Factory<SecurityManager> factory = new IniSecurityManagerFactory(path);
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		return SecurityUtils.getSubject();
	}
	
	@Test
	public void demo2(){
		System.out.println("11");
	}
	@Test
	public void demo1(){
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:org/lpf/shiro/shiro.ini");
		SecurityManager securityManager = factory.getInstance();
		//2、得到SecurityManager实例 并绑定给SecurityUtils   org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
	    SecurityUtils.setSecurityManager(securityManager);
	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
	    Subject subject = SecurityUtils.getSubject();
	    UsernamePasswordToken token = new UsernamePasswordToken("wang", "123");
	    try {
	        //4、登录，即身份验证
	        subject.login(token);
	    } catch (AuthenticationException e) {
	        //5、身份验证失败
	    	e.printStackTrace();
	    }
	    Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录
	    //6、退出
	    subject.logout();
	}
	
	/**
	 * 自定义验证规则
	 * 自定义Realm
	 * @Title: demo3
	 * @Description:TODO(...)
	 * @author lpf
	 * @date: 2018年3月5日 下午4:20:48
	 *
	 */
	@Test
	public void demo3(){
		Subject subject = get("classpath:org/lpf/shiro/shiro-realm.ini");
		UsernamePasswordToken token = new UsernamePasswordToken("wang", "123");
		try {
		        //4、登录，即身份验证
	        subject.login(token);
	    } catch (AuthenticationException e) {
	        //5、身份验证失败
	    	e.printStackTrace();
	    }
	    Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录
	    //6、退出
	    subject.logout();
	}
	
	
	
}
