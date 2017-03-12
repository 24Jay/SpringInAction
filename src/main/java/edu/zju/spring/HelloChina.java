package edu.zju.spring;

public class HelloChina extends HelloWorld
{

	@Override
	public void getMessage()
	{
		super.getMessage();
		System.out.println("Hello CHINA, here is Wuhan, China!"+this.message);
	}

}
