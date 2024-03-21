package Assertion;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

public class Soft_AssertEX2 {

@Test
public void patil1()
{
	SoftAssert soft=new SoftAssert();
	System.out.println("test1-----------");
	soft.assertTrue(true);
	System.out.println("test2-----------");
	soft.assertAll();
}
@Test
public void patil2()
{
	SoftAssert soft=new SoftAssert();
	System.out.println("test3-----------");
	soft.assertEquals(true,false);
	System.out.println("test4-----------");
	soft.assertAll();
}
@Test
public void patil3()
{
	SoftAssert soft=new SoftAssert();
	System.out.println("test5-----------");
	soft.assertEquals(true,true);
	System.out.println("test6-----------");
	soft.assertAll();
}

}
