package ListenDemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listen1.class)
public class Test1 {
	@Test
	public void test1()
	{
	System.out.println("its test1 method");
	}
	@Test
	public void test2()
	{
		System.out.println("its test2 method");
		Assert.fail();
	}
	@Test
	public void test3()
	{
		System.out.println("its test3 method");
	}
	@Test
	public void test4()
	{
		System.out.println("its test4 method");
		Assert.fail();
	}

	}


