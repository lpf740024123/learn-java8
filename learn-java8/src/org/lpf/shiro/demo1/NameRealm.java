package org.lpf.shiro.demo1;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;

/**
 * 用户名验证规则
 * @ClassName NameRealm
 * @Description: TODO(...)
 * @author lpf
 * @date 2018年3月5日下午3:28:14
 *
 */
public class NameRealm implements Realm{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "userRealm";
	}

	/**
	 * 判断支持token的类型
	 */
	@Override
	public boolean supports(AuthenticationToken token) {
		// TODO Auto-generated method stub
		return token instanceof UsernamePasswordToken;
	}
	
	@Override
	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token)
			throws AuthenticationException {
		// TODO Auto-generated method stub
		System.out.println(getName());
		// 获取 token中的唯一标识
		String username = (String) token.getPrincipal();
		//密码
		String password = new String((char[])token.getCredentials());
		
		if (!"zhang".equals(username))
			throw new UnknownAccountException();//标识错误
		if (!"123".equals(password)) 
			throw new IncorrectCredentialsException();//密码错误
		return new SimpleAuthenticationInfo(username,password,getName());
	}
	
	
}
