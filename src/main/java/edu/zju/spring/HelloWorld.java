package edu.zju.spring;

public class HelloWorld
{
	protected String message;

	public void setMessage(String message)
	{
		this.message = message;
	}

	public void getMessage()
	{
		System.out.println("Your Message : " + message);
	}
	
	public void myInit()
	{
		System.out.println("This instance initialized.");
	}
	
	public void myDestroy()
	{
		System.out.println("This instance destroyed.");
	}
}