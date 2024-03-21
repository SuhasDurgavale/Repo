package ListenDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_Listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("test case execiution start");
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test case pass");	
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case fail");	
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("test case skipped");	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
