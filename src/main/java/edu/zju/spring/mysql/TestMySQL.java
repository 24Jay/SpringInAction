package edu.zju.spring.mysql;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMySQL
{
	public static void main(String[] ar)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/edu/zju/spring/mysql/MysqlBeans.xml");

		SingerJDBCTemplateDAO templateDAO = (SingerJDBCTemplateDAO) context.getBean("singerTemplate");
		Singer singer = templateDAO.getSinger(1);
		System.out.println(singer);

		List<Singer> singers = templateDAO.listSingers();
		Iterator<Singer> it = singers.iterator();
		while (it.hasNext())
		{
			Singer s = it.next();
			System.out.println("JDBCTemplate = "+s);
		}
		
		SingerNamedParameterJdbcTemplate named = (SingerNamedParameterJdbcTemplate) context.getBean("namedTemplate");
		List<Singer> list = named.listSingers();
		for(Singer s :list)
			System.out.println("namedParameterJdbcTemplate = "+ s);
	}
}
