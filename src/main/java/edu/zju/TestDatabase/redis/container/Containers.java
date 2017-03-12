package edu.zju.TestDatabase.redis.container;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Containers
{
	List list;

	Set set;

	Map map;

	Properties properties;

	public List getList()
	{
		return list;
	}

	public void setList(List list)
	{
		this.list = list;
	}

	public Set getSet()
	{
		return set;
	}

	public void setSet(Set set)
	{
		this.set = set;
	}

	public Map getMap()
	{
		return map;
	}

	public void setMap(Map map)
	{
		this.map = map;
	}

	public Properties getProperties()
	{
		return properties;
	}

	public void setProperties(Properties properties)
	{
		this.properties = properties;
	}

	public static void main(String[] ra)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"./edu/zju/TestDatabase/redis/container/ContainerBeans.xml");
		
		Containers c = (Containers) ctx.getBean("containers");
		System.out.println(c.getList());
		System.out.println(c.getSet());
		System.out.println(c.getMap());
		System.out.println(c.getProperties());
	}
}
