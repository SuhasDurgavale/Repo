package package_Xml;

 
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_1 {
@Test
public void method1()
{
	System.out.println("its method1");
	Assert.fail();
}
@Test
public void method2()
{
	System.out.println("its method2");
}
}
