package edu.zju.TestDatabase.redis.di;

public class SpellChecker
{
	private String result;

	public SpellChecker(String res)
	{
		this.result = res;
	}

	public void checkSpelling()
	{
		System.out.println("Spelling checking Result = " + result);
	}
}
