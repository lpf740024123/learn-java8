package org.lpf.shiro.demo1;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;

public class NameRealm1 implements Realm {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "nameRealm1";
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		// TODO Auto-generated method stub
		return token instanceof UsernamePasswordToken;
	}

	@Override
	public AuthenticationInfo getAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		System.out.println(getName());
		// 获取 token中的唯一标识
		String username = (String) token.getPrincipal();
		//密码
		String password = new String((char[])token.getCredentials());
		
		if (!"wang".equals(username))
			throw new UnknownAccountException();//标识错误
		if (!"123".equals(password)) 
			throw new IncorrectCredentialsException();//密码错误
		return new SimpleAuthenticationInfo(username,password,getName());
	}
}
