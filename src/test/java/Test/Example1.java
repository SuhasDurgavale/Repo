package Test;
import static org.testng.Assert.fail;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1 {
@Test
public void Data1()
{
	System.out.println("this is data1");	
}
@Test(priority=-1)
public void Data2()
{
	System.out.println("this is data2");
}

@BeforeSuite
public void BeforeSuitMethod()
{
	System.out.println("its BeforeSuitMethod");
}
@AfterSuite
public void AfterSuiteMethod()
{
	System.out.println("its AfterSuiteMethod");
}
@BeforeTest()
public void BeforeTestMethod()
{
	System.out.println("its BeforeTestMethod");
}
@AfterTest()
public void AfterTestMethod()
{
	System.out.println("its AfterTestMethod");
}
@BeforeClass()
public void BeforeClassMethod()
{
	System.out.println("its BeforeClassMethod");
}
@AfterClass
public void AfterClassMethod()
{
	System.out.println("its AfterClassMethod ");
}
@BeforeMethod
public void BeforeMMMethod()
{
	System.out.println("its BeforeMMMethod");
}
@AfterMethod
public void AfterMMMethod()
{
	System.out.println("its AfterMMMethod");
}
}
