package Keyword;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {

	
	@Test(dependsOnMethods = {"Cardrive","Carstop"},alwaysRun=true)
	public void Carstart()
	{
		System.out.println("start car");
	}
	@Test
	public void Cardrive()
	{
		System.out.println("drive car");
	Assert.fail();
	}
	@Test
	public void Carstop()
	{
		System.out.println("stop car");
	}

}
