package Groups;

import org.testng.annotations.Test;

public class Group1 {

	@Test(groups = {"sanity"})
	public void Test1()
	{
		System.out.println("test 1");
	}
	@Test(groups = {"regression"})
	public void Test2()
	{
		System.out.println("test 2");
	}
	@Test(groups = {"sanity","regression"})
	public void Test3()
	{
		System.out.println("test 3");
	}
}
