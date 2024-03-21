package Assertion;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
@Test(priority=1)
public void test1()
{
	System.out.println("test 1 result");
	Assert.assertEquals(10,10);
}
@Test(priority=2)
public void rest()
{
	System.out.println("its rest test");
}
}
