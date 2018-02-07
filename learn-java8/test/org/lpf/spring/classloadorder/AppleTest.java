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
	 * 3：BeanNameAware.setBeanName(String name); 类名称
	 * 4：BeanClassLoaderAware.setBeanClassLoader(ClassLoader arg0); 类加载器
	 * 5：BeanFactoryAware.setBeanFactory(BeanFactory factory); 生产工厂
	 * 6：EnvironmentAware.setEnvironment(Environment environment);运行环境
	 * 7：EmbeddedValueResolverAware.setEmbeddedValueResolver(StringValueResolver resolver);解析器，解析给定的字符串值，例如解析占位符。
	 * 8：ResourceLoaderAware.setResourceLoader(ResourceLoader resourceLoader);资源加载器，可以获取资源信息
	 * 9：ApplicationEventPublisherAware.setApplicationEventPublisher(
	 * 		ApplicationEventPublisher applicationEventPublisher); 事件发布器 和 资源加载器默认是同一对象 GenericApplicationContext
	 * 10：MessageSourceAware.setMessageSource(MessageSource messageSource);
	 * 	消息资源 默认和 事件发布器 和 资源加载器是同一对象 GenericApplicationContext
	 * 11：ApplicationContextAware.setApplicationContext(ApplicationContext applicationContext);
	 * 	上下文 默认和消息资源 和 事件发布器 和 资源加载器是同一对象 GenericApplicationContext
	 * 12：ServletContextAware.setServletContext(ServletContext servletContext);服务器的 Application
	 * 13：BeanPostProcessor.postProcessBeforeInitialization(Object arg0, String arg1);
	 * 		bean后处理器 init方法执行之前执行的方法,针对于容器中的对象不包括(this) 必须要把 arg0返回.否则 after方法 不会调用,拦截的顺序根据配置文件的顺序走
	 * 14：InitializingBean.afterPropertiesSet(); 初始化方法,属性值都被赋值完成之后的调用,值针对于实现该接口的对象
	 * 15：BeanPostProcessor.postProcessAfterInitialization(Object arg0, String arg1);
	 * 		bean后处理器 init方法执行之后执行的方法,针对于容器中的对象不包括(this)
	 * 16：DestructionAwareBeanPostProcessor.postProcessBeforeDestruction(Object bean, String beanName) 销毁对象之前执行的方法.
	 */
	@Test
	public void demo1(){
		System.out.println("end");
	}
	
}
