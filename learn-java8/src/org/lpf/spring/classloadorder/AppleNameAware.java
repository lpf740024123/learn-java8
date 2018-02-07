package org.lpf.spring.classloadorder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringValueResolver;

/**
 * 让 类知道 自己在容器中的标识
 * @author pc
 *
 */
public class AppleNameAware implements BeanNameAware,BeanClassLoaderAware,
	BeanFactoryAware,EnvironmentAware,EmbeddedValueResolverAware,ResourceLoaderAware,
	ApplicationEventPublisherAware,MessageSourceAware,ApplicationContextAware,
	BeanPostProcessor,InitializingBean{

	private String id;
	private String name;
	
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("-----------类名称------------");
		System.out.println("bean name :" + arg0);
	}

	@Override
	public void setBeanClassLoader(ClassLoader arg0) {
		// TODO Auto-generated method stub
		System.out.println("-----------类加载器------------");
		System.out.println(arg0.getClass());
		System.out.println(arg0);
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("-----------类诞生的工厂------------");
		// TODO Auto-generated method stub
		System.out.println(factory.getClass());
		System.out.println(factory.toString());
	}

	@Override
	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		System.out.println("-----------类运行环境信息------------");
		System.out.println(environment.toString());
		System.out.println(environment.getActiveProfiles());
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		// TODO Auto-generated method stub
		System.out.println("-----------类嵌入式解析器------------");
		System.out.println(resolver.getClass());
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		System.out.println("-----------资源加载器------------");
		System.out.println(resourceLoader);
	}

	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		System.out.println("-----------全局事件发布器------------");
		System.out.println(applicationEventPublisher);
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		// TODO Auto-generated method stub
		System.out.println("-----------消息资源------------");
		System.out.println(messageSource);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("-----------上下文,IOC容器------------");
		System.out.println(applicationContext);
	}

	
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("-----------bean后处理器,init方法之后------------");
		System.out.println(arg0);
		System.out.println(arg1);
		System.out.println("-----------bean后处理器,init方法之后结束------------");
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("-----------bean后处理器,init方法之前------------");
		System.out.println("类标识："+arg1+",类Class："+arg0);
	//	System.out.println(arg1);
		System.out.println("-----------bean后处理器,init方法结束------------");
		return arg0;
	}

	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("-----------属性被全部set之后,执行的init------------");
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		System.out.println("AppleNameAware 属性 id 被注入"+id);
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("AppleNameAware 属性 name 被注入"+name);
		this.name = name;
	}
	
	
	
	
}
