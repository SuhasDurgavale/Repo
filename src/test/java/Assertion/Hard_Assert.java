package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
	String data="suhas";
	String data1;
@Test
public void show1()
{
	System.out.println("test1----------");
	Assert.assertEquals(data,"sanket");
	System.out.println("test2----------");
}
@Test
public void show2()
{
	System.out.println("test3----------");
	Assert.assertNotEquals(data,"sanket");
	System.out.println("test4----------");
}
@Test
public void show3()
{
	System.out.println("test 5----------");
	Assert.assertTrue(5>2);
	System.out.println("test 6----------");
}
@Test
public void show4()
{
	System.out.println("test 7----------");
	Assert.assertFalse(5>2);
	System.out.println("test 8----------");
}
@Test
public void show5()
{
	System.out.println("test 9----------");
	Assert.assertTrue(5<2);
	System.out.println("test 10----------");
}
@Test
public void show6()
{
	System.out.println("test 11----------");
	Assert.assertFalse(5<2);
	System.out.println("test 12----------");
}

@Test
public void show7()
{
	System.out.println("test 13----------");
	Assert.assertNull(data1);                             
	System.out.println("test 14----------");
}
@Test
public void show8()
{
	System.out.println("test 15----------");
	Assert.assertNotNull(data1);
	System.out.println("test 16----------");
}

}
