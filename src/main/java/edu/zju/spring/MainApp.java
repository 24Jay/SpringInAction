package edu.zju.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp
{
	public static void main(String[] ar)
	{

		/***
		 * Spring 提供了以下两种不同类型的容器:<br>
		 * 
		 * Spring ApplicationContext 容器是较为高级的容器:<br>
		 * 该容器添加了更多的企业特定的功能，例如从一个属性文件中解析文本信息的能力，<br>
		 * 发布应用程序事件给感兴趣的事件监听器的能力。<br>
		 * FileSystemXmlApplicationContext<br>
		 * ClassPathXmlApplicationContext<br>
		 * WebXmlApplicationContext<br>
		 */

		/**
		 * Spring BeanFactory 容器:<br>
		 * 它是最简单的容器，给 DI 提供了基本的支持，<br>
		 * 它用 org.springframework.beans.factory.BeanFactory 接口来定义。<br>
		 */
		XmlBeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("./edu/zju/spring/MyBeans.xml"));
		HelloWorld ob = (HelloWorld) factory.getBean("hello");
		ob.getMessage();

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"./edu/zju/spring/MyBeans.xml");
		AbstractApplicationContext conte = new ClassPathXmlApplicationContext(
				"./edu/zju/spring/MyBeans.xml");
		ApplicationContext cont = new FileSystemXmlApplicationContext(
				"src/main/java/edu/zju/spring/MyBeans.xml");
		System.out.println(
				"ClassPathXmlApplicationContext classloader = " + context.getClassLoader());
		System.out
				.println("FileSystemXmlApplicationContext classloader = " + cont.getClassLoader());
		/**
		 * 如果对应的bean的为singleton则下面的比较相等,如果为prototype则不等<br>
		 */
		HelloWorld o = (HelloWorld) conte.getBean("he");
		HelloWorld obj = (HelloWorld) context.getBean("he");
		System.out.println(o == obj);
		obj.getMessage();
		o.getMessage();
		/**
		 * 如果bean是prototype,则配置的destroy方法无效,singleton的时候才有效<br>
		 */
		context.registerShutdownHook();
	}

}
