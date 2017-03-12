package edu.zju.TestDatabase.redis.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditor
{
	private SpellChecker checker;

	private String conclu;

	private int count;

	/**
	 * Constructor-based dependency injection: <br>
	 * 当容器调用带有多个参数的构造函数类时，实现基于构造函数的DI，每个代表在其他类中的一个依赖关系。
	 **/
	public TextEditor(SpellChecker ch, String result)
	{
		this.checker = ch;
		this.conclu = result;
	}

	/**
	 * Setter-based dependency injection:<br>
	 * 基于 setter 方法的 DI 是通过在调用无参数的构造函数或无参数的静态工厂方法实例化bean<br>
	 * 之后容器调用 beans 的 setter 方法来实现的。
	 */
	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public void checkSpelling()
	{
		System.out.println("Checking times = " + count);
		System.out.println("The checking conclusion is : " + conclu);
		checker.checkSpelling();
	}

	public static void main(String[] ar)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"./edu/zju/TestDatabase/redis/MyBeans.xml");
		SpellChecker checker = (SpellChecker) context.getBean("che");
		checker.checkSpelling();
		TextEditor te = (TextEditor) context.getBean("te");
		te.checkSpelling();
	}
}
