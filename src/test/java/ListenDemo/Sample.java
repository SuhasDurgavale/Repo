package ListenDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
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
