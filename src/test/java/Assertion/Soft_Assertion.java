package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
String name="suhas";
SoftAssert soft=new SoftAssert();

@Test
public void display1()
{
	System.out.println("Test1-------------");
	soft.assertEquals(5,7);
	System.out.println("Test2-------------");
	soft.assertAll();
	
}
@Test
public void display2()
{
	System.out.println("Test3-------------");
	soft.assertTrue(true);
	System.out.println("Test4-------------");
	soft.assertAll();
	
}
@Test
public void display3()
{
	System.out.println("Test5-------------");
	soft.assertTrue(10>5);
	System.out.println("Test6-------------");
	soft.assertAll();
}
@Test
public void display4()
{
	System.out.println("Test7-------------");
	soft.assertFalse(10>5);
	System.out.println("Test8-------------");
	soft.assertAll();
}
}
